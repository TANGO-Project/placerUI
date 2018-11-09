/**
 */
package placer;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Max Make Span</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link placer.MaxMakeSpan#getMaxMakeSpan <em>Max Make Span</em>}</li>
 * </ul>
 *
 * @see placer.PlacerPackage#getMaxMakeSpan()
 * @model
 * @generated
 */
public interface MaxMakeSpan extends EObject {
	/**
	 * Returns the value of the '<em><b>Max Make Span</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Make Span</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Make Span</em>' attribute.
	 * @see #setMaxMakeSpan(int)
	 * @see placer.PlacerPackage#getMaxMakeSpan_MaxMakeSpan()
	 * @model required="true"
	 * @generated
	 */
	int getMaxMakeSpan();

	/**
	 * Sets the value of the '{@link placer.MaxMakeSpan#getMaxMakeSpan <em>Max Make Span</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Make Span</em>' attribute.
	 * @see #getMaxMakeSpan()
	 * @generated
	 */
	void setMaxMakeSpan(int value);

} // MaxMakeSpan
