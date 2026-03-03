/**
 */
package org.nasdanika.models.terraform;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provisioner</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A provisioner within a resource block that executes scripts or copies files on a resource after it is created. Provisioners are a last resort and should be avoided when possible in favor of provider-native mechanisms.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.terraform.Provisioner#getType <em>Type</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.Provisioner#getArguments <em>Arguments</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.terraform.TerraformPackage#getProvisioner()
 * @model
 * @generated
 */
public interface Provisioner extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.terraform.ProvisionerType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of provisioner: local-exec, remote-exec, or file.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.nasdanika.models.terraform.ProvisionerType
	 * @see #setType(ProvisionerType)
	 * @see org.nasdanika.models.terraform.TerraformPackage#getProvisioner_Type()
	 * @model required="true"
	 * @generated
	 */
	ProvisionerType getType();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.terraform.Provisioner#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.nasdanika.models.terraform.ProvisionerType
	 * @see #getType()
	 * @generated
	 */
	void setType(ProvisionerType value);

	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.terraform.Argument}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Configuration arguments for the provisioner (e.g., command, interpreter, working_dir for local-exec).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Arguments</em>' containment reference list.
	 * @see org.nasdanika.models.terraform.TerraformPackage#getProvisioner_Arguments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Argument> getArguments();

} // Provisioner
