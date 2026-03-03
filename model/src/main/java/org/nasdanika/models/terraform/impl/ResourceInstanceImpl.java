/**
 */
package org.nasdanika.models.terraform.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.terraform.ResourceInstance;
import org.nasdanika.models.terraform.TerraformPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.terraform.impl.ResourceInstanceImpl#getIndexKey <em>Index Key</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.impl.ResourceInstanceImpl#getSchemaVersion <em>Schema Version</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.impl.ResourceInstanceImpl#getAttributesJson <em>Attributes Json</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.impl.ResourceInstanceImpl#getSensitiveAttributes <em>Sensitive Attributes</em>}</li>
 *   <li>{@link org.nasdanika.models.terraform.impl.ResourceInstanceImpl#getPrivateJson <em>Private Json</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceInstanceImpl extends MinimalEObjectImpl.Container implements ResourceInstance {
	/**
	 * The default value of the '{@link #getIndexKey() <em>Index Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndexKey()
	 * @generated
	 * @ordered
	 */
	protected static final String INDEX_KEY_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getSchemaVersion() <em>Schema Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemaVersion()
	 * @generated
	 * @ordered
	 */
	protected static final int SCHEMA_VERSION_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getAttributesJson() <em>Attributes Json</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributesJson()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTRIBUTES_JSON_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getSensitiveAttributes() <em>Sensitive Attributes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensitiveAttributes()
	 * @generated
	 * @ordered
	 */
	protected static final String SENSITIVE_ATTRIBUTES_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getPrivateJson() <em>Private Json</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivateJson()
	 * @generated
	 * @ordered
	 */
	protected static final String PRIVATE_JSON_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TerraformPackage.Literals.RESOURCE_INSTANCE;
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
	public String getIndexKey() {
		return (String)eDynamicGet(TerraformPackage.RESOURCE_INSTANCE__INDEX_KEY, TerraformPackage.Literals.RESOURCE_INSTANCE__INDEX_KEY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIndexKey(String newIndexKey) {
		eDynamicSet(TerraformPackage.RESOURCE_INSTANCE__INDEX_KEY, TerraformPackage.Literals.RESOURCE_INSTANCE__INDEX_KEY, newIndexKey);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getSchemaVersion() {
		return (Integer)eDynamicGet(TerraformPackage.RESOURCE_INSTANCE__SCHEMA_VERSION, TerraformPackage.Literals.RESOURCE_INSTANCE__SCHEMA_VERSION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSchemaVersion(int newSchemaVersion) {
		eDynamicSet(TerraformPackage.RESOURCE_INSTANCE__SCHEMA_VERSION, TerraformPackage.Literals.RESOURCE_INSTANCE__SCHEMA_VERSION, newSchemaVersion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAttributesJson() {
		return (String)eDynamicGet(TerraformPackage.RESOURCE_INSTANCE__ATTRIBUTES_JSON, TerraformPackage.Literals.RESOURCE_INSTANCE__ATTRIBUTES_JSON, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAttributesJson(String newAttributesJson) {
		eDynamicSet(TerraformPackage.RESOURCE_INSTANCE__ATTRIBUTES_JSON, TerraformPackage.Literals.RESOURCE_INSTANCE__ATTRIBUTES_JSON, newAttributesJson);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSensitiveAttributes() {
		return (String)eDynamicGet(TerraformPackage.RESOURCE_INSTANCE__SENSITIVE_ATTRIBUTES, TerraformPackage.Literals.RESOURCE_INSTANCE__SENSITIVE_ATTRIBUTES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSensitiveAttributes(String newSensitiveAttributes) {
		eDynamicSet(TerraformPackage.RESOURCE_INSTANCE__SENSITIVE_ATTRIBUTES, TerraformPackage.Literals.RESOURCE_INSTANCE__SENSITIVE_ATTRIBUTES, newSensitiveAttributes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPrivateJson() {
		return (String)eDynamicGet(TerraformPackage.RESOURCE_INSTANCE__PRIVATE_JSON, TerraformPackage.Literals.RESOURCE_INSTANCE__PRIVATE_JSON, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrivateJson(String newPrivateJson) {
		eDynamicSet(TerraformPackage.RESOURCE_INSTANCE__PRIVATE_JSON, TerraformPackage.Literals.RESOURCE_INSTANCE__PRIVATE_JSON, newPrivateJson);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TerraformPackage.RESOURCE_INSTANCE__INDEX_KEY:
				return getIndexKey();
			case TerraformPackage.RESOURCE_INSTANCE__SCHEMA_VERSION:
				return getSchemaVersion();
			case TerraformPackage.RESOURCE_INSTANCE__ATTRIBUTES_JSON:
				return getAttributesJson();
			case TerraformPackage.RESOURCE_INSTANCE__SENSITIVE_ATTRIBUTES:
				return getSensitiveAttributes();
			case TerraformPackage.RESOURCE_INSTANCE__PRIVATE_JSON:
				return getPrivateJson();
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
			case TerraformPackage.RESOURCE_INSTANCE__INDEX_KEY:
				setIndexKey((String)newValue);
				return;
			case TerraformPackage.RESOURCE_INSTANCE__SCHEMA_VERSION:
				setSchemaVersion((Integer)newValue);
				return;
			case TerraformPackage.RESOURCE_INSTANCE__ATTRIBUTES_JSON:
				setAttributesJson((String)newValue);
				return;
			case TerraformPackage.RESOURCE_INSTANCE__SENSITIVE_ATTRIBUTES:
				setSensitiveAttributes((String)newValue);
				return;
			case TerraformPackage.RESOURCE_INSTANCE__PRIVATE_JSON:
				setPrivateJson((String)newValue);
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
			case TerraformPackage.RESOURCE_INSTANCE__INDEX_KEY:
				setIndexKey(INDEX_KEY_EDEFAULT);
				return;
			case TerraformPackage.RESOURCE_INSTANCE__SCHEMA_VERSION:
				setSchemaVersion(SCHEMA_VERSION_EDEFAULT);
				return;
			case TerraformPackage.RESOURCE_INSTANCE__ATTRIBUTES_JSON:
				setAttributesJson(ATTRIBUTES_JSON_EDEFAULT);
				return;
			case TerraformPackage.RESOURCE_INSTANCE__SENSITIVE_ATTRIBUTES:
				setSensitiveAttributes(SENSITIVE_ATTRIBUTES_EDEFAULT);
				return;
			case TerraformPackage.RESOURCE_INSTANCE__PRIVATE_JSON:
				setPrivateJson(PRIVATE_JSON_EDEFAULT);
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
			case TerraformPackage.RESOURCE_INSTANCE__INDEX_KEY:
				return INDEX_KEY_EDEFAULT == null ? getIndexKey() != null : !INDEX_KEY_EDEFAULT.equals(getIndexKey());
			case TerraformPackage.RESOURCE_INSTANCE__SCHEMA_VERSION:
				return getSchemaVersion() != SCHEMA_VERSION_EDEFAULT;
			case TerraformPackage.RESOURCE_INSTANCE__ATTRIBUTES_JSON:
				return ATTRIBUTES_JSON_EDEFAULT == null ? getAttributesJson() != null : !ATTRIBUTES_JSON_EDEFAULT.equals(getAttributesJson());
			case TerraformPackage.RESOURCE_INSTANCE__SENSITIVE_ATTRIBUTES:
				return SENSITIVE_ATTRIBUTES_EDEFAULT == null ? getSensitiveAttributes() != null : !SENSITIVE_ATTRIBUTES_EDEFAULT.equals(getSensitiveAttributes());
			case TerraformPackage.RESOURCE_INSTANCE__PRIVATE_JSON:
				return PRIVATE_JSON_EDEFAULT == null ? getPrivateJson() != null : !PRIVATE_JSON_EDEFAULT.equals(getPrivateJson());
		}
		return super.eIsSet(featureID);
	}

} //ResourceInstanceImpl
