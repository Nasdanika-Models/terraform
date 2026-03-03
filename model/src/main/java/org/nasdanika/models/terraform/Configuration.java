/**
 */
package org.nasdanika.models.terraform;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A root module configuration that represents a complete Terraform configuration - a directory of .tf files that forms the root module. The Configuration is the main entry point from which Terraform executes and includes backend configuration and provider declarations.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.terraform.Configuration#getProviders <em>Providers</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.Configuration#getBackend <em>Backend</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.terraform.TerraformPackage#getConfiguration()
 * @model
 * @generated
 */
public interface Configuration extends org.nasdanika.models.terraform.Module {
	/**
	 * Returns the value of the '<em><b>Providers</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.terraform.Provider}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provider configuration blocks for providers used in this configuration.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Providers</em>' containment reference list.
	 * @see org.nasdanika.models.terraform.TerraformPackage#getConfiguration_Providers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Provider> getProviders();

	/**
	 * Returns the value of the '<em><b>Backend</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The backend configuration for this root module, defining where state is stored.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Backend</em>' containment reference.
	 * @see #setBackend(Backend)
	 * @see org.nasdanika.models.terraform.TerraformPackage#getConfiguration_Backend()
	 * @model containment="true"
	 * @generated
	 */
	Backend getBackend();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.terraform.Configuration#getBackend <em>Backend</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Backend</em>' containment reference.
	 * @see #getBackend()
	 * @generated
	 */
	void setBackend(Backend value);

} // Configuration
