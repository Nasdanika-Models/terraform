/**
 */
package org.nasdanika.models.terraform;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An output value declaration that exposes values from a module to the calling module or to the user. Output values make information about infrastructure available after applying the configuration.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.terraform.Output#getValue <em>Value</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.Output#isSensitive <em>Sensitive</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.Output#getDependsOn <em>Depends On</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.Output#getPreconditions <em>Preconditions</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.terraform.TerraformPackage#getOutput()
 * @model
 * @generated
 */
public interface Output extends DocumentedNamedElement {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The HCL expression whose result is exported as the output value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.nasdanika.models.terraform.TerraformPackage#getOutput_Value()
	 * @model required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.terraform.Output#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Sensitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When true, marks the output value as sensitive. Sensitive values are redacted from Terraform output and logs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sensitive</em>' attribute.
	 * @see #setSensitive(boolean)
	 * @see org.nasdanika.models.terraform.TerraformPackage#getOutput_Sensitive()
	 * @model
	 * @generated
	 */
	boolean isSensitive();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.terraform.Output#isSensitive <em>Sensitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensitive</em>' attribute.
	 * @see #isSensitive()
	 * @generated
	 */
	void setSensitive(boolean value);

	/**
	 * Returns the value of the '<em><b>Depends On</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Explicit dependencies for the output value, used when the value does not implicitly depend on all required resources. Specified as reference strings.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Depends On</em>' attribute list.
	 * @see org.nasdanika.models.terraform.TerraformPackage#getOutput_DependsOn()
	 * @model
	 * @generated
	 */
	EList<String> getDependsOn();

	/**
	 * Returns the value of the '<em><b>Preconditions</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.terraform.Precondition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Preconditions that must be met before evaluating the output value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Preconditions</em>' containment reference list.
	 * @see org.nasdanika.models.terraform.TerraformPackage#getOutput_Preconditions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Precondition> getPreconditions();

} // Output
