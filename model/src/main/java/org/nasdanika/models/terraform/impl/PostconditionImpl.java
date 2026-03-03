/**
 */
package org.nasdanika.models.terraform.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.terraform.Postcondition;
import org.nasdanika.models.terraform.TerraformPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Postcondition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.terraform.impl.PostconditionImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.impl.PostconditionImpl#getErrorMessage <em>Error Message</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PostconditionImpl extends MinimalEObjectImpl.Container implements Postcondition {
	/**
	 * The default value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getErrorMessage() <em>Error Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String ERROR_MESSAGE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PostconditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TerraformPackage.Literals.POSTCONDITION;
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
	public String getCondition() {
		return (String)eDynamicGet(TerraformPackage.POSTCONDITION__CONDITION, TerraformPackage.Literals.POSTCONDITION__CONDITION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCondition(String newCondition) {
		eDynamicSet(TerraformPackage.POSTCONDITION__CONDITION, TerraformPackage.Literals.POSTCONDITION__CONDITION, newCondition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getErrorMessage() {
		return (String)eDynamicGet(TerraformPackage.POSTCONDITION__ERROR_MESSAGE, TerraformPackage.Literals.POSTCONDITION__ERROR_MESSAGE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setErrorMessage(String newErrorMessage) {
		eDynamicSet(TerraformPackage.POSTCONDITION__ERROR_MESSAGE, TerraformPackage.Literals.POSTCONDITION__ERROR_MESSAGE, newErrorMessage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TerraformPackage.POSTCONDITION__CONDITION:
				return getCondition();
			case TerraformPackage.POSTCONDITION__ERROR_MESSAGE:
				return getErrorMessage();
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
			case TerraformPackage.POSTCONDITION__CONDITION:
				setCondition((String)newValue);
				return;
			case TerraformPackage.POSTCONDITION__ERROR_MESSAGE:
				setErrorMessage((String)newValue);
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
			case TerraformPackage.POSTCONDITION__CONDITION:
				setCondition(CONDITION_EDEFAULT);
				return;
			case TerraformPackage.POSTCONDITION__ERROR_MESSAGE:
				setErrorMessage(ERROR_MESSAGE_EDEFAULT);
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
			case TerraformPackage.POSTCONDITION__CONDITION:
				return CONDITION_EDEFAULT == null ? getCondition() != null : !CONDITION_EDEFAULT.equals(getCondition());
			case TerraformPackage.POSTCONDITION__ERROR_MESSAGE:
				return ERROR_MESSAGE_EDEFAULT == null ? getErrorMessage() != null : !ERROR_MESSAGE_EDEFAULT.equals(getErrorMessage());
		}
		return super.eIsSet(featureID);
	}

} //PostconditionImpl
