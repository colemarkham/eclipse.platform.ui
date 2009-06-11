/*******************************************************************************
 * Copyright (c) 2009 Siemens AG and others.
 * 
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 * 
 * Contributors:
 *     Kai Tödter - initial implementation
 ******************************************************************************/

package org.eclipse.e4.demo.contacts.model.internal;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.e4.demo.contacts.model.Contact;
import org.eclipse.e4.demo.contacts.model.IContactsRepository;
import org.eclipse.osgi.internal.signedcontent.Base64;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.widgets.Display;

public class VCardContactsRepository implements IContactsRepository {

	private final Collection<Contact> contacts = Collections
			.synchronizedCollection(new ArrayList<Contact>());

	public VCardContactsRepository() {

		URL url = FileLocator.find(Platform
				.getBundle("org.eclipse.e4.demo.contacts"), new Path("vcards"),
				null);

		try {
			URI uri = FileLocator.toFileURL(url).toURI();
			File directory = new File(uri);
			for (String file : directory.list()) {
				if (file.endsWith(".vcf")) {
					Contact contact = readFromVCard(directory.getAbsolutePath()
							+ File.separator + file);
					contacts.add(contact);
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void addContact(final Contact contact) {
		contacts.add(contact);
	}

	public Collection<Contact> getAllContacts() {
		return Collections.unmodifiableCollection(contacts);
	}

	public void removeContact(final Contact contact) {
		contacts.remove(contact);
	}

	private void saveAsVCard(Contact contact, String fileName) {
		String charSet = "CHARSET="
				+ java.nio.charset.Charset.defaultCharset().name();
		String vCard = "BEGIN:VCARD" + "\nVERSION:2.1" + "\nN;" + charSet + ":"
				+ contact.getLastName() + ";" + contact.getFirstName()
				+ "\nFN;" + charSet + ":" + contact.getFirstName() + " "
				+ contact.getLastName() + "\nORG;" + charSet + ":"
				+ contact.getCompany() + "\nTITLE:" + contact.getJobTitle()
				+ "\nTEL;WORK;VOICE:" + contact.getPhone()
				+ "\nTEL;CELL;VOICE:" + contact.getMobile() + "\nADR;WORK;"
				+ charSet + ":" + ";;" + contact.getStreet() + ";"
				+ contact.getCity() + ";" + contact.getState() + ";"
				+ contact.getZip() + ";" + contact.getCountry() + "\nURL;WORK:"
				+ contact.getWebPage() + "\nEMAIL;PREF;INTERNET:"
				+ contact.getEmail() + "\nEND:VCARD\n";

		PrintWriter out;
		try {
			out = new PrintWriter(fileName);
			out.println(vCard);
			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Reads a Contact from a VCard. This method cannot parse a generic VCard,
	 * but can only parse VCards created with Microsoft Outlook. The intention
	 * is not to provide a generic VCard reader but an easy way to get contact
	 * data (including pictures) in the repository.
	 * 
	 * @param fileName
	 *            the vcard file
	 * @return the created Contact
	 */
	public Contact readFromVCard(String fileName) {
		Contact contact = new Contact();
		BufferedReader bufferedReader = null;
		String charSet = "Windows-1252";

		// First try to guess the char set
		try {
			bufferedReader = new BufferedReader(new InputStreamReader(
					new FileInputStream(fileName)));
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				int index = line.indexOf("CHARSET=");
				if (index != -1) {
					int endIndex = index + 8;
					while (line.charAt(endIndex) != ':'
							&& line.charAt(endIndex) != ';') {
						endIndex += 1;
					}
					charSet = line.substring(index + 8, endIndex);
					break;
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (bufferedReader != null) {
					bufferedReader.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		// Then parse the vCard
		try {
			bufferedReader = new BufferedReader(new InputStreamReader(
					new FileInputStream(fileName), charSet));
			String line;
			String value;
			while ((line = bufferedReader.readLine()) != null) {
				value = getVCardValue(line, "N");
				if (value != null) {
					String[] result = value.split(";");

					if (result.length > 0) {
						contact.setLastName(result[0]);
					}
					if (result.length > 1) {
						contact.setFirstName(result[1]);
					}
					if (result.length > 2) {
						contact.setMiddleName(result[2]);
					}
					if (result.length > 3) {
						contact.setTitle(result[3]);
					}
					continue;
				}
				value = getVCardValue(line, "TEL;WORK");
				if (value != null) {
					contact.setPhone(value);
					continue;
				}
				value = getVCardValue(line, "TEL;CELL");
				if (value != null) {
					contact.setMobile(value);
					continue;
				}
				value = getVCardValue(line, "ADR;WORK");
				if (value != null) {
					String[] result = value.split(";");

					if (result.length > 2) {
						contact.setStreet(result[2]);
					}
					if (result.length > 3) {
						contact.setCity(result[3]);
					}
					if (result.length > 4) {
						contact.setState(result[4]);
					}
					if (result.length > 5) {
						contact.setZip(result[5]);
					}
					if (result.length > 6) {
						contact.setCountry(result[6]);
					}
					continue;
				}
				value = getVCardValue(line, "EMAIL;PREF;INTERNET");
				if (value != null) {
					contact.setEmail(value);
					continue;
				}
				value = getVCardValue(line, "URL;WORK");
				if (value != null) {
					contact.setWebPage(value);
					continue;
				}
				value = getVCardValue(line, "ORG");
				if (value != null) {
					contact.setCompany(value);
					continue;
				}
				value = getVCardValue(line, "TITLE");
				if (value != null) {
					contact.setJobTitle(value);
					continue;
				}
				value = getVCardValue(line, "NOTE");
				if (value != null) {
					contact.setNote(value);
					continue;
				}
				value = getVCardValue(line, "PHOTO;TYPE=JPEG;ENCODING=BASE64");
				if (value != null) {
					line = bufferedReader.readLine();
					String base64 = "";
					while (line != null && line.length() > 0
							&& line.charAt(0) == ' ') {
						base64 += line.trim();
						line = bufferedReader.readLine();
					}
					byte[] imageBytes = Base64.decode(base64.getBytes());
					ByteArrayInputStream is = new ByteArrayInputStream(
							imageBytes);
					ImageData imageData = new ImageData(is);
					contact
							.setImage(new Image(Display.getCurrent(), imageData));
					continue;
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (bufferedReader != null) {
					bufferedReader.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return contact;
	}

	private String getVCardValue(String line, String token) {
		if (line.startsWith(token + ":") || line.startsWith(token + ";")) {
			String value = line.substring(line.indexOf(":") + 1);
			return value;
		}
		return null;
	}

}