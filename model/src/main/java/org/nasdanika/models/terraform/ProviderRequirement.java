/**
 */
package org.nasdanika.models.terraform;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provider Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A required_providers entry that declares a dependency on a Terraform provider. Specifies the source address and version constraints for a provider.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.terraform.ProviderRequirement#getSource <em>Source</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.ProviderRequirement#getVersion <em>Version</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.ProviderRequirement#getConfigurationAlias <em>Configuration Alias</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.terraform.TerraformPackage#getProviderRequirement()
 * @model
 * @generated
 */
public interface ProviderRequirement extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The provider source address in the format [hostname/]namespace/type, e.g. 'hashicorp/aws' or 'registry.terraform.io/hashicorp/azurerm'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see #setSource(String)
	 * @see org.nasdanika.models.terraform.TerraformPackage#getProviderRequirement_Source()
	 * @model
	 * @generated
	 */
	String getSource();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.terraform.ProviderRequirement#getSource <em>Source</em>}' attribute.
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
	 * Version constraint string for the provider, e.g. '~> 4.0', '>= 3.0, < 5.0'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see org.nasdanika.models.terraform.TerraformPackage#getProviderRequirement_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.terraform.ProviderRequirement#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Configuration Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An optional alias for this provider requirement when the module needs access to a provider with an alias defined by the calling module.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Configuration Alias</em>' attribute.
	 * @see #setConfigurationAlias(String)
	 * @see org.nasdanika.models.terraform.TerraformPackage#getProviderRequirement_ConfigurationAlias()
	 * @model
	 * @generated
	 */
	String getConfigurationAlias();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.terraform.ProviderRequirement#getConfigurationAlias <em>Configuration Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration Alias</em>' attribute.
	 * @see #getConfigurationAlias()
	 * @generated
	 */
	void setConfigurationAlias(String value);

} // ProviderRequirement
