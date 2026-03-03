/**
 */
package org.nasdanika.models.terraform.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.terraform.Lifecycle;
import org.nasdanika.models.terraform.TerraformPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lifecycle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.terraform.impl.LifecycleImpl#isCreateBeforeDestroy <em>Create Before Destroy</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.impl.LifecycleImpl#isPreventDestroy <em>Prevent Destroy</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.impl.LifecycleImpl#getIgnoreChanges <em>Ignore Changes</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.impl.LifecycleImpl#getReplaceTriggeredBy <em>Replace Triggered By</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LifecycleImpl extends MinimalEObjectImpl.Container implements Lifecycle {
	/**
	 * The default value of the '{@link #isCreateBeforeDestroy() <em>Create Before Destroy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCreateBeforeDestroy()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CREATE_BEFORE_DESTROY_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isPreventDestroy() <em>Prevent Destroy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPreventDestroy()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PREVENT_DESTROY_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LifecycleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TerraformPackage.Literals.LIFECYCLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCreateBeforeDestroy() {
		return (Boolean)eDynamicGet(TerraformPackage.LIFECYCLE__CREATE_BEFORE_DESTROY, TerraformPackage.Literals.LIFECYCLE__CREATE_BEFORE_DESTROY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreateBeforeDestroy(boolean newCreateBeforeDestroy) {
		eDynamicSet(TerraformPackage.LIFECYCLE__CREATE_BEFORE_DESTROY, TerraformPackage.Literals.LIFECYCLE__CREATE_BEFORE_DESTROY, newCreateBeforeDestroy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isPreventDestroy() {
		return (Boolean)eDynamicGet(TerraformPackage.LIFECYCLE__PREVENT_DESTROY, TerraformPackage.Literals.LIFECYCLE__PREVENT_DESTROY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPreventDestroy(boolean newPreventDestroy) {
		eDynamicSet(TerraformPackage.LIFECYCLE__PREVENT_DESTROY, TerraformPackage.Literals.LIFECYCLE__PREVENT_DESTROY, newPreventDestroy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getIgnoreChanges() {
		return (EList<String>)eDynamicGet(TerraformPackage.LIFECYCLE__IGNORE_CHANGES, TerraformPackage.Literals.LIFECYCLE__IGNORE_CHANGES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getReplaceTriggeredBy() {
		return (EList<String>)eDynamicGet(TerraformPackage.LIFECYCLE__REPLACE_TRIGGERED_BY, TerraformPackage.Literals.LIFECYCLE__REPLACE_TRIGGERED_BY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TerraformPackage.LIFECYCLE__CREATE_BEFORE_DESTROY:
				return isCreateBeforeDestroy();
			case TerraformPackage.LIFECYCLE__PREVENT_DESTROY:
				return isPreventDestroy();
			case TerraformPackage.LIFECYCLE__IGNORE_CHANGES:
				return getIgnoreChanges();
			case TerraformPackage.LIFECYCLE__REPLACE_TRIGGERED_BY:
				return getReplaceTriggeredBy();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TerraformPackage.LIFECYCLE__CREATE_BEFORE_DESTROY:
				setCreateBeforeDestroy((Boolean)newValue);
				return;
			case TerraformPackage.LIFECYCLE__PREVENT_DESTROY:
				setPreventDestroy((Boolean)newValue);
				return;
			case TerraformPackage.LIFECYCLE__IGNORE_CHANGES:
				getIgnoreChanges().clear();
				getIgnoreChanges().addAll((Collection<? extends String>)newValue);
				return;
			case TerraformPackage.LIFECYCLE__REPLACE_TRIGGERED_BY:
				getReplaceTriggeredBy().clear();
				getReplaceTriggeredBy().addAll((Collection<? extends String>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TerraformPackage.LIFECYCLE__CREATE_BEFORE_DESTROY:
				setCreateBeforeDestroy(CREATE_BEFORE_DESTROY_EDEFAULT);
				return;
			case TerraformPackage.LIFECYCLE__PREVENT_DESTROY:
				setPreventDestroy(PREVENT_DESTROY_EDEFAULT);
				return;
			case TerraformPackage.LIFECYCLE__IGNORE_CHANGES:
				getIgnoreChanges().clear();
				return;
			case TerraformPackage.LIFECYCLE__REPLACE_TRIGGERED_BY:
				getReplaceTriggeredBy().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TerraformPackage.LIFECYCLE__CREATE_BEFORE_DESTROY:
				return isCreateBeforeDestroy() != CREATE_BEFORE_DESTROY_EDEFAULT;
			case TerraformPackage.LIFECYCLE__PREVENT_DESTROY:
				return isPreventDestroy() != PREVENT_DESTROY_EDEFAULT;
			case TerraformPackage.LIFECYCLE__IGNORE_CHANGES:
				return !getIgnoreChanges().isEmpty();
			case TerraformPackage.LIFECYCLE__REPLACE_TRIGGERED_BY:
				return !getReplaceTriggeredBy().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LifecycleImpl
