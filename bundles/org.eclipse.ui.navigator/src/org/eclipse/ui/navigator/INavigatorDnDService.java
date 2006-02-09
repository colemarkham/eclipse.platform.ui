/*******************************************************************************
 * Copyright (c) 2006 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 ******************************************************************************/

package org.eclipse.ui.navigator;


/**
 * 
 * Provides instances of {@link CommonDragAdapterAssistant} and
 * {@link CommonDropAdapterAssistant} for the associated
 * {@link INavigatorContentService}.
 * 
 * <p>
 * Clients should only take note of this Service they are are using the
 * {@link INavigatorContentService} in the context of a viewer which is not or
 * does not extend {@link CommonViewer}. Clients should take a look at the
 * initalization of the DND support in the {@link CommonViewer} if they wish to
 * support this capability in their own viewers.
 * </p>
 * 
 * @see CommonDragAdapter
 * @see CommonDragAdapterAssistant
 * @see CommonDropAdapter
 * @see CommonDropAdapterAssistant
 * @see CommonViewer#initDragAndDrop()
 * @see INavigatorContentService#getDnDService()
 * @see <a
 *      href="http://www.eclipse.org/articles/Article-SWT-DND/DND-in-SWT.html">Drag
 *      and Drop: Adding Drag and Drop to an SWT Application</a>
 * @see <a
 *      href="http://www.eclipse.org/articles/Article-Workbench-DND/drag_drop.html">Drag
 *      and Drop in the Eclipse UI (Custom Transfer Types)</a>
 * 
 * @since 3.2
 * 
 * 
 */
public interface INavigatorDnDService {

	/**
	 * 
	 * As part of the <b>org.eclipse.ui.navigator.viewer</b> extension point,
	 * clients may explicit extend the support Transfer Types of a particular
	 * viewer using the <b>dragAssistant</b> element. This element defines a
	 * class which extends {@link CommonDragAdapterAssistant} and can direct the
	 * viewer on how to provide different kinds of DND Transfer Types. The array
	 * is returned in no particular order.
	 * 
	 * 
	 * 
	 * @return An array of {@link CommonDragAdapterAssistant} or an empty array.
	 */
	CommonDragAdapterAssistant[] getCommonDragAssistants();

	/**
	 * 
	 * This method returns an array of {@link CommonDropAdapterAssistant} from
	 * content extensions that are <i>visible</i> and <i>active</i> for the
	 * associated {@link INavigatorContentService}. The array is sorted by
	 * priority, with overrides taken into account.
	 * 
	 * <p>
	 * That is, if an extension X overrides extension Y (see
	 * <b>org.eclipse.ui.navigator.navigatorContent/override</b>), then X will
	 * occur before Y in the array. If X and Y override Z, but X has higher
	 * priority than Y, then X will occur before Y, and Y will occur before Z.
	 * </p>
	 * <p>
	 * The array should be processed from the first element to the last, asking
	 * each extension to
	 * {@link CommonDropAdapterAssistant#validateDrop(Object, int, org.eclipse.swt.dnd.TransferData)}.
	 * The first to successfully validate the drop operation will have the
	 * opportunity to
	 * {@link CommonDropAdapterAssistant#handleDrop(org.eclipse.swt.dnd.DropTargetEvent, Object)}.
	 * </p>
	 * 
	 * @param aDropTarget
	 *            The target element in the viewer of the drop operation
	 * @return An array of {@link CommonDropAdapterAssistant}s that are defined
	 *         by the set of
	 *         <b>org.eclipse.ui.navigator.navigatorContent/navigatorContent</b>
	 *         extensions that provide a <b>possibleChildren</b> expression
	 *         that matches the given drop target.
	 */
	CommonDropAdapterAssistant[] findCommonDropAdapterAssistants(
			Object aDropTarget);
}
