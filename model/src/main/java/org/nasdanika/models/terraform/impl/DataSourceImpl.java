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
import org.nasdanika.models.terraform.DataSource;
import org.nasdanika.models.terraform.Lifecycle;
import org.nasdanika.models.terraform.Postcondition;
import org.nasdanika.models.terraform.Precondition;
import org.nasdanika.models.terraform.TerraformPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.terraform.impl.DataSourceImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.impl.DataSourceImpl#getProvider <em>Provider</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.impl.DataSourceImpl#getCount <em>Count</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.impl.DataSourceImpl#getForEach <em>For Each</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.impl.DataSourceImpl#getDependsOn <em>Depends On</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.impl.DataSourceImpl#getArguments <em>Arguments</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.impl.DataSourceImpl#getLifecycle <em>Lifecycle</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.impl.DataSourceImpl#getPreconditions <em>Preconditions</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.impl.DataSourceImpl#getPostconditions <em>Postconditions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataSourceImpl extends DocumentedNamedElementImpl implements DataSource {
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
	protected DataSourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TerraformPackage.Literals.DATA_SOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getType() {
		return (String)eDynamicGet(TerraformPackage.DATA_SOURCE__TYPE, TerraformPackage.Literals.DATA_SOURCE__TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(String newType) {
		eDynamicSet(TerraformPackage.DATA_SOURCE__TYPE, TerraformPackage.Literals.DATA_SOURCE__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProvider() {
		return (String)eDynamicGet(TerraformPackage.DATA_SOURCE__PROVIDER, TerraformPackage.Literals.DATA_SOURCE__PROVIDER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProvider(String newProvider) {
		eDynamicSet(TerraformPackage.DATA_SOURCE__PROVIDER, TerraformPackage.Literals.DATA_SOURCE__PROVIDER, newProvider);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCount() {
		return (String)eDynamicGet(TerraformPackage.DATA_SOURCE__COUNT, TerraformPackage.Literals.DATA_SOURCE__COUNT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCount(String newCount) {
		eDynamicSet(TerraformPackage.DATA_SOURCE__COUNT, TerraformPackage.Literals.DATA_SOURCE__COUNT, newCount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getForEach() {
		return (String)eDynamicGet(TerraformPackage.DATA_SOURCE__FOR_EACH, TerraformPackage.Literals.DATA_SOURCE__FOR_EACH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setForEach(String newForEach) {
		eDynamicSet(TerraformPackage.DATA_SOURCE__FOR_EACH, TerraformPackage.Literals.DATA_SOURCE__FOR_EACH, newForEach);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getDependsOn() {
		return (EList<String>)eDynamicGet(TerraformPackage.DATA_SOURCE__DEPENDS_ON, TerraformPackage.Literals.DATA_SOURCE__DEPENDS_ON, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Argument> getArguments() {
		return (EList<Argument>)eDynamicGet(TerraformPackage.DATA_SOURCE__ARGUMENTS, TerraformPackage.Literals.DATA_SOURCE__ARGUMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Lifecycle getLifecycle() {
		return (Lifecycle)eDynamicGet(TerraformPackage.DATA_SOURCE__LIFECYCLE, TerraformPackage.Literals.DATA_SOURCE__LIFECYCLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLifecycle(Lifecycle newLifecycle, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newLifecycle, TerraformPackage.DATA_SOURCE__LIFECYCLE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLifecycle(Lifecycle newLifecycle) {
		eDynamicSet(TerraformPackage.DATA_SOURCE__LIFECYCLE, TerraformPackage.Literals.DATA_SOURCE__LIFECYCLE, newLifecycle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Precondition> getPreconditions() {
		return (EList<Precondition>)eDynamicGet(TerraformPackage.DATA_SOURCE__PRECONDITIONS, TerraformPackage.Literals.DATA_SOURCE__PRECONDITIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Postcondition> getPostconditions() {
		return (EList<Postcondition>)eDynamicGet(TerraformPackage.DATA_SOURCE__POSTCONDITIONS, TerraformPackage.Literals.DATA_SOURCE__POSTCONDITIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TerraformPackage.DATA_SOURCE__ARGUMENTS:
				return ((InternalEList<?>)getArguments()).basicRemove(otherEnd, msgs);
			case TerraformPackage.DATA_SOURCE__LIFECYCLE:
				return basicSetLifecycle(null, msgs);
			case TerraformPackage.DATA_SOURCE__PRECONDITIONS:
				return ((InternalEList<?>)getPreconditions()).basicRemove(otherEnd, msgs);
			case TerraformPackage.DATA_SOURCE__POSTCONDITIONS:
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
			case TerraformPackage.DATA_SOURCE__TYPE:
				return getType();
			case TerraformPackage.DATA_SOURCE__PROVIDER:
				return getProvider();
			case TerraformPackage.DATA_SOURCE__COUNT:
				return getCount();
			case TerraformPackage.DATA_SOURCE__FOR_EACH:
				return getForEach();
			case TerraformPackage.DATA_SOURCE__DEPENDS_ON:
				return getDependsOn();
			case TerraformPackage.DATA_SOURCE__ARGUMENTS:
				return getArguments();
			case TerraformPackage.DATA_SOURCE__LIFECYCLE:
				return getLifecycle();
			case TerraformPackage.DATA_SOURCE__PRECONDITIONS:
				return getPreconditions();
			case TerraformPackage.DATA_SOURCE__POSTCONDITIONS:
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
			case TerraformPackage.DATA_SOURCE__TYPE:
				setType((String)newValue);
				return;
			case TerraformPackage.DATA_SOURCE__PROVIDER:
				setProvider((String)newValue);
				return;
			case TerraformPackage.DATA_SOURCE__COUNT:
				setCount((String)newValue);
				return;
			case TerraformPackage.DATA_SOURCE__FOR_EACH:
				setForEach((String)newValue);
				return;
			case TerraformPackage.DATA_SOURCE__DEPENDS_ON:
				getDependsOn().clear();
				getDependsOn().addAll((Collection<? extends String>)newValue);
				return;
			case TerraformPackage.DATA_SOURCE__ARGUMENTS:
				getArguments().clear();
				getArguments().addAll((Collection<? extends Argument>)newValue);
				return;
			case TerraformPackage.DATA_SOURCE__LIFECYCLE:
				setLifecycle((Lifecycle)newValue);
				return;
			case TerraformPackage.DATA_SOURCE__PRECONDITIONS:
				getPreconditions().clear();
				getPreconditions().addAll((Collection<? extends Precondition>)newValue);
				return;
			case TerraformPackage.DATA_SOURCE__POSTCONDITIONS:
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
			case TerraformPackage.DATA_SOURCE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case TerraformPackage.DATA_SOURCE__PROVIDER:
				setProvider(PROVIDER_EDEFAULT);
				return;
			case TerraformPackage.DATA_SOURCE__COUNT:
				setCount(COUNT_EDEFAULT);
				return;
			case TerraformPackage.DATA_SOURCE__FOR_EACH:
				setForEach(FOR_EACH_EDEFAULT);
				return;
			case TerraformPackage.DATA_SOURCE__DEPENDS_ON:
				getDependsOn().clear();
				return;
			case TerraformPackage.DATA_SOURCE__ARGUMENTS:
				getArguments().clear();
				return;
			case TerraformPackage.DATA_SOURCE__LIFECYCLE:
				setLifecycle((Lifecycle)null);
				return;
			case TerraformPackage.DATA_SOURCE__PRECONDITIONS:
				getPreconditions().clear();
				return;
			case TerraformPackage.DATA_SOURCE__POSTCONDITIONS:
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
			case TerraformPackage.DATA_SOURCE__TYPE:
				return TYPE_EDEFAULT == null ? getType() != null : !TYPE_EDEFAULT.equals(getType());
			case TerraformPackage.DATA_SOURCE__PROVIDER:
				return PROVIDER_EDEFAULT == null ? getProvider() != null : !PROVIDER_EDEFAULT.equals(getProvider());
			case TerraformPackage.DATA_SOURCE__COUNT:
				return COUNT_EDEFAULT == null ? getCount() != null : !COUNT_EDEFAULT.equals(getCount());
			case TerraformPackage.DATA_SOURCE__FOR_EACH:
				return FOR_EACH_EDEFAULT == null ? getForEach() != null : !FOR_EACH_EDEFAULT.equals(getForEach());
			case TerraformPackage.DATA_SOURCE__DEPENDS_ON:
				return !getDependsOn().isEmpty();
			case TerraformPackage.DATA_SOURCE__ARGUMENTS:
				return !getArguments().isEmpty();
			case TerraformPackage.DATA_SOURCE__LIFECYCLE:
				return getLifecycle() != null;
			case TerraformPackage.DATA_SOURCE__PRECONDITIONS:
				return !getPreconditions().isEmpty();
			case TerraformPackage.DATA_SOURCE__POSTCONDITIONS:
				return !getPostconditions().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DataSourceImpl
