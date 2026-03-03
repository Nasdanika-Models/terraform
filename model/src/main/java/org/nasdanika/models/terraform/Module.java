/**
 */
package org.nasdanika.models.terraform;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A module is a container for multiple resources that are used together. Every Terraform configuration has at least one module, known as the root module. A module consists of a collection of .tf and/or .tf.json files kept together in a directory.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.terraform.Module#getResources <em>Resources</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.Module#getDataSources <em>Data Sources</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.Module#getVariables <em>Variables</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.Module#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.Module#getLocals <em>Locals</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.Module#getModuleCalls <em>Module Calls</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.Module#getRequiredProviders <em>Required Providers</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.Module#getRequiredTerraformVersion <em>Required Terraform Version</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.terraform.TerraformPackage#getModule()
 * @model
 * @generated
 */
public interface Module extends DocumentedNamedElement {
	/**
	 * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.terraform.Resource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Managed resources declared in this module.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resources</em>' containment reference list.
	 * @see org.nasdanika.models.terraform.TerraformPackage#getModule_Resources()
	 * @model containment="true"
	 * @generated
	 */
	EList<Resource> getResources();

	/**
	 * Returns the value of the '<em><b>Data Sources</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.terraform.DataSource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Data sources declared in this module.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Sources</em>' containment reference list.
	 * @see org.nasdanika.models.terraform.TerraformPackage#getModule_DataSources()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataSource> getDataSources();

	/**
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.terraform.Variable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Input variable declarations for this module.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Variables</em>' containment reference list.
	 * @see org.nasdanika.models.terraform.TerraformPackage#getModule_Variables()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getVariables();

	/**
	 * Returns the value of the '<em><b>Outputs</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.terraform.Output}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Output value declarations for this module.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outputs</em>' containment reference list.
	 * @see org.nasdanika.models.terraform.TerraformPackage#getModule_Outputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Output> getOutputs();

	/**
	 * Returns the value of the '<em><b>Locals</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.terraform.Local}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Local value declarations for this module.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Locals</em>' containment reference list.
	 * @see org.nasdanika.models.terraform.TerraformPackage#getModule_Locals()
	 * @model containment="true"
	 * @generated
	 */
	EList<Local> getLocals();

	/**
	 * Returns the value of the '<em><b>Module Calls</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.terraform.ModuleCall}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Child module calls within this module.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Module Calls</em>' containment reference list.
	 * @see org.nasdanika.models.terraform.TerraformPackage#getModule_ModuleCalls()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModuleCall> getModuleCalls();

	/**
	 * Returns the value of the '<em><b>Required Providers</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.terraform.ProviderRequirement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Required provider declarations for this module, specifying provider source addresses and version constraints.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Required Providers</em>' containment reference list.
	 * @see org.nasdanika.models.terraform.TerraformPackage#getModule_RequiredProviders()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProviderRequirement> getRequiredProviders();

	/**
	 * Returns the value of the '<em><b>Required Terraform Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Version constraint string for the minimum Terraform version required by this module.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Required Terraform Version</em>' attribute.
	 * @see #setRequiredTerraformVersion(String)
	 * @see org.nasdanika.models.terraform.TerraformPackage#getModule_RequiredTerraformVersion()
	 * @model
	 * @generated
	 */
	String getRequiredTerraformVersion();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.terraform.Module#getRequiredTerraformVersion <em>Required Terraform Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Terraform Version</em>' attribute.
	 * @see #getRequiredTerraformVersion()
	 * @generated
	 */
	void setRequiredTerraformVersion(String value);

} // Module
