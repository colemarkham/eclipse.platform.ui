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
package org.eclipse.e4.ui.model.application.ui.menu;

import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.MUILabel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
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
 *   <li>{@link org.eclipse.e4.ui.model.application.ui.menu.MMenuElement#getMnemonics <em>Mnemonics</em>}</li>
 * </ul>
 * </p>
 *
 * @model abstract="true"
 * @generated
 * @since 1.0
 */
public interface MMenuElement extends MUIElement, MUILabel {

	/**
	 * Returns the value of the '<em><b>Mnemonics</b></em>' attribute.
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
	 * @return the value of the '<em>Mnemonics</em>' attribute.
	 * @see #setMnemonics(String)
	 * @model
	 * @generated
	 */
	String getMnemonics();

	/**
	 * Sets the value of the '{@link org.eclipse.e4.ui.model.application.ui.menu.MMenuElement#getMnemonics <em>Mnemonics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mnemonics</em>' attribute.
	 * @see #getMnemonics()
	 * @generated
	 */
	void setMnemonics(String value);

	/**
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
	 * @model kind="operation"
	 * @generated
	 */
	String getLocalizedMnemonics();
} // MMenuElement
