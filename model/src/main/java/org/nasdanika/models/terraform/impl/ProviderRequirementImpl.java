/**
 */
package org.nasdanika.models.terraform.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.terraform.ProviderRequirement;
import org.nasdanika.models.terraform.TerraformPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Provider Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.terraform.impl.ProviderRequirementImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.impl.ProviderRequirementImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.impl.ProviderRequirementImpl#getConfigurationAlias <em>Configuration Alias</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProviderRequirementImpl extends NamedElementImpl implements ProviderRequirement {
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
	 * The default value of the '{@link #getConfigurationAlias() <em>Configuration Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurationAlias()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFIGURATION_ALIAS_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProviderRequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TerraformPackage.Literals.PROVIDER_REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSource() {
		return (String)eDynamicGet(TerraformPackage.PROVIDER_REQUIREMENT__SOURCE, TerraformPackage.Literals.PROVIDER_REQUIREMENT__SOURCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSource(String newSource) {
		eDynamicSet(TerraformPackage.PROVIDER_REQUIREMENT__SOURCE, TerraformPackage.Literals.PROVIDER_REQUIREMENT__SOURCE, newSource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVersion() {
		return (String)eDynamicGet(TerraformPackage.PROVIDER_REQUIREMENT__VERSION, TerraformPackage.Literals.PROVIDER_REQUIREMENT__VERSION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersion(String newVersion) {
		eDynamicSet(TerraformPackage.PROVIDER_REQUIREMENT__VERSION, TerraformPackage.Literals.PROVIDER_REQUIREMENT__VERSION, newVersion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConfigurationAlias() {
		return (String)eDynamicGet(TerraformPackage.PROVIDER_REQUIREMENT__CONFIGURATION_ALIAS, TerraformPackage.Literals.PROVIDER_REQUIREMENT__CONFIGURATION_ALIAS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfigurationAlias(String newConfigurationAlias) {
		eDynamicSet(TerraformPackage.PROVIDER_REQUIREMENT__CONFIGURATION_ALIAS, TerraformPackage.Literals.PROVIDER_REQUIREMENT__CONFIGURATION_ALIAS, newConfigurationAlias);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TerraformPackage.PROVIDER_REQUIREMENT__SOURCE:
				return getSource();
			case TerraformPackage.PROVIDER_REQUIREMENT__VERSION:
				return getVersion();
			case TerraformPackage.PROVIDER_REQUIREMENT__CONFIGURATION_ALIAS:
				return getConfigurationAlias();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TerraformPackage.PROVIDER_REQUIREMENT__SOURCE:
				setSource((String)newValue);
				return;
			case TerraformPackage.PROVIDER_REQUIREMENT__VERSION:
				setVersion((String)newValue);
				return;
			case TerraformPackage.PROVIDER_REQUIREMENT__CONFIGURATION_ALIAS:
				setConfigurationAlias((String)newValue);
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
			case TerraformPackage.PROVIDER_REQUIREMENT__SOURCE:
				setSource(SOURCE_EDEFAULT);
				return;
			case TerraformPackage.PROVIDER_REQUIREMENT__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case TerraformPackage.PROVIDER_REQUIREMENT__CONFIGURATION_ALIAS:
				setConfigurationAlias(CONFIGURATION_ALIAS_EDEFAULT);
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
			case TerraformPackage.PROVIDER_REQUIREMENT__SOURCE:
				return SOURCE_EDEFAULT == null ? getSource() != null : !SOURCE_EDEFAULT.equals(getSource());
			case TerraformPackage.PROVIDER_REQUIREMENT__VERSION:
				return VERSION_EDEFAULT == null ? getVersion() != null : !VERSION_EDEFAULT.equals(getVersion());
			case TerraformPackage.PROVIDER_REQUIREMENT__CONFIGURATION_ALIAS:
				return CONFIGURATION_ALIAS_EDEFAULT == null ? getConfigurationAlias() != null : !CONFIGURATION_ALIAS_EDEFAULT.equals(getConfigurationAlias());
		}
		return super.eIsSet(featureID);
	}

} //ProviderRequirementImpl
