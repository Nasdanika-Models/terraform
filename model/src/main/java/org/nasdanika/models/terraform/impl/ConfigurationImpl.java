/**
 */
package org.nasdanika.models.terraform.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.terraform.Backend;
import org.nasdanika.models.terraform.Configuration;
import org.nasdanika.models.terraform.Provider;
import org.nasdanika.models.terraform.TerraformPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.terraform.impl.ConfigurationImpl#getProviders <em>Providers</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.impl.ConfigurationImpl#getBackend <em>Backend</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfigurationImpl extends ModuleImpl implements Configuration {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TerraformPackage.Literals.CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Provider> getProviders() {
		return (EList<Provider>)eDynamicGet(TerraformPackage.CONFIGURATION__PROVIDERS, TerraformPackage.Literals.CONFIGURATION__PROVIDERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Backend getBackend() {
		return (Backend)eDynamicGet(TerraformPackage.CONFIGURATION__BACKEND, TerraformPackage.Literals.CONFIGURATION__BACKEND, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBackend(Backend newBackend, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newBackend, TerraformPackage.CONFIGURATION__BACKEND, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBackend(Backend newBackend) {
		eDynamicSet(TerraformPackage.CONFIGURATION__BACKEND, TerraformPackage.Literals.CONFIGURATION__BACKEND, newBackend);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TerraformPackage.CONFIGURATION__PROVIDERS:
				return ((InternalEList<?>)getProviders()).basicRemove(otherEnd, msgs);
			case TerraformPackage.CONFIGURATION__BACKEND:
				return basicSetBackend(null, msgs);
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
			case TerraformPackage.CONFIGURATION__PROVIDERS:
				return getProviders();
			case TerraformPackage.CONFIGURATION__BACKEND:
				return getBackend();
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
			case TerraformPackage.CONFIGURATION__PROVIDERS:
				getProviders().clear();
				getProviders().addAll((Collection<? extends Provider>)newValue);
				return;
			case TerraformPackage.CONFIGURATION__BACKEND:
				setBackend((Backend)newValue);
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
			case TerraformPackage.CONFIGURATION__PROVIDERS:
				getProviders().clear();
				return;
			case TerraformPackage.CONFIGURATION__BACKEND:
				setBackend((Backend)null);
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
			case TerraformPackage.CONFIGURATION__PROVIDERS:
				return !getProviders().isEmpty();
			case TerraformPackage.CONFIGURATION__BACKEND:
				return getBackend() != null;
		}
		return super.eIsSet(featureID);
	}

} //ConfigurationImpl
