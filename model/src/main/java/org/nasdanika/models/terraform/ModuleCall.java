/**
 */
package org.nasdanika.models.terraform;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A module call (module block) that instantiates a child module. A module is a container for multiple resources that are used together. The module call specifies the source of the module and passes input variable values to it.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.terraform.ModuleCall#getSource <em>Source</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.ModuleCall#getVersion <em>Version</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.ModuleCall#getCount <em>Count</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.ModuleCall#getForEach <em>For Each</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.ModuleCall#getDependsOn <em>Depends On</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.ModuleCall#getArguments <em>Arguments</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.ModuleCall#getProviders <em>Providers</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.terraform.TerraformPackage#getModuleCall()
 * @model
 * @generated
 */
public interface ModuleCall extends DocumentedNamedElement {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The module source address, which tells Terraform where to find the module source code. Can be a local path, Terraform Registry address, GitHub URL, or other supported source types.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see #setSource(String)
	 * @see org.nasdanika.models.terraform.TerraformPackage#getModuleCall_Source()
	 * @model required="true"
	 * @generated
	 */
	String getSource();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.terraform.ModuleCall#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' attribute.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Version constraint for the module when sourced from the Terraform Registry.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see org.nasdanika.models.terraform.TerraformPackage#getModuleCall_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.terraform.ModuleCall#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The count meta-argument as an HCL expression.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Count</em>' attribute.
	 * @see #setCount(String)
	 * @see org.nasdanika.models.terraform.TerraformPackage#getModuleCall_Count()
	 * @model
	 * @generated
	 */
	String getCount();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.terraform.ModuleCall#getCount <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count</em>' attribute.
	 * @see #getCount()
	 * @generated
	 */
	void setCount(String value);

	/**
	 * Returns the value of the '<em><b>For Each</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The for_each meta-argument as an HCL expression.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>For Each</em>' attribute.
	 * @see #setForEach(String)
	 * @see org.nasdanika.models.terraform.TerraformPackage#getModuleCall_ForEach()
	 * @model
	 * @generated
	 */
	String getForEach();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.terraform.ModuleCall#getForEach <em>For Each</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>For Each</em>' attribute.
	 * @see #getForEach()
	 * @generated
	 */
	void setForEach(String value);

	/**
	 * Returns the value of the '<em><b>Depends On</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Explicit dependencies for this module call.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Depends On</em>' attribute list.
	 * @see org.nasdanika.models.terraform.TerraformPackage#getModuleCall_DependsOn()
	 * @model
	 * @generated
	 */
	EList<String> getDependsOn();

	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.terraform.Argument}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Input variable values passed to the module. Each argument corresponds to an input variable defined in the module.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Arguments</em>' containment reference list.
	 * @see org.nasdanika.models.terraform.TerraformPackage#getModuleCall_Arguments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Argument> getArguments();

	/**
	 * Returns the value of the '<em><b>Providers</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.terraform.Argument}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provider configuration assignments passed to the module, mapping module-local provider names to parent provider configurations.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Providers</em>' containment reference list.
	 * @see org.nasdanika.models.terraform.TerraformPackage#getModuleCall_Providers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Argument> getProviders();

} // ModuleCall
