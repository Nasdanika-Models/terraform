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
import org.nasdanika.models.terraform.ModuleCall;
import org.nasdanika.models.terraform.TerraformPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.terraform.impl.ModuleCallImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.impl.ModuleCallImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.impl.ModuleCallImpl#getCount <em>Count</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.impl.ModuleCallImpl#getForEach <em>For Each</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.impl.ModuleCallImpl#getDependsOn <em>Depends On</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.impl.ModuleCallImpl#getArguments <em>Arguments</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.impl.ModuleCallImpl#getProviders <em>Providers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModuleCallImpl extends DocumentedNamedElementImpl implements ModuleCall {
	/**
	 * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

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
	protected ModuleCallImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TerraformPackage.Literals.MODULE_CALL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSource() {
		return (String)eDynamicGet(TerraformPackage.MODULE_CALL__SOURCE, TerraformPackage.Literals.MODULE_CALL__SOURCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSource(String newSource) {
		eDynamicSet(TerraformPackage.MODULE_CALL__SOURCE, TerraformPackage.Literals.MODULE_CALL__SOURCE, newSource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVersion() {
		return (String)eDynamicGet(TerraformPackage.MODULE_CALL__VERSION, TerraformPackage.Literals.MODULE_CALL__VERSION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersion(String newVersion) {
		eDynamicSet(TerraformPackage.MODULE_CALL__VERSION, TerraformPackage.Literals.MODULE_CALL__VERSION, newVersion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCount() {
		return (String)eDynamicGet(TerraformPackage.MODULE_CALL__COUNT, TerraformPackage.Literals.MODULE_CALL__COUNT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCount(String newCount) {
		eDynamicSet(TerraformPackage.MODULE_CALL__COUNT, TerraformPackage.Literals.MODULE_CALL__COUNT, newCount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getForEach() {
		return (String)eDynamicGet(TerraformPackage.MODULE_CALL__FOR_EACH, TerraformPackage.Literals.MODULE_CALL__FOR_EACH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setForEach(String newForEach) {
		eDynamicSet(TerraformPackage.MODULE_CALL__FOR_EACH, TerraformPackage.Literals.MODULE_CALL__FOR_EACH, newForEach);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getDependsOn() {
		return (EList<String>)eDynamicGet(TerraformPackage.MODULE_CALL__DEPENDS_ON, TerraformPackage.Literals.MODULE_CALL__DEPENDS_ON, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Argument> getArguments() {
		return (EList<Argument>)eDynamicGet(TerraformPackage.MODULE_CALL__ARGUMENTS, TerraformPackage.Literals.MODULE_CALL__ARGUMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Argument> getProviders() {
		return (EList<Argument>)eDynamicGet(TerraformPackage.MODULE_CALL__PROVIDERS, TerraformPackage.Literals.MODULE_CALL__PROVIDERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TerraformPackage.MODULE_CALL__ARGUMENTS:
				return ((InternalEList<?>)getArguments()).basicRemove(otherEnd, msgs);
			case TerraformPackage.MODULE_CALL__PROVIDERS:
				return ((InternalEList<?>)getProviders()).basicRemove(otherEnd, msgs);
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
			case TerraformPackage.MODULE_CALL__SOURCE:
				return getSource();
			case TerraformPackage.MODULE_CALL__VERSION:
				return getVersion();
			case TerraformPackage.MODULE_CALL__COUNT:
				return getCount();
			case TerraformPackage.MODULE_CALL__FOR_EACH:
				return getForEach();
			case TerraformPackage.MODULE_CALL__DEPENDS_ON:
				return getDependsOn();
			case TerraformPackage.MODULE_CALL__ARGUMENTS:
				return getArguments();
			case TerraformPackage.MODULE_CALL__PROVIDERS:
				return getProviders();
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
			case TerraformPackage.MODULE_CALL__SOURCE:
				setSource((String)newValue);
				return;
			case TerraformPackage.MODULE_CALL__VERSION:
				setVersion((String)newValue);
				return;
			case TerraformPackage.MODULE_CALL__COUNT:
				setCount((String)newValue);
				return;
			case TerraformPackage.MODULE_CALL__FOR_EACH:
				setForEach((String)newValue);
				return;
			case TerraformPackage.MODULE_CALL__DEPENDS_ON:
				getDependsOn().clear();
				getDependsOn().addAll((Collection<? extends String>)newValue);
				return;
			case TerraformPackage.MODULE_CALL__ARGUMENTS:
				getArguments().clear();
				getArguments().addAll((Collection<? extends Argument>)newValue);
				return;
			case TerraformPackage.MODULE_CALL__PROVIDERS:
				getProviders().clear();
				getProviders().addAll((Collection<? extends Argument>)newValue);
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
			case TerraformPackage.MODULE_CALL__SOURCE:
				setSource(SOURCE_EDEFAULT);
				return;
			case TerraformPackage.MODULE_CALL__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case TerraformPackage.MODULE_CALL__COUNT:
				setCount(COUNT_EDEFAULT);
				return;
			case TerraformPackage.MODULE_CALL__FOR_EACH:
				setForEach(FOR_EACH_EDEFAULT);
				return;
			case TerraformPackage.MODULE_CALL__DEPENDS_ON:
				getDependsOn().clear();
				return;
			case TerraformPackage.MODULE_CALL__ARGUMENTS:
				getArguments().clear();
				return;
			case TerraformPackage.MODULE_CALL__PROVIDERS:
				getProviders().clear();
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
			case TerraformPackage.MODULE_CALL__SOURCE:
				return SOURCE_EDEFAULT == null ? getSource() != null : !SOURCE_EDEFAULT.equals(getSource());
			case TerraformPackage.MODULE_CALL__VERSION:
				return VERSION_EDEFAULT == null ? getVersion() != null : !VERSION_EDEFAULT.equals(getVersion());
			case TerraformPackage.MODULE_CALL__COUNT:
				return COUNT_EDEFAULT == null ? getCount() != null : !COUNT_EDEFAULT.equals(getCount());
			case TerraformPackage.MODULE_CALL__FOR_EACH:
				return FOR_EACH_EDEFAULT == null ? getForEach() != null : !FOR_EACH_EDEFAULT.equals(getForEach());
			case TerraformPackage.MODULE_CALL__DEPENDS_ON:
				return !getDependsOn().isEmpty();
			case TerraformPackage.MODULE_CALL__ARGUMENTS:
				return !getArguments().isEmpty();
			case TerraformPackage.MODULE_CALL__PROVIDERS:
				return !getProviders().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModuleCallImpl
