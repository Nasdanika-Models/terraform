/**
 */
package org.nasdanika.models.terraform;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lifecycle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A lifecycle block within a resource that customizes the resource lifecycle behavior. Provides fine-grained control over how Terraform creates, updates, and destroys resources.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.terraform.Lifecycle#isCreateBeforeDestroy <em>Create Before Destroy</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.Lifecycle#isPreventDestroy <em>Prevent Destroy</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.Lifecycle#getIgnoreChanges <em>Ignore Changes</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.Lifecycle#getReplaceTriggeredBy <em>Replace Triggered By</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.terraform.TerraformPackage#getLifecycle()
 * @model
 * @generated
 */
public interface Lifecycle extends EObject {
	/**
	 * Returns the value of the '<em><b>Create Before Destroy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When true, Terraform will create a new resource before destroying the old one when the resource must be replaced. Useful for zero-downtime deployments.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Create Before Destroy</em>' attribute.
	 * @see #setCreateBeforeDestroy(boolean)
	 * @see org.nasdanika.models.terraform.TerraformPackage#getLifecycle_CreateBeforeDestroy()
	 * @model
	 * @generated
	 */
	boolean isCreateBeforeDestroy();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.terraform.Lifecycle#isCreateBeforeDestroy <em>Create Before Destroy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Create Before Destroy</em>' attribute.
	 * @see #isCreateBeforeDestroy()
	 * @generated
	 */
	void setCreateBeforeDestroy(boolean value);

	/**
	 * Returns the value of the '<em><b>Prevent Destroy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When true, any attempt to destroy the resource will produce an error. Useful for protecting critical infrastructure components.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Prevent Destroy</em>' attribute.
	 * @see #setPreventDestroy(boolean)
	 * @see org.nasdanika.models.terraform.TerraformPackage#getLifecycle_PreventDestroy()
	 * @model
	 * @generated
	 */
	boolean isPreventDestroy();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.terraform.Lifecycle#isPreventDestroy <em>Prevent Destroy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prevent Destroy</em>' attribute.
	 * @see #isPreventDestroy()
	 * @generated
	 */
	void setPreventDestroy(boolean value);

	/**
	 * Returns the value of the '<em><b>Ignore Changes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * List of attribute paths that Terraform should ignore when planning updates. Changes to these attributes will not trigger a plan diff.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ignore Changes</em>' attribute list.
	 * @see org.nasdanika.models.terraform.TerraformPackage#getLifecycle_IgnoreChanges()
	 * @model
	 * @generated
	 */
	EList<String> getIgnoreChanges();

	/**
	 * Returns the value of the '<em><b>Replace Triggered By</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * List of references to resources or resource attributes that, when changed, should trigger replacement of this resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Replace Triggered By</em>' attribute list.
	 * @see org.nasdanika.models.terraform.TerraformPackage#getLifecycle_ReplaceTriggeredBy()
	 * @model
	 * @generated
	 */
	EList<String> getReplaceTriggeredBy();

} // Lifecycle
