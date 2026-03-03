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

import org.nasdanika.models.terraform.State;
import org.nasdanika.models.terraform.StateOutput;
import org.nasdanika.models.terraform.StateResource;
import org.nasdanika.models.terraform.TerraformPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.terraform.impl.StateImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.impl.StateImpl#getTerraformVersion <em>Terraform Version</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.impl.StateImpl#getSerial <em>Serial</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.impl.StateImpl#getLineage <em>Lineage</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.impl.StateImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.impl.StateImpl#getOutputs <em>Outputs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateImpl extends MinimalEObjectImpl.Container implements State {
	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final int VERSION_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getTerraformVersion() <em>Terraform Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerraformVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String TERRAFORM_VERSION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getSerial() <em>Serial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSerial()
	 * @generated
	 * @ordered
	 */
	protected static final int SERIAL_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getLineage() <em>Lineage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineage()
	 * @generated
	 * @ordered
	 */
	protected static final String LINEAGE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TerraformPackage.Literals.STATE;
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
	public int getVersion() {
		return (Integer)eDynamicGet(TerraformPackage.STATE__VERSION, TerraformPackage.Literals.STATE__VERSION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersion(int newVersion) {
		eDynamicSet(TerraformPackage.STATE__VERSION, TerraformPackage.Literals.STATE__VERSION, newVersion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTerraformVersion() {
		return (String)eDynamicGet(TerraformPackage.STATE__TERRAFORM_VERSION, TerraformPackage.Literals.STATE__TERRAFORM_VERSION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTerraformVersion(String newTerraformVersion) {
		eDynamicSet(TerraformPackage.STATE__TERRAFORM_VERSION, TerraformPackage.Literals.STATE__TERRAFORM_VERSION, newTerraformVersion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getSerial() {
		return (Integer)eDynamicGet(TerraformPackage.STATE__SERIAL, TerraformPackage.Literals.STATE__SERIAL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSerial(int newSerial) {
		eDynamicSet(TerraformPackage.STATE__SERIAL, TerraformPackage.Literals.STATE__SERIAL, newSerial);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLineage() {
		return (String)eDynamicGet(TerraformPackage.STATE__LINEAGE, TerraformPackage.Literals.STATE__LINEAGE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLineage(String newLineage) {
		eDynamicSet(TerraformPackage.STATE__LINEAGE, TerraformPackage.Literals.STATE__LINEAGE, newLineage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<StateResource> getResources() {
		return (EList<StateResource>)eDynamicGet(TerraformPackage.STATE__RESOURCES, TerraformPackage.Literals.STATE__RESOURCES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<StateOutput> getOutputs() {
		return (EList<StateOutput>)eDynamicGet(TerraformPackage.STATE__OUTPUTS, TerraformPackage.Literals.STATE__OUTPUTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TerraformPackage.STATE__RESOURCES:
				return ((InternalEList<?>)getResources()).basicRemove(otherEnd, msgs);
			case TerraformPackage.STATE__OUTPUTS:
				return ((InternalEList<?>)getOutputs()).basicRemove(otherEnd, msgs);
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
			case TerraformPackage.STATE__VERSION:
				return getVersion();
			case TerraformPackage.STATE__TERRAFORM_VERSION:
				return getTerraformVersion();
			case TerraformPackage.STATE__SERIAL:
				return getSerial();
			case TerraformPackage.STATE__LINEAGE:
				return getLineage();
			case TerraformPackage.STATE__RESOURCES:
				return getResources();
			case TerraformPackage.STATE__OUTPUTS:
				return getOutputs();
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
			case TerraformPackage.STATE__VERSION:
				setVersion((Integer)newValue);
				return;
			case TerraformPackage.STATE__TERRAFORM_VERSION:
				setTerraformVersion((String)newValue);
				return;
			case TerraformPackage.STATE__SERIAL:
				setSerial((Integer)newValue);
				return;
			case TerraformPackage.STATE__LINEAGE:
				setLineage((String)newValue);
				return;
			case TerraformPackage.STATE__RESOURCES:
				getResources().clear();
				getResources().addAll((Collection<? extends StateResource>)newValue);
				return;
			case TerraformPackage.STATE__OUTPUTS:
				getOutputs().clear();
				getOutputs().addAll((Collection<? extends StateOutput>)newValue);
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
			case TerraformPackage.STATE__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case TerraformPackage.STATE__TERRAFORM_VERSION:
				setTerraformVersion(TERRAFORM_VERSION_EDEFAULT);
				return;
			case TerraformPackage.STATE__SERIAL:
				setSerial(SERIAL_EDEFAULT);
				return;
			case TerraformPackage.STATE__LINEAGE:
				setLineage(LINEAGE_EDEFAULT);
				return;
			case TerraformPackage.STATE__RESOURCES:
				getResources().clear();
				return;
			case TerraformPackage.STATE__OUTPUTS:
				getOutputs().clear();
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
			case TerraformPackage.STATE__VERSION:
				return getVersion() != VERSION_EDEFAULT;
			case TerraformPackage.STATE__TERRAFORM_VERSION:
				return TERRAFORM_VERSION_EDEFAULT == null ? getTerraformVersion() != null : !TERRAFORM_VERSION_EDEFAULT.equals(getTerraformVersion());
			case TerraformPackage.STATE__SERIAL:
				return getSerial() != SERIAL_EDEFAULT;
			case TerraformPackage.STATE__LINEAGE:
				return LINEAGE_EDEFAULT == null ? getLineage() != null : !LINEAGE_EDEFAULT.equals(getLineage());
			case TerraformPackage.STATE__RESOURCES:
				return !getResources().isEmpty();
			case TerraformPackage.STATE__OUTPUTS:
				return !getOutputs().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StateImpl
