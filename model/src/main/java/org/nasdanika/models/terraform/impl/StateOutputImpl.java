/**
 */
package org.nasdanika.models.terraform.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.terraform.StateOutput;
import org.nasdanika.models.terraform.TerraformPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Output</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.terraform.impl.StateOutputImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.impl.StateOutputImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.impl.StateOutputImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.impl.StateOutputImpl#isSensitive <em>Sensitive</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateOutputImpl extends MinimalEObjectImpl.Container implements StateOutput {
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
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

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
	 * The default value of the '{@link #isSensitive() <em>Sensitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSensitive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SENSITIVE_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateOutputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TerraformPackage.Literals.STATE_OUTPUT;
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
	public String getName() {
		return (String)eDynamicGet(TerraformPackage.STATE_OUTPUT__NAME, TerraformPackage.Literals.STATE_OUTPUT__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		eDynamicSet(TerraformPackage.STATE_OUTPUT__NAME, TerraformPackage.Literals.STATE_OUTPUT__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValue() {
		return (String)eDynamicGet(TerraformPackage.STATE_OUTPUT__VALUE, TerraformPackage.Literals.STATE_OUTPUT__VALUE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(String newValue) {
		eDynamicSet(TerraformPackage.STATE_OUTPUT__VALUE, TerraformPackage.Literals.STATE_OUTPUT__VALUE, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getType() {
		return (String)eDynamicGet(TerraformPackage.STATE_OUTPUT__TYPE, TerraformPackage.Literals.STATE_OUTPUT__TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(String newType) {
		eDynamicSet(TerraformPackage.STATE_OUTPUT__TYPE, TerraformPackage.Literals.STATE_OUTPUT__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSensitive() {
		return (Boolean)eDynamicGet(TerraformPackage.STATE_OUTPUT__SENSITIVE, TerraformPackage.Literals.STATE_OUTPUT__SENSITIVE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSensitive(boolean newSensitive) {
		eDynamicSet(TerraformPackage.STATE_OUTPUT__SENSITIVE, TerraformPackage.Literals.STATE_OUTPUT__SENSITIVE, newSensitive);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TerraformPackage.STATE_OUTPUT__NAME:
				return getName();
			case TerraformPackage.STATE_OUTPUT__VALUE:
				return getValue();
			case TerraformPackage.STATE_OUTPUT__TYPE:
				return getType();
			case TerraformPackage.STATE_OUTPUT__SENSITIVE:
				return isSensitive();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TerraformPackage.STATE_OUTPUT__NAME:
				setName((String)newValue);
				return;
			case TerraformPackage.STATE_OUTPUT__VALUE:
				setValue((String)newValue);
				return;
			case TerraformPackage.STATE_OUTPUT__TYPE:
				setType((String)newValue);
				return;
			case TerraformPackage.STATE_OUTPUT__SENSITIVE:
				setSensitive((Boolean)newValue);
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
			case TerraformPackage.STATE_OUTPUT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TerraformPackage.STATE_OUTPUT__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case TerraformPackage.STATE_OUTPUT__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case TerraformPackage.STATE_OUTPUT__SENSITIVE:
				setSensitive(SENSITIVE_EDEFAULT);
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
			case TerraformPackage.STATE_OUTPUT__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case TerraformPackage.STATE_OUTPUT__VALUE:
				return VALUE_EDEFAULT == null ? getValue() != null : !VALUE_EDEFAULT.equals(getValue());
			case TerraformPackage.STATE_OUTPUT__TYPE:
				return TYPE_EDEFAULT == null ? getType() != null : !TYPE_EDEFAULT.equals(getType());
			case TerraformPackage.STATE_OUTPUT__SENSITIVE:
				return isSensitive() != SENSITIVE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //StateOutputImpl
