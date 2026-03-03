/**
 */
package org.nasdanika.models.terraform;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Provisioner Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Types of provisioners supported by Terraform. Provisioners are used to execute scripts on local or remote machines as part of resource creation or destruction.
 * <!-- end-model-doc -->
 * @see org.nasdanika.models.terraform.TerraformPackage#getProvisionerType()
 * @model
 * @generated
 */
public enum ProvisionerType implements Enumerator {
	/**
	 * The '<em><b>LOCAL EXEC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Executes a command locally on the machine running Terraform.
	 * <!-- end-model-doc -->
	 * @see #LOCAL_EXEC_VALUE
	 * @generated
	 * @ordered
	 */
	LOCAL_EXEC(0, "LOCAL_EXEC", "local-exec"),

	/**
	 * The '<em><b>REMOTE EXEC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Executes commands on the remote resource after it is created.
	 * <!-- end-model-doc -->
	 * @see #REMOTE_EXEC_VALUE
	 * @generated
	 * @ordered
	 */
	REMOTE_EXEC(1, "REMOTE_EXEC", "remote-exec"),

	/**
	 * The '<em><b>FILE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Copies files or directories from the machine running Terraform to a remote resource.
	 * <!-- end-model-doc -->
	 * @see #FILE_VALUE
	 * @generated
	 * @ordered
	 */
	FILE(2, "FILE", "file");

	/**
	 * The '<em><b>LOCAL EXEC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Executes a command locally on the machine running Terraform.
	 * <!-- end-model-doc -->
	 * @see #LOCAL_EXEC
	 * @model literal="local-exec"
	 * @generated
	 * @ordered
	 */
	public static final int LOCAL_EXEC_VALUE = 0;

	/**
	 * The '<em><b>REMOTE EXEC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Executes commands on the remote resource after it is created.
	 * <!-- end-model-doc -->
	 * @see #REMOTE_EXEC
	 * @model literal="remote-exec"
	 * @generated
	 * @ordered
	 */
	public static final int REMOTE_EXEC_VALUE = 1;

	/**
	 * The '<em><b>FILE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Copies files or directories from the machine running Terraform to a remote resource.
	 * <!-- end-model-doc -->
	 * @see #FILE
	 * @model literal="file"
	 * @generated
	 * @ordered
	 */
	public static final int FILE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Provisioner Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ProvisionerType[] VALUES_ARRAY =
		new ProvisionerType[] {
			LOCAL_EXEC,
			REMOTE_EXEC,
			FILE,
		};

	/**
	 * A public read-only list of all the '<em><b>Provisioner Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ProvisionerType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Provisioner Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProvisionerType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProvisionerType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Provisioner Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProvisionerType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProvisionerType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Provisioner Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProvisionerType get(int value) {
		switch (value) {
			case LOCAL_EXEC_VALUE: return LOCAL_EXEC;
			case REMOTE_EXEC_VALUE: return REMOTE_EXEC;
			case FILE_VALUE: return FILE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ProvisionerType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //ProvisionerType
