/**
 * Copyright (c) 2008 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *      IBM Corporation - initial API and implementation
 *
 * $Id: WorkbenchPackage.java,v 1.9 2009/07/22 00:30:07 pwebster Exp $
 */
package org.eclipse.e4.ui.model.workbench;

import org.eclipse.e4.ui.model.application.ApplicationPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.e4.ui.model.workbench.WorkbenchFactory
 * @model kind="package"
 * @generated
 */
public interface WorkbenchPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "workbench"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/ui/2008/Workbench"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "workbench"; //$NON-NLS-1$

	/**
	 * The package content type ID.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eCONTENT_TYPE = "org.eclipse.e4.ui.model.workbench"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WorkbenchPackage eINSTANCE = org.eclipse.e4.ui.model.internal.workbench.WorkbenchPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.e4.ui.model.internal.workbench.MWorkbenchWindowImpl <em>MWorkbench Window</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.e4.ui.model.internal.workbench.MWorkbenchWindowImpl
	 * @see org.eclipse.e4.ui.model.internal.workbench.WorkbenchPackageImpl#getMWorkbenchWindow()
	 * @generated
	 */
	int MWORKBENCH_WINDOW = 0;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MWORKBENCH_WINDOW__OWNER = ApplicationPackage.MWINDOW__OWNER;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MWORKBENCH_WINDOW__ID = ApplicationPackage.MWINDOW__ID;

	/**
	 * The feature id for the '<em><b>Menu</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MWORKBENCH_WINDOW__MENU = ApplicationPackage.MWINDOW__MENU;

	/**
	 * The feature id for the '<em><b>Tool Bar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MWORKBENCH_WINDOW__TOOL_BAR = ApplicationPackage.MWINDOW__TOOL_BAR;

	/**
	 * The feature id for the '<em><b>Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MWORKBENCH_WINDOW__POLICY = ApplicationPackage.MWINDOW__POLICY;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MWORKBENCH_WINDOW__CHILDREN = ApplicationPackage.MWINDOW__CHILDREN;

	/**
	 * The feature id for the '<em><b>Active Child</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MWORKBENCH_WINDOW__ACTIVE_CHILD = ApplicationPackage.MWINDOW__ACTIVE_CHILD;

	/**
	 * The feature id for the '<em><b>Handlers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MWORKBENCH_WINDOW__HANDLERS = ApplicationPackage.MWINDOW__HANDLERS;

	/**
	 * The feature id for the '<em><b>Widget</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MWORKBENCH_WINDOW__WIDGET = ApplicationPackage.MWINDOW__WIDGET;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MWORKBENCH_WINDOW__PARENT = ApplicationPackage.MWINDOW__PARENT;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MWORKBENCH_WINDOW__VISIBLE = ApplicationPackage.MWINDOW__VISIBLE;

	/**
	 * The feature id for the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MWORKBENCH_WINDOW__CONTEXT = ApplicationPackage.MWINDOW__CONTEXT;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MWORKBENCH_WINDOW__VARIABLES = ApplicationPackage.MWINDOW__VARIABLES;

	/**
	 * The feature id for the '<em><b>Icon URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MWORKBENCH_WINDOW__ICON_URI = ApplicationPackage.MWINDOW__ICON_URI;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MWORKBENCH_WINDOW__NAME = ApplicationPackage.MWINDOW__NAME;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MWORKBENCH_WINDOW__TOOLTIP = ApplicationPackage.MWINDOW__TOOLTIP;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MWORKBENCH_WINDOW__X = ApplicationPackage.MWINDOW__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MWORKBENCH_WINDOW__Y = ApplicationPackage.MWINDOW__Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MWORKBENCH_WINDOW__WIDTH = ApplicationPackage.MWINDOW__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MWORKBENCH_WINDOW__HEIGHT = ApplicationPackage.MWINDOW__HEIGHT;

	/**
	 * The feature id for the '<em><b>Shared Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MWORKBENCH_WINDOW__SHARED_PARTS = ApplicationPackage.MWINDOW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MWorkbench Window</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MWORKBENCH_WINDOW_FEATURE_COUNT = ApplicationPackage.MWINDOW_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.e4.ui.model.internal.workbench.MProxyPartImpl <em>MProxy Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.e4.ui.model.internal.workbench.MProxyPartImpl
	 * @see org.eclipse.e4.ui.model.internal.workbench.WorkbenchPackageImpl#getMProxyPart()
	 * @generated
	 */
	int MPROXY_PART = 1;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPROXY_PART__OWNER = ApplicationPackage.MPART__OWNER;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPROXY_PART__ID = ApplicationPackage.MPART__ID;

	/**
	 * The feature id for the '<em><b>Menu</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPROXY_PART__MENU = ApplicationPackage.MPART__MENU;

	/**
	 * The feature id for the '<em><b>Tool Bar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPROXY_PART__TOOL_BAR = ApplicationPackage.MPART__TOOL_BAR;

	/**
	 * The feature id for the '<em><b>Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPROXY_PART__POLICY = ApplicationPackage.MPART__POLICY;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPROXY_PART__CHILDREN = ApplicationPackage.MPART__CHILDREN;

	/**
	 * The feature id for the '<em><b>Active Child</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPROXY_PART__ACTIVE_CHILD = ApplicationPackage.MPART__ACTIVE_CHILD;

	/**
	 * The feature id for the '<em><b>Handlers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPROXY_PART__HANDLERS = ApplicationPackage.MPART__HANDLERS;

	/**
	 * The feature id for the '<em><b>Widget</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPROXY_PART__WIDGET = ApplicationPackage.MPART__WIDGET;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPROXY_PART__PARENT = ApplicationPackage.MPART__PARENT;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPROXY_PART__VISIBLE = ApplicationPackage.MPART__VISIBLE;

	/**
	 * The feature id for the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPROXY_PART__CONTEXT = ApplicationPackage.MPART__CONTEXT;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPROXY_PART__VARIABLES = ApplicationPackage.MPART__VARIABLES;

	/**
	 * The feature id for the '<em><b>Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPROXY_PART__PART = ApplicationPackage.MPART_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MProxy Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPROXY_PART_FEATURE_COUNT = ApplicationPackage.MPART_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.e4.ui.model.internal.workbench.MPerspectiveImpl <em>MPerspective</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.e4.ui.model.internal.workbench.MPerspectiveImpl
	 * @see org.eclipse.e4.ui.model.internal.workbench.WorkbenchPackageImpl#getMPerspective()
	 * @generated
	 */
	int MPERSPECTIVE = 2;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPERSPECTIVE__OWNER = ApplicationPackage.MITEM_PART__OWNER;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPERSPECTIVE__ID = ApplicationPackage.MITEM_PART__ID;

	/**
	 * The feature id for the '<em><b>Menu</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPERSPECTIVE__MENU = ApplicationPackage.MITEM_PART__MENU;

	/**
	 * The feature id for the '<em><b>Tool Bar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPERSPECTIVE__TOOL_BAR = ApplicationPackage.MITEM_PART__TOOL_BAR;

	/**
	 * The feature id for the '<em><b>Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPERSPECTIVE__POLICY = ApplicationPackage.MITEM_PART__POLICY;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPERSPECTIVE__CHILDREN = ApplicationPackage.MITEM_PART__CHILDREN;

	/**
	 * The feature id for the '<em><b>Active Child</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPERSPECTIVE__ACTIVE_CHILD = ApplicationPackage.MITEM_PART__ACTIVE_CHILD;

	/**
	 * The feature id for the '<em><b>Handlers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPERSPECTIVE__HANDLERS = ApplicationPackage.MITEM_PART__HANDLERS;

	/**
	 * The feature id for the '<em><b>Widget</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPERSPECTIVE__WIDGET = ApplicationPackage.MITEM_PART__WIDGET;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPERSPECTIVE__PARENT = ApplicationPackage.MITEM_PART__PARENT;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPERSPECTIVE__VISIBLE = ApplicationPackage.MITEM_PART__VISIBLE;

	/**
	 * The feature id for the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPERSPECTIVE__CONTEXT = ApplicationPackage.MITEM_PART__CONTEXT;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPERSPECTIVE__VARIABLES = ApplicationPackage.MITEM_PART__VARIABLES;

	/**
	 * The feature id for the '<em><b>Icon URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPERSPECTIVE__ICON_URI = ApplicationPackage.MITEM_PART__ICON_URI;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPERSPECTIVE__NAME = ApplicationPackage.MITEM_PART__NAME;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPERSPECTIVE__TOOLTIP = ApplicationPackage.MITEM_PART__TOOLTIP;

	/**
	 * The number of structural features of the '<em>MPerspective</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPERSPECTIVE_FEATURE_COUNT = ApplicationPackage.MITEM_PART_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.e4.ui.model.internal.workbench.MWorkbenchImpl <em>MWorkbench</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.e4.ui.model.internal.workbench.MWorkbenchImpl
	 * @see org.eclipse.e4.ui.model.internal.workbench.WorkbenchPackageImpl#getMWorkbench()
	 * @generated
	 */
	int MWORKBENCH = 3;

	/**
	 * The feature id for the '<em><b>Wb Windows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MWORKBENCH__WB_WINDOWS = 0;

	/**
	 * The feature id for the '<em><b>Cur WBW</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MWORKBENCH__CUR_WBW = 1;

	/**
	 * The number of structural features of the '<em>MWorkbench</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MWORKBENCH_FEATURE_COUNT = 2;


	/**
	 * The meta object id for the '{@link org.eclipse.e4.ui.model.internal.workbench.MMenuItemRendererImpl <em>MMenu Item Renderer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.e4.ui.model.internal.workbench.MMenuItemRendererImpl
	 * @see org.eclipse.e4.ui.model.internal.workbench.WorkbenchPackageImpl#getMMenuItemRenderer()
	 * @generated
	 */
	int MMENU_ITEM_RENDERER = 4;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMENU_ITEM_RENDERER__OWNER = ApplicationPackage.MMENU_ITEM__OWNER;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMENU_ITEM_RENDERER__ID = ApplicationPackage.MMENU_ITEM__ID;

	/**
	 * The feature id for the '<em><b>Icon URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMENU_ITEM_RENDERER__ICON_URI = ApplicationPackage.MMENU_ITEM__ICON_URI;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMENU_ITEM_RENDERER__NAME = ApplicationPackage.MMENU_ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMENU_ITEM_RENDERER__TOOLTIP = ApplicationPackage.MMENU_ITEM__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Command</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMENU_ITEM_RENDERER__COMMAND = ApplicationPackage.MMENU_ITEM__COMMAND;

	/**
	 * The feature id for the '<em><b>Menu</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMENU_ITEM_RENDERER__MENU = ApplicationPackage.MMENU_ITEM__MENU;

	/**
	 * The feature id for the '<em><b>Wb Command</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMENU_ITEM_RENDERER__WB_COMMAND = ApplicationPackage.MMENU_ITEM__WB_COMMAND;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMENU_ITEM_RENDERER__PARAMETERS = ApplicationPackage.MMENU_ITEM__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMENU_ITEM_RENDERER__VISIBLE = ApplicationPackage.MMENU_ITEM__VISIBLE;

	/**
	 * The feature id for the '<em><b>Separator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMENU_ITEM_RENDERER__SEPARATOR = ApplicationPackage.MMENU_ITEM__SEPARATOR;

	/**
	 * The feature id for the '<em><b>Renderer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMENU_ITEM_RENDERER__RENDERER = ApplicationPackage.MMENU_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MMenu Item Renderer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMENU_ITEM_RENDERER_FEATURE_COUNT = ApplicationPackage.MMENU_ITEM_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.e4.ui.model.internal.workbench.MToolItemRendererImpl <em>MTool Item Renderer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.e4.ui.model.internal.workbench.MToolItemRendererImpl
	 * @see org.eclipse.e4.ui.model.internal.workbench.WorkbenchPackageImpl#getMToolItemRenderer()
	 * @generated
	 */
	int MTOOL_ITEM_RENDERER = 5;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTOOL_ITEM_RENDERER__OWNER = ApplicationPackage.MTOOL_BAR_ITEM__OWNER;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTOOL_ITEM_RENDERER__ID = ApplicationPackage.MTOOL_BAR_ITEM__ID;

	/**
	 * The feature id for the '<em><b>Icon URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTOOL_ITEM_RENDERER__ICON_URI = ApplicationPackage.MTOOL_BAR_ITEM__ICON_URI;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTOOL_ITEM_RENDERER__NAME = ApplicationPackage.MTOOL_BAR_ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTOOL_ITEM_RENDERER__TOOLTIP = ApplicationPackage.MTOOL_BAR_ITEM__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Command</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTOOL_ITEM_RENDERER__COMMAND = ApplicationPackage.MTOOL_BAR_ITEM__COMMAND;

	/**
	 * The feature id for the '<em><b>Menu</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTOOL_ITEM_RENDERER__MENU = ApplicationPackage.MTOOL_BAR_ITEM__MENU;

	/**
	 * The feature id for the '<em><b>Wb Command</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTOOL_ITEM_RENDERER__WB_COMMAND = ApplicationPackage.MTOOL_BAR_ITEM__WB_COMMAND;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTOOL_ITEM_RENDERER__PARAMETERS = ApplicationPackage.MTOOL_BAR_ITEM__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTOOL_ITEM_RENDERER__VISIBLE = ApplicationPackage.MTOOL_BAR_ITEM__VISIBLE;

	/**
	 * The feature id for the '<em><b>Renderer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTOOL_ITEM_RENDERER__RENDERER = ApplicationPackage.MTOOL_BAR_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MTool Item Renderer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTOOL_ITEM_RENDERER_FEATURE_COUNT = ApplicationPackage.MTOOL_BAR_ITEM_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '<em>IContribution Item</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.eclipse.e4.ui.model.internal.workbench.WorkbenchPackageImpl#getIContributionItem()
	 * @generated
	 */
	int ICONTRIBUTION_ITEM = 6;


	/**
	 * Returns the meta object for class '{@link org.eclipse.e4.ui.model.workbench.MWorkbenchWindow <em>MWorkbench Window</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MWorkbench Window</em>'.
	 * @see org.eclipse.e4.ui.model.workbench.MWorkbenchWindow
	 * @generated
	 */
	EClass getMWorkbenchWindow();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.e4.ui.model.workbench.MWorkbenchWindow#getSharedParts <em>Shared Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Shared Parts</em>'.
	 * @see org.eclipse.e4.ui.model.workbench.MWorkbenchWindow#getSharedParts()
	 * @see #getMWorkbenchWindow()
	 * @generated
	 */
	EReference getMWorkbenchWindow_SharedParts();

	/**
	 * Returns the meta object for class '{@link org.eclipse.e4.ui.model.workbench.MProxyPart <em>MProxy Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MProxy Part</em>'.
	 * @see org.eclipse.e4.ui.model.workbench.MProxyPart
	 * @generated
	 */
	EClass getMProxyPart();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.e4.ui.model.workbench.MProxyPart#getPart <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Part</em>'.
	 * @see org.eclipse.e4.ui.model.workbench.MProxyPart#getPart()
	 * @see #getMProxyPart()
	 * @generated
	 */
	EReference getMProxyPart_Part();

	/**
	 * Returns the meta object for class '{@link org.eclipse.e4.ui.model.workbench.MPerspective <em>MPerspective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MPerspective</em>'.
	 * @see org.eclipse.e4.ui.model.workbench.MPerspective
	 * @generated
	 */
	EClass getMPerspective();

	/**
	 * Returns the meta object for class '{@link org.eclipse.e4.ui.model.workbench.MWorkbench <em>MWorkbench</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MWorkbench</em>'.
	 * @see org.eclipse.e4.ui.model.workbench.MWorkbench
	 * @generated
	 */
	EClass getMWorkbench();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.e4.ui.model.workbench.MWorkbench#getWbWindows <em>Wb Windows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Wb Windows</em>'.
	 * @see org.eclipse.e4.ui.model.workbench.MWorkbench#getWbWindows()
	 * @see #getMWorkbench()
	 * @generated
	 */
	EReference getMWorkbench_WbWindows();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.e4.ui.model.workbench.MWorkbench#getCurWBW <em>Cur WBW</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cur WBW</em>'.
	 * @see org.eclipse.e4.ui.model.workbench.MWorkbench#getCurWBW()
	 * @see #getMWorkbench()
	 * @generated
	 */
	EReference getMWorkbench_CurWBW();

	/**
	 * Returns the meta object for class '{@link org.eclipse.e4.ui.model.workbench.MMenuItemRenderer <em>MMenu Item Renderer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MMenu Item Renderer</em>'.
	 * @see org.eclipse.e4.ui.model.workbench.MMenuItemRenderer
	 * @generated
	 */
	EClass getMMenuItemRenderer();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.e4.ui.model.workbench.MMenuItemRenderer#getRenderer <em>Renderer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Renderer</em>'.
	 * @see org.eclipse.e4.ui.model.workbench.MMenuItemRenderer#getRenderer()
	 * @see #getMMenuItemRenderer()
	 * @generated
	 */
	EAttribute getMMenuItemRenderer_Renderer();

	/**
	 * Returns the meta object for class '{@link org.eclipse.e4.ui.model.workbench.MToolItemRenderer <em>MTool Item Renderer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MTool Item Renderer</em>'.
	 * @see org.eclipse.e4.ui.model.workbench.MToolItemRenderer
	 * @generated
	 */
	EClass getMToolItemRenderer();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.e4.ui.model.workbench.MToolItemRenderer#getRenderer <em>Renderer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Renderer</em>'.
	 * @see org.eclipse.e4.ui.model.workbench.MToolItemRenderer#getRenderer()
	 * @see #getMToolItemRenderer()
	 * @generated
	 */
	EAttribute getMToolItemRenderer_Renderer();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>IContribution Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>IContribution Item</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object" serializeable="false"
	 * @generated
	 */
	EDataType getIContributionItem();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WorkbenchFactory getWorkbenchFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.e4.ui.model.internal.workbench.MWorkbenchWindowImpl <em>MWorkbench Window</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.e4.ui.model.internal.workbench.MWorkbenchWindowImpl
		 * @see org.eclipse.e4.ui.model.internal.workbench.WorkbenchPackageImpl#getMWorkbenchWindow()
		 * @generated
		 */
		EClass MWORKBENCH_WINDOW = eINSTANCE.getMWorkbenchWindow();

		/**
		 * The meta object literal for the '<em><b>Shared Parts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MWORKBENCH_WINDOW__SHARED_PARTS = eINSTANCE.getMWorkbenchWindow_SharedParts();

		/**
		 * The meta object literal for the '{@link org.eclipse.e4.ui.model.internal.workbench.MProxyPartImpl <em>MProxy Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.e4.ui.model.internal.workbench.MProxyPartImpl
		 * @see org.eclipse.e4.ui.model.internal.workbench.WorkbenchPackageImpl#getMProxyPart()
		 * @generated
		 */
		EClass MPROXY_PART = eINSTANCE.getMProxyPart();

		/**
		 * The meta object literal for the '<em><b>Part</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MPROXY_PART__PART = eINSTANCE.getMProxyPart_Part();

		/**
		 * The meta object literal for the '{@link org.eclipse.e4.ui.model.internal.workbench.MPerspectiveImpl <em>MPerspective</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.e4.ui.model.internal.workbench.MPerspectiveImpl
		 * @see org.eclipse.e4.ui.model.internal.workbench.WorkbenchPackageImpl#getMPerspective()
		 * @generated
		 */
		EClass MPERSPECTIVE = eINSTANCE.getMPerspective();

		/**
		 * The meta object literal for the '{@link org.eclipse.e4.ui.model.internal.workbench.MWorkbenchImpl <em>MWorkbench</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.e4.ui.model.internal.workbench.MWorkbenchImpl
		 * @see org.eclipse.e4.ui.model.internal.workbench.WorkbenchPackageImpl#getMWorkbench()
		 * @generated
		 */
		EClass MWORKBENCH = eINSTANCE.getMWorkbench();

		/**
		 * The meta object literal for the '<em><b>Wb Windows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MWORKBENCH__WB_WINDOWS = eINSTANCE.getMWorkbench_WbWindows();

		/**
		 * The meta object literal for the '<em><b>Cur WBW</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MWORKBENCH__CUR_WBW = eINSTANCE.getMWorkbench_CurWBW();

		/**
		 * The meta object literal for the '{@link org.eclipse.e4.ui.model.internal.workbench.MMenuItemRendererImpl <em>MMenu Item Renderer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.e4.ui.model.internal.workbench.MMenuItemRendererImpl
		 * @see org.eclipse.e4.ui.model.internal.workbench.WorkbenchPackageImpl#getMMenuItemRenderer()
		 * @generated
		 */
		EClass MMENU_ITEM_RENDERER = eINSTANCE.getMMenuItemRenderer();

		/**
		 * The meta object literal for the '<em><b>Renderer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MMENU_ITEM_RENDERER__RENDERER = eINSTANCE.getMMenuItemRenderer_Renderer();

		/**
		 * The meta object literal for the '{@link org.eclipse.e4.ui.model.internal.workbench.MToolItemRendererImpl <em>MTool Item Renderer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.e4.ui.model.internal.workbench.MToolItemRendererImpl
		 * @see org.eclipse.e4.ui.model.internal.workbench.WorkbenchPackageImpl#getMToolItemRenderer()
		 * @generated
		 */
		EClass MTOOL_ITEM_RENDERER = eINSTANCE.getMToolItemRenderer();

		/**
		 * The meta object literal for the '<em><b>Renderer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MTOOL_ITEM_RENDERER__RENDERER = eINSTANCE.getMToolItemRenderer_Renderer();

		/**
		 * The meta object literal for the '<em>IContribution Item</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see org.eclipse.e4.ui.model.internal.workbench.WorkbenchPackageImpl#getIContributionItem()
		 * @generated
		 */
		EDataType ICONTRIBUTION_ITEM = eINSTANCE.getIContributionItem();

	}

} //WorkbenchPackage