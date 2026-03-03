/**
 */
package org.nasdanika.models.terraform;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A specific instance of a resource tracked in Terraform state. When using count or for_each, a resource may have multiple instances, each tracked separately.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.terraform.ResourceInstance#getIndexKey <em>Index Key</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.ResourceInstance#getSchemaVersion <em>Schema Version</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.ResourceInstance#getAttributesJson <em>Attributes Json</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.ResourceInstance#getSensitiveAttributes <em>Sensitive Attributes</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.ResourceInstance#getPrivateJson <em>Private Json</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.terraform.TerraformPackage#getResourceInstance()
 * @model
 * @generated
 */
public interface ResourceInstance extends EObject {
	/**
	 * Returns the value of the '<em><b>Index Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The index key for this instance when using count (numeric) or for_each (string key). Null for single-instance resources.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Index Key</em>' attribute.
	 * @see #setIndexKey(String)
	 * @see org.nasdanika.models.terraform.TerraformPackage#getResourceInstance_IndexKey()
	 * @model
	 * @generated
	 */
	String getIndexKey();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.terraform.ResourceInstance#getIndexKey <em>Index Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index Key</em>' attribute.
	 * @see #getIndexKey()
	 * @generated
	 */
	void setIndexKey(String value);

	/**
	 * Returns the value of the '<em><b>Schema Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The version of the resource schema used to create this state entry.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Schema Version</em>' attribute.
	 * @see #setSchemaVersion(int)
	 * @see org.nasdanika.models.terraform.TerraformPackage#getResourceInstance_SchemaVersion()
	 * @model
	 * @generated
	 */
	int getSchemaVersion();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.terraform.ResourceInstance#getSchemaVersion <em>Schema Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema Version</em>' attribute.
	 * @see #getSchemaVersion()
	 * @generated
	 */
	void setSchemaVersion(int value);

	/**
	 * Returns the value of the '<em><b>Attributes Json</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * JSON-encoded map of the resource instance's attribute values as tracked in state.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Attributes Json</em>' attribute.
	 * @see #setAttributesJson(String)
	 * @see org.nasdanika.models.terraform.TerraformPackage#getResourceInstance_AttributesJson()
	 * @model
	 * @generated
	 */
	String getAttributesJson();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.terraform.ResourceInstance#getAttributesJson <em>Attributes Json</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attributes Json</em>' attribute.
	 * @see #getAttributesJson()
	 * @generated
	 */
	void setAttributesJson(String value);

	/**
	 * Returns the value of the '<em><b>Sensitive Attributes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * JSON-encoded list of attribute paths that are marked as sensitive in the state.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sensitive Attributes</em>' attribute.
	 * @see #setSensitiveAttributes(String)
	 * @see org.nasdanika.models.terraform.TerraformPackage#getResourceInstance_SensitiveAttributes()
	 * @model
	 * @generated
	 */
	String getSensitiveAttributes();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.terraform.ResourceInstance#getSensitiveAttributes <em>Sensitive Attributes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensitive Attributes</em>' attribute.
	 * @see #getSensitiveAttributes()
	 * @generated
	 */
	void setSensitiveAttributes(String value);

	/**
	 * Returns the value of the '<em><b>Private Json</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Base64-encoded private state data used by the provider.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Private Json</em>' attribute.
	 * @see #setPrivateJson(String)
	 * @see org.nasdanika.models.terraform.TerraformPackage#getResourceInstance_PrivateJson()
	 * @model
	 * @generated
	 */
	String getPrivateJson();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.terraform.ResourceInstance#getPrivateJson <em>Private Json</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Private Json</em>' attribute.
	 * @see #getPrivateJson()
	 * @generated
	 */
	void setPrivateJson(String value);

} // ResourceInstance
