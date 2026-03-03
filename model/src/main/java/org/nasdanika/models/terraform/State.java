/**
 */
package org.nasdanika.models.terraform;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Terraform state, which is the record of all managed infrastructure and configuration. Terraform uses state to map real-world resources to the configuration, track metadata, and improve performance for large infrastructures. State is stored in a file (terraform.tfstate by default) or in a remote backend.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.terraform.State#getVersion <em>Version</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.State#getTerraformVersion <em>Terraform Version</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.State#getSerial <em>Serial</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.State#getLineage <em>Lineage</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.State#getResources <em>Resources</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.State#getOutputs <em>Outputs</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.terraform.TerraformPackage#getState()
 * @model
 * @generated
 */
public interface State extends EObject {
	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The state file format version number.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(int)
	 * @see org.nasdanika.models.terraform.TerraformPackage#getState_Version()
	 * @model required="true"
	 * @generated
	 */
	int getVersion();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.terraform.State#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(int value);

	/**
	 * Returns the value of the '<em><b>Terraform Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The version of Terraform that last wrote this state file.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Terraform Version</em>' attribute.
	 * @see #setTerraformVersion(String)
	 * @see org.nasdanika.models.terraform.TerraformPackage#getState_TerraformVersion()
	 * @model
	 * @generated
	 */
	String getTerraformVersion();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.terraform.State#getTerraformVersion <em>Terraform Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Terraform Version</em>' attribute.
	 * @see #getTerraformVersion()
	 * @generated
	 */
	void setTerraformVersion(String value);

	/**
	 * Returns the value of the '<em><b>Serial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A monotonically increasing integer that is incremented each time Terraform makes a change to state. Used for conflict detection in remote backends.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Serial</em>' attribute.
	 * @see #setSerial(int)
	 * @see org.nasdanika.models.terraform.TerraformPackage#getState_Serial()
	 * @model required="true"
	 * @generated
	 */
	int getSerial();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.terraform.State#getSerial <em>Serial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serial</em>' attribute.
	 * @see #getSerial()
	 * @generated
	 */
	void setSerial(int value);

	/**
	 * Returns the value of the '<em><b>Lineage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A unique identifier for this state file, generated when the state is first created and unchanged thereafter. Used to detect unintended state swaps.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lineage</em>' attribute.
	 * @see #setLineage(String)
	 * @see org.nasdanika.models.terraform.TerraformPackage#getState_Lineage()
	 * @model
	 * @generated
	 */
	String getLineage();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.terraform.State#getLineage <em>Lineage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lineage</em>' attribute.
	 * @see #getLineage()
	 * @generated
	 */
	void setLineage(String value);

	/**
	 * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.terraform.StateResource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All resources tracked in this state.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resources</em>' containment reference list.
	 * @see org.nasdanika.models.terraform.TerraformPackage#getState_Resources()
	 * @model containment="true"
	 * @generated
	 */
	EList<StateResource> getResources();

	/**
	 * Returns the value of the '<em><b>Outputs</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.terraform.StateOutput}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Output values recorded in this state.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outputs</em>' containment reference list.
	 * @see org.nasdanika.models.terraform.TerraformPackage#getState_Outputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<StateOutput> getOutputs();

} // State
