/**
 */
package org.nasdanika.models.terraform.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.terraform.DataSource;
import org.nasdanika.models.terraform.Local;
import org.nasdanika.models.terraform.ModuleCall;
import org.nasdanika.models.terraform.Output;
import org.nasdanika.models.terraform.ProviderRequirement;
import org.nasdanika.models.terraform.Resource;
import org.nasdanika.models.terraform.TerraformPackage;
import org.nasdanika.models.terraform.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.terraform.impl.ModuleImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.impl.ModuleImpl#getDataSources <em>Data Sources</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.impl.ModuleImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.impl.ModuleImpl#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.impl.ModuleImpl#getLocals <em>Locals</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.impl.ModuleImpl#getModuleCalls <em>Module Calls</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.impl.ModuleImpl#getRequiredProviders <em>Required Providers</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.impl.ModuleImpl#getRequiredTerraformVersion <em>Required Terraform Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModuleImpl extends DocumentedNamedElementImpl implements org.nasdanika.models.terraform.Module {
	/**
	 * The default value of the '{@link #getRequiredTerraformVersion() <em>Required Terraform Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredTerraformVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String REQUIRED_TERRAFORM_VERSION_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TerraformPackage.Literals.MODULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Resource> getResources() {
		return (EList<Resource>)eDynamicGet(TerraformPackage.MODULE__RESOURCES, TerraformPackage.Literals.MODULE__RESOURCES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<DataSource> getDataSources() {
		return (EList<DataSource>)eDynamicGet(TerraformPackage.MODULE__DATA_SOURCES, TerraformPackage.Literals.MODULE__DATA_SOURCES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Variable> getVariables() {
		return (EList<Variable>)eDynamicGet(TerraformPackage.MODULE__VARIABLES, TerraformPackage.Literals.MODULE__VARIABLES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Output> getOutputs() {
		return (EList<Output>)eDynamicGet(TerraformPackage.MODULE__OUTPUTS, TerraformPackage.Literals.MODULE__OUTPUTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Local> getLocals() {
		return (EList<Local>)eDynamicGet(TerraformPackage.MODULE__LOCALS, TerraformPackage.Literals.MODULE__LOCALS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ModuleCall> getModuleCalls() {
		return (EList<ModuleCall>)eDynamicGet(TerraformPackage.MODULE__MODULE_CALLS, TerraformPackage.Literals.MODULE__MODULE_CALLS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ProviderRequirement> getRequiredProviders() {
		return (EList<ProviderRequirement>)eDynamicGet(TerraformPackage.MODULE__REQUIRED_PROVIDERS, TerraformPackage.Literals.MODULE__REQUIRED_PROVIDERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRequiredTerraformVersion() {
		return (String)eDynamicGet(TerraformPackage.MODULE__REQUIRED_TERRAFORM_VERSION, TerraformPackage.Literals.MODULE__REQUIRED_TERRAFORM_VERSION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequiredTerraformVersion(String newRequiredTerraformVersion) {
		eDynamicSet(TerraformPackage.MODULE__REQUIRED_TERRAFORM_VERSION, TerraformPackage.Literals.MODULE__REQUIRED_TERRAFORM_VERSION, newRequiredTerraformVersion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TerraformPackage.MODULE__RESOURCES:
				return ((InternalEList<?>)getResources()).basicRemove(otherEnd, msgs);
			case TerraformPackage.MODULE__DATA_SOURCES:
				return ((InternalEList<?>)getDataSources()).basicRemove(otherEnd, msgs);
			case TerraformPackage.MODULE__VARIABLES:
				return ((InternalEList<?>)getVariables()).basicRemove(otherEnd, msgs);
			case TerraformPackage.MODULE__OUTPUTS:
				return ((InternalEList<?>)getOutputs()).basicRemove(otherEnd, msgs);
			case TerraformPackage.MODULE__LOCALS:
				return ((InternalEList<?>)getLocals()).basicRemove(otherEnd, msgs);
			case TerraformPackage.MODULE__MODULE_CALLS:
				return ((InternalEList<?>)getModuleCalls()).basicRemove(otherEnd, msgs);
			case TerraformPackage.MODULE__REQUIRED_PROVIDERS:
				return ((InternalEList<?>)getRequiredProviders()).basicRemove(otherEnd, msgs);
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
			case TerraformPackage.MODULE__RESOURCES:
				return getResources();
			case TerraformPackage.MODULE__DATA_SOURCES:
				return getDataSources();
			case TerraformPackage.MODULE__VARIABLES:
				return getVariables();
			case TerraformPackage.MODULE__OUTPUTS:
				return getOutputs();
			case TerraformPackage.MODULE__LOCALS:
				return getLocals();
			case TerraformPackage.MODULE__MODULE_CALLS:
				return getModuleCalls();
			case TerraformPackage.MODULE__REQUIRED_PROVIDERS:
				return getRequiredProviders();
			case TerraformPackage.MODULE__REQUIRED_TERRAFORM_VERSION:
				return getRequiredTerraformVersion();
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
			case TerraformPackage.MODULE__RESOURCES:
				getResources().clear();
				getResources().addAll((Collection<? extends Resource>)newValue);
				return;
			case TerraformPackage.MODULE__DATA_SOURCES:
				getDataSources().clear();
				getDataSources().addAll((Collection<? extends DataSource>)newValue);
				return;
			case TerraformPackage.MODULE__VARIABLES:
				getVariables().clear();
				getVariables().addAll((Collection<? extends Variable>)newValue);
				return;
			case TerraformPackage.MODULE__OUTPUTS:
				getOutputs().clear();
				getOutputs().addAll((Collection<? extends Output>)newValue);
				return;
			case TerraformPackage.MODULE__LOCALS:
				getLocals().clear();
				getLocals().addAll((Collection<? extends Local>)newValue);
				return;
			case TerraformPackage.MODULE__MODULE_CALLS:
				getModuleCalls().clear();
				getModuleCalls().addAll((Collection<? extends ModuleCall>)newValue);
				return;
			case TerraformPackage.MODULE__REQUIRED_PROVIDERS:
				getRequiredProviders().clear();
				getRequiredProviders().addAll((Collection<? extends ProviderRequirement>)newValue);
				return;
			case TerraformPackage.MODULE__REQUIRED_TERRAFORM_VERSION:
				setRequiredTerraformVersion((String)newValue);
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
			case TerraformPackage.MODULE__RESOURCES:
				getResources().clear();
				return;
			case TerraformPackage.MODULE__DATA_SOURCES:
				getDataSources().clear();
				return;
			case TerraformPackage.MODULE__VARIABLES:
				getVariables().clear();
				return;
			case TerraformPackage.MODULE__OUTPUTS:
				getOutputs().clear();
				return;
			case TerraformPackage.MODULE__LOCALS:
				getLocals().clear();
				return;
			case TerraformPackage.MODULE__MODULE_CALLS:
				getModuleCalls().clear();
				return;
			case TerraformPackage.MODULE__REQUIRED_PROVIDERS:
				getRequiredProviders().clear();
				return;
			case TerraformPackage.MODULE__REQUIRED_TERRAFORM_VERSION:
				setRequiredTerraformVersion(REQUIRED_TERRAFORM_VERSION_EDEFAULT);
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
			case TerraformPackage.MODULE__RESOURCES:
				return !getResources().isEmpty();
			case TerraformPackage.MODULE__DATA_SOURCES:
				return !getDataSources().isEmpty();
			case TerraformPackage.MODULE__VARIABLES:
				return !getVariables().isEmpty();
			case TerraformPackage.MODULE__OUTPUTS:
				return !getOutputs().isEmpty();
			case TerraformPackage.MODULE__LOCALS:
				return !getLocals().isEmpty();
			case TerraformPackage.MODULE__MODULE_CALLS:
				return !getModuleCalls().isEmpty();
			case TerraformPackage.MODULE__REQUIRED_PROVIDERS:
				return !getRequiredProviders().isEmpty();
			case TerraformPackage.MODULE__REQUIRED_TERRAFORM_VERSION:
				return REQUIRED_TERRAFORM_VERSION_EDEFAULT == null ? getRequiredTerraformVersion() != null : !REQUIRED_TERRAFORM_VERSION_EDEFAULT.equals(getRequiredTerraformVersion());
		}
		return super.eIsSet(featureID);
	}

} //ModuleImpl
