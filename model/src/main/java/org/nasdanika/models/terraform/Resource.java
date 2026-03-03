/**
 */
package org.nasdanika.models.terraform;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A resource block that describes one or more infrastructure objects, such as virtual networks, compute instances, or higher-level components such as DNS records. Resources are the most important element in Terraform; each resource block describes one or more infrastructure objects.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.terraform.Resource#getType <em>Type</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.Resource#getProvider <em>Provider</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.Resource#getCount <em>Count</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.Resource#getForEach <em>For Each</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.Resource#getDependsOn <em>Depends On</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.Resource#getArguments <em>Arguments</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.Resource#getProvisioners <em>Provisioners</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.Resource#getLifecycle <em>Lifecycle</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.Resource#getPreconditions <em>Preconditions</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.Resource#getPostconditions <em>Postconditions</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.terraform.TerraformPackage#getResource()
 * @model
 * @generated
 */
public interface Resource extends DocumentedNamedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The resource type, which is provider-defined (e.g., 'aws_instance', 'azurerm_virtual_network'). Combined with the name, forms the resource address.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.nasdanika.models.terraform.TerraformPackage#getResource_Type()
	 * @model required="true"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.terraform.Resource#getType <em>Type</em>}' attribute.
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
	 * Optional provider meta-argument that overrides the default provider for this resource. Specified as 'provider_name.alias' to reference a provider with an alias.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Provider</em>' attribute.
	 * @see #setProvider(String)
	 * @see org.nasdanika.models.terraform.TerraformPackage#getResource_Provider()
	 * @model
	 * @generated
	 */
	String getProvider();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.terraform.Resource#getProvider <em>Provider</em>}' attribute.
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
	 * The count meta-argument as an HCL expression. When set to a whole number, creates that many instances of the resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Count</em>' attribute.
	 * @see #setCount(String)
	 * @see org.nasdanika.models.terraform.TerraformPackage#getResource_Count()
	 * @model
	 * @generated
	 */
	String getCount();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.terraform.Resource#getCount <em>Count</em>}' attribute.
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
	 * The for_each meta-argument as an HCL expression. When set to a map or set, creates one instance per element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>For Each</em>' attribute.
	 * @see #setForEach(String)
	 * @see org.nasdanika.models.terraform.TerraformPackage#getResource_ForEach()
	 * @model
	 * @generated
	 */
	String getForEach();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.terraform.Resource#getForEach <em>For Each</em>}' attribute.
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
	 * Explicit dependencies for the resource, used when Terraform cannot automatically infer dependencies from expressions. Specified as reference strings (e.g., 'aws_s3_bucket.example').
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Depends On</em>' attribute list.
	 * @see org.nasdanika.models.terraform.TerraformPackage#getResource_DependsOn()
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
	 * Resource-type-specific configuration arguments.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Arguments</em>' containment reference list.
	 * @see org.nasdanika.models.terraform.TerraformPackage#getResource_Arguments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Argument> getArguments();

	/**
	 * Returns the value of the '<em><b>Provisioners</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.terraform.Provisioner}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provisioner blocks for post-creation actions. Provisioners are a last resort.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Provisioners</em>' containment reference list.
	 * @see org.nasdanika.models.terraform.TerraformPackage#getResource_Provisioners()
	 * @model containment="true"
	 * @generated
	 */
	EList<Provisioner> getProvisioners();

	/**
	 * Returns the value of the '<em><b>Lifecycle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lifecycle customization for this resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lifecycle</em>' containment reference.
	 * @see #setLifecycle(Lifecycle)
	 * @see org.nasdanika.models.terraform.TerraformPackage#getResource_Lifecycle()
	 * @model containment="true"
	 * @generated
	 */
	Lifecycle getLifecycle();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.terraform.Resource#getLifecycle <em>Lifecycle</em>}' containment reference.
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
	 * Preconditions that must hold before planning changes to this resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Preconditions</em>' containment reference list.
	 * @see org.nasdanika.models.terraform.TerraformPackage#getResource_Preconditions()
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
	 * Postconditions that must hold after applying changes to this resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Postconditions</em>' containment reference list.
	 * @see org.nasdanika.models.terraform.TerraformPackage#getResource_Postconditions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Postcondition> getPostconditions();

} // Resource
