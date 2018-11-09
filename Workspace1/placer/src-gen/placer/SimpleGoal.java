/**
 */
package placer;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Simple Goal</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see placer.PlacerPackage#getSimpleGoal()
 * @model instanceClass="placer.SimpleGoal"
 * @generated
 */
public enum SimpleGoal implements Enumerator {
	/**
	 * The '<em><b>Min Makespan</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIN_MAKESPAN_VALUE
	 * @generated
	 * @ordered
	 */
	MIN_MAKESPAN(0, "minMakespan", "minMakespan"),
	/**
	 * The '<em><b>Min Energy</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #MIN_ENERGY_VALUE
	 * @generated
	 * @ordered
	 */
	MIN_ENERGY(1, "minEnergy", "minEnergy"),

	/**
	 * The '<em><b>Min Frame</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIN_FRAME_VALUE
	 * @generated
	 * @ordered
	 */
	MIN_FRAME(2, "minFrame", "minFrame");

	/**
	 * The '<em><b>Min Makespan</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Min Makespan</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MIN_MAKESPAN
	 * @model name="minMakespan"
	 * @generated
	 * @ordered
	 */
	public static final int MIN_MAKESPAN_VALUE = 0;

	/**
	 * The '<em><b>Min Energy</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Min Energy</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MIN_ENERGY
	 * @model name="minEnergy"
	 * @generated
	 * @ordered
	 */
	public static final int MIN_ENERGY_VALUE = 1;

	/**
	 * The '<em><b>Min Frame</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Min Frame</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MIN_FRAME
	 * @model name="minFrame"
	 * @generated
	 * @ordered
	 */
	public static final int MIN_FRAME_VALUE = 2;

	/**
	 * An array of all the '<em><b>Simple Goal</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SimpleGoal[] VALUES_ARRAY = new SimpleGoal[] { MIN_MAKESPAN, MIN_ENERGY, MIN_FRAME, };

	/**
	 * A public read-only list of all the '<em><b>Simple Goal</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SimpleGoal> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Simple Goal</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SimpleGoal get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SimpleGoal result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Simple Goal</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SimpleGoal getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SimpleGoal result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Simple Goal</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SimpleGoal get(int value) {
		switch (value) {
		case MIN_MAKESPAN_VALUE:
			return MIN_MAKESPAN;
		case MIN_ENERGY_VALUE:
			return MIN_ENERGY;
		case MIN_FRAME_VALUE:
			return MIN_FRAME;
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
	private SimpleGoal(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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

} //SimpleGoal
