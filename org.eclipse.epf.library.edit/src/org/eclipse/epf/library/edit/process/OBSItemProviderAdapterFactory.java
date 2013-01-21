//------------------------------------------------------------------------------
// Copyright (c) 2005, 2006 IBM Corporation and others.
// All rights reserved. This program and the accompanying materials
// are made available under the terms of the Eclipse Public License v1.0
// which accompanies this distribution, and is available at
// http://www.eclipse.org/legal/epl-v10.html
//
// Contributors:
// IBM Corporation - initial implementation
//------------------------------------------------------------------------------
package org.eclipse.epf.library.edit.process;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.epf.library.edit.util.TngUtil;

/**
 * @author Phong Nguyen Le
 * @since 1.0
 */
public class OBSItemProviderAdapterFactory extends ItemProviderAdapterFactory {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.epf.uma.util.BreakdownAdapterFactory#createActivityAdapter()
	 */
	public Adapter createActivityAdapter() {
		return new OBSActivityItemProvider(this);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.epf.uma.util.BreakdownAdapterFactory#createIterationAdapter()
	 */
	public Adapter createIterationAdapter() {
		return createActivityAdapter();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.epf.uma.util.BreakdownAdapterFactory#createPhaseAdapter()
	 */
	public Adapter createPhaseAdapter() {
		return createActivityAdapter();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.epf.uma.util.BreakdownAdapterFactory#createTeamProfileAdapter()
	 */
	public Adapter createTeamProfileAdapter() {
		return new TeamProfileItemProvider(this, (ItemProviderAdapter) TngUtil.umaItemProviderAdapterFactory.createTeamProfileAdapter());
	}

	// /* (non-Javadoc)
	// * @see
	// org.eclipse.epf.uma.util.BreakdownAdapterFactory#createTeamProfileAdapter()
	// */
	// public Adapter createCompositeRoleAdapter() {
	// return new OBSCompositeRoleItemProvider(this);
	// }

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.epf.uma.util.BreakdownAdapterFactory#createPhaseAdapter()
	 */
	public Adapter createMilestoneAdapter() {
		return new OBSMilestoneItemProvider(this, (ItemProviderAdapter) TngUtil.umaItemProviderAdapterFactory
				.createMilestoneAdapter());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ibm.library.edit.process.ItemProviderAdapterFactory#createProcessAdapter()
	 */
	// public Adapter createProcessAdapter() {
	// return createActivityAdapter();
	// }
	public Adapter createCapabilityPatternAdapter() {
		return new OBSProcessItemProvider(this, (ItemProviderAdapter) TngUtil.umaItemProviderAdapterFactory.createCapabilityPatternAdapter());
	}

	public Adapter createDeliveryProcessAdapter() {
		return new OBSProcessItemProvider(this, (ItemProviderAdapter) TngUtil.umaItemProviderAdapterFactory.createDeliveryProcessAdapter());
	}

}
