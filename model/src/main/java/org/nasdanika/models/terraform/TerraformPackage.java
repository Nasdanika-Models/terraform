/**
 */
package org.nasdanika.models.terraform;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Ecore model for Terraform concepts based on the Terraform glossary (https://developer.hashicorp.com/terraform/docs/glossary).
 * 
 * The model can be used to:
 * - Generate documentation about Terraform configurations
 * - Generate Terraform configuration artifacts (.tf files) from model instances
 * - Load and represent information from existing Terraform artifacts (configuration files, state files)
 * <!-- end-model-doc -->
 * @see org.nasdanika.models.terraform.TerraformFactory
 * @model kind="package"
 * @generated
 */
public interface TerraformPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "terraform";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ecore://nasdanika.org/models/terraform";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.models.terraform";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TerraformPackage eINSTANCE = org.nasdanika.models.terraform.impl.TerraformPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.models.terraform.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.terraform.impl.NamedElementImpl
	 * @see org.nasdanika.models.terraform.impl.TerraformPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.terraform.impl.DocumentedNamedElementImpl <em>Documented Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.terraform.impl.DocumentedNamedElementImpl
	 * @see org.nasdanika.models.terraform.impl.TerraformPackageImpl#getDocumentedNamedElement()
	 * @generated
	 */
	int DOCUMENTED_NAMED_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTED_NAMED_ELEMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTED_NAMED_ELEMENT__DESCRIPTION = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Documented Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTED_NAMED_ELEMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Documented Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTED_NAMED_ELEMENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.terraform.impl.ArgumentImpl <em>Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.terraform.impl.ArgumentImpl
	 * @see org.nasdanika.models.terraform.impl.TerraformPackageImpl#getArgument()
	 * @generated
	 */
	int ARGUMENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.terraform.impl.ValidationImpl <em>Validation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.terraform.impl.ValidationImpl
	 * @see org.nasdanika.models.terraform.impl.TerraformPackageImpl#getValidation()
	 * @generated
	 */
	int VALIDATION = 3;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION__CONDITION = 0;

	/**
	 * The feature id for the '<em><b>Error Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION__ERROR_MESSAGE = 1;

	/**
	 * The number of structural features of the '<em>Validation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Validation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.terraform.impl.PreconditionImpl <em>Precondition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.terraform.impl.PreconditionImpl
	 * @see org.nasdanika.models.terraform.impl.TerraformPackageImpl#getPrecondition()
	 * @generated
	 */
	int PRECONDITION = 4;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECONDITION__CONDITION = 0;

	/**
	 * The feature id for the '<em><b>Error Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECONDITION__ERROR_MESSAGE = 1;

	/**
	 * The number of structural features of the '<em>Precondition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECONDITION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Precondition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.terraform.impl.PostconditionImpl <em>Postcondition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.terraform.impl.PostconditionImpl
	 * @see org.nasdanika.models.terraform.impl.TerraformPackageImpl#getPostcondition()
	 * @generated
	 */
	int POSTCONDITION = 5;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTCONDITION__CONDITION = 0;

	/**
	 * The feature id for the '<em><b>Error Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTCONDITION__ERROR_MESSAGE = 1;

	/**
	 * The number of structural features of the '<em>Postcondition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTCONDITION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Postcondition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTCONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.terraform.impl.LifecycleImpl <em>Lifecycle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.terraform.impl.LifecycleImpl
	 * @see org.nasdanika.models.terraform.impl.TerraformPackageImpl#getLifecycle()
	 * @generated
	 */
	int LIFECYCLE = 6;

	/**
	 * The feature id for the '<em><b>Create Before Destroy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFECYCLE__CREATE_BEFORE_DESTROY = 0;

	/**
	 * The feature id for the '<em><b>Prevent Destroy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFECYCLE__PREVENT_DESTROY = 1;

	/**
	 * The feature id for the '<em><b>Ignore Changes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFECYCLE__IGNORE_CHANGES = 2;

	/**
	 * The feature id for the '<em><b>Replace Triggered By</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFECYCLE__REPLACE_TRIGGERED_BY = 3;

	/**
	 * The number of structural features of the '<em>Lifecycle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFECYCLE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Lifecycle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFECYCLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.terraform.impl.ProvisionerImpl <em>Provisioner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.terraform.impl.ProvisionerImpl
	 * @see org.nasdanika.models.terraform.impl.TerraformPackageImpl#getProvisioner()
	 * @generated
	 */
	int PROVISIONER = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVISIONER__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVISIONER__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVISIONER__ARGUMENTS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Provisioner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVISIONER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Provisioner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVISIONER_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.terraform.impl.ProviderRequirementImpl <em>Provider Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.terraform.impl.ProviderRequirementImpl
	 * @see org.nasdanika.models.terraform.impl.TerraformPackageImpl#getProviderRequirement()
	 * @generated
	 */
	int PROVIDER_REQUIREMENT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER_REQUIREMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER_REQUIREMENT__SOURCE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER_REQUIREMENT__VERSION = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Configuration Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER_REQUIREMENT__CONFIGURATION_ALIAS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Provider Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER_REQUIREMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Provider Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER_REQUIREMENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.terraform.impl.ProviderImpl <em>Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.terraform.impl.ProviderImpl
	 * @see org.nasdanika.models.terraform.impl.TerraformPackageImpl#getProvider()
	 * @generated
	 */
	int PROVIDER = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER__NAME = DOCUMENTED_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER__DESCRIPTION = DOCUMENTED_NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER__ALIAS = DOCUMENTED_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER__ARGUMENTS = DOCUMENTED_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER_FEATURE_COUNT = DOCUMENTED_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER_OPERATION_COUNT = DOCUMENTED_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.terraform.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.terraform.impl.VariableImpl
	 * @see org.nasdanika.models.terraform.impl.TerraformPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = DOCUMENTED_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__DESCRIPTION = DOCUMENTED_NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__TYPE = DOCUMENTED_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__DEFAULT = DOCUMENTED_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sensitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__SENSITIVE = DOCUMENTED_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NULLABLE = DOCUMENTED_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Validations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__VALIDATIONS = DOCUMENTED_NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = DOCUMENTED_NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = DOCUMENTED_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.terraform.impl.OutputImpl <em>Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.terraform.impl.OutputImpl
	 * @see org.nasdanika.models.terraform.impl.TerraformPackageImpl#getOutput()
	 * @generated
	 */
	int OUTPUT = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__NAME = DOCUMENTED_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__DESCRIPTION = DOCUMENTED_NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__VALUE = DOCUMENTED_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sensitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__SENSITIVE = DOCUMENTED_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__DEPENDS_ON = DOCUMENTED_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Preconditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__PRECONDITIONS = DOCUMENTED_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_FEATURE_COUNT = DOCUMENTED_NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_OPERATION_COUNT = DOCUMENTED_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.terraform.impl.LocalImpl <em>Local</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.terraform.impl.LocalImpl
	 * @see org.nasdanika.models.terraform.impl.TerraformPackageImpl#getLocal()
	 * @generated
	 */
	int LOCAL = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL__VALUE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Local</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Local</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.terraform.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.terraform.impl.ResourceImpl
	 * @see org.nasdanika.models.terraform.impl.TerraformPackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__NAME = DOCUMENTED_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__DESCRIPTION = DOCUMENTED_NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__TYPE = DOCUMENTED_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__PROVIDER = DOCUMENTED_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__COUNT = DOCUMENTED_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>For Each</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__FOR_EACH = DOCUMENTED_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__DEPENDS_ON = DOCUMENTED_NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__ARGUMENTS = DOCUMENTED_NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Provisioners</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__PROVISIONERS = DOCUMENTED_NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Lifecycle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__LIFECYCLE = DOCUMENTED_NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Preconditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__PRECONDITIONS = DOCUMENTED_NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Postconditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__POSTCONDITIONS = DOCUMENTED_NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = DOCUMENTED_NAMED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION_COUNT = DOCUMENTED_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.terraform.impl.DataSourceImpl <em>Data Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.terraform.impl.DataSourceImpl
	 * @see org.nasdanika.models.terraform.impl.TerraformPackageImpl#getDataSource()
	 * @generated
	 */
	int DATA_SOURCE = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__NAME = DOCUMENTED_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__DESCRIPTION = DOCUMENTED_NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__TYPE = DOCUMENTED_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__PROVIDER = DOCUMENTED_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__COUNT = DOCUMENTED_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>For Each</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__FOR_EACH = DOCUMENTED_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__DEPENDS_ON = DOCUMENTED_NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__ARGUMENTS = DOCUMENTED_NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Lifecycle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__LIFECYCLE = DOCUMENTED_NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Preconditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__PRECONDITIONS = DOCUMENTED_NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Postconditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__POSTCONDITIONS = DOCUMENTED_NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Data Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_FEATURE_COUNT = DOCUMENTED_NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Data Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_OPERATION_COUNT = DOCUMENTED_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.terraform.impl.BackendImpl <em>Backend</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.terraform.impl.BackendImpl
	 * @see org.nasdanika.models.terraform.impl.TerraformPackageImpl#getBackend()
	 * @generated
	 */
	int BACKEND = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKEND__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKEND__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKEND__ARGUMENTS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Backend</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKEND_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Backend</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKEND_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.terraform.impl.ModuleCallImpl <em>Module Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.terraform.impl.ModuleCallImpl
	 * @see org.nasdanika.models.terraform.impl.TerraformPackageImpl#getModuleCall()
	 * @generated
	 */
	int MODULE_CALL = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_CALL__NAME = DOCUMENTED_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_CALL__DESCRIPTION = DOCUMENTED_NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_CALL__SOURCE = DOCUMENTED_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_CALL__VERSION = DOCUMENTED_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_CALL__COUNT = DOCUMENTED_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>For Each</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_CALL__FOR_EACH = DOCUMENTED_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_CALL__DEPENDS_ON = DOCUMENTED_NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_CALL__ARGUMENTS = DOCUMENTED_NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Providers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_CALL__PROVIDERS = DOCUMENTED_NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Module Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_CALL_FEATURE_COUNT = DOCUMENTED_NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Module Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_CALL_OPERATION_COUNT = DOCUMENTED_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.terraform.impl.ModuleImpl <em>Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.terraform.impl.ModuleImpl
	 * @see org.nasdanika.models.terraform.impl.TerraformPackageImpl#getModule()
	 * @generated
	 */
	int MODULE = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__NAME = DOCUMENTED_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__DESCRIPTION = DOCUMENTED_NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__RESOURCES = DOCUMENTED_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Sources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__DATA_SOURCES = DOCUMENTED_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__VARIABLES = DOCUMENTED_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__OUTPUTS = DOCUMENTED_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Locals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__LOCALS = DOCUMENTED_NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Module Calls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__MODULE_CALLS = DOCUMENTED_NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Required Providers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__REQUIRED_PROVIDERS = DOCUMENTED_NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Required Terraform Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__REQUIRED_TERRAFORM_VERSION = DOCUMENTED_NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_FEATURE_COUNT = DOCUMENTED_NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_OPERATION_COUNT = DOCUMENTED_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.terraform.impl.ConfigurationImpl <em>Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.terraform.impl.ConfigurationImpl
	 * @see org.nasdanika.models.terraform.impl.TerraformPackageImpl#getConfiguration()
	 * @generated
	 */
	int CONFIGURATION = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__NAME = MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__DESCRIPTION = MODULE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__RESOURCES = MODULE__RESOURCES;

	/**
	 * The feature id for the '<em><b>Data Sources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__DATA_SOURCES = MODULE__DATA_SOURCES;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__VARIABLES = MODULE__VARIABLES;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__OUTPUTS = MODULE__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Locals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__LOCALS = MODULE__LOCALS;

	/**
	 * The feature id for the '<em><b>Module Calls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__MODULE_CALLS = MODULE__MODULE_CALLS;

	/**
	 * The feature id for the '<em><b>Required Providers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__REQUIRED_PROVIDERS = MODULE__REQUIRED_PROVIDERS;

	/**
	 * The feature id for the '<em><b>Required Terraform Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__REQUIRED_TERRAFORM_VERSION = MODULE__REQUIRED_TERRAFORM_VERSION;

	/**
	 * The feature id for the '<em><b>Providers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__PROVIDERS = MODULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Backend</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__BACKEND = MODULE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_FEATURE_COUNT = MODULE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_OPERATION_COUNT = MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.terraform.impl.WorkspaceImpl <em>Workspace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.terraform.impl.WorkspaceImpl
	 * @see org.nasdanika.models.terraform.impl.TerraformPackageImpl#getWorkspace()
	 * @generated
	 */
	int WORKSPACE = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSPACE__NAME = DOCUMENTED_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSPACE__DESCRIPTION = DOCUMENTED_NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Workspace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSPACE_FEATURE_COUNT = DOCUMENTED_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Workspace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSPACE_OPERATION_COUNT = DOCUMENTED_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.terraform.impl.ResourceInstanceImpl <em>Resource Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.terraform.impl.ResourceInstanceImpl
	 * @see org.nasdanika.models.terraform.impl.TerraformPackageImpl#getResourceInstance()
	 * @generated
	 */
	int RESOURCE_INSTANCE = 20;

	/**
	 * The feature id for the '<em><b>Index Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE__INDEX_KEY = 0;

	/**
	 * The feature id for the '<em><b>Schema Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE__SCHEMA_VERSION = 1;

	/**
	 * The feature id for the '<em><b>Attributes Json</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE__ATTRIBUTES_JSON = 2;

	/**
	 * The feature id for the '<em><b>Sensitive Attributes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE__SENSITIVE_ATTRIBUTES = 3;

	/**
	 * The feature id for the '<em><b>Private Json</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE__PRIVATE_JSON = 4;

	/**
	 * The number of structural features of the '<em>Resource Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Resource Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.terraform.impl.StateResourceImpl <em>State Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.terraform.impl.StateResourceImpl
	 * @see org.nasdanika.models.terraform.impl.TerraformPackageImpl#getStateResource()
	 * @generated
	 */
	int STATE_RESOURCE = 21;

	/**
	 * The feature id for the '<em><b>Module</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_RESOURCE__MODULE = 0;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_RESOURCE__MODE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_RESOURCE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_RESOURCE__NAME = 3;

	/**
	 * The feature id for the '<em><b>Provider Config</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_RESOURCE__PROVIDER_CONFIG = 4;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_RESOURCE__INSTANCES = 5;

	/**
	 * The number of structural features of the '<em>State Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_RESOURCE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>State Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_RESOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.terraform.impl.StateOutputImpl <em>State Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.terraform.impl.StateOutputImpl
	 * @see org.nasdanika.models.terraform.impl.TerraformPackageImpl#getStateOutput()
	 * @generated
	 */
	int STATE_OUTPUT = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OUTPUT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OUTPUT__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OUTPUT__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Sensitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OUTPUT__SENSITIVE = 3;

	/**
	 * The number of structural features of the '<em>State Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OUTPUT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>State Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OUTPUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.terraform.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.terraform.impl.StateImpl
	 * @see org.nasdanika.models.terraform.impl.TerraformPackageImpl#getState()
	 * @generated
	 */
	int STATE = 23;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__VERSION = 0;

	/**
	 * The feature id for the '<em><b>Terraform Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__TERRAFORM_VERSION = 1;

	/**
	 * The feature id for the '<em><b>Serial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__SERIAL = 2;

	/**
	 * The feature id for the '<em><b>Lineage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__LINEAGE = 3;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__RESOURCES = 4;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__OUTPUTS = 5;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.terraform.ProvisionerType <em>Provisioner Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.terraform.ProvisionerType
	 * @see org.nasdanika.models.terraform.impl.TerraformPackageImpl#getProvisionerType()
	 * @generated
	 */
	int PROVISIONER_TYPE = 24;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.terraform.ResourceMode <em>Resource Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.terraform.ResourceMode
	 * @see org.nasdanika.models.terraform.impl.TerraformPackageImpl#getResourceMode()
	 * @generated
	 */
	int RESOURCE_MODE = 25;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.terraform.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see org.nasdanika.models.terraform.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.terraform.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.models.terraform.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.terraform.DocumentedNamedElement <em>Documented Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Documented Named Element</em>'.
	 * @see org.nasdanika.models.terraform.DocumentedNamedElement
	 * @generated
	 */
	EClass getDocumentedNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.terraform.DocumentedNamedElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.nasdanika.models.terraform.DocumentedNamedElement#getDescription()
	 * @see #getDocumentedNamedElement()
	 * @generated
	 */
	EAttribute getDocumentedNamedElement_Description();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.terraform.Argument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argument</em>'.
	 * @see org.nasdanika.models.terraform.Argument
	 * @generated
	 */
	EClass getArgument();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.terraform.Argument#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.models.terraform.Argument#getName()
	 * @see #getArgument()
	 * @generated
	 */
	EAttribute getArgument_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.terraform.Argument#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.nasdanika.models.terraform.Argument#getValue()
	 * @see #getArgument()
	 * @generated
	 */
	EAttribute getArgument_Value();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.terraform.Validation <em>Validation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Validation</em>'.
	 * @see org.nasdanika.models.terraform.Validation
	 * @generated
	 */
	EClass getValidation();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.terraform.Validation#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see org.nasdanika.models.terraform.Validation#getCondition()
	 * @see #getValidation()
	 * @generated
	 */
	EAttribute getValidation_Condition();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.terraform.Validation#getErrorMessage <em>Error Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Message</em>'.
	 * @see org.nasdanika.models.terraform.Validation#getErrorMessage()
	 * @see #getValidation()
	 * @generated
	 */
	EAttribute getValidation_ErrorMessage();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.terraform.Precondition <em>Precondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Precondition</em>'.
	 * @see org.nasdanika.models.terraform.Precondition
	 * @generated
	 */
	EClass getPrecondition();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.terraform.Precondition#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see org.nasdanika.models.terraform.Precondition#getCondition()
	 * @see #getPrecondition()
	 * @generated
	 */
	EAttribute getPrecondition_Condition();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.terraform.Precondition#getErrorMessage <em>Error Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Message</em>'.
	 * @see org.nasdanika.models.terraform.Precondition#getErrorMessage()
	 * @see #getPrecondition()
	 * @generated
	 */
	EAttribute getPrecondition_ErrorMessage();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.terraform.Postcondition <em>Postcondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postcondition</em>'.
	 * @see org.nasdanika.models.terraform.Postcondition
	 * @generated
	 */
	EClass getPostcondition();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.terraform.Postcondition#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see org.nasdanika.models.terraform.Postcondition#getCondition()
	 * @see #getPostcondition()
	 * @generated
	 */
	EAttribute getPostcondition_Condition();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.terraform.Postcondition#getErrorMessage <em>Error Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Message</em>'.
	 * @see org.nasdanika.models.terraform.Postcondition#getErrorMessage()
	 * @see #getPostcondition()
	 * @generated
	 */
	EAttribute getPostcondition_ErrorMessage();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.terraform.Lifecycle <em>Lifecycle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lifecycle</em>'.
	 * @see org.nasdanika.models.terraform.Lifecycle
	 * @generated
	 */
	EClass getLifecycle();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.terraform.Lifecycle#isCreateBeforeDestroy <em>Create Before Destroy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Create Before Destroy</em>'.
	 * @see org.nasdanika.models.terraform.Lifecycle#isCreateBeforeDestroy()
	 * @see #getLifecycle()
	 * @generated
	 */
	EAttribute getLifecycle_CreateBeforeDestroy();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.terraform.Lifecycle#isPreventDestroy <em>Prevent Destroy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prevent Destroy</em>'.
	 * @see org.nasdanika.models.terraform.Lifecycle#isPreventDestroy()
	 * @see #getLifecycle()
	 * @generated
	 */
	EAttribute getLifecycle_PreventDestroy();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.models.terraform.Lifecycle#getIgnoreChanges <em>Ignore Changes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Ignore Changes</em>'.
	 * @see org.nasdanika.models.terraform.Lifecycle#getIgnoreChanges()
	 * @see #getLifecycle()
	 * @generated
	 */
	EAttribute getLifecycle_IgnoreChanges();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.models.terraform.Lifecycle#getReplaceTriggeredBy <em>Replace Triggered By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Replace Triggered By</em>'.
	 * @see org.nasdanika.models.terraform.Lifecycle#getReplaceTriggeredBy()
	 * @see #getLifecycle()
	 * @generated
	 */
	EAttribute getLifecycle_ReplaceTriggeredBy();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.terraform.Provisioner <em>Provisioner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provisioner</em>'.
	 * @see org.nasdanika.models.terraform.Provisioner
	 * @generated
	 */
	EClass getProvisioner();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.terraform.Provisioner#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.nasdanika.models.terraform.Provisioner#getType()
	 * @see #getProvisioner()
	 * @generated
	 */
	EAttribute getProvisioner_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.terraform.Provisioner#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see org.nasdanika.models.terraform.Provisioner#getArguments()
	 * @see #getProvisioner()
	 * @generated
	 */
	EReference getProvisioner_Arguments();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.terraform.ProviderRequirement <em>Provider Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provider Requirement</em>'.
	 * @see org.nasdanika.models.terraform.ProviderRequirement
	 * @generated
	 */
	EClass getProviderRequirement();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.terraform.ProviderRequirement#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see org.nasdanika.models.terraform.ProviderRequirement#getSource()
	 * @see #getProviderRequirement()
	 * @generated
	 */
	EAttribute getProviderRequirement_Source();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.terraform.ProviderRequirement#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.nasdanika.models.terraform.ProviderRequirement#getVersion()
	 * @see #getProviderRequirement()
	 * @generated
	 */
	EAttribute getProviderRequirement_Version();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.terraform.ProviderRequirement#getConfigurationAlias <em>Configuration Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Configuration Alias</em>'.
	 * @see org.nasdanika.models.terraform.ProviderRequirement#getConfigurationAlias()
	 * @see #getProviderRequirement()
	 * @generated
	 */
	EAttribute getProviderRequirement_ConfigurationAlias();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.terraform.Provider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provider</em>'.
	 * @see org.nasdanika.models.terraform.Provider
	 * @generated
	 */
	EClass getProvider();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.terraform.Provider#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias</em>'.
	 * @see org.nasdanika.models.terraform.Provider#getAlias()
	 * @see #getProvider()
	 * @generated
	 */
	EAttribute getProvider_Alias();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.terraform.Provider#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see org.nasdanika.models.terraform.Provider#getArguments()
	 * @see #getProvider()
	 * @generated
	 */
	EReference getProvider_Arguments();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.terraform.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see org.nasdanika.models.terraform.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.terraform.Variable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.nasdanika.models.terraform.Variable#getType()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.terraform.Variable#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default</em>'.
	 * @see org.nasdanika.models.terraform.Variable#getDefault()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Default();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.terraform.Variable#isSensitive <em>Sensitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sensitive</em>'.
	 * @see org.nasdanika.models.terraform.Variable#isSensitive()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Sensitive();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.terraform.Variable#isNullable <em>Nullable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nullable</em>'.
	 * @see org.nasdanika.models.terraform.Variable#isNullable()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Nullable();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.terraform.Variable#getValidations <em>Validations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Validations</em>'.
	 * @see org.nasdanika.models.terraform.Variable#getValidations()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_Validations();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.terraform.Output <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output</em>'.
	 * @see org.nasdanika.models.terraform.Output
	 * @generated
	 */
	EClass getOutput();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.terraform.Output#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.nasdanika.models.terraform.Output#getValue()
	 * @see #getOutput()
	 * @generated
	 */
	EAttribute getOutput_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.terraform.Output#isSensitive <em>Sensitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sensitive</em>'.
	 * @see org.nasdanika.models.terraform.Output#isSensitive()
	 * @see #getOutput()
	 * @generated
	 */
	EAttribute getOutput_Sensitive();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.models.terraform.Output#getDependsOn <em>Depends On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Depends On</em>'.
	 * @see org.nasdanika.models.terraform.Output#getDependsOn()
	 * @see #getOutput()
	 * @generated
	 */
	EAttribute getOutput_DependsOn();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.terraform.Output#getPreconditions <em>Preconditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Preconditions</em>'.
	 * @see org.nasdanika.models.terraform.Output#getPreconditions()
	 * @see #getOutput()
	 * @generated
	 */
	EReference getOutput_Preconditions();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.terraform.Local <em>Local</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local</em>'.
	 * @see org.nasdanika.models.terraform.Local
	 * @generated
	 */
	EClass getLocal();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.terraform.Local#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.nasdanika.models.terraform.Local#getValue()
	 * @see #getLocal()
	 * @generated
	 */
	EAttribute getLocal_Value();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.terraform.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see org.nasdanika.models.terraform.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.terraform.Resource#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.nasdanika.models.terraform.Resource#getType()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.terraform.Resource#getProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provider</em>'.
	 * @see org.nasdanika.models.terraform.Resource#getProvider()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Provider();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.terraform.Resource#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count</em>'.
	 * @see org.nasdanika.models.terraform.Resource#getCount()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Count();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.terraform.Resource#getForEach <em>For Each</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>For Each</em>'.
	 * @see org.nasdanika.models.terraform.Resource#getForEach()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_ForEach();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.models.terraform.Resource#getDependsOn <em>Depends On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Depends On</em>'.
	 * @see org.nasdanika.models.terraform.Resource#getDependsOn()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_DependsOn();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.terraform.Resource#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see org.nasdanika.models.terraform.Resource#getArguments()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_Arguments();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.terraform.Resource#getProvisioners <em>Provisioners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Provisioners</em>'.
	 * @see org.nasdanika.models.terraform.Resource#getProvisioners()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_Provisioners();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.terraform.Resource#getLifecycle <em>Lifecycle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lifecycle</em>'.
	 * @see org.nasdanika.models.terraform.Resource#getLifecycle()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_Lifecycle();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.terraform.Resource#getPreconditions <em>Preconditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Preconditions</em>'.
	 * @see org.nasdanika.models.terraform.Resource#getPreconditions()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_Preconditions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.terraform.Resource#getPostconditions <em>Postconditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Postconditions</em>'.
	 * @see org.nasdanika.models.terraform.Resource#getPostconditions()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_Postconditions();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.terraform.DataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Source</em>'.
	 * @see org.nasdanika.models.terraform.DataSource
	 * @generated
	 */
	EClass getDataSource();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.terraform.DataSource#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.nasdanika.models.terraform.DataSource#getType()
	 * @see #getDataSource()
	 * @generated
	 */
	EAttribute getDataSource_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.terraform.DataSource#getProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provider</em>'.
	 * @see org.nasdanika.models.terraform.DataSource#getProvider()
	 * @see #getDataSource()
	 * @generated
	 */
	EAttribute getDataSource_Provider();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.terraform.DataSource#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count</em>'.
	 * @see org.nasdanika.models.terraform.DataSource#getCount()
	 * @see #getDataSource()
	 * @generated
	 */
	EAttribute getDataSource_Count();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.terraform.DataSource#getForEach <em>For Each</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>For Each</em>'.
	 * @see org.nasdanika.models.terraform.DataSource#getForEach()
	 * @see #getDataSource()
	 * @generated
	 */
	EAttribute getDataSource_ForEach();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.models.terraform.DataSource#getDependsOn <em>Depends On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Depends On</em>'.
	 * @see org.nasdanika.models.terraform.DataSource#getDependsOn()
	 * @see #getDataSource()
	 * @generated
	 */
	EAttribute getDataSource_DependsOn();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.terraform.DataSource#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see org.nasdanika.models.terraform.DataSource#getArguments()
	 * @see #getDataSource()
	 * @generated
	 */
	EReference getDataSource_Arguments();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.terraform.DataSource#getLifecycle <em>Lifecycle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lifecycle</em>'.
	 * @see org.nasdanika.models.terraform.DataSource#getLifecycle()
	 * @see #getDataSource()
	 * @generated
	 */
	EReference getDataSource_Lifecycle();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.terraform.DataSource#getPreconditions <em>Preconditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Preconditions</em>'.
	 * @see org.nasdanika.models.terraform.DataSource#getPreconditions()
	 * @see #getDataSource()
	 * @generated
	 */
	EReference getDataSource_Preconditions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.terraform.DataSource#getPostconditions <em>Postconditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Postconditions</em>'.
	 * @see org.nasdanika.models.terraform.DataSource#getPostconditions()
	 * @see #getDataSource()
	 * @generated
	 */
	EReference getDataSource_Postconditions();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.terraform.Backend <em>Backend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Backend</em>'.
	 * @see org.nasdanika.models.terraform.Backend
	 * @generated
	 */
	EClass getBackend();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.terraform.Backend#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.nasdanika.models.terraform.Backend#getType()
	 * @see #getBackend()
	 * @generated
	 */
	EAttribute getBackend_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.terraform.Backend#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see org.nasdanika.models.terraform.Backend#getArguments()
	 * @see #getBackend()
	 * @generated
	 */
	EReference getBackend_Arguments();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.terraform.ModuleCall <em>Module Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module Call</em>'.
	 * @see org.nasdanika.models.terraform.ModuleCall
	 * @generated
	 */
	EClass getModuleCall();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.terraform.ModuleCall#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see org.nasdanika.models.terraform.ModuleCall#getSource()
	 * @see #getModuleCall()
	 * @generated
	 */
	EAttribute getModuleCall_Source();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.terraform.ModuleCall#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.nasdanika.models.terraform.ModuleCall#getVersion()
	 * @see #getModuleCall()
	 * @generated
	 */
	EAttribute getModuleCall_Version();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.terraform.ModuleCall#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count</em>'.
	 * @see org.nasdanika.models.terraform.ModuleCall#getCount()
	 * @see #getModuleCall()
	 * @generated
	 */
	EAttribute getModuleCall_Count();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.terraform.ModuleCall#getForEach <em>For Each</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>For Each</em>'.
	 * @see org.nasdanika.models.terraform.ModuleCall#getForEach()
	 * @see #getModuleCall()
	 * @generated
	 */
	EAttribute getModuleCall_ForEach();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.models.terraform.ModuleCall#getDependsOn <em>Depends On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Depends On</em>'.
	 * @see org.nasdanika.models.terraform.ModuleCall#getDependsOn()
	 * @see #getModuleCall()
	 * @generated
	 */
	EAttribute getModuleCall_DependsOn();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.terraform.ModuleCall#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see org.nasdanika.models.terraform.ModuleCall#getArguments()
	 * @see #getModuleCall()
	 * @generated
	 */
	EReference getModuleCall_Arguments();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.terraform.ModuleCall#getProviders <em>Providers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Providers</em>'.
	 * @see org.nasdanika.models.terraform.ModuleCall#getProviders()
	 * @see #getModuleCall()
	 * @generated
	 */
	EReference getModuleCall_Providers();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.terraform.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module</em>'.
	 * @see org.nasdanika.models.terraform.Module
	 * @generated
	 */
	EClass getModule();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.terraform.Module#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources</em>'.
	 * @see org.nasdanika.models.terraform.Module#getResources()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_Resources();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.terraform.Module#getDataSources <em>Data Sources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Sources</em>'.
	 * @see org.nasdanika.models.terraform.Module#getDataSources()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_DataSources();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.terraform.Module#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see org.nasdanika.models.terraform.Module#getVariables()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_Variables();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.terraform.Module#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outputs</em>'.
	 * @see org.nasdanika.models.terraform.Module#getOutputs()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_Outputs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.terraform.Module#getLocals <em>Locals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Locals</em>'.
	 * @see org.nasdanika.models.terraform.Module#getLocals()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_Locals();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.terraform.Module#getModuleCalls <em>Module Calls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Module Calls</em>'.
	 * @see org.nasdanika.models.terraform.Module#getModuleCalls()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_ModuleCalls();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.terraform.Module#getRequiredProviders <em>Required Providers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Required Providers</em>'.
	 * @see org.nasdanika.models.terraform.Module#getRequiredProviders()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_RequiredProviders();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.terraform.Module#getRequiredTerraformVersion <em>Required Terraform Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required Terraform Version</em>'.
	 * @see org.nasdanika.models.terraform.Module#getRequiredTerraformVersion()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_RequiredTerraformVersion();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.terraform.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration</em>'.
	 * @see org.nasdanika.models.terraform.Configuration
	 * @generated
	 */
	EClass getConfiguration();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.terraform.Configuration#getProviders <em>Providers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Providers</em>'.
	 * @see org.nasdanika.models.terraform.Configuration#getProviders()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Providers();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.terraform.Configuration#getBackend <em>Backend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Backend</em>'.
	 * @see org.nasdanika.models.terraform.Configuration#getBackend()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Backend();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.terraform.Workspace <em>Workspace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workspace</em>'.
	 * @see org.nasdanika.models.terraform.Workspace
	 * @generated
	 */
	EClass getWorkspace();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.terraform.ResourceInstance <em>Resource Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Instance</em>'.
	 * @see org.nasdanika.models.terraform.ResourceInstance
	 * @generated
	 */
	EClass getResourceInstance();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.terraform.ResourceInstance#getIndexKey <em>Index Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index Key</em>'.
	 * @see org.nasdanika.models.terraform.ResourceInstance#getIndexKey()
	 * @see #getResourceInstance()
	 * @generated
	 */
	EAttribute getResourceInstance_IndexKey();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.terraform.ResourceInstance#getSchemaVersion <em>Schema Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema Version</em>'.
	 * @see org.nasdanika.models.terraform.ResourceInstance#getSchemaVersion()
	 * @see #getResourceInstance()
	 * @generated
	 */
	EAttribute getResourceInstance_SchemaVersion();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.terraform.ResourceInstance#getAttributesJson <em>Attributes Json</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attributes Json</em>'.
	 * @see org.nasdanika.models.terraform.ResourceInstance#getAttributesJson()
	 * @see #getResourceInstance()
	 * @generated
	 */
	EAttribute getResourceInstance_AttributesJson();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.terraform.ResourceInstance#getSensitiveAttributes <em>Sensitive Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sensitive Attributes</em>'.
	 * @see org.nasdanika.models.terraform.ResourceInstance#getSensitiveAttributes()
	 * @see #getResourceInstance()
	 * @generated
	 */
	EAttribute getResourceInstance_SensitiveAttributes();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.terraform.ResourceInstance#getPrivateJson <em>Private Json</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Private Json</em>'.
	 * @see org.nasdanika.models.terraform.ResourceInstance#getPrivateJson()
	 * @see #getResourceInstance()
	 * @generated
	 */
	EAttribute getResourceInstance_PrivateJson();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.terraform.StateResource <em>State Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Resource</em>'.
	 * @see org.nasdanika.models.terraform.StateResource
	 * @generated
	 */
	EClass getStateResource();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.terraform.StateResource#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Module</em>'.
	 * @see org.nasdanika.models.terraform.StateResource#getModule()
	 * @see #getStateResource()
	 * @generated
	 */
	EAttribute getStateResource_Module();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.terraform.StateResource#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see org.nasdanika.models.terraform.StateResource#getMode()
	 * @see #getStateResource()
	 * @generated
	 */
	EAttribute getStateResource_Mode();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.terraform.StateResource#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.nasdanika.models.terraform.StateResource#getType()
	 * @see #getStateResource()
	 * @generated
	 */
	EAttribute getStateResource_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.terraform.StateResource#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.models.terraform.StateResource#getName()
	 * @see #getStateResource()
	 * @generated
	 */
	EAttribute getStateResource_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.terraform.StateResource#getProviderConfig <em>Provider Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provider Config</em>'.
	 * @see org.nasdanika.models.terraform.StateResource#getProviderConfig()
	 * @see #getStateResource()
	 * @generated
	 */
	EAttribute getStateResource_ProviderConfig();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.terraform.StateResource#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instances</em>'.
	 * @see org.nasdanika.models.terraform.StateResource#getInstances()
	 * @see #getStateResource()
	 * @generated
	 */
	EReference getStateResource_Instances();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.terraform.StateOutput <em>State Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Output</em>'.
	 * @see org.nasdanika.models.terraform.StateOutput
	 * @generated
	 */
	EClass getStateOutput();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.terraform.StateOutput#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.models.terraform.StateOutput#getName()
	 * @see #getStateOutput()
	 * @generated
	 */
	EAttribute getStateOutput_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.terraform.StateOutput#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.nasdanika.models.terraform.StateOutput#getValue()
	 * @see #getStateOutput()
	 * @generated
	 */
	EAttribute getStateOutput_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.terraform.StateOutput#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.nasdanika.models.terraform.StateOutput#getType()
	 * @see #getStateOutput()
	 * @generated
	 */
	EAttribute getStateOutput_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.terraform.StateOutput#isSensitive <em>Sensitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sensitive</em>'.
	 * @see org.nasdanika.models.terraform.StateOutput#isSensitive()
	 * @see #getStateOutput()
	 * @generated
	 */
	EAttribute getStateOutput_Sensitive();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.terraform.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see org.nasdanika.models.terraform.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.terraform.State#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.nasdanika.models.terraform.State#getVersion()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Version();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.terraform.State#getTerraformVersion <em>Terraform Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Terraform Version</em>'.
	 * @see org.nasdanika.models.terraform.State#getTerraformVersion()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_TerraformVersion();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.terraform.State#getSerial <em>Serial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Serial</em>'.
	 * @see org.nasdanika.models.terraform.State#getSerial()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Serial();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.terraform.State#getLineage <em>Lineage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lineage</em>'.
	 * @see org.nasdanika.models.terraform.State#getLineage()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Lineage();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.terraform.State#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources</em>'.
	 * @see org.nasdanika.models.terraform.State#getResources()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Resources();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.terraform.State#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outputs</em>'.
	 * @see org.nasdanika.models.terraform.State#getOutputs()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Outputs();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.models.terraform.ProvisionerType <em>Provisioner Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Provisioner Type</em>'.
	 * @see org.nasdanika.models.terraform.ProvisionerType
	 * @generated
	 */
	EEnum getProvisionerType();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.models.terraform.ResourceMode <em>Resource Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Resource Mode</em>'.
	 * @see org.nasdanika.models.terraform.ResourceMode
	 * @generated
	 */
	EEnum getResourceMode();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TerraformFactory getTerraformFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.terraform.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.terraform.impl.NamedElementImpl
		 * @see org.nasdanika.models.terraform.impl.TerraformPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.terraform.impl.DocumentedNamedElementImpl <em>Documented Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.terraform.impl.DocumentedNamedElementImpl
		 * @see org.nasdanika.models.terraform.impl.TerraformPackageImpl#getDocumentedNamedElement()
		 * @generated
		 */
		EClass DOCUMENTED_NAMED_ELEMENT = eINSTANCE.getDocumentedNamedElement();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENTED_NAMED_ELEMENT__DESCRIPTION = eINSTANCE.getDocumentedNamedElement_Description();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.terraform.impl.ArgumentImpl <em>Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.terraform.impl.ArgumentImpl
		 * @see org.nasdanika.models.terraform.impl.TerraformPackageImpl#getArgument()
		 * @generated
		 */
		EClass ARGUMENT = eINSTANCE.getArgument();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARGUMENT__NAME = eINSTANCE.getArgument_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARGUMENT__VALUE = eINSTANCE.getArgument_Value();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.terraform.impl.ValidationImpl <em>Validation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.terraform.impl.ValidationImpl
		 * @see org.nasdanika.models.terraform.impl.TerraformPackageImpl#getValidation()
		 * @generated
		 */
		EClass VALIDATION = eINSTANCE.getValidation();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALIDATION__CONDITION = eINSTANCE.getValidation_Condition();

		/**
		 * The meta object literal for the '<em><b>Error Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALIDATION__ERROR_MESSAGE = eINSTANCE.getValidation_ErrorMessage();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.terraform.impl.PreconditionImpl <em>Precondition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.terraform.impl.PreconditionImpl
		 * @see org.nasdanika.models.terraform.impl.TerraformPackageImpl#getPrecondition()
		 * @generated
		 */
		EClass PRECONDITION = eINSTANCE.getPrecondition();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRECONDITION__CONDITION = eINSTANCE.getPrecondition_Condition();

		/**
		 * The meta object literal for the '<em><b>Error Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRECONDITION__ERROR_MESSAGE = eINSTANCE.getPrecondition_ErrorMessage();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.terraform.impl.PostconditionImpl <em>Postcondition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.terraform.impl.PostconditionImpl
		 * @see org.nasdanika.models.terraform.impl.TerraformPackageImpl#getPostcondition()
		 * @generated
		 */
		EClass POSTCONDITION = eINSTANCE.getPostcondition();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSTCONDITION__CONDITION = eINSTANCE.getPostcondition_Condition();

		/**
		 * The meta object literal for the '<em><b>Error Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSTCONDITION__ERROR_MESSAGE = eINSTANCE.getPostcondition_ErrorMessage();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.terraform.impl.LifecycleImpl <em>Lifecycle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.terraform.impl.LifecycleImpl
		 * @see org.nasdanika.models.terraform.impl.TerraformPackageImpl#getLifecycle()
		 * @generated
		 */
		EClass LIFECYCLE = eINSTANCE.getLifecycle();

		/**
		 * The meta object literal for the '<em><b>Create Before Destroy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIFECYCLE__CREATE_BEFORE_DESTROY = eINSTANCE.getLifecycle_CreateBeforeDestroy();

		/**
		 * The meta object literal for the '<em><b>Prevent Destroy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIFECYCLE__PREVENT_DESTROY = eINSTANCE.getLifecycle_PreventDestroy();

		/**
		 * The meta object literal for the '<em><b>Ignore Changes</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIFECYCLE__IGNORE_CHANGES = eINSTANCE.getLifecycle_IgnoreChanges();

		/**
		 * The meta object literal for the '<em><b>Replace Triggered By</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIFECYCLE__REPLACE_TRIGGERED_BY = eINSTANCE.getLifecycle_ReplaceTriggeredBy();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.terraform.impl.ProvisionerImpl <em>Provisioner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.terraform.impl.ProvisionerImpl
		 * @see org.nasdanika.models.terraform.impl.TerraformPackageImpl#getProvisioner()
		 * @generated
		 */
		EClass PROVISIONER = eINSTANCE.getProvisioner();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROVISIONER__TYPE = eINSTANCE.getProvisioner_Type();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVISIONER__ARGUMENTS = eINSTANCE.getProvisioner_Arguments();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.terraform.impl.ProviderRequirementImpl <em>Provider Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.terraform.impl.ProviderRequirementImpl
		 * @see org.nasdanika.models.terraform.impl.TerraformPackageImpl#getProviderRequirement()
		 * @generated
		 */
		EClass PROVIDER_REQUIREMENT = eINSTANCE.getProviderRequirement();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROVIDER_REQUIREMENT__SOURCE = eINSTANCE.getProviderRequirement_Source();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROVIDER_REQUIREMENT__VERSION = eINSTANCE.getProviderRequirement_Version();

		/**
		 * The meta object literal for the '<em><b>Configuration Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROVIDER_REQUIREMENT__CONFIGURATION_ALIAS = eINSTANCE.getProviderRequirement_ConfigurationAlias();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.terraform.impl.ProviderImpl <em>Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.terraform.impl.ProviderImpl
		 * @see org.nasdanika.models.terraform.impl.TerraformPackageImpl#getProvider()
		 * @generated
		 */
		EClass PROVIDER = eINSTANCE.getProvider();

		/**
		 * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROVIDER__ALIAS = eINSTANCE.getProvider_Alias();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVIDER__ARGUMENTS = eINSTANCE.getProvider_Arguments();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.terraform.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.terraform.impl.VariableImpl
		 * @see org.nasdanika.models.terraform.impl.TerraformPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__TYPE = eINSTANCE.getVariable_Type();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__DEFAULT = eINSTANCE.getVariable_Default();

		/**
		 * The meta object literal for the '<em><b>Sensitive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__SENSITIVE = eINSTANCE.getVariable_Sensitive();

		/**
		 * The meta object literal for the '<em><b>Nullable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__NULLABLE = eINSTANCE.getVariable_Nullable();

		/**
		 * The meta object literal for the '<em><b>Validations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__VALIDATIONS = eINSTANCE.getVariable_Validations();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.terraform.impl.OutputImpl <em>Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.terraform.impl.OutputImpl
		 * @see org.nasdanika.models.terraform.impl.TerraformPackageImpl#getOutput()
		 * @generated
		 */
		EClass OUTPUT = eINSTANCE.getOutput();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT__VALUE = eINSTANCE.getOutput_Value();

		/**
		 * The meta object literal for the '<em><b>Sensitive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT__SENSITIVE = eINSTANCE.getOutput_Sensitive();

		/**
		 * The meta object literal for the '<em><b>Depends On</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT__DEPENDS_ON = eINSTANCE.getOutput_DependsOn();

		/**
		 * The meta object literal for the '<em><b>Preconditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT__PRECONDITIONS = eINSTANCE.getOutput_Preconditions();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.terraform.impl.LocalImpl <em>Local</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.terraform.impl.LocalImpl
		 * @see org.nasdanika.models.terraform.impl.TerraformPackageImpl#getLocal()
		 * @generated
		 */
		EClass LOCAL = eINSTANCE.getLocal();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL__VALUE = eINSTANCE.getLocal_Value();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.terraform.impl.ResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.terraform.impl.ResourceImpl
		 * @see org.nasdanika.models.terraform.impl.TerraformPackageImpl#getResource()
		 * @generated
		 */
		EClass RESOURCE = eINSTANCE.getResource();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__TYPE = eINSTANCE.getResource_Type();

		/**
		 * The meta object literal for the '<em><b>Provider</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__PROVIDER = eINSTANCE.getResource_Provider();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__COUNT = eINSTANCE.getResource_Count();

		/**
		 * The meta object literal for the '<em><b>For Each</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__FOR_EACH = eINSTANCE.getResource_ForEach();

		/**
		 * The meta object literal for the '<em><b>Depends On</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__DEPENDS_ON = eINSTANCE.getResource_DependsOn();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__ARGUMENTS = eINSTANCE.getResource_Arguments();

		/**
		 * The meta object literal for the '<em><b>Provisioners</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__PROVISIONERS = eINSTANCE.getResource_Provisioners();

		/**
		 * The meta object literal for the '<em><b>Lifecycle</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__LIFECYCLE = eINSTANCE.getResource_Lifecycle();

		/**
		 * The meta object literal for the '<em><b>Preconditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__PRECONDITIONS = eINSTANCE.getResource_Preconditions();

		/**
		 * The meta object literal for the '<em><b>Postconditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__POSTCONDITIONS = eINSTANCE.getResource_Postconditions();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.terraform.impl.DataSourceImpl <em>Data Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.terraform.impl.DataSourceImpl
		 * @see org.nasdanika.models.terraform.impl.TerraformPackageImpl#getDataSource()
		 * @generated
		 */
		EClass DATA_SOURCE = eINSTANCE.getDataSource();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SOURCE__TYPE = eINSTANCE.getDataSource_Type();

		/**
		 * The meta object literal for the '<em><b>Provider</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SOURCE__PROVIDER = eINSTANCE.getDataSource_Provider();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SOURCE__COUNT = eINSTANCE.getDataSource_Count();

		/**
		 * The meta object literal for the '<em><b>For Each</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SOURCE__FOR_EACH = eINSTANCE.getDataSource_ForEach();

		/**
		 * The meta object literal for the '<em><b>Depends On</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SOURCE__DEPENDS_ON = eINSTANCE.getDataSource_DependsOn();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SOURCE__ARGUMENTS = eINSTANCE.getDataSource_Arguments();

		/**
		 * The meta object literal for the '<em><b>Lifecycle</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SOURCE__LIFECYCLE = eINSTANCE.getDataSource_Lifecycle();

		/**
		 * The meta object literal for the '<em><b>Preconditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SOURCE__PRECONDITIONS = eINSTANCE.getDataSource_Preconditions();

		/**
		 * The meta object literal for the '<em><b>Postconditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SOURCE__POSTCONDITIONS = eINSTANCE.getDataSource_Postconditions();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.terraform.impl.BackendImpl <em>Backend</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.terraform.impl.BackendImpl
		 * @see org.nasdanika.models.terraform.impl.TerraformPackageImpl#getBackend()
		 * @generated
		 */
		EClass BACKEND = eINSTANCE.getBackend();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BACKEND__TYPE = eINSTANCE.getBackend_Type();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BACKEND__ARGUMENTS = eINSTANCE.getBackend_Arguments();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.terraform.impl.ModuleCallImpl <em>Module Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.terraform.impl.ModuleCallImpl
		 * @see org.nasdanika.models.terraform.impl.TerraformPackageImpl#getModuleCall()
		 * @generated
		 */
		EClass MODULE_CALL = eINSTANCE.getModuleCall();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE_CALL__SOURCE = eINSTANCE.getModuleCall_Source();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE_CALL__VERSION = eINSTANCE.getModuleCall_Version();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE_CALL__COUNT = eINSTANCE.getModuleCall_Count();

		/**
		 * The meta object literal for the '<em><b>For Each</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE_CALL__FOR_EACH = eINSTANCE.getModuleCall_ForEach();

		/**
		 * The meta object literal for the '<em><b>Depends On</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE_CALL__DEPENDS_ON = eINSTANCE.getModuleCall_DependsOn();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_CALL__ARGUMENTS = eINSTANCE.getModuleCall_Arguments();

		/**
		 * The meta object literal for the '<em><b>Providers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_CALL__PROVIDERS = eINSTANCE.getModuleCall_Providers();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.terraform.impl.ModuleImpl <em>Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.terraform.impl.ModuleImpl
		 * @see org.nasdanika.models.terraform.impl.TerraformPackageImpl#getModule()
		 * @generated
		 */
		EClass MODULE = eINSTANCE.getModule();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__RESOURCES = eINSTANCE.getModule_Resources();

		/**
		 * The meta object literal for the '<em><b>Data Sources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__DATA_SOURCES = eINSTANCE.getModule_DataSources();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__VARIABLES = eINSTANCE.getModule_Variables();

		/**
		 * The meta object literal for the '<em><b>Outputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__OUTPUTS = eINSTANCE.getModule_Outputs();

		/**
		 * The meta object literal for the '<em><b>Locals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__LOCALS = eINSTANCE.getModule_Locals();

		/**
		 * The meta object literal for the '<em><b>Module Calls</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__MODULE_CALLS = eINSTANCE.getModule_ModuleCalls();

		/**
		 * The meta object literal for the '<em><b>Required Providers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__REQUIRED_PROVIDERS = eINSTANCE.getModule_RequiredProviders();

		/**
		 * The meta object literal for the '<em><b>Required Terraform Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__REQUIRED_TERRAFORM_VERSION = eINSTANCE.getModule_RequiredTerraformVersion();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.terraform.impl.ConfigurationImpl <em>Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.terraform.impl.ConfigurationImpl
		 * @see org.nasdanika.models.terraform.impl.TerraformPackageImpl#getConfiguration()
		 * @generated
		 */
		EClass CONFIGURATION = eINSTANCE.getConfiguration();

		/**
		 * The meta object literal for the '<em><b>Providers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__PROVIDERS = eINSTANCE.getConfiguration_Providers();

		/**
		 * The meta object literal for the '<em><b>Backend</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__BACKEND = eINSTANCE.getConfiguration_Backend();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.terraform.impl.WorkspaceImpl <em>Workspace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.terraform.impl.WorkspaceImpl
		 * @see org.nasdanika.models.terraform.impl.TerraformPackageImpl#getWorkspace()
		 * @generated
		 */
		EClass WORKSPACE = eINSTANCE.getWorkspace();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.terraform.impl.ResourceInstanceImpl <em>Resource Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.terraform.impl.ResourceInstanceImpl
		 * @see org.nasdanika.models.terraform.impl.TerraformPackageImpl#getResourceInstance()
		 * @generated
		 */
		EClass RESOURCE_INSTANCE = eINSTANCE.getResourceInstance();

		/**
		 * The meta object literal for the '<em><b>Index Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_INSTANCE__INDEX_KEY = eINSTANCE.getResourceInstance_IndexKey();

		/**
		 * The meta object literal for the '<em><b>Schema Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_INSTANCE__SCHEMA_VERSION = eINSTANCE.getResourceInstance_SchemaVersion();

		/**
		 * The meta object literal for the '<em><b>Attributes Json</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_INSTANCE__ATTRIBUTES_JSON = eINSTANCE.getResourceInstance_AttributesJson();

		/**
		 * The meta object literal for the '<em><b>Sensitive Attributes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_INSTANCE__SENSITIVE_ATTRIBUTES = eINSTANCE.getResourceInstance_SensitiveAttributes();

		/**
		 * The meta object literal for the '<em><b>Private Json</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_INSTANCE__PRIVATE_JSON = eINSTANCE.getResourceInstance_PrivateJson();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.terraform.impl.StateResourceImpl <em>State Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.terraform.impl.StateResourceImpl
		 * @see org.nasdanika.models.terraform.impl.TerraformPackageImpl#getStateResource()
		 * @generated
		 */
		EClass STATE_RESOURCE = eINSTANCE.getStateResource();

		/**
		 * The meta object literal for the '<em><b>Module</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE_RESOURCE__MODULE = eINSTANCE.getStateResource_Module();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE_RESOURCE__MODE = eINSTANCE.getStateResource_Mode();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE_RESOURCE__TYPE = eINSTANCE.getStateResource_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE_RESOURCE__NAME = eINSTANCE.getStateResource_Name();

		/**
		 * The meta object literal for the '<em><b>Provider Config</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE_RESOURCE__PROVIDER_CONFIG = eINSTANCE.getStateResource_ProviderConfig();

		/**
		 * The meta object literal for the '<em><b>Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_RESOURCE__INSTANCES = eINSTANCE.getStateResource_Instances();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.terraform.impl.StateOutputImpl <em>State Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.terraform.impl.StateOutputImpl
		 * @see org.nasdanika.models.terraform.impl.TerraformPackageImpl#getStateOutput()
		 * @generated
		 */
		EClass STATE_OUTPUT = eINSTANCE.getStateOutput();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE_OUTPUT__NAME = eINSTANCE.getStateOutput_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE_OUTPUT__VALUE = eINSTANCE.getStateOutput_Value();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE_OUTPUT__TYPE = eINSTANCE.getStateOutput_Type();

		/**
		 * The meta object literal for the '<em><b>Sensitive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE_OUTPUT__SENSITIVE = eINSTANCE.getStateOutput_Sensitive();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.terraform.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.terraform.impl.StateImpl
		 * @see org.nasdanika.models.terraform.impl.TerraformPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__VERSION = eINSTANCE.getState_Version();

		/**
		 * The meta object literal for the '<em><b>Terraform Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__TERRAFORM_VERSION = eINSTANCE.getState_TerraformVersion();

		/**
		 * The meta object literal for the '<em><b>Serial</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__SERIAL = eINSTANCE.getState_Serial();

		/**
		 * The meta object literal for the '<em><b>Lineage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__LINEAGE = eINSTANCE.getState_Lineage();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__RESOURCES = eINSTANCE.getState_Resources();

		/**
		 * The meta object literal for the '<em><b>Outputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__OUTPUTS = eINSTANCE.getState_Outputs();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.terraform.ProvisionerType <em>Provisioner Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.terraform.ProvisionerType
		 * @see org.nasdanika.models.terraform.impl.TerraformPackageImpl#getProvisionerType()
		 * @generated
		 */
		EEnum PROVISIONER_TYPE = eINSTANCE.getProvisionerType();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.terraform.ResourceMode <em>Resource Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.terraform.ResourceMode
		 * @see org.nasdanika.models.terraform.impl.TerraformPackageImpl#getResourceMode()
		 * @generated
		 */
		EEnum RESOURCE_MODE = eINSTANCE.getResourceMode();

	}

} //TerraformPackage
