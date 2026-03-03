/**
 */
package org.nasdanika.models.terraform.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.terraform.Argument;
import org.nasdanika.models.terraform.Provisioner;
import org.nasdanika.models.terraform.ProvisionerType;
import org.nasdanika.models.terraform.TerraformPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Provisioner</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.terraform.impl.ProvisionerImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.impl.ProvisionerImpl#getArguments <em>Arguments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProvisionerImpl extends NamedElementImpl implements Provisioner {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ProvisionerType TYPE_EDEFAULT = ProvisionerType.LOCAL_EXEC;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProvisionerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TerraformPackage.Literals.PROVISIONER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProvisionerType getType() {
		return (ProvisionerType)eDynamicGet(TerraformPackage.PROVISIONER__TYPE, TerraformPackage.Literals.PROVISIONER__TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(ProvisionerType newType) {
		eDynamicSet(TerraformPackage.PROVISIONER__TYPE, TerraformPackage.Literals.PROVISIONER__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Argument> getArguments() {
		return (EList<Argument>)eDynamicGet(TerraformPackage.PROVISIONER__ARGUMENTS, TerraformPackage.Literals.PROVISIONER__ARGUMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TerraformPackage.PROVISIONER__ARGUMENTS:
				return ((InternalEList<?>)getArguments()).basicRemove(otherEnd, msgs);
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
			case TerraformPackage.PROVISIONER__TYPE:
				return getType();
			case TerraformPackage.PROVISIONER__ARGUMENTS:
				return getArguments();
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
			case TerraformPackage.PROVISIONER__TYPE:
				setType((ProvisionerType)newValue);
				return;
			case TerraformPackage.PROVISIONER__ARGUMENTS:
				getArguments().clear();
				getArguments().addAll((Collection<? extends Argument>)newValue);
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
			case TerraformPackage.PROVISIONER__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case TerraformPackage.PROVISIONER__ARGUMENTS:
				getArguments().clear();
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
			case TerraformPackage.PROVISIONER__TYPE:
				return getType() != TYPE_EDEFAULT;
			case TerraformPackage.PROVISIONER__ARGUMENTS:
				return !getArguments().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProvisionerImpl
