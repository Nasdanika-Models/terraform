/**
 */
package org.nasdanika.models.terraform.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
import org.nasdanika.models.terraform.Resource;
import org.nasdanika.models.terraform.ResourceInstance;
import org.nasdanika.models.terraform.State;
import org.nasdanika.models.terraform.StateOutput;
import org.nasdanika.models.terraform.StateResource;
import org.nasdanika.models.terraform.TerraformPackage;
import org.nasdanika.models.terraform.Validation;
import org.nasdanika.models.terraform.Variable;
import org.nasdanika.models.terraform.Workspace;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.terraform.TerraformPackage
 * @generated
 */
public class TerraformSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TerraformPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerraformSwitch() {
		if (modelPackage == null) {
			modelPackage = TerraformPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case TerraformPackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T result = caseNamedElement(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TerraformPackage.DOCUMENTED_NAMED_ELEMENT: {
				DocumentedNamedElement documentedNamedElement = (DocumentedNamedElement)theEObject;
				T result = caseDocumentedNamedElement(documentedNamedElement);
				if (result == null) result = caseNamedElement(documentedNamedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TerraformPackage.ARGUMENT: {
				Argument argument = (Argument)theEObject;
				T result = caseArgument(argument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TerraformPackage.VALIDATION: {
				Validation validation = (Validation)theEObject;
				T result = caseValidation(validation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TerraformPackage.PRECONDITION: {
				Precondition precondition = (Precondition)theEObject;
				T result = casePrecondition(precondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TerraformPackage.POSTCONDITION: {
				Postcondition postcondition = (Postcondition)theEObject;
				T result = casePostcondition(postcondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TerraformPackage.LIFECYCLE: {
				Lifecycle lifecycle = (Lifecycle)theEObject;
				T result = caseLifecycle(lifecycle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TerraformPackage.PROVISIONER: {
				Provisioner provisioner = (Provisioner)theEObject;
				T result = caseProvisioner(provisioner);
				if (result == null) result = caseNamedElement(provisioner);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TerraformPackage.PROVIDER_REQUIREMENT: {
				ProviderRequirement providerRequirement = (ProviderRequirement)theEObject;
				T result = caseProviderRequirement(providerRequirement);
				if (result == null) result = caseNamedElement(providerRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TerraformPackage.PROVIDER: {
				Provider provider = (Provider)theEObject;
				T result = caseProvider(provider);
				if (result == null) result = caseDocumentedNamedElement(provider);
				if (result == null) result = caseNamedElement(provider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TerraformPackage.VARIABLE: {
				Variable variable = (Variable)theEObject;
				T result = caseVariable(variable);
				if (result == null) result = caseDocumentedNamedElement(variable);
				if (result == null) result = caseNamedElement(variable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TerraformPackage.OUTPUT: {
				Output output = (Output)theEObject;
				T result = caseOutput(output);
				if (result == null) result = caseDocumentedNamedElement(output);
				if (result == null) result = caseNamedElement(output);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TerraformPackage.LOCAL: {
				Local local = (Local)theEObject;
				T result = caseLocal(local);
				if (result == null) result = caseNamedElement(local);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TerraformPackage.RESOURCE: {
				Resource resource = (Resource)theEObject;
				T result = caseResource(resource);
				if (result == null) result = caseDocumentedNamedElement(resource);
				if (result == null) result = caseNamedElement(resource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TerraformPackage.DATA_SOURCE: {
				DataSource dataSource = (DataSource)theEObject;
				T result = caseDataSource(dataSource);
				if (result == null) result = caseDocumentedNamedElement(dataSource);
				if (result == null) result = caseNamedElement(dataSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TerraformPackage.BACKEND: {
				Backend backend = (Backend)theEObject;
				T result = caseBackend(backend);
				if (result == null) result = caseNamedElement(backend);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TerraformPackage.MODULE_CALL: {
				ModuleCall moduleCall = (ModuleCall)theEObject;
				T result = caseModuleCall(moduleCall);
				if (result == null) result = caseDocumentedNamedElement(moduleCall);
				if (result == null) result = caseNamedElement(moduleCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TerraformPackage.MODULE: {
				org.nasdanika.models.terraform.Module module = (org.nasdanika.models.terraform.Module)theEObject;
				T result = caseModule(module);
				if (result == null) result = caseDocumentedNamedElement(module);
				if (result == null) result = caseNamedElement(module);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TerraformPackage.CONFIGURATION: {
				Configuration configuration = (Configuration)theEObject;
				T result = caseConfiguration(configuration);
				if (result == null) result = caseModule(configuration);
				if (result == null) result = caseDocumentedNamedElement(configuration);
				if (result == null) result = caseNamedElement(configuration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TerraformPackage.WORKSPACE: {
				Workspace workspace = (Workspace)theEObject;
				T result = caseWorkspace(workspace);
				if (result == null) result = caseDocumentedNamedElement(workspace);
				if (result == null) result = caseNamedElement(workspace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TerraformPackage.RESOURCE_INSTANCE: {
				ResourceInstance resourceInstance = (ResourceInstance)theEObject;
				T result = caseResourceInstance(resourceInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TerraformPackage.STATE_RESOURCE: {
				StateResource stateResource = (StateResource)theEObject;
				T result = caseStateResource(stateResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TerraformPackage.STATE_OUTPUT: {
				StateOutput stateOutput = (StateOutput)theEObject;
				T result = caseStateOutput(stateOutput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TerraformPackage.STATE: {
				State state = (State)theEObject;
				T result = caseState(state);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Documented Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Documented Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentedNamedElement(DocumentedNamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArgument(Argument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Validation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Validation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValidation(Validation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Precondition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Precondition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrecondition(Precondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postcondition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postcondition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostcondition(Postcondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lifecycle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lifecycle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLifecycle(Lifecycle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Provisioner</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Provisioner</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProvisioner(Provisioner object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Provider Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Provider Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProviderRequirement(ProviderRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProvider(Provider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariable(Variable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutput(Output object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Local</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Local</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocal(Local object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResource(Resource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataSource(DataSource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Backend</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Backend</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBackend(Backend object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModuleCall(ModuleCall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModule(org.nasdanika.models.terraform.Module object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfiguration(Configuration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Workspace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Workspace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkspace(Workspace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceInstance(ResourceInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStateResource(StateResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State Output</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State Output</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStateOutput(StateOutput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseState(State object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //TerraformSwitch
