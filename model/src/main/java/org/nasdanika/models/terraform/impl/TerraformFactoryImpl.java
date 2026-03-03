/**
 */
package org.nasdanika.models.terraform.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.nasdanika.models.terraform.Argument;
import org.nasdanika.models.terraform.Backend;
import org.nasdanika.models.terraform.Configuration;
import org.nasdanika.models.terraform.DataSource;
import org.nasdanika.models.terraform.Lifecycle;
import org.nasdanika.models.terraform.Local;
import org.nasdanika.models.terraform.ModuleCall;
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
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TerraformFactoryImpl extends EFactoryImpl implements TerraformFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TerraformFactory init() {
		try {
			TerraformFactory theTerraformFactory = (TerraformFactory)EPackage.Registry.INSTANCE.getEFactory(TerraformPackage.eNS_URI);
			if (theTerraformFactory != null) {
				return theTerraformFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TerraformFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerraformFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TerraformPackage.ARGUMENT: return createArgument();
			case TerraformPackage.VALIDATION: return createValidation();
			case TerraformPackage.PRECONDITION: return createPrecondition();
			case TerraformPackage.POSTCONDITION: return createPostcondition();
			case TerraformPackage.LIFECYCLE: return createLifecycle();
			case TerraformPackage.PROVISIONER: return createProvisioner();
			case TerraformPackage.PROVIDER_REQUIREMENT: return createProviderRequirement();
			case TerraformPackage.PROVIDER: return createProvider();
			case TerraformPackage.VARIABLE: return createVariable();
			case TerraformPackage.OUTPUT: return createOutput();
			case TerraformPackage.LOCAL: return createLocal();
			case TerraformPackage.RESOURCE: return createResource();
			case TerraformPackage.DATA_SOURCE: return createDataSource();
			case TerraformPackage.BACKEND: return createBackend();
			case TerraformPackage.MODULE_CALL: return createModuleCall();
			case TerraformPackage.MODULE: return createModule();
			case TerraformPackage.CONFIGURATION: return createConfiguration();
			case TerraformPackage.WORKSPACE: return createWorkspace();
			case TerraformPackage.RESOURCE_INSTANCE: return createResourceInstance();
			case TerraformPackage.STATE_RESOURCE: return createStateResource();
			case TerraformPackage.STATE_OUTPUT: return createStateOutput();
			case TerraformPackage.STATE: return createState();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case TerraformPackage.PROVISIONER_TYPE:
				return createProvisionerTypeFromString(eDataType, initialValue);
			case TerraformPackage.RESOURCE_MODE:
				return createResourceModeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case TerraformPackage.PROVISIONER_TYPE:
				return convertProvisionerTypeToString(eDataType, instanceValue);
			case TerraformPackage.RESOURCE_MODE:
				return convertResourceModeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Argument createArgument() {
		ArgumentImpl argument = new ArgumentImpl();
		return argument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Validation createValidation() {
		ValidationImpl validation = new ValidationImpl();
		return validation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Precondition createPrecondition() {
		PreconditionImpl precondition = new PreconditionImpl();
		return precondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Postcondition createPostcondition() {
		PostconditionImpl postcondition = new PostconditionImpl();
		return postcondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Lifecycle createLifecycle() {
		LifecycleImpl lifecycle = new LifecycleImpl();
		return lifecycle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Provisioner createProvisioner() {
		ProvisionerImpl provisioner = new ProvisionerImpl();
		return provisioner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProviderRequirement createProviderRequirement() {
		ProviderRequirementImpl providerRequirement = new ProviderRequirementImpl();
		return providerRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Provider createProvider() {
		ProviderImpl provider = new ProviderImpl();
		return provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Output createOutput() {
		OutputImpl output = new OutputImpl();
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Local createLocal() {
		LocalImpl local = new LocalImpl();
		return local;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Resource createResource() {
		ResourceImpl resource = new ResourceImpl();
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataSource createDataSource() {
		DataSourceImpl dataSource = new DataSourceImpl();
		return dataSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Backend createBackend() {
		BackendImpl backend = new BackendImpl();
		return backend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModuleCall createModuleCall() {
		ModuleCallImpl moduleCall = new ModuleCallImpl();
		return moduleCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.nasdanika.models.terraform.Module createModule() {
		ModuleImpl module = new ModuleImpl();
		return module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Configuration createConfiguration() {
		ConfigurationImpl configuration = new ConfigurationImpl();
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Workspace createWorkspace() {
		WorkspaceImpl workspace = new WorkspaceImpl();
		return workspace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceInstance createResourceInstance() {
		ResourceInstanceImpl resourceInstance = new ResourceInstanceImpl();
		return resourceInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StateResource createStateResource() {
		StateResourceImpl stateResource = new StateResourceImpl();
		return stateResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StateOutput createStateOutput() {
		StateOutputImpl stateOutput = new StateOutputImpl();
		return stateOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public State createState() {
		StateImpl state = new StateImpl();
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvisionerType createProvisionerTypeFromString(EDataType eDataType, String initialValue) {
		ProvisionerType result = ProvisionerType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProvisionerTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceMode createResourceModeFromString(EDataType eDataType, String initialValue) {
		ResourceMode result = ResourceMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResourceModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerraformPackage getTerraformPackage() {
		return (TerraformPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TerraformPackage getPackage() {
		return TerraformPackage.eINSTANCE;
	}

} //TerraformFactoryImpl
