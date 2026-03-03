/**
 */
package org.nasdanika.models.terraform;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data source allows Terraform to use information defined outside of Terraform, defined by another separate Terraform configuration, or modified by functions. Each data source corresponds to a data block in configuration. Data sources read existing infrastructure but do not manage its lifecycle.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.terraform.DataSource#getType <em>Type</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.DataSource#getProvider <em>Provider</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.DataSource#getCount <em>Count</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.DataSource#getForEach <em>For Each</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.DataSource#getDependsOn <em>Depends On</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.DataSource#getArguments <em>Arguments</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.DataSource#getLifecycle <em>Lifecycle</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.DataSource#getPreconditions <em>Preconditions</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.DataSource#getPostconditions <em>Postconditions</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.terraform.TerraformPackage#getDataSource()
 * @model
 * @generated
 */
public interface DataSource extends DocumentedNamedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The data source type, which is provider-defined (e.g., 'aws_ami', 'azurerm_resource_group').
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.nasdanika.models.terraform.TerraformPackage#getDataSource_Type()
	 * @model required="true"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.terraform.DataSource#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Optional provider meta-argument that overrides the default provider for this data source.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Provider</em>' attribute.
	 * @see #setProvider(String)
	 * @see org.nasdanika.models.terraform.TerraformPackage#getDataSource_Provider()
	 * @model
	 * @generated
	 */
	String getProvider();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.terraform.DataSource#getProvider <em>Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider</em>' attribute.
	 * @see #getProvider()
	 * @generated
	 */
	void setProvider(String value);

	/**
	 * Returns the value of the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The count meta-argument as an HCL expression.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Count</em>' attribute.
	 * @see #setCount(String)
	 * @see org.nasdanika.models.terraform.TerraformPackage#getDataSource_Count()
	 * @model
	 * @generated
	 */
	String getCount();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.terraform.DataSource#getCount <em>Count</em>}' attribute.
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
	 * @see org.nasdanika.models.terraform.TerraformPackage#getDataSource_ForEach()
	 * @model
	 * @generated
	 */
	String getForEach();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.terraform.DataSource#getForEach <em>For Each</em>}' attribute.
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
	 * Explicit dependencies for the data source.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Depends On</em>' attribute list.
	 * @see org.nasdanika.models.terraform.TerraformPackage#getDataSource_DependsOn()
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
	 * Data-source-type-specific filter and configuration arguments.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Arguments</em>' containment reference list.
	 * @see org.nasdanika.models.terraform.TerraformPackage#getDataSource_Arguments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Argument> getArguments();

	/**
	 * Returns the value of the '<em><b>Lifecycle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lifecycle customization for this data source.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lifecycle</em>' containment reference.
	 * @see #setLifecycle(Lifecycle)
	 * @see org.nasdanika.models.terraform.TerraformPackage#getDataSource_Lifecycle()
	 * @model containment="true"
	 * @generated
	 */
	Lifecycle getLifecycle();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.terraform.DataSource#getLifecycle <em>Lifecycle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lifecycle</em>' containment reference.
	 * @see #getLifecycle()
	 * @generated
	 */
	void setLifecycle(Lifecycle value);

	/**
	 * Returns the value of the '<em><b>Preconditions</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.terraform.Precondition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Preconditions that must hold before reading this data source.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Preconditions</em>' containment reference list.
	 * @see org.nasdanika.models.terraform.TerraformPackage#getDataSource_Preconditions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Precondition> getPreconditions();

	/**
	 * Returns the value of the '<em><b>Postconditions</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.terraform.Postcondition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Postconditions that must hold after reading this data source.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Postconditions</em>' containment reference list.
	 * @see org.nasdanika.models.terraform.TerraformPackage#getDataSource_Postconditions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Postcondition> getPostconditions();

} // DataSource
