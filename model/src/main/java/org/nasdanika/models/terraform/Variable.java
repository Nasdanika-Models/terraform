/**
 */
package org.nasdanika.models.terraform;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An input variable declaration that allows callers to customize module behavior without modifying the source. Variables are the parameters of Terraform modules, comparable to function arguments in programming.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.terraform.Variable#getType <em>Type</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.Variable#getDefault <em>Default</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.Variable#isSensitive <em>Sensitive</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.Variable#isNullable <em>Nullable</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.Variable#getValidations <em>Validations</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.terraform.TerraformPackage#getVariable()
 * @model
 * @generated
 */
public interface Variable extends DocumentedNamedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Type constraint expressed as an HCL type expression (e.g., 'string', 'number', 'bool', 'list(string)', 'map(any)', 'object({...})').
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.nasdanika.models.terraform.TerraformPackage#getVariable_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.terraform.Variable#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Default value for the variable as an HCL expression. If omitted, the caller must provide a value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default</em>' attribute.
	 * @see #setDefault(String)
	 * @see org.nasdanika.models.terraform.TerraformPackage#getVariable_Default()
	 * @model
	 * @generated
	 */
	String getDefault();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.terraform.Variable#getDefault <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' attribute.
	 * @see #getDefault()
	 * @generated
	 */
	void setDefault(String value);

	/**
	 * Returns the value of the '<em><b>Sensitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When true, marks the variable value as sensitive. Sensitive values are redacted from Terraform output and logs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sensitive</em>' attribute.
	 * @see #setSensitive(boolean)
	 * @see org.nasdanika.models.terraform.TerraformPackage#getVariable_Sensitive()
	 * @model
	 * @generated
	 */
	boolean isSensitive();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.terraform.Variable#isSensitive <em>Sensitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensitive</em>' attribute.
	 * @see #isSensitive()
	 * @generated
	 */
	void setSensitive(boolean value);

	/**
	 * Returns the value of the '<em><b>Nullable</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When false, Terraform will reject null values for this variable. Defaults to true.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nullable</em>' attribute.
	 * @see #setNullable(boolean)
	 * @see org.nasdanika.models.terraform.TerraformPackage#getVariable_Nullable()
	 * @model default="true"
	 * @generated
	 */
	boolean isNullable();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.terraform.Variable#isNullable <em>Nullable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nullable</em>' attribute.
	 * @see #isNullable()
	 * @generated
	 */
	void setNullable(boolean value);

	/**
	 * Returns the value of the '<em><b>Validations</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.terraform.Validation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Custom validation rules for the variable value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Validations</em>' containment reference list.
	 * @see org.nasdanika.models.terraform.TerraformPackage#getVariable_Validations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Validation> getValidations();

} // Variable
