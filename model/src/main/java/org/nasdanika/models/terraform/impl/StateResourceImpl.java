/**
 */
package org.nasdanika.models.terraform.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.terraform.ResourceInstance;
import org.nasdanika.models.terraform.ResourceMode;
import org.nasdanika.models.terraform.StateResource;
import org.nasdanika.models.terraform.TerraformPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.terraform.impl.StateResourceImpl#getModule <em>Module</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.impl.StateResourceImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.impl.StateResourceImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.impl.StateResourceImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.impl.StateResourceImpl#getProviderConfig <em>Provider Config</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.impl.StateResourceImpl#getInstances <em>Instances</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateResourceImpl extends MinimalEObjectImpl.Container implements StateResource {
	/**
	 * The default value of the '{@link #getModule() <em>Module</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModule()
	 * @generated
	 * @ordered
	 */
	protected static final String MODULE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected static final ResourceMode MODE_EDEFAULT = ResourceMode.MANAGED;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getProviderConfig() <em>Provider Config</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviderConfig()
	 * @generated
	 * @ordered
	 */
	protected static final String PROVIDER_CONFIG_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TerraformPackage.Literals.STATE_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getModule() {
		return (String)eDynamicGet(TerraformPackage.STATE_RESOURCE__MODULE, TerraformPackage.Literals.STATE_RESOURCE__MODULE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModule(String newModule) {
		eDynamicSet(TerraformPackage.STATE_RESOURCE__MODULE, TerraformPackage.Literals.STATE_RESOURCE__MODULE, newModule);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceMode getMode() {
		return (ResourceMode)eDynamicGet(TerraformPackage.STATE_RESOURCE__MODE, TerraformPackage.Literals.STATE_RESOURCE__MODE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMode(ResourceMode newMode) {
		eDynamicSet(TerraformPackage.STATE_RESOURCE__MODE, TerraformPackage.Literals.STATE_RESOURCE__MODE, newMode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getType() {
		return (String)eDynamicGet(TerraformPackage.STATE_RESOURCE__TYPE, TerraformPackage.Literals.STATE_RESOURCE__TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(String newType) {
		eDynamicSet(TerraformPackage.STATE_RESOURCE__TYPE, TerraformPackage.Literals.STATE_RESOURCE__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return (String)eDynamicGet(TerraformPackage.STATE_RESOURCE__NAME, TerraformPackage.Literals.STATE_RESOURCE__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		eDynamicSet(TerraformPackage.STATE_RESOURCE__NAME, TerraformPackage.Literals.STATE_RESOURCE__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProviderConfig() {
		return (String)eDynamicGet(TerraformPackage.STATE_RESOURCE__PROVIDER_CONFIG, TerraformPackage.Literals.STATE_RESOURCE__PROVIDER_CONFIG, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProviderConfig(String newProviderConfig) {
		eDynamicSet(TerraformPackage.STATE_RESOURCE__PROVIDER_CONFIG, TerraformPackage.Literals.STATE_RESOURCE__PROVIDER_CONFIG, newProviderConfig);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ResourceInstance> getInstances() {
		return (EList<ResourceInstance>)eDynamicGet(TerraformPackage.STATE_RESOURCE__INSTANCES, TerraformPackage.Literals.STATE_RESOURCE__INSTANCES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TerraformPackage.STATE_RESOURCE__INSTANCES:
				return ((InternalEList<?>)getInstances()).basicRemove(otherEnd, msgs);
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
			case TerraformPackage.STATE_RESOURCE__MODULE:
				return getModule();
			case TerraformPackage.STATE_RESOURCE__MODE:
				return getMode();
			case TerraformPackage.STATE_RESOURCE__TYPE:
				return getType();
			case TerraformPackage.STATE_RESOURCE__NAME:
				return getName();
			case TerraformPackage.STATE_RESOURCE__PROVIDER_CONFIG:
				return getProviderConfig();
			case TerraformPackage.STATE_RESOURCE__INSTANCES:
				return getInstances();
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
			case TerraformPackage.STATE_RESOURCE__MODULE:
				setModule((String)newValue);
				return;
			case TerraformPackage.STATE_RESOURCE__MODE:
				setMode((ResourceMode)newValue);
				return;
			case TerraformPackage.STATE_RESOURCE__TYPE:
				setType((String)newValue);
				return;
			case TerraformPackage.STATE_RESOURCE__NAME:
				setName((String)newValue);
				return;
			case TerraformPackage.STATE_RESOURCE__PROVIDER_CONFIG:
				setProviderConfig((String)newValue);
				return;
			case TerraformPackage.STATE_RESOURCE__INSTANCES:
				getInstances().clear();
				getInstances().addAll((Collection<? extends ResourceInstance>)newValue);
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
			case TerraformPackage.STATE_RESOURCE__MODULE:
				setModule(MODULE_EDEFAULT);
				return;
			case TerraformPackage.STATE_RESOURCE__MODE:
				setMode(MODE_EDEFAULT);
				return;
			case TerraformPackage.STATE_RESOURCE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case TerraformPackage.STATE_RESOURCE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TerraformPackage.STATE_RESOURCE__PROVIDER_CONFIG:
				setProviderConfig(PROVIDER_CONFIG_EDEFAULT);
				return;
			case TerraformPackage.STATE_RESOURCE__INSTANCES:
				getInstances().clear();
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
			case TerraformPackage.STATE_RESOURCE__MODULE:
				return MODULE_EDEFAULT == null ? getModule() != null : !MODULE_EDEFAULT.equals(getModule());
			case TerraformPackage.STATE_RESOURCE__MODE:
				return getMode() != MODE_EDEFAULT;
			case TerraformPackage.STATE_RESOURCE__TYPE:
				return TYPE_EDEFAULT == null ? getType() != null : !TYPE_EDEFAULT.equals(getType());
			case TerraformPackage.STATE_RESOURCE__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case TerraformPackage.STATE_RESOURCE__PROVIDER_CONFIG:
				return PROVIDER_CONFIG_EDEFAULT == null ? getProviderConfig() != null : !PROVIDER_CONFIG_EDEFAULT.equals(getProviderConfig());
			case TerraformPackage.STATE_RESOURCE__INSTANCES:
				return !getInstances().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StateResourceImpl
