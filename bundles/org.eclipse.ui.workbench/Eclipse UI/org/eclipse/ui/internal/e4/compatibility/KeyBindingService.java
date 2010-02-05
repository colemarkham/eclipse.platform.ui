/*******************************************************************************
 * Copyright (c) 2010 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 ******************************************************************************/

package org.eclipse.ui.internal.e4.compatibility;

import org.eclipse.jface.action.IAction;
import org.eclipse.ui.IKeyBindingService;

/**
 * @since 3.5
 *
 */
public class KeyBindingService implements IKeyBindingService {

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IKeyBindingService#getScopes()
	 */
	public String[] getScopes() {
		// FIXME compat getScopes
		E4Util.unsupported("getScopes"); //$NON-NLS-1$
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IKeyBindingService#registerAction(org.eclipse.jface.action.IAction)
	 */
	public void registerAction(IAction action) {
		// FIXME compat registerAction
		E4Util.unsupported("registerAction"); //$NON-NLS-1$

	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IKeyBindingService#setScopes(java.lang.String[])
	 */
	public void setScopes(String[] scopes) {
		// FIXME compat setScopes
		E4Util.unsupported("setScopes"); //$NON-NLS-1$

	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IKeyBindingService#unregisterAction(org.eclipse.jface.action.IAction)
	 */
	public void unregisterAction(IAction action) {
		// FIXME compat unregisterAction
		E4Util.unsupported("unregisterAction"); //$NON-NLS-1$

	}

}