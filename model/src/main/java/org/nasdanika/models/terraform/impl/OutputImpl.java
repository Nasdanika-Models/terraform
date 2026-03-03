/**
 */
package org.nasdanika.models.terraform.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.terraform.Output;
import org.nasdanika.models.terraform.Precondition;
import org.nasdanika.models.terraform.TerraformPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Output</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.terraform.impl.OutputImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.impl.OutputImpl#isSensitive <em>Sensitive</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.impl.OutputImpl#getDependsOn <em>Depends On</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.impl.OutputImpl#getPreconditions <em>Preconditions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OutputImpl extends DocumentedNamedElementImpl implements Output {
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
	protected OutputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TerraformPackage.Literals.OUTPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValue() {
		return (String)eDynamicGet(TerraformPackage.OUTPUT__VALUE, TerraformPackage.Literals.OUTPUT__VALUE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(String newValue) {
		eDynamicSet(TerraformPackage.OUTPUT__VALUE, TerraformPackage.Literals.OUTPUT__VALUE, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSensitive() {
		return (Boolean)eDynamicGet(TerraformPackage.OUTPUT__SENSITIVE, TerraformPackage.Literals.OUTPUT__SENSITIVE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSensitive(boolean newSensitive) {
		eDynamicSet(TerraformPackage.OUTPUT__SENSITIVE, TerraformPackage.Literals.OUTPUT__SENSITIVE, newSensitive);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getDependsOn() {
		return (EList<String>)eDynamicGet(TerraformPackage.OUTPUT__DEPENDS_ON, TerraformPackage.Literals.OUTPUT__DEPENDS_ON, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Precondition> getPreconditions() {
		return (EList<Precondition>)eDynamicGet(TerraformPackage.OUTPUT__PRECONDITIONS, TerraformPackage.Literals.OUTPUT__PRECONDITIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TerraformPackage.OUTPUT__PRECONDITIONS:
				return ((InternalEList<?>)getPreconditions()).basicRemove(otherEnd, msgs);
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
			case TerraformPackage.OUTPUT__VALUE:
				return getValue();
			case TerraformPackage.OUTPUT__SENSITIVE:
				return isSensitive();
			case TerraformPackage.OUTPUT__DEPENDS_ON:
				return getDependsOn();
			case TerraformPackage.OUTPUT__PRECONDITIONS:
				return getPreconditions();
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
			case TerraformPackage.OUTPUT__VALUE:
				setValue((String)newValue);
				return;
			case TerraformPackage.OUTPUT__SENSITIVE:
				setSensitive((Boolean)newValue);
				return;
			case TerraformPackage.OUTPUT__DEPENDS_ON:
				getDependsOn().clear();
				getDependsOn().addAll((Collection<? extends String>)newValue);
				return;
			case TerraformPackage.OUTPUT__PRECONDITIONS:
				getPreconditions().clear();
				getPreconditions().addAll((Collection<? extends Precondition>)newValue);
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
			case TerraformPackage.OUTPUT__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case TerraformPackage.OUTPUT__SENSITIVE:
				setSensitive(SENSITIVE_EDEFAULT);
				return;
			case TerraformPackage.OUTPUT__DEPENDS_ON:
				getDependsOn().clear();
				return;
			case TerraformPackage.OUTPUT__PRECONDITIONS:
				getPreconditions().clear();
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
			case TerraformPackage.OUTPUT__VALUE:
				return VALUE_EDEFAULT == null ? getValue() != null : !VALUE_EDEFAULT.equals(getValue());
			case TerraformPackage.OUTPUT__SENSITIVE:
				return isSensitive() != SENSITIVE_EDEFAULT;
			case TerraformPackage.OUTPUT__DEPENDS_ON:
				return !getDependsOn().isEmpty();
			case TerraformPackage.OUTPUT__PRECONDITIONS:
				return !getPreconditions().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OutputImpl
