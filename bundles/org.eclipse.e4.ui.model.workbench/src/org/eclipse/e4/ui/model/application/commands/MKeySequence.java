/**
 * Copyright (c) 2008, 2013 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *      IBM Corporation - initial API and implementation
 */
package org.eclipse.e4.ui.model.application.commands;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Key Sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>
 * <strong>Developers</strong>:
 * Add more detailed documentation by editing this comment in 
 * org.eclipse.ui.model.workbench/model/UIElements.ecore. 
 * There is a GenModel/documentation node under each type and attribute.
 * </p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.e4.ui.model.application.commands.MKeySequence#getKeySequence <em>Key Sequence</em>}</li>
 * </ul>
 * </p>
 *
 * @model interface="true" abstract="true"
 * @generated
 * @since 1.0
 */
public interface MKeySequence {
	/**
	 * Returns the value of the '<em><b>Key Sequence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>
	 * <strong>Developers</strong>:
	 * Add more detailed documentation by editing this comment in 
	 * org.eclipse.ui.model.workbench/model/UIElements.ecore. 
	 * There is a GenModel/documentation node under each type and attribute.
	 * </p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Key Sequence</em>' attribute.
	 * @see #setKeySequence(String)
	 * @model required="true"
	 * @generated
	 */
	String getKeySequence();

	/**
	 * Sets the value of the '{@link org.eclipse.e4.ui.model.application.commands.MKeySequence#getKeySequence <em>Key Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Sequence</em>' attribute.
	 * @see #getKeySequence()
	 * @generated
	 */
	void setKeySequence(String value);

} // MKeySequence
