/**
 */
package org.nasdanika.models.terraform.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nasdanika.models.terraform.Argument;
import org.nasdanika.models.terraform.Backend;
import org.nasdanika.models.terraform.Configuration;
import org.nasdanika.models.terraform.DataSource;
import org.nasdanika.models.terraform.DocumentedNamedElement;
import org.nasdanika.models.terraform.Lifecycle;
import org.nasdanika.models.terraform.Local;
import org.nasdanika.models.terraform.ModuleCall;
import org.nasdanika.models.terraform.NamedElement;
import org.nasdanika.models.terraform.Output;
import org.nasdanika.models.terraform.Postcondition;
import org.nasdanika.models.terraform.Precondition;
import org.nasdanika.models.terraform.Provider;
import org.nasdanika.models.terraform.ProviderRequirement;
import org.nasdanika.models.terraform.Provisioner;
import org.nasdanika.models.terraform.ProvisionerType;
import org.nasdanika.models.terraform.Resource;
import org.nasdanika.models.terraform.ResourceInstance;
import org.nasdanika.models.terraform.ResourceMode;
import org.nasdanika.models.terraform.State;
import org.nasdanika.models.terraform.StateOutput;
import org.nasdanika.models.terraform.StateResource;
import org.nasdanika.models.terraform.TerraformFactory;
import org.nasdanika.models.terraform.TerraformPackage;
import org.nasdanika.models.terraform.Validation;
import org.nasdanika.models.terraform.Variable;
import org.nasdanika.models.terraform.Workspace;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TerraformPackageImpl extends EPackageImpl implements TerraformPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentedNamedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass argumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass validationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass preconditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postconditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lifecycleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass provisionerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass providerRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass providerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass backendEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workspaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateOutputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum provisionerTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum resourceModeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.nasdanika.models.terraform.TerraformPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TerraformPackageImpl() {
		super(eNS_URI, TerraformFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link TerraformPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TerraformPackage init() {
		if (isInited) return (TerraformPackage)EPackage.Registry.INSTANCE.getEPackage(TerraformPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTerraformPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TerraformPackageImpl theTerraformPackage = registeredTerraformPackage instanceof TerraformPackageImpl ? (TerraformPackageImpl)registeredTerraformPackage : new TerraformPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theTerraformPackage.createPackageContents();

		// Initialize created meta-data
		theTerraformPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTerraformPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TerraformPackage.eNS_URI, theTerraformPackage);
		return theTerraformPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDocumentedNamedElement() {
		return documentedNamedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentedNamedElement_Description() {
		return (EAttribute)documentedNamedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArgument() {
		return argumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArgument_Name() {
		return (EAttribute)argumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArgument_Value() {
		return (EAttribute)argumentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getValidation() {
		return validationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getValidation_Condition() {
		return (EAttribute)validationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getValidation_ErrorMessage() {
		return (EAttribute)validationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrecondition() {
		return preconditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPrecondition_Condition() {
		return (EAttribute)preconditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPrecondition_ErrorMessage() {
		return (EAttribute)preconditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPostcondition() {
		return postconditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPostcondition_Condition() {
		return (EAttribute)postconditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPostcondition_ErrorMessage() {
		return (EAttribute)postconditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLifecycle() {
		return lifecycleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLifecycle_CreateBeforeDestroy() {
		return (EAttribute)lifecycleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLifecycle_PreventDestroy() {
		return (EAttribute)lifecycleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLifecycle_IgnoreChanges() {
		return (EAttribute)lifecycleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLifecycle_ReplaceTriggeredBy() {
		return (EAttribute)lifecycleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProvisioner() {
		return provisionerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProvisioner_Type() {
		return (EAttribute)provisionerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProvisioner_Arguments() {
		return (EReference)provisionerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProviderRequirement() {
		return providerRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProviderRequirement_Source() {
		return (EAttribute)providerRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProviderRequirement_Version() {
		return (EAttribute)providerRequirementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProviderRequirement_ConfigurationAlias() {
		return (EAttribute)providerRequirementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProvider() {
		return providerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProvider_Alias() {
		return (EAttribute)providerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProvider_Arguments() {
		return (EReference)providerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVariable_Type() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVariable_Default() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVariable_Sensitive() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVariable_Nullable() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVariable_Validations() {
		return (EReference)variableEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOutput() {
		return outputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOutput_Value() {
		return (EAttribute)outputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOutput_Sensitive() {
		return (EAttribute)outputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOutput_DependsOn() {
		return (EAttribute)outputEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOutput_Preconditions() {
		return (EReference)outputEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLocal() {
		return localEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLocal_Value() {
		return (EAttribute)localEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResource() {
		return resourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResource_Type() {
		return (EAttribute)resourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResource_Provider() {
		return (EAttribute)resourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResource_Count() {
		return (EAttribute)resourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResource_ForEach() {
		return (EAttribute)resourceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResource_DependsOn() {
		return (EAttribute)resourceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResource_Arguments() {
		return (EReference)resourceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResource_Provisioners() {
		return (EReference)resourceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResource_Lifecycle() {
		return (EReference)resourceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResource_Preconditions() {
		return (EReference)resourceEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResource_Postconditions() {
		return (EReference)resourceEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataSource() {
		return dataSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataSource_Type() {
		return (EAttribute)dataSourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataSource_Provider() {
		return (EAttribute)dataSourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataSource_Count() {
		return (EAttribute)dataSourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataSource_ForEach() {
		return (EAttribute)dataSourceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataSource_DependsOn() {
		return (EAttribute)dataSourceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataSource_Arguments() {
		return (EReference)dataSourceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataSource_Lifecycle() {
		return (EReference)dataSourceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataSource_Preconditions() {
		return (EReference)dataSourceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataSource_Postconditions() {
		return (EReference)dataSourceEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBackend() {
		return backendEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBackend_Type() {
		return (EAttribute)backendEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBackend_Arguments() {
		return (EReference)backendEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModuleCall() {
		return moduleCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModuleCall_Source() {
		return (EAttribute)moduleCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModuleCall_Version() {
		return (EAttribute)moduleCallEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModuleCall_Count() {
		return (EAttribute)moduleCallEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModuleCall_ForEach() {
		return (EAttribute)moduleCallEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModuleCall_DependsOn() {
		return (EAttribute)moduleCallEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModuleCall_Arguments() {
		return (EReference)moduleCallEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModuleCall_Providers() {
		return (EReference)moduleCallEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModule() {
		return moduleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModule_Resources() {
		return (EReference)moduleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModule_DataSources() {
		return (EReference)moduleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModule_Variables() {
		return (EReference)moduleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModule_Outputs() {
		return (EReference)moduleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModule_Locals() {
		return (EReference)moduleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModule_ModuleCalls() {
		return (EReference)moduleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModule_RequiredProviders() {
		return (EReference)moduleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModule_RequiredTerraformVersion() {
		return (EAttribute)moduleEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConfiguration() {
		return configurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConfiguration_Providers() {
		return (EReference)configurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConfiguration_Backend() {
		return (EReference)configurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWorkspace() {
		return workspaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResourceInstance() {
		return resourceInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResourceInstance_IndexKey() {
		return (EAttribute)resourceInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResourceInstance_SchemaVersion() {
		return (EAttribute)resourceInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResourceInstance_AttributesJson() {
		return (EAttribute)resourceInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResourceInstance_SensitiveAttributes() {
		return (EAttribute)resourceInstanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResourceInstance_PrivateJson() {
		return (EAttribute)resourceInstanceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStateResource() {
		return stateResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStateResource_Module() {
		return (EAttribute)stateResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStateResource_Mode() {
		return (EAttribute)stateResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStateResource_Type() {
		return (EAttribute)stateResourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStateResource_Name() {
		return (EAttribute)stateResourceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStateResource_ProviderConfig() {
		return (EAttribute)stateResourceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStateResource_Instances() {
		return (EReference)stateResourceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStateOutput() {
		return stateOutputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStateOutput_Name() {
		return (EAttribute)stateOutputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStateOutput_Value() {
		return (EAttribute)stateOutputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStateOutput_Type() {
		return (EAttribute)stateOutputEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStateOutput_Sensitive() {
		return (EAttribute)stateOutputEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getState() {
		return stateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getState_Version() {
		return (EAttribute)stateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getState_TerraformVersion() {
		return (EAttribute)stateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getState_Serial() {
		return (EAttribute)stateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getState_Lineage() {
		return (EAttribute)stateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getState_Resources() {
		return (EReference)stateEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getState_Outputs() {
		return (EReference)stateEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getProvisionerType() {
		return provisionerTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getResourceMode() {
		return resourceModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerraformFactory getTerraformFactory() {
		return (TerraformFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		documentedNamedElementEClass = createEClass(DOCUMENTED_NAMED_ELEMENT);
		createEAttribute(documentedNamedElementEClass, DOCUMENTED_NAMED_ELEMENT__DESCRIPTION);

		argumentEClass = createEClass(ARGUMENT);
		createEAttribute(argumentEClass, ARGUMENT__NAME);
		createEAttribute(argumentEClass, ARGUMENT__VALUE);

		validationEClass = createEClass(VALIDATION);
		createEAttribute(validationEClass, VALIDATION__CONDITION);
		createEAttribute(validationEClass, VALIDATION__ERROR_MESSAGE);

		preconditionEClass = createEClass(PRECONDITION);
		createEAttribute(preconditionEClass, PRECONDITION__CONDITION);
		createEAttribute(preconditionEClass, PRECONDITION__ERROR_MESSAGE);

		postconditionEClass = createEClass(POSTCONDITION);
		createEAttribute(postconditionEClass, POSTCONDITION__CONDITION);
		createEAttribute(postconditionEClass, POSTCONDITION__ERROR_MESSAGE);

		lifecycleEClass = createEClass(LIFECYCLE);
		createEAttribute(lifecycleEClass, LIFECYCLE__CREATE_BEFORE_DESTROY);
		createEAttribute(lifecycleEClass, LIFECYCLE__PREVENT_DESTROY);
		createEAttribute(lifecycleEClass, LIFECYCLE__IGNORE_CHANGES);
		createEAttribute(lifecycleEClass, LIFECYCLE__REPLACE_TRIGGERED_BY);

		provisionerEClass = createEClass(PROVISIONER);
		createEAttribute(provisionerEClass, PROVISIONER__TYPE);
		createEReference(provisionerEClass, PROVISIONER__ARGUMENTS);

		providerRequirementEClass = createEClass(PROVIDER_REQUIREMENT);
		createEAttribute(providerRequirementEClass, PROVIDER_REQUIREMENT__SOURCE);
		createEAttribute(providerRequirementEClass, PROVIDER_REQUIREMENT__VERSION);
		createEAttribute(providerRequirementEClass, PROVIDER_REQUIREMENT__CONFIGURATION_ALIAS);

		providerEClass = createEClass(PROVIDER);
		createEAttribute(providerEClass, PROVIDER__ALIAS);
		createEReference(providerEClass, PROVIDER__ARGUMENTS);

		variableEClass = createEClass(VARIABLE);
		createEAttribute(variableEClass, VARIABLE__TYPE);
		createEAttribute(variableEClass, VARIABLE__DEFAULT);
		createEAttribute(variableEClass, VARIABLE__SENSITIVE);
		createEAttribute(variableEClass, VARIABLE__NULLABLE);
		createEReference(variableEClass, VARIABLE__VALIDATIONS);

		outputEClass = createEClass(OUTPUT);
		createEAttribute(outputEClass, OUTPUT__VALUE);
		createEAttribute(outputEClass, OUTPUT__SENSITIVE);
		createEAttribute(outputEClass, OUTPUT__DEPENDS_ON);
		createEReference(outputEClass, OUTPUT__PRECONDITIONS);

		localEClass = createEClass(LOCAL);
		createEAttribute(localEClass, LOCAL__VALUE);

		resourceEClass = createEClass(RESOURCE);
		createEAttribute(resourceEClass, RESOURCE__TYPE);
		createEAttribute(resourceEClass, RESOURCE__PROVIDER);
		createEAttribute(resourceEClass, RESOURCE__COUNT);
		createEAttribute(resourceEClass, RESOURCE__FOR_EACH);
		createEAttribute(resourceEClass, RESOURCE__DEPENDS_ON);
		createEReference(resourceEClass, RESOURCE__ARGUMENTS);
		createEReference(resourceEClass, RESOURCE__PROVISIONERS);
		createEReference(resourceEClass, RESOURCE__LIFECYCLE);
		createEReference(resourceEClass, RESOURCE__PRECONDITIONS);
		createEReference(resourceEClass, RESOURCE__POSTCONDITIONS);

		dataSourceEClass = createEClass(DATA_SOURCE);
		createEAttribute(dataSourceEClass, DATA_SOURCE__TYPE);
		createEAttribute(dataSourceEClass, DATA_SOURCE__PROVIDER);
		createEAttribute(dataSourceEClass, DATA_SOURCE__COUNT);
		createEAttribute(dataSourceEClass, DATA_SOURCE__FOR_EACH);
		createEAttribute(dataSourceEClass, DATA_SOURCE__DEPENDS_ON);
		createEReference(dataSourceEClass, DATA_SOURCE__ARGUMENTS);
		createEReference(dataSourceEClass, DATA_SOURCE__LIFECYCLE);
		createEReference(dataSourceEClass, DATA_SOURCE__PRECONDITIONS);
		createEReference(dataSourceEClass, DATA_SOURCE__POSTCONDITIONS);

		backendEClass = createEClass(BACKEND);
		createEAttribute(backendEClass, BACKEND__TYPE);
		createEReference(backendEClass, BACKEND__ARGUMENTS);

		moduleCallEClass = createEClass(MODULE_CALL);
		createEAttribute(moduleCallEClass, MODULE_CALL__SOURCE);
		createEAttribute(moduleCallEClass, MODULE_CALL__VERSION);
		createEAttribute(moduleCallEClass, MODULE_CALL__COUNT);
		createEAttribute(moduleCallEClass, MODULE_CALL__FOR_EACH);
		createEAttribute(moduleCallEClass, MODULE_CALL__DEPENDS_ON);
		createEReference(moduleCallEClass, MODULE_CALL__ARGUMENTS);
		createEReference(moduleCallEClass, MODULE_CALL__PROVIDERS);

		moduleEClass = createEClass(MODULE);
		createEReference(moduleEClass, MODULE__RESOURCES);
		createEReference(moduleEClass, MODULE__DATA_SOURCES);
		createEReference(moduleEClass, MODULE__VARIABLES);
		createEReference(moduleEClass, MODULE__OUTPUTS);
		createEReference(moduleEClass, MODULE__LOCALS);
		createEReference(moduleEClass, MODULE__MODULE_CALLS);
		createEReference(moduleEClass, MODULE__REQUIRED_PROVIDERS);
		createEAttribute(moduleEClass, MODULE__REQUIRED_TERRAFORM_VERSION);

		configurationEClass = createEClass(CONFIGURATION);
		createEReference(configurationEClass, CONFIGURATION__PROVIDERS);
		createEReference(configurationEClass, CONFIGURATION__BACKEND);

		workspaceEClass = createEClass(WORKSPACE);

		resourceInstanceEClass = createEClass(RESOURCE_INSTANCE);
		createEAttribute(resourceInstanceEClass, RESOURCE_INSTANCE__INDEX_KEY);
		createEAttribute(resourceInstanceEClass, RESOURCE_INSTANCE__SCHEMA_VERSION);
		createEAttribute(resourceInstanceEClass, RESOURCE_INSTANCE__ATTRIBUTES_JSON);
		createEAttribute(resourceInstanceEClass, RESOURCE_INSTANCE__SENSITIVE_ATTRIBUTES);
		createEAttribute(resourceInstanceEClass, RESOURCE_INSTANCE__PRIVATE_JSON);

		stateResourceEClass = createEClass(STATE_RESOURCE);
		createEAttribute(stateResourceEClass, STATE_RESOURCE__MODULE);
		createEAttribute(stateResourceEClass, STATE_RESOURCE__MODE);
		createEAttribute(stateResourceEClass, STATE_RESOURCE__TYPE);
		createEAttribute(stateResourceEClass, STATE_RESOURCE__NAME);
		createEAttribute(stateResourceEClass, STATE_RESOURCE__PROVIDER_CONFIG);
		createEReference(stateResourceEClass, STATE_RESOURCE__INSTANCES);

		stateOutputEClass = createEClass(STATE_OUTPUT);
		createEAttribute(stateOutputEClass, STATE_OUTPUT__NAME);
		createEAttribute(stateOutputEClass, STATE_OUTPUT__VALUE);
		createEAttribute(stateOutputEClass, STATE_OUTPUT__TYPE);
		createEAttribute(stateOutputEClass, STATE_OUTPUT__SENSITIVE);

		stateEClass = createEClass(STATE);
		createEAttribute(stateEClass, STATE__VERSION);
		createEAttribute(stateEClass, STATE__TERRAFORM_VERSION);
		createEAttribute(stateEClass, STATE__SERIAL);
		createEAttribute(stateEClass, STATE__LINEAGE);
		createEReference(stateEClass, STATE__RESOURCES);
		createEReference(stateEClass, STATE__OUTPUTS);

		// Create enums
		provisionerTypeEEnum = createEEnum(PROVISIONER_TYPE);
		resourceModeEEnum = createEEnum(RESOURCE_MODE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		documentedNamedElementEClass.getESuperTypes().add(this.getNamedElement());
		provisionerEClass.getESuperTypes().add(this.getNamedElement());
		providerRequirementEClass.getESuperTypes().add(this.getNamedElement());
		providerEClass.getESuperTypes().add(this.getDocumentedNamedElement());
		variableEClass.getESuperTypes().add(this.getDocumentedNamedElement());
		outputEClass.getESuperTypes().add(this.getDocumentedNamedElement());
		localEClass.getESuperTypes().add(this.getNamedElement());
		resourceEClass.getESuperTypes().add(this.getDocumentedNamedElement());
		dataSourceEClass.getESuperTypes().add(this.getDocumentedNamedElement());
		backendEClass.getESuperTypes().add(this.getNamedElement());
		moduleCallEClass.getESuperTypes().add(this.getDocumentedNamedElement());
		moduleEClass.getESuperTypes().add(this.getDocumentedNamedElement());
		configurationEClass.getESuperTypes().add(this.getModule());
		workspaceEClass.getESuperTypes().add(this.getDocumentedNamedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentedNamedElementEClass, DocumentedNamedElement.class, "DocumentedNamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentedNamedElement_Description(), ecorePackage.getEString(), "description", null, 0, 1, DocumentedNamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(argumentEClass, Argument.class, "Argument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArgument_Name(), ecorePackage.getEString(), "name", null, 1, 1, Argument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArgument_Value(), ecorePackage.getEString(), "value", null, 0, 1, Argument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(validationEClass, Validation.class, "Validation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValidation_Condition(), ecorePackage.getEString(), "condition", null, 1, 1, Validation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValidation_ErrorMessage(), ecorePackage.getEString(), "errorMessage", null, 1, 1, Validation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(preconditionEClass, Precondition.class, "Precondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrecondition_Condition(), ecorePackage.getEString(), "condition", null, 1, 1, Precondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrecondition_ErrorMessage(), ecorePackage.getEString(), "errorMessage", null, 1, 1, Precondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(postconditionEClass, Postcondition.class, "Postcondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPostcondition_Condition(), ecorePackage.getEString(), "condition", null, 1, 1, Postcondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPostcondition_ErrorMessage(), ecorePackage.getEString(), "errorMessage", null, 1, 1, Postcondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lifecycleEClass, Lifecycle.class, "Lifecycle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLifecycle_CreateBeforeDestroy(), ecorePackage.getEBoolean(), "createBeforeDestroy", null, 0, 1, Lifecycle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLifecycle_PreventDestroy(), ecorePackage.getEBoolean(), "preventDestroy", null, 0, 1, Lifecycle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLifecycle_IgnoreChanges(), ecorePackage.getEString(), "ignoreChanges", null, 0, -1, Lifecycle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLifecycle_ReplaceTriggeredBy(), ecorePackage.getEString(), "replaceTriggeredBy", null, 0, -1, Lifecycle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(provisionerEClass, Provisioner.class, "Provisioner", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProvisioner_Type(), this.getProvisionerType(), "type", null, 1, 1, Provisioner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProvisioner_Arguments(), this.getArgument(), null, "arguments", null, 0, -1, Provisioner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(providerRequirementEClass, ProviderRequirement.class, "ProviderRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProviderRequirement_Source(), ecorePackage.getEString(), "source", null, 0, 1, ProviderRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProviderRequirement_Version(), ecorePackage.getEString(), "version", null, 0, 1, ProviderRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProviderRequirement_ConfigurationAlias(), ecorePackage.getEString(), "configurationAlias", null, 0, 1, ProviderRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(providerEClass, Provider.class, "Provider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProvider_Alias(), ecorePackage.getEString(), "alias", null, 0, 1, Provider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProvider_Arguments(), this.getArgument(), null, "arguments", null, 0, -1, Provider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariable_Type(), ecorePackage.getEString(), "type", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_Default(), ecorePackage.getEString(), "default", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_Sensitive(), ecorePackage.getEBoolean(), "sensitive", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_Nullable(), ecorePackage.getEBoolean(), "nullable", "true", 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariable_Validations(), this.getValidation(), null, "validations", null, 0, -1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outputEClass, Output.class, "Output", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOutput_Value(), ecorePackage.getEString(), "value", null, 1, 1, Output.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutput_Sensitive(), ecorePackage.getEBoolean(), "sensitive", null, 0, 1, Output.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutput_DependsOn(), ecorePackage.getEString(), "dependsOn", null, 0, -1, Output.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOutput_Preconditions(), this.getPrecondition(), null, "preconditions", null, 0, -1, Output.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(localEClass, Local.class, "Local", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocal_Value(), ecorePackage.getEString(), "value", null, 1, 1, Local.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceEClass, Resource.class, "Resource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResource_Type(), ecorePackage.getEString(), "type", null, 1, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResource_Provider(), ecorePackage.getEString(), "provider", null, 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResource_Count(), ecorePackage.getEString(), "count", null, 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResource_ForEach(), ecorePackage.getEString(), "forEach", null, 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResource_DependsOn(), ecorePackage.getEString(), "dependsOn", null, 0, -1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResource_Arguments(), this.getArgument(), null, "arguments", null, 0, -1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResource_Provisioners(), this.getProvisioner(), null, "provisioners", null, 0, -1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResource_Lifecycle(), this.getLifecycle(), null, "lifecycle", null, 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResource_Preconditions(), this.getPrecondition(), null, "preconditions", null, 0, -1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResource_Postconditions(), this.getPostcondition(), null, "postconditions", null, 0, -1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataSourceEClass, DataSource.class, "DataSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataSource_Type(), ecorePackage.getEString(), "type", null, 1, 1, DataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataSource_Provider(), ecorePackage.getEString(), "provider", null, 0, 1, DataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataSource_Count(), ecorePackage.getEString(), "count", null, 0, 1, DataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataSource_ForEach(), ecorePackage.getEString(), "forEach", null, 0, 1, DataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataSource_DependsOn(), ecorePackage.getEString(), "dependsOn", null, 0, -1, DataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataSource_Arguments(), this.getArgument(), null, "arguments", null, 0, -1, DataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataSource_Lifecycle(), this.getLifecycle(), null, "lifecycle", null, 0, 1, DataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataSource_Preconditions(), this.getPrecondition(), null, "preconditions", null, 0, -1, DataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataSource_Postconditions(), this.getPostcondition(), null, "postconditions", null, 0, -1, DataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(backendEClass, Backend.class, "Backend", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBackend_Type(), ecorePackage.getEString(), "type", null, 1, 1, Backend.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBackend_Arguments(), this.getArgument(), null, "arguments", null, 0, -1, Backend.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moduleCallEClass, ModuleCall.class, "ModuleCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModuleCall_Source(), ecorePackage.getEString(), "source", null, 1, 1, ModuleCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModuleCall_Version(), ecorePackage.getEString(), "version", null, 0, 1, ModuleCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModuleCall_Count(), ecorePackage.getEString(), "count", null, 0, 1, ModuleCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModuleCall_ForEach(), ecorePackage.getEString(), "forEach", null, 0, 1, ModuleCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModuleCall_DependsOn(), ecorePackage.getEString(), "dependsOn", null, 0, -1, ModuleCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModuleCall_Arguments(), this.getArgument(), null, "arguments", null, 0, -1, ModuleCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModuleCall_Providers(), this.getArgument(), null, "providers", null, 0, -1, ModuleCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moduleEClass, org.nasdanika.models.terraform.Module.class, "Module", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModule_Resources(), this.getResource(), null, "resources", null, 0, -1, org.nasdanika.models.terraform.Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModule_DataSources(), this.getDataSource(), null, "dataSources", null, 0, -1, org.nasdanika.models.terraform.Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModule_Variables(), this.getVariable(), null, "variables", null, 0, -1, org.nasdanika.models.terraform.Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModule_Outputs(), this.getOutput(), null, "outputs", null, 0, -1, org.nasdanika.models.terraform.Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModule_Locals(), this.getLocal(), null, "locals", null, 0, -1, org.nasdanika.models.terraform.Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModule_ModuleCalls(), this.getModuleCall(), null, "moduleCalls", null, 0, -1, org.nasdanika.models.terraform.Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModule_RequiredProviders(), this.getProviderRequirement(), null, "requiredProviders", null, 0, -1, org.nasdanika.models.terraform.Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModule_RequiredTerraformVersion(), ecorePackage.getEString(), "requiredTerraformVersion", null, 0, 1, org.nasdanika.models.terraform.Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configurationEClass, Configuration.class, "Configuration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConfiguration_Providers(), this.getProvider(), null, "providers", null, 0, -1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfiguration_Backend(), this.getBackend(), null, "backend", null, 0, 1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workspaceEClass, Workspace.class, "Workspace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(resourceInstanceEClass, ResourceInstance.class, "ResourceInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResourceInstance_IndexKey(), ecorePackage.getEString(), "indexKey", null, 0, 1, ResourceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceInstance_SchemaVersion(), ecorePackage.getEInt(), "schemaVersion", null, 0, 1, ResourceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceInstance_AttributesJson(), ecorePackage.getEString(), "attributesJson", null, 0, 1, ResourceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceInstance_SensitiveAttributes(), ecorePackage.getEString(), "sensitiveAttributes", null, 0, 1, ResourceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceInstance_PrivateJson(), ecorePackage.getEString(), "privateJson", null, 0, 1, ResourceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateResourceEClass, StateResource.class, "StateResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStateResource_Module(), ecorePackage.getEString(), "module", null, 0, 1, StateResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStateResource_Mode(), this.getResourceMode(), "mode", null, 1, 1, StateResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStateResource_Type(), ecorePackage.getEString(), "type", null, 1, 1, StateResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStateResource_Name(), ecorePackage.getEString(), "name", null, 1, 1, StateResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStateResource_ProviderConfig(), ecorePackage.getEString(), "providerConfig", null, 1, 1, StateResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStateResource_Instances(), this.getResourceInstance(), null, "instances", null, 0, -1, StateResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateOutputEClass, StateOutput.class, "StateOutput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStateOutput_Name(), ecorePackage.getEString(), "name", null, 1, 1, StateOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStateOutput_Value(), ecorePackage.getEString(), "value", null, 0, 1, StateOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStateOutput_Type(), ecorePackage.getEString(), "type", null, 0, 1, StateOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStateOutput_Sensitive(), ecorePackage.getEBoolean(), "sensitive", null, 0, 1, StateOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateEClass, State.class, "State", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getState_Version(), ecorePackage.getEInt(), "version", null, 1, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getState_TerraformVersion(), ecorePackage.getEString(), "terraformVersion", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getState_Serial(), ecorePackage.getEInt(), "serial", null, 1, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getState_Lineage(), ecorePackage.getEString(), "lineage", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_Resources(), this.getStateResource(), null, "resources", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_Outputs(), this.getStateOutput(), null, "outputs", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(provisionerTypeEEnum, ProvisionerType.class, "ProvisionerType");
		addEEnumLiteral(provisionerTypeEEnum, ProvisionerType.LOCAL_EXEC);
		addEEnumLiteral(provisionerTypeEEnum, ProvisionerType.REMOTE_EXEC);
		addEEnumLiteral(provisionerTypeEEnum, ProvisionerType.FILE);

		initEEnum(resourceModeEEnum, ResourceMode.class, "ResourceMode");
		addEEnumLiteral(resourceModeEEnum, ResourceMode.MANAGED);
		addEEnumLiteral(resourceModeEEnum, ResourceMode.DATA);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "documentation", "Ecore model for Terraform concepts based on the Terraform glossary (https://developer.hashicorp.com/terraform/docs/glossary).\n\nThe model can be used to:\n- Generate documentation about Terraform configurations\n- Generate Terraform configuration artifacts (.tf files) from model instances\n- Load and represent information from existing Terraform artifacts (configuration files, state files)"
		   });
		addAnnotation
		  (provisionerTypeEEnum,
		   source,
		   new String[] {
			   "documentation", "Types of provisioners supported by Terraform. Provisioners are used to execute scripts on local or remote machines as part of resource creation or destruction."
		   });
		addAnnotation
		  (provisionerTypeEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "documentation", "Executes a command locally on the machine running Terraform."
		   });
		addAnnotation
		  (provisionerTypeEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "documentation", "Executes commands on the remote resource after it is created."
		   });
		addAnnotation
		  (provisionerTypeEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "documentation", "Copies files or directories from the machine running Terraform to a remote resource."
		   });
		addAnnotation
		  (resourceModeEEnum,
		   source,
		   new String[] {
			   "documentation", "The mode of a resource in Terraform state. Indicates whether the resource is a managed resource or a data source."
		   });
		addAnnotation
		  (resourceModeEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "documentation", "A managed resource whose lifecycle Terraform controls."
		   });
		addAnnotation
		  (resourceModeEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "documentation", "A data source that reads existing infrastructure but does not manage its lifecycle."
		   });
		addAnnotation
		  (namedElementEClass,
		   source,
		   new String[] {
			   "documentation", "Abstract base class for all named Terraform elements."
		   });
		addAnnotation
		  (getNamedElement_Name(),
		   source,
		   new String[] {
			   "documentation", "The name of the element as defined in the Terraform configuration."
		   });
		addAnnotation
		  (documentedNamedElementEClass,
		   source,
		   new String[] {
			   "documentation", "Abstract base class for named Terraform elements that can have a description."
		   });
		addAnnotation
		  (getDocumentedNamedElement_Description(),
		   source,
		   new String[] {
			   "documentation", "Human-readable description of the element, used for documentation generation."
		   });
		addAnnotation
		  (argumentEClass,
		   source,
		   new String[] {
			   "documentation", "An argument assigns a value to a particular name within a Terraform block. Arguments appear within blocks and assign a value to a name. The value can be a literal value or an expression."
		   });
		addAnnotation
		  (getArgument_Name(),
		   source,
		   new String[] {
			   "documentation", "The argument name (left-hand side of the assignment)."
		   });
		addAnnotation
		  (getArgument_Value(),
		   source,
		   new String[] {
			   "documentation", "The argument value as an HCL expression string. This may reference variables, locals, resource attributes, or data source attributes."
		   });
		addAnnotation
		  (validationEClass,
		   source,
		   new String[] {
			   "documentation", "A validation block within an input variable definition. Validation rules allow module authors to define constraints on accepted variable values."
		   });
		addAnnotation
		  (getValidation_Condition(),
		   source,
		   new String[] {
			   "documentation", "An HCL expression that returns true if the value is valid. Must return a boolean and may only reference the variable being validated."
		   });
		addAnnotation
		  (getValidation_ErrorMessage(),
		   source,
		   new String[] {
			   "documentation", "The error message to display when the condition is false. Must be a string value and should describe the constraint."
		   });
		addAnnotation
		  (preconditionEClass,
		   source,
		   new String[] {
			   "documentation", "A precondition block that verifies assumptions about a resource, data source, or output before applying changes."
		   });
		addAnnotation
		  (getPrecondition_Condition(),
		   source,
		   new String[] {
			   "documentation", "An HCL expression that must evaluate to true. If false, Terraform will produce an error."
		   });
		addAnnotation
		  (getPrecondition_ErrorMessage(),
		   source,
		   new String[] {
			   "documentation", "The error message to display if the condition fails."
		   });
		addAnnotation
		  (postconditionEClass,
		   source,
		   new String[] {
			   "documentation", "A postcondition block that verifies guarantees about a resource or data source after applying changes."
		   });
		addAnnotation
		  (getPostcondition_Condition(),
		   source,
		   new String[] {
			   "documentation", "An HCL expression that must evaluate to true after the operation. If false, Terraform will produce an error."
		   });
		addAnnotation
		  (getPostcondition_ErrorMessage(),
		   source,
		   new String[] {
			   "documentation", "The error message to display if the condition fails."
		   });
		addAnnotation
		  (lifecycleEClass,
		   source,
		   new String[] {
			   "documentation", "A lifecycle block within a resource that customizes the resource lifecycle behavior. Provides fine-grained control over how Terraform creates, updates, and destroys resources."
		   });
		addAnnotation
		  (getLifecycle_CreateBeforeDestroy(),
		   source,
		   new String[] {
			   "documentation", "When true, Terraform will create a new resource before destroying the old one when the resource must be replaced. Useful for zero-downtime deployments."
		   });
		addAnnotation
		  (getLifecycle_PreventDestroy(),
		   source,
		   new String[] {
			   "documentation", "When true, any attempt to destroy the resource will produce an error. Useful for protecting critical infrastructure components."
		   });
		addAnnotation
		  (getLifecycle_IgnoreChanges(),
		   source,
		   new String[] {
			   "documentation", "List of attribute paths that Terraform should ignore when planning updates. Changes to these attributes will not trigger a plan diff."
		   });
		addAnnotation
		  (getLifecycle_ReplaceTriggeredBy(),
		   source,
		   new String[] {
			   "documentation", "List of references to resources or resource attributes that, when changed, should trigger replacement of this resource."
		   });
		addAnnotation
		  (provisionerEClass,
		   source,
		   new String[] {
			   "documentation", "A provisioner within a resource block that executes scripts or copies files on a resource after it is created. Provisioners are a last resort and should be avoided when possible in favor of provider-native mechanisms."
		   });
		addAnnotation
		  (getProvisioner_Type(),
		   source,
		   new String[] {
			   "documentation", "The type of provisioner: local-exec, remote-exec, or file."
		   });
		addAnnotation
		  (getProvisioner_Arguments(),
		   source,
		   new String[] {
			   "documentation", "Configuration arguments for the provisioner (e.g., command, interpreter, working_dir for local-exec)."
		   });
		addAnnotation
		  (providerRequirementEClass,
		   source,
		   new String[] {
			   "documentation", "A required_providers entry that declares a dependency on a Terraform provider. Specifies the source address and version constraints for a provider."
		   });
		addAnnotation
		  (getProviderRequirement_Source(),
		   source,
		   new String[] {
			   "documentation", "The provider source address in the format [hostname/]namespace/type, e.g. \'hashicorp/aws\' or \'registry.terraform.io/hashicorp/azurerm\'."
		   });
		addAnnotation
		  (getProviderRequirement_Version(),
		   source,
		   new String[] {
			   "documentation", "Version constraint string for the provider, e.g. \'~> 4.0\', \'>= 3.0, < 5.0\'."
		   });
		addAnnotation
		  (getProviderRequirement_ConfigurationAlias(),
		   source,
		   new String[] {
			   "documentation", "An optional alias for this provider requirement when the module needs access to a provider with an alias defined by the calling module."
		   });
		addAnnotation
		  (providerEClass,
		   source,
		   new String[] {
			   "documentation", "A provider block that configures a specific provider plugin. Providers are responsible for understanding API interactions and exposing resources. Each provider name corresponds to a provider declared in required_providers."
		   });
		addAnnotation
		  (getProvider_Alias(),
		   source,
		   new String[] {
			   "documentation", "Optional alias for this provider configuration, allowing multiple configurations of the same provider type. Resources can then select a specific alias via the provider meta-argument."
		   });
		addAnnotation
		  (getProvider_Arguments(),
		   source,
		   new String[] {
			   "documentation", "Provider-specific configuration arguments (e.g., region, access_key for AWS)."
		   });
		addAnnotation
		  (variableEClass,
		   source,
		   new String[] {
			   "documentation", "An input variable declaration that allows callers to customize module behavior without modifying the source. Variables are the parameters of Terraform modules, comparable to function arguments in programming."
		   });
		addAnnotation
		  (getVariable_Type(),
		   source,
		   new String[] {
			   "documentation", "Type constraint expressed as an HCL type expression (e.g., \'string\', \'number\', \'bool\', \'list(string)\', \'map(any)\', \'object({...})\')."
		   });
		addAnnotation
		  (getVariable_Default(),
		   source,
		   new String[] {
			   "documentation", "Default value for the variable as an HCL expression. If omitted, the caller must provide a value."
		   });
		addAnnotation
		  (getVariable_Sensitive(),
		   source,
		   new String[] {
			   "documentation", "When true, marks the variable value as sensitive. Sensitive values are redacted from Terraform output and logs."
		   });
		addAnnotation
		  (getVariable_Nullable(),
		   source,
		   new String[] {
			   "documentation", "When false, Terraform will reject null values for this variable. Defaults to true."
		   });
		addAnnotation
		  (getVariable_Validations(),
		   source,
		   new String[] {
			   "documentation", "Custom validation rules for the variable value."
		   });
		addAnnotation
		  (outputEClass,
		   source,
		   new String[] {
			   "documentation", "An output value declaration that exposes values from a module to the calling module or to the user. Output values make information about infrastructure available after applying the configuration."
		   });
		addAnnotation
		  (getOutput_Value(),
		   source,
		   new String[] {
			   "documentation", "The HCL expression whose result is exported as the output value."
		   });
		addAnnotation
		  (getOutput_Sensitive(),
		   source,
		   new String[] {
			   "documentation", "When true, marks the output value as sensitive. Sensitive values are redacted from Terraform output and logs."
		   });
		addAnnotation
		  (getOutput_DependsOn(),
		   source,
		   new String[] {
			   "documentation", "Explicit dependencies for the output value, used when the value does not implicitly depend on all required resources. Specified as reference strings."
		   });
		addAnnotation
		  (getOutput_Preconditions(),
		   source,
		   new String[] {
			   "documentation", "Preconditions that must be met before evaluating the output value."
		   });
		addAnnotation
		  (localEClass,
		   source,
		   new String[] {
			   "documentation", "A local value is a convenience feature that assigns a name to an expression, allowing the same expression to be used multiple times without repeating it. Comparable to a local variable in a programming language."
		   });
		addAnnotation
		  (getLocal_Value(),
		   source,
		   new String[] {
			   "documentation", "The HCL expression that computes the local value."
		   });
		addAnnotation
		  (resourceEClass,
		   source,
		   new String[] {
			   "documentation", "A resource block that describes one or more infrastructure objects, such as virtual networks, compute instances, or higher-level components such as DNS records. Resources are the most important element in Terraform; each resource block describes one or more infrastructure objects."
		   });
		addAnnotation
		  (getResource_Type(),
		   source,
		   new String[] {
			   "documentation", "The resource type, which is provider-defined (e.g., \'aws_instance\', \'azurerm_virtual_network\'). Combined with the name, forms the resource address."
		   });
		addAnnotation
		  (getResource_Provider(),
		   source,
		   new String[] {
			   "documentation", "Optional provider meta-argument that overrides the default provider for this resource. Specified as \'provider_name.alias\' to reference a provider with an alias."
		   });
		addAnnotation
		  (getResource_Count(),
		   source,
		   new String[] {
			   "documentation", "The count meta-argument as an HCL expression. When set to a whole number, creates that many instances of the resource."
		   });
		addAnnotation
		  (getResource_ForEach(),
		   source,
		   new String[] {
			   "documentation", "The for_each meta-argument as an HCL expression. When set to a map or set, creates one instance per element."
		   });
		addAnnotation
		  (getResource_DependsOn(),
		   source,
		   new String[] {
			   "documentation", "Explicit dependencies for the resource, used when Terraform cannot automatically infer dependencies from expressions. Specified as reference strings (e.g., \'aws_s3_bucket.example\')."
		   });
		addAnnotation
		  (getResource_Arguments(),
		   source,
		   new String[] {
			   "documentation", "Resource-type-specific configuration arguments."
		   });
		addAnnotation
		  (getResource_Provisioners(),
		   source,
		   new String[] {
			   "documentation", "Provisioner blocks for post-creation actions. Provisioners are a last resort."
		   });
		addAnnotation
		  (getResource_Lifecycle(),
		   source,
		   new String[] {
			   "documentation", "Lifecycle customization for this resource."
		   });
		addAnnotation
		  (getResource_Preconditions(),
		   source,
		   new String[] {
			   "documentation", "Preconditions that must hold before planning changes to this resource."
		   });
		addAnnotation
		  (getResource_Postconditions(),
		   source,
		   new String[] {
			   "documentation", "Postconditions that must hold after applying changes to this resource."
		   });
		addAnnotation
		  (dataSourceEClass,
		   source,
		   new String[] {
			   "documentation", "A data source allows Terraform to use information defined outside of Terraform, defined by another separate Terraform configuration, or modified by functions. Each data source corresponds to a data block in configuration. Data sources read existing infrastructure but do not manage its lifecycle."
		   });
		addAnnotation
		  (getDataSource_Type(),
		   source,
		   new String[] {
			   "documentation", "The data source type, which is provider-defined (e.g., \'aws_ami\', \'azurerm_resource_group\')."
		   });
		addAnnotation
		  (getDataSource_Provider(),
		   source,
		   new String[] {
			   "documentation", "Optional provider meta-argument that overrides the default provider for this data source."
		   });
		addAnnotation
		  (getDataSource_Count(),
		   source,
		   new String[] {
			   "documentation", "The count meta-argument as an HCL expression."
		   });
		addAnnotation
		  (getDataSource_ForEach(),
		   source,
		   new String[] {
			   "documentation", "The for_each meta-argument as an HCL expression."
		   });
		addAnnotation
		  (getDataSource_DependsOn(),
		   source,
		   new String[] {
			   "documentation", "Explicit dependencies for the data source."
		   });
		addAnnotation
		  (getDataSource_Arguments(),
		   source,
		   new String[] {
			   "documentation", "Data-source-type-specific filter and configuration arguments."
		   });
		addAnnotation
		  (getDataSource_Lifecycle(),
		   source,
		   new String[] {
			   "documentation", "Lifecycle customization for this data source."
		   });
		addAnnotation
		  (getDataSource_Preconditions(),
		   source,
		   new String[] {
			   "documentation", "Preconditions that must hold before reading this data source."
		   });
		addAnnotation
		  (getDataSource_Postconditions(),
		   source,
		   new String[] {
			   "documentation", "Postconditions that must hold after reading this data source."
		   });
		addAnnotation
		  (backendEClass,
		   source,
		   new String[] {
			   "documentation", "A backend block that defines where Terraform stores its state data files. The backend also determines how operations such as plan and apply are executed. Each configuration can have at most one backend block."
		   });
		addAnnotation
		  (getBackend_Type(),
		   source,
		   new String[] {
			   "documentation", "The backend type (e.g., \'local\', \'s3\', \'azurerm\', \'gcs\', \'remote\', \'http\', \'consul\', \'pg\', \'kubernetes\')."
		   });
		addAnnotation
		  (getBackend_Arguments(),
		   source,
		   new String[] {
			   "documentation", "Backend-type-specific configuration arguments (e.g., bucket, key, region for S3 backend)."
		   });
		addAnnotation
		  (moduleCallEClass,
		   source,
		   new String[] {
			   "documentation", "A module call (module block) that instantiates a child module. A module is a container for multiple resources that are used together. The module call specifies the source of the module and passes input variable values to it."
		   });
		addAnnotation
		  (getModuleCall_Source(),
		   source,
		   new String[] {
			   "documentation", "The module source address, which tells Terraform where to find the module source code. Can be a local path, Terraform Registry address, GitHub URL, or other supported source types."
		   });
		addAnnotation
		  (getModuleCall_Version(),
		   source,
		   new String[] {
			   "documentation", "Version constraint for the module when sourced from the Terraform Registry."
		   });
		addAnnotation
		  (getModuleCall_Count(),
		   source,
		   new String[] {
			   "documentation", "The count meta-argument as an HCL expression."
		   });
		addAnnotation
		  (getModuleCall_ForEach(),
		   source,
		   new String[] {
			   "documentation", "The for_each meta-argument as an HCL expression."
		   });
		addAnnotation
		  (getModuleCall_DependsOn(),
		   source,
		   new String[] {
			   "documentation", "Explicit dependencies for this module call."
		   });
		addAnnotation
		  (getModuleCall_Arguments(),
		   source,
		   new String[] {
			   "documentation", "Input variable values passed to the module. Each argument corresponds to an input variable defined in the module."
		   });
		addAnnotation
		  (getModuleCall_Providers(),
		   source,
		   new String[] {
			   "documentation", "Provider configuration assignments passed to the module, mapping module-local provider names to parent provider configurations."
		   });
		addAnnotation
		  (moduleEClass,
		   source,
		   new String[] {
			   "documentation", "A module is a container for multiple resources that are used together. Every Terraform configuration has at least one module, known as the root module. A module consists of a collection of .tf and/or .tf.json files kept together in a directory."
		   });
		addAnnotation
		  (getModule_Resources(),
		   source,
		   new String[] {
			   "documentation", "Managed resources declared in this module."
		   });
		addAnnotation
		  (getModule_DataSources(),
		   source,
		   new String[] {
			   "documentation", "Data sources declared in this module."
		   });
		addAnnotation
		  (getModule_Variables(),
		   source,
		   new String[] {
			   "documentation", "Input variable declarations for this module."
		   });
		addAnnotation
		  (getModule_Outputs(),
		   source,
		   new String[] {
			   "documentation", "Output value declarations for this module."
		   });
		addAnnotation
		  (getModule_Locals(),
		   source,
		   new String[] {
			   "documentation", "Local value declarations for this module."
		   });
		addAnnotation
		  (getModule_ModuleCalls(),
		   source,
		   new String[] {
			   "documentation", "Child module calls within this module."
		   });
		addAnnotation
		  (getModule_RequiredProviders(),
		   source,
		   new String[] {
			   "documentation", "Required provider declarations for this module, specifying provider source addresses and version constraints."
		   });
		addAnnotation
		  (getModule_RequiredTerraformVersion(),
		   source,
		   new String[] {
			   "documentation", "Version constraint string for the minimum Terraform version required by this module."
		   });
		addAnnotation
		  (configurationEClass,
		   source,
		   new String[] {
			   "documentation", "A root module configuration that represents a complete Terraform configuration - a directory of .tf files that forms the root module. The Configuration is the main entry point from which Terraform executes and includes backend configuration and provider declarations."
		   });
		addAnnotation
		  (getConfiguration_Providers(),
		   source,
		   new String[] {
			   "documentation", "Provider configuration blocks for providers used in this configuration."
		   });
		addAnnotation
		  (getConfiguration_Backend(),
		   source,
		   new String[] {
			   "documentation", "The backend configuration for this root module, defining where state is stored."
		   });
		addAnnotation
		  (workspaceEClass,
		   source,
		   new String[] {
			   "documentation", "A named workspace that isolates state data for separate Terraform runs of the same configuration. Each workspace has its own state file. The \'default\' workspace is created automatically."
		   });
		addAnnotation
		  (resourceInstanceEClass,
		   source,
		   new String[] {
			   "documentation", "A specific instance of a resource tracked in Terraform state. When using count or for_each, a resource may have multiple instances, each tracked separately."
		   });
		addAnnotation
		  (getResourceInstance_IndexKey(),
		   source,
		   new String[] {
			   "documentation", "The index key for this instance when using count (numeric) or for_each (string key). Null for single-instance resources."
		   });
		addAnnotation
		  (getResourceInstance_SchemaVersion(),
		   source,
		   new String[] {
			   "documentation", "The version of the resource schema used to create this state entry."
		   });
		addAnnotation
		  (getResourceInstance_AttributesJson(),
		   source,
		   new String[] {
			   "documentation", "JSON-encoded map of the resource instance\'s attribute values as tracked in state."
		   });
		addAnnotation
		  (getResourceInstance_SensitiveAttributes(),
		   source,
		   new String[] {
			   "documentation", "JSON-encoded list of attribute paths that are marked as sensitive in the state."
		   });
		addAnnotation
		  (getResourceInstance_PrivateJson(),
		   source,
		   new String[] {
			   "documentation", "Base64-encoded private state data used by the provider."
		   });
		addAnnotation
		  (stateResourceEClass,
		   source,
		   new String[] {
			   "documentation", "A resource entry in Terraform state, representing one managed resource or data source and all its instances."
		   });
		addAnnotation
		  (getStateResource_Module(),
		   source,
		   new String[] {
			   "documentation", "The module path for this resource (e.g., \'module.vpc\'). Empty string for root module resources."
		   });
		addAnnotation
		  (getStateResource_Mode(),
		   source,
		   new String[] {
			   "documentation", "The resource mode: \'managed\' for resources or \'data\' for data sources."
		   });
		addAnnotation
		  (getStateResource_Type(),
		   source,
		   new String[] {
			   "documentation", "The resource type (e.g., \'aws_instance\')."
		   });
		addAnnotation
		  (getStateResource_Name(),
		   source,
		   new String[] {
			   "documentation", "The resource name as defined in the configuration."
		   });
		addAnnotation
		  (getStateResource_ProviderConfig(),
		   source,
		   new String[] {
			   "documentation", "The provider configuration address for this resource (e.g., \'provider[\"registry.terraform.io/hashicorp/aws\"]\')."
		   });
		addAnnotation
		  (getStateResource_Instances(),
		   source,
		   new String[] {
			   "documentation", "The resource instances tracked in state."
		   });
		addAnnotation
		  (stateOutputEClass,
		   source,
		   new String[] {
			   "documentation", "An output value recorded in Terraform state."
		   });
		addAnnotation
		  (getStateOutput_Name(),
		   source,
		   new String[] {
			   "documentation", "The output name."
		   });
		addAnnotation
		  (getStateOutput_Value(),
		   source,
		   new String[] {
			   "documentation", "The output value as a JSON-encoded string."
		   });
		addAnnotation
		  (getStateOutput_Type(),
		   source,
		   new String[] {
			   "documentation", "The type of the output value."
		   });
		addAnnotation
		  (getStateOutput_Sensitive(),
		   source,
		   new String[] {
			   "documentation", "Whether this output value is marked as sensitive."
		   });
		addAnnotation
		  (stateEClass,
		   source,
		   new String[] {
			   "documentation", "Terraform state, which is the record of all managed infrastructure and configuration. Terraform uses state to map real-world resources to the configuration, track metadata, and improve performance for large infrastructures. State is stored in a file (terraform.tfstate by default) or in a remote backend."
		   });
		addAnnotation
		  (getState_Version(),
		   source,
		   new String[] {
			   "documentation", "The state file format version number."
		   });
		addAnnotation
		  (getState_TerraformVersion(),
		   source,
		   new String[] {
			   "documentation", "The version of Terraform that last wrote this state file."
		   });
		addAnnotation
		  (getState_Serial(),
		   source,
		   new String[] {
			   "documentation", "A monotonically increasing integer that is incremented each time Terraform makes a change to state. Used for conflict detection in remote backends."
		   });
		addAnnotation
		  (getState_Lineage(),
		   source,
		   new String[] {
			   "documentation", "A unique identifier for this state file, generated when the state is first created and unchanged thereafter. Used to detect unintended state swaps."
		   });
		addAnnotation
		  (getState_Resources(),
		   source,
		   new String[] {
			   "documentation", "All resources tracked in this state."
		   });
		addAnnotation
		  (getState_Outputs(),
		   source,
		   new String[] {
			   "documentation", "Output values recorded in this state."
		   });
	}

} //TerraformPackageImpl
