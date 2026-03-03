/**
 */
package org.nasdanika.models.terraform;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A resource entry in Terraform state, representing one managed resource or data source and all its instances.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.terraform.StateResource#getModule <em>Module</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.StateResource#getMode <em>Mode</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.StateResource#getType <em>Type</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.StateResource#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.StateResource#getProviderConfig <em>Provider Config</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.StateResource#getInstances <em>Instances</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.terraform.TerraformPackage#getStateResource()
 * @model
 * @generated
 */
public interface StateResource extends EObject {
	/**
	 * Returns the value of the '<em><b>Module</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The module path for this resource (e.g., 'module.vpc'). Empty string for root module resources.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Module</em>' attribute.
	 * @see #setModule(String)
	 * @see org.nasdanika.models.terraform.TerraformPackage#getStateResource_Module()
	 * @model
	 * @generated
	 */
	String getModule();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.terraform.StateResource#getModule <em>Module</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module</em>' attribute.
	 * @see #getModule()
	 * @generated
	 */
	void setModule(String value);

	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.terraform.ResourceMode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The resource mode: 'managed' for resources or 'data' for data sources.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see org.nasdanika.models.terraform.ResourceMode
	 * @see #setMode(ResourceMode)
	 * @see org.nasdanika.models.terraform.TerraformPackage#getStateResource_Mode()
	 * @model required="true"
	 * @generated
	 */
	ResourceMode getMode();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.terraform.StateResource#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see org.nasdanika.models.terraform.ResourceMode
	 * @see #getMode()
	 * @generated
	 */
	void setMode(ResourceMode value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The resource type (e.g., 'aws_instance').
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.nasdanika.models.terraform.TerraformPackage#getStateResource_Type()
	 * @model required="true"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.terraform.StateResource#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The resource name as defined in the configuration.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.nasdanika.models.terraform.TerraformPackage#getStateResource_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.terraform.StateResource#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Provider Config</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The provider configuration address for this resource (e.g., 'provider["registry.terraform.io/hashicorp/aws"]').
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Provider Config</em>' attribute.
	 * @see #setProviderConfig(String)
	 * @see org.nasdanika.models.terraform.TerraformPackage#getStateResource_ProviderConfig()
	 * @model required="true"
	 * @generated
	 */
	String getProviderConfig();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.terraform.StateResource#getProviderConfig <em>Provider Config</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider Config</em>' attribute.
	 * @see #getProviderConfig()
	 * @generated
	 */
	void setProviderConfig(String value);

	/**
	 * Returns the value of the '<em><b>Instances</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.terraform.ResourceInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The resource instances tracked in state.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instances</em>' containment reference list.
	 * @see org.nasdanika.models.terraform.TerraformPackage#getStateResource_Instances()
	 * @model containment="true"
	 * @generated
	 */
	EList<ResourceInstance> getInstances();

} // StateResource
