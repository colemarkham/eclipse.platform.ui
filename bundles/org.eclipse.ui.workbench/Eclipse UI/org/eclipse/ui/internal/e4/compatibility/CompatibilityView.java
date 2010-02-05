/*******************************************************************************
 * Copyright (c) 2009, 2010 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 ******************************************************************************/

package org.eclipse.ui.internal.e4.compatibility;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.e4.core.services.annotations.Optional;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.internal.WorkbenchPlugin;

public class CompatibilityView extends CompatibilityPart {

	private ViewDescriptor descriptor;

	ViewDescriptor getDescriptor() {
		return descriptor;
	}

	protected IWorkbenchPart createPart() throws PartInitException {
		try {
			descriptor = (ViewDescriptor) PlatformUI.getWorkbench().getViewRegistry().find(
					part.getId());
			return descriptor.createView();
		} catch (CoreException e) {
			IStatus status = e.getStatus();
			throw new PartInitException(new Status(IStatus.ERROR, WorkbenchPlugin.PI_WORKBENCH,
					status.getCode(), status.getMessage(), status.getException()));
		}
	}

	// FIXME: remove me when bug 299760 is fixed
	void doSave(@Optional IProgressMonitor monitor) {
		super.doSave(monitor);
	}

	protected void initialize(IWorkbenchPart part) throws PartInitException {
		((IViewPart) part).init(
				new ViewSite(this.part, part, descriptor.getConfigurationElement()), null);
	}

	public IViewPart getView() {
		return (IViewPart) getPart();
	}

}