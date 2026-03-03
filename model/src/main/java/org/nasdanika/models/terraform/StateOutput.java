/**
 */
package org.nasdanika.models.terraform;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Output</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An output value recorded in Terraform state.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.terraform.StateOutput#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.StateOutput#getValue <em>Value</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.StateOutput#getType <em>Type</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.StateOutput#isSensitive <em>Sensitive</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.terraform.TerraformPackage#getStateOutput()
 * @model
 * @generated
 */
public interface StateOutput extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The output name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.nasdanika.models.terraform.TerraformPackage#getStateOutput_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.terraform.StateOutput#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The output value as a JSON-encoded string.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.nasdanika.models.terraform.TerraformPackage#getStateOutput_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.terraform.StateOutput#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of the output value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.nasdanika.models.terraform.TerraformPackage#getStateOutput_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.terraform.StateOutput#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Sensitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether this output value is marked as sensitive.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sensitive</em>' attribute.
	 * @see #setSensitive(boolean)
	 * @see org.nasdanika.models.terraform.TerraformPackage#getStateOutput_Sensitive()
	 * @model
	 * @generated
	 */
	boolean isSensitive();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.terraform.StateOutput#isSensitive <em>Sensitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensitive</em>' attribute.
	 * @see #isSensitive()
	 * @generated
	 */
	void setSensitive(boolean value);

} // StateOutput
