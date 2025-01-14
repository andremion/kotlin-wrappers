// Automatically generated - do not modify!

package web.html

import web.dom.DOMTokenList
import web.dom.NodeListOf

abstract external class HTMLOutputElement :
    HTMLElement {
    var defaultValue: String
    val form: HTMLFormElement?
    val htmlFor: DOMTokenList
    val labels: NodeListOf<HTMLLabelElement>
    var name: String

    /** Returns the string "output". */
    val type: String
    val validationMessage: String
    val validity: ValidityState

    /**
     * Returns the element's current value.
     *
     * Can be set, to change the value.
     */
    var value: String
    val willValidate: Boolean
    fun checkValidity(): Boolean
    fun reportValidity(): Boolean
    fun setCustomValidity(error: String)
}
