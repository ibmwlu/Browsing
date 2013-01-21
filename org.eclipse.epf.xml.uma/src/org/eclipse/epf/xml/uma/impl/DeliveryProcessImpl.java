/*******************************************************************************
 * Copyright (c) 2005, 2009 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * IBM Corporation - initial implementation
 *******************************************************************************/
package org.eclipse.epf.xml.uma.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.epf.xml.uma.DeliveryProcess;
import org.eclipse.epf.xml.uma.UmaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delivery Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.epf.xml.uma.impl.DeliveryProcessImpl#getGroup4 <em>Group4</em>}</li>
 *   <li>{@link org.eclipse.epf.xml.uma.impl.DeliveryProcessImpl#getCommunicationsMaterial <em>Communications Material</em>}</li>
 *   <li>{@link org.eclipse.epf.xml.uma.impl.DeliveryProcessImpl#getEducationMaterial <em>Education Material</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeliveryProcessImpl extends ProcessImpl implements DeliveryProcess {
	/**
	 * The cached value of the '{@link #getGroup4() <em>Group4</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup4()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group4;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeliveryProcessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UmaPackage.Literals.DELIVERY_PROCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup4() {
		if (group4 == null) {
			group4 = new BasicFeatureMap(this, UmaPackage.DELIVERY_PROCESS__GROUP4);
		}
		return group4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getCommunicationsMaterial() {
		return getGroup4().list(UmaPackage.Literals.DELIVERY_PROCESS__COMMUNICATIONS_MATERIAL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getEducationMaterial() {
		return getGroup4().list(UmaPackage.Literals.DELIVERY_PROCESS__EDUCATION_MATERIAL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UmaPackage.DELIVERY_PROCESS__GROUP4:
				return ((InternalEList<?>)getGroup4()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UmaPackage.DELIVERY_PROCESS__GROUP4:
				if (coreType) return getGroup4();
				return ((FeatureMap.Internal)getGroup4()).getWrapper();
			case UmaPackage.DELIVERY_PROCESS__COMMUNICATIONS_MATERIAL:
				return getCommunicationsMaterial();
			case UmaPackage.DELIVERY_PROCESS__EDUCATION_MATERIAL:
				return getEducationMaterial();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
		@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UmaPackage.DELIVERY_PROCESS__GROUP4:
				((FeatureMap.Internal)getGroup4()).set(newValue);
				return;
			case UmaPackage.DELIVERY_PROCESS__COMMUNICATIONS_MATERIAL:
				getCommunicationsMaterial().clear();
				getCommunicationsMaterial().addAll((Collection<? extends String>)newValue);
				return;
			case UmaPackage.DELIVERY_PROCESS__EDUCATION_MATERIAL:
				getEducationMaterial().clear();
				getEducationMaterial().addAll((Collection<? extends String>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case UmaPackage.DELIVERY_PROCESS__GROUP4:
				getGroup4().clear();
				return;
			case UmaPackage.DELIVERY_PROCESS__COMMUNICATIONS_MATERIAL:
				getCommunicationsMaterial().clear();
				return;
			case UmaPackage.DELIVERY_PROCESS__EDUCATION_MATERIAL:
				getEducationMaterial().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UmaPackage.DELIVERY_PROCESS__GROUP4:
				return group4 != null && !group4.isEmpty();
			case UmaPackage.DELIVERY_PROCESS__COMMUNICATIONS_MATERIAL:
				return !getCommunicationsMaterial().isEmpty();
			case UmaPackage.DELIVERY_PROCESS__EDUCATION_MATERIAL:
				return !getEducationMaterial().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (group4: ");
		result.append(group4);
		result.append(')');
		return result.toString();
	}

} //DeliveryProcessImpl
