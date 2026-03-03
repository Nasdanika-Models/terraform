/**
 */
package org.nasdanika.models.terraform.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.terraform.TerraformPackage;
import org.nasdanika.models.terraform.Validation;
import org.nasdanika.models.terraform.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.terraform.impl.VariableImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.impl.VariableImpl#getDefault <em>Default</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.impl.VariableImpl#isSensitive <em>Sensitive</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.impl.VariableImpl#isNullable <em>Nullable</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.impl.VariableImpl#getValidations <em>Validations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariableImpl extends DocumentedNamedElementImpl implements Variable {
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
	 * The default value of the '{@link #getDefault() <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_EDEFAULT = null;

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
	 * The default value of the '{@link #isNullable() <em>Nullable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNullable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NULLABLE_EDEFAULT = true;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TerraformPackage.Literals.VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getType() {
		return (String)eDynamicGet(TerraformPackage.VARIABLE__TYPE, TerraformPackage.Literals.VARIABLE__TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(String newType) {
		eDynamicSet(TerraformPackage.VARIABLE__TYPE, TerraformPackage.Literals.VARIABLE__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefault() {
		return (String)eDynamicGet(TerraformPackage.VARIABLE__DEFAULT, TerraformPackage.Literals.VARIABLE__DEFAULT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefault(String newDefault) {
		eDynamicSet(TerraformPackage.VARIABLE__DEFAULT, TerraformPackage.Literals.VARIABLE__DEFAULT, newDefault);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSensitive() {
		return (Boolean)eDynamicGet(TerraformPackage.VARIABLE__SENSITIVE, TerraformPackage.Literals.VARIABLE__SENSITIVE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSensitive(boolean newSensitive) {
		eDynamicSet(TerraformPackage.VARIABLE__SENSITIVE, TerraformPackage.Literals.VARIABLE__SENSITIVE, newSensitive);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isNullable() {
		return (Boolean)eDynamicGet(TerraformPackage.VARIABLE__NULLABLE, TerraformPackage.Literals.VARIABLE__NULLABLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNullable(boolean newNullable) {
		eDynamicSet(TerraformPackage.VARIABLE__NULLABLE, TerraformPackage.Literals.VARIABLE__NULLABLE, newNullable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Validation> getValidations() {
		return (EList<Validation>)eDynamicGet(TerraformPackage.VARIABLE__VALIDATIONS, TerraformPackage.Literals.VARIABLE__VALIDATIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TerraformPackage.VARIABLE__VALIDATIONS:
				return ((InternalEList<?>)getValidations()).basicRemove(otherEnd, msgs);
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
			case TerraformPackage.VARIABLE__TYPE:
				return getType();
			case TerraformPackage.VARIABLE__DEFAULT:
				return getDefault();
			case TerraformPackage.VARIABLE__SENSITIVE:
				return isSensitive();
			case TerraformPackage.VARIABLE__NULLABLE:
				return isNullable();
			case TerraformPackage.VARIABLE__VALIDATIONS:
				return getValidations();
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
			case TerraformPackage.VARIABLE__TYPE:
				setType((String)newValue);
				return;
			case TerraformPackage.VARIABLE__DEFAULT:
				setDefault((String)newValue);
				return;
			case TerraformPackage.VARIABLE__SENSITIVE:
				setSensitive((Boolean)newValue);
				return;
			case TerraformPackage.VARIABLE__NULLABLE:
				setNullable((Boolean)newValue);
				return;
			case TerraformPackage.VARIABLE__VALIDATIONS:
				getValidations().clear();
				getValidations().addAll((Collection<? extends Validation>)newValue);
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
			case TerraformPackage.VARIABLE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case TerraformPackage.VARIABLE__DEFAULT:
				setDefault(DEFAULT_EDEFAULT);
				return;
			case TerraformPackage.VARIABLE__SENSITIVE:
				setSensitive(SENSITIVE_EDEFAULT);
				return;
			case TerraformPackage.VARIABLE__NULLABLE:
				setNullable(NULLABLE_EDEFAULT);
				return;
			case TerraformPackage.VARIABLE__VALIDATIONS:
				getValidations().clear();
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
			case TerraformPackage.VARIABLE__TYPE:
				return TYPE_EDEFAULT == null ? getType() != null : !TYPE_EDEFAULT.equals(getType());
			case TerraformPackage.VARIABLE__DEFAULT:
				return DEFAULT_EDEFAULT == null ? getDefault() != null : !DEFAULT_EDEFAULT.equals(getDefault());
			case TerraformPackage.VARIABLE__SENSITIVE:
				return isSensitive() != SENSITIVE_EDEFAULT;
			case TerraformPackage.VARIABLE__NULLABLE:
				return isNullable() != NULLABLE_EDEFAULT;
			case TerraformPackage.VARIABLE__VALIDATIONS:
				return !getValidations().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //VariableImpl
