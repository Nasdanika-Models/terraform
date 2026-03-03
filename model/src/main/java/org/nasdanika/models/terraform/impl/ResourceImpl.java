/**
 */
package org.nasdanika.models.terraform.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.terraform.Argument;
import org.nasdanika.models.terraform.Lifecycle;
import org.nasdanika.models.terraform.Postcondition;
import org.nasdanika.models.terraform.Precondition;
import org.nasdanika.models.terraform.Provisioner;
import org.nasdanika.models.terraform.Resource;
import org.nasdanika.models.terraform.TerraformPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.terraform.impl.ResourceImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.impl.ResourceImpl#getProvider <em>Provider</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.impl.ResourceImpl#getCount <em>Count</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.impl.ResourceImpl#getForEach <em>For Each</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.impl.ResourceImpl#getDependsOn <em>Depends On</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.impl.ResourceImpl#getArguments <em>Arguments</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.impl.ResourceImpl#getProvisioners <em>Provisioners</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.impl.ResourceImpl#getLifecycle <em>Lifecycle</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.impl.ResourceImpl#getPreconditions <em>Preconditions</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.impl.ResourceImpl#getPostconditions <em>Postconditions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceImpl extends DocumentedNamedElementImpl implements Resource {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getProvider() <em>Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvider()
	 * @generated
	 * @ordered
	 */
	protected static final String PROVIDER_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getCount() <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected static final String COUNT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getForEach() <em>For Each</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForEach()
	 * @generated
	 * @ordered
	 */
	protected static final String FOR_EACH_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TerraformPackage.Literals.RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getType() {
		return (String)eDynamicGet(TerraformPackage.RESOURCE__TYPE, TerraformPackage.Literals.RESOURCE__TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(String newType) {
		eDynamicSet(TerraformPackage.RESOURCE__TYPE, TerraformPackage.Literals.RESOURCE__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProvider() {
		return (String)eDynamicGet(TerraformPackage.RESOURCE__PROVIDER, TerraformPackage.Literals.RESOURCE__PROVIDER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProvider(String newProvider) {
		eDynamicSet(TerraformPackage.RESOURCE__PROVIDER, TerraformPackage.Literals.RESOURCE__PROVIDER, newProvider);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCount() {
		return (String)eDynamicGet(TerraformPackage.RESOURCE__COUNT, TerraformPackage.Literals.RESOURCE__COUNT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCount(String newCount) {
		eDynamicSet(TerraformPackage.RESOURCE__COUNT, TerraformPackage.Literals.RESOURCE__COUNT, newCount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getForEach() {
		return (String)eDynamicGet(TerraformPackage.RESOURCE__FOR_EACH, TerraformPackage.Literals.RESOURCE__FOR_EACH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setForEach(String newForEach) {
		eDynamicSet(TerraformPackage.RESOURCE__FOR_EACH, TerraformPackage.Literals.RESOURCE__FOR_EACH, newForEach);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getDependsOn() {
		return (EList<String>)eDynamicGet(TerraformPackage.RESOURCE__DEPENDS_ON, TerraformPackage.Literals.RESOURCE__DEPENDS_ON, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Argument> getArguments() {
		return (EList<Argument>)eDynamicGet(TerraformPackage.RESOURCE__ARGUMENTS, TerraformPackage.Literals.RESOURCE__ARGUMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Provisioner> getProvisioners() {
		return (EList<Provisioner>)eDynamicGet(TerraformPackage.RESOURCE__PROVISIONERS, TerraformPackage.Literals.RESOURCE__PROVISIONERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Lifecycle getLifecycle() {
		return (Lifecycle)eDynamicGet(TerraformPackage.RESOURCE__LIFECYCLE, TerraformPackage.Literals.RESOURCE__LIFECYCLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLifecycle(Lifecycle newLifecycle, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newLifecycle, TerraformPackage.RESOURCE__LIFECYCLE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLifecycle(Lifecycle newLifecycle) {
		eDynamicSet(TerraformPackage.RESOURCE__LIFECYCLE, TerraformPackage.Literals.RESOURCE__LIFECYCLE, newLifecycle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Precondition> getPreconditions() {
		return (EList<Precondition>)eDynamicGet(TerraformPackage.RESOURCE__PRECONDITIONS, TerraformPackage.Literals.RESOURCE__PRECONDITIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Postcondition> getPostconditions() {
		return (EList<Postcondition>)eDynamicGet(TerraformPackage.RESOURCE__POSTCONDITIONS, TerraformPackage.Literals.RESOURCE__POSTCONDITIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TerraformPackage.RESOURCE__ARGUMENTS:
				return ((InternalEList<?>)getArguments()).basicRemove(otherEnd, msgs);
			case TerraformPackage.RESOURCE__PROVISIONERS:
				return ((InternalEList<?>)getProvisioners()).basicRemove(otherEnd, msgs);
			case TerraformPackage.RESOURCE__LIFECYCLE:
				return basicSetLifecycle(null, msgs);
			case TerraformPackage.RESOURCE__PRECONDITIONS:
				return ((InternalEList<?>)getPreconditions()).basicRemove(otherEnd, msgs);
			case TerraformPackage.RESOURCE__POSTCONDITIONS:
				return ((InternalEList<?>)getPostconditions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TerraformPackage.RESOURCE__TYPE:
				return getType();
			case TerraformPackage.RESOURCE__PROVIDER:
				return getProvider();
			case TerraformPackage.RESOURCE__COUNT:
				return getCount();
			case TerraformPackage.RESOURCE__FOR_EACH:
				return getForEach();
			case TerraformPackage.RESOURCE__DEPENDS_ON:
				return getDependsOn();
			case TerraformPackage.RESOURCE__ARGUMENTS:
				return getArguments();
			case TerraformPackage.RESOURCE__PROVISIONERS:
				return getProvisioners();
			case TerraformPackage.RESOURCE__LIFECYCLE:
				return getLifecycle();
			case TerraformPackage.RESOURCE__PRECONDITIONS:
				return getPreconditions();
			case TerraformPackage.RESOURCE__POSTCONDITIONS:
				return getPostconditions();
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
			case TerraformPackage.RESOURCE__TYPE:
				setType((String)newValue);
				return;
			case TerraformPackage.RESOURCE__PROVIDER:
				setProvider((String)newValue);
				return;
			case TerraformPackage.RESOURCE__COUNT:
				setCount((String)newValue);
				return;
			case TerraformPackage.RESOURCE__FOR_EACH:
				setForEach((String)newValue);
				return;
			case TerraformPackage.RESOURCE__DEPENDS_ON:
				getDependsOn().clear();
				getDependsOn().addAll((Collection<? extends String>)newValue);
				return;
			case TerraformPackage.RESOURCE__ARGUMENTS:
				getArguments().clear();
				getArguments().addAll((Collection<? extends Argument>)newValue);
				return;
			case TerraformPackage.RESOURCE__PROVISIONERS:
				getProvisioners().clear();
				getProvisioners().addAll((Collection<? extends Provisioner>)newValue);
				return;
			case TerraformPackage.RESOURCE__LIFECYCLE:
				setLifecycle((Lifecycle)newValue);
				return;
			case TerraformPackage.RESOURCE__PRECONDITIONS:
				getPreconditions().clear();
				getPreconditions().addAll((Collection<? extends Precondition>)newValue);
				return;
			case TerraformPackage.RESOURCE__POSTCONDITIONS:
				getPostconditions().clear();
				getPostconditions().addAll((Collection<? extends Postcondition>)newValue);
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
			case TerraformPackage.RESOURCE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case TerraformPackage.RESOURCE__PROVIDER:
				setProvider(PROVIDER_EDEFAULT);
				return;
			case TerraformPackage.RESOURCE__COUNT:
				setCount(COUNT_EDEFAULT);
				return;
			case TerraformPackage.RESOURCE__FOR_EACH:
				setForEach(FOR_EACH_EDEFAULT);
				return;
			case TerraformPackage.RESOURCE__DEPENDS_ON:
				getDependsOn().clear();
				return;
			case TerraformPackage.RESOURCE__ARGUMENTS:
				getArguments().clear();
				return;
			case TerraformPackage.RESOURCE__PROVISIONERS:
				getProvisioners().clear();
				return;
			case TerraformPackage.RESOURCE__LIFECYCLE:
				setLifecycle((Lifecycle)null);
				return;
			case TerraformPackage.RESOURCE__PRECONDITIONS:
				getPreconditions().clear();
				return;
			case TerraformPackage.RESOURCE__POSTCONDITIONS:
				getPostconditions().clear();
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
			case TerraformPackage.RESOURCE__TYPE:
				return TYPE_EDEFAULT == null ? getType() != null : !TYPE_EDEFAULT.equals(getType());
			case TerraformPackage.RESOURCE__PROVIDER:
				return PROVIDER_EDEFAULT == null ? getProvider() != null : !PROVIDER_EDEFAULT.equals(getProvider());
			case TerraformPackage.RESOURCE__COUNT:
				return COUNT_EDEFAULT == null ? getCount() != null : !COUNT_EDEFAULT.equals(getCount());
			case TerraformPackage.RESOURCE__FOR_EACH:
				return FOR_EACH_EDEFAULT == null ? getForEach() != null : !FOR_EACH_EDEFAULT.equals(getForEach());
			case TerraformPackage.RESOURCE__DEPENDS_ON:
				return !getDependsOn().isEmpty();
			case TerraformPackage.RESOURCE__ARGUMENTS:
				return !getArguments().isEmpty();
			case TerraformPackage.RESOURCE__PROVISIONERS:
				return !getProvisioners().isEmpty();
			case TerraformPackage.RESOURCE__LIFECYCLE:
				return getLifecycle() != null;
			case TerraformPackage.RESOURCE__PRECONDITIONS:
				return !getPreconditions().isEmpty();
			case TerraformPackage.RESOURCE__POSTCONDITIONS:
				return !getPostconditions().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ResourceImpl
