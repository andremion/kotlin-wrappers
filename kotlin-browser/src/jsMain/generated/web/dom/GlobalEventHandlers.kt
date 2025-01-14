// Automatically generated - do not modify!

package web.dom

import web.animations.AnimationEvent
import web.clipboard.ClipboardEvent
import web.csp.SecurityPolicyViolationEvent
import web.cssom.TransitionEvent
import web.events.Event
import web.events.EventHandler
import web.events.ProgressEvent
import web.html.FormDataEvent
import web.html.SubmitEvent
import web.uievents.*

external interface GlobalEventHandlers {
    /**
     * Fires when the user aborts the download.
     * @param ev The event.
     */
    var onabort: EventHandler<UIEvent>?
        get() = definedExternally
        set(value) = definedExternally

    var onanimationcancel: EventHandler<AnimationEvent>?
        get() = definedExternally
        set(value) = definedExternally

    var onanimationend: EventHandler<AnimationEvent>?
        get() = definedExternally
        set(value) = definedExternally

    var onanimationiteration: EventHandler<AnimationEvent>?
        get() = definedExternally
        set(value) = definedExternally

    var onanimationstart: EventHandler<AnimationEvent>?
        get() = definedExternally
        set(value) = definedExternally

    var onauxclick: EventHandler<MouseEvent>?
        get() = definedExternally
        set(value) = definedExternally

    var onbeforeinput: EventHandler<InputEvent>?
        get() = definedExternally
        set(value) = definedExternally


    /**
     * Fires when the object loses the input focus.
     * @param ev The focus event.
     */
    var onblur: EventHandler<FocusEvent>?
        get() = definedExternally
        set(value) = definedExternally

    var oncancel: EventHandler<Event>?
        get() = definedExternally
        set(value) = definedExternally


    /**
     * Occurs when playback is possible, but would require further buffering.
     * @param ev The event.
     */
    var oncanplay: EventHandler<Event>?
        get() = definedExternally
        set(value) = definedExternally

    var oncanplaythrough: EventHandler<Event>?
        get() = definedExternally
        set(value) = definedExternally


    /**
     * Fires when the contents of the object or selection have changed.
     * @param ev The event.
     */
    var onchange: EventHandler<Event>?
        get() = definedExternally
        set(value) = definedExternally


    /**
     * Fires when the user clicks the left mouse button on the object
     * @param ev The mouse event.
     */
    var onclick: EventHandler<MouseEvent>?
        get() = definedExternally
        set(value) = definedExternally

    var onclose: EventHandler<Event>?
        get() = definedExternally
        set(value) = definedExternally


    /**
     * Fires when the user clicks the right mouse button in the client area, opening the context menu.
     * @param ev The mouse event.
     */
    var oncontextmenu: EventHandler<MouseEvent>?
        get() = definedExternally
        set(value) = definedExternally

    var oncopy: EventHandler<ClipboardEvent>?
        get() = definedExternally
        set(value) = definedExternally

    var oncuechange: EventHandler<Event>?
        get() = definedExternally
        set(value) = definedExternally

    var oncut: EventHandler<ClipboardEvent>?
        get() = definedExternally
        set(value) = definedExternally


    /**
     * Fires when the user double-clicks the object.
     * @param ev The mouse event.
     */
    var ondblclick: EventHandler<MouseEvent>?
        get() = definedExternally
        set(value) = definedExternally


    /**
     * Fires on the source object continuously during a drag operation.
     * @param ev The event.
     */
    var ondrag: EventHandler<DragEvent>?
        get() = definedExternally
        set(value) = definedExternally


    /**
     * Fires on the source object when the user releases the mouse at the close of a drag operation.
     * @param ev The event.
     */
    var ondragend: EventHandler<DragEvent>?
        get() = definedExternally
        set(value) = definedExternally


    /**
     * Fires on the target element when the user drags the object to a valid drop target.
     * @param ev The drag event.
     */
    var ondragenter: EventHandler<DragEvent>?
        get() = definedExternally
        set(value) = definedExternally


    /**
     * Fires on the target object when the user moves the mouse out of a valid drop target during a drag operation.
     * @param ev The drag event.
     */
    var ondragleave: EventHandler<DragEvent>?
        get() = definedExternally
        set(value) = definedExternally


    /**
     * Fires on the target element continuously while the user drags the object over a valid drop target.
     * @param ev The event.
     */
    var ondragover: EventHandler<DragEvent>?
        get() = definedExternally
        set(value) = definedExternally


    /**
     * Fires on the source object when the user starts to drag a text selection or selected object.
     * @param ev The event.
     */
    var ondragstart: EventHandler<DragEvent>?
        get() = definedExternally
        set(value) = definedExternally

    var ondrop: EventHandler<DragEvent>?
        get() = definedExternally
        set(value) = definedExternally


    /**
     * Occurs when the duration attribute is updated.
     * @param ev The event.
     */
    var ondurationchange: EventHandler<Event>?
        get() = definedExternally
        set(value) = definedExternally


    /**
     * Occurs when the media element is reset to its initial state.
     * @param ev The event.
     */
    var onemptied: EventHandler<Event>?
        get() = definedExternally
        set(value) = definedExternally


    /**
     * Occurs when the end of playback is reached.
     * @param ev The event
     */
    var onended: EventHandler<Event>?
        get() = definedExternally
        set(value) = definedExternally


    /**
     * Fires when an error occurs during object loading.
     * @param ev The event.
     */
    var onerror: Function<Unit>? /* OnErrorEventHandler */
        get() = definedExternally
        set(value) = definedExternally

    /**
     * Fires when the object receives focus.
     * @param ev The event.
     */
    var onfocus: EventHandler<FocusEvent>?
        get() = definedExternally
        set(value) = definedExternally

    var onformdata: EventHandler<FormDataEvent>?
        get() = definedExternally
        set(value) = definedExternally

    var ongotpointercapture: EventHandler<PointerEvent>?
        get() = definedExternally
        set(value) = definedExternally

    var oninput: EventHandler<Event>?
        get() = definedExternally
        set(value) = definedExternally

    var oninvalid: EventHandler<Event>?
        get() = definedExternally
        set(value) = definedExternally


    /**
     * Fires when the user presses a key.
     * @param ev The keyboard event
     */
    var onkeydown: EventHandler<KeyboardEvent>?
        get() = definedExternally
        set(value) = definedExternally


    /**
     * Fires when the user releases a key.
     * @param ev The keyboard event
     */
    var onkeyup: EventHandler<KeyboardEvent>?
        get() = definedExternally
        set(value) = definedExternally


    /**
     * Fires immediately after the browser loads the object.
     * @param ev The event.
     */
    var onload: EventHandler<Event>?
        get() = definedExternally
        set(value) = definedExternally


    /**
     * Occurs when media data is loaded at the current playback position.
     * @param ev The event.
     */
    var onloadeddata: EventHandler<Event>?
        get() = definedExternally
        set(value) = definedExternally


    /**
     * Occurs when the duration and dimensions of the media have been determined.
     * @param ev The event.
     */
    var onloadedmetadata: EventHandler<Event>?
        get() = definedExternally
        set(value) = definedExternally


    /**
     * Occurs when Internet Explorer begins looking for media data.
     * @param ev The event.
     */
    var onloadstart: EventHandler<Event>?
        get() = definedExternally
        set(value) = definedExternally

    var onlostpointercapture: EventHandler<PointerEvent>?
        get() = definedExternally
        set(value) = definedExternally


    /**
     * Fires when the user clicks the object with either mouse button.
     * @param ev The mouse event.
     */
    var onmousedown: EventHandler<MouseEvent>?
        get() = definedExternally
        set(value) = definedExternally

    var onmouseenter: EventHandler<MouseEvent>?
        get() = definedExternally
        set(value) = definedExternally

    var onmouseleave: EventHandler<MouseEvent>?
        get() = definedExternally
        set(value) = definedExternally


    /**
     * Fires when the user moves the mouse over the object.
     * @param ev The mouse event.
     */
    var onmousemove: EventHandler<MouseEvent>?
        get() = definedExternally
        set(value) = definedExternally


    /**
     * Fires when the user moves the mouse pointer outside the boundaries of the object.
     * @param ev The mouse event.
     */
    var onmouseout: EventHandler<MouseEvent>?
        get() = definedExternally
        set(value) = definedExternally


    /**
     * Fires when the user moves the mouse pointer into the object.
     * @param ev The mouse event.
     */
    var onmouseover: EventHandler<MouseEvent>?
        get() = definedExternally
        set(value) = definedExternally


    /**
     * Fires when the user releases a mouse button while the mouse is over the object.
     * @param ev The mouse event.
     */
    var onmouseup: EventHandler<MouseEvent>?
        get() = definedExternally
        set(value) = definedExternally

    var onpaste: EventHandler<ClipboardEvent>?
        get() = definedExternally
        set(value) = definedExternally


    /**
     * Occurs when playback is paused.
     * @param ev The event.
     */
    var onpause: EventHandler<Event>?
        get() = definedExternally
        set(value) = definedExternally


    /**
     * Occurs when the play method is requested.
     * @param ev The event.
     */
    var onplay: EventHandler<Event>?
        get() = definedExternally
        set(value) = definedExternally


    /**
     * Occurs when the audio or video has started playing.
     * @param ev The event.
     */
    var onplaying: EventHandler<Event>?
        get() = definedExternally
        set(value) = definedExternally

    var onpointercancel: EventHandler<PointerEvent>?
        get() = definedExternally
        set(value) = definedExternally

    var onpointerdown: EventHandler<PointerEvent>?
        get() = definedExternally
        set(value) = definedExternally

    var onpointerenter: EventHandler<PointerEvent>?
        get() = definedExternally
        set(value) = definedExternally

    var onpointerleave: EventHandler<PointerEvent>?
        get() = definedExternally
        set(value) = definedExternally

    var onpointermove: EventHandler<PointerEvent>?
        get() = definedExternally
        set(value) = definedExternally

    var onpointerout: EventHandler<PointerEvent>?
        get() = definedExternally
        set(value) = definedExternally

    var onpointerover: EventHandler<PointerEvent>?
        get() = definedExternally
        set(value) = definedExternally

    var onpointerup: EventHandler<PointerEvent>?
        get() = definedExternally
        set(value) = definedExternally


    /**
     * Occurs to indicate progress while downloading media data.
     * @param ev The event.
     */
    var onprogress: EventHandler<ProgressEvent<*>>?
        get() = definedExternally
        set(value) = definedExternally


    /**
     * Occurs when the playback rate is increased or decreased.
     * @param ev The event.
     */
    var onratechange: EventHandler<Event>?
        get() = definedExternally
        set(value) = definedExternally


    /**
     * Fires when the user resets a form.
     * @param ev The event.
     */
    var onreset: EventHandler<Event>?
        get() = definedExternally
        set(value) = definedExternally

    var onresize: EventHandler<UIEvent>?
        get() = definedExternally
        set(value) = definedExternally


    /**
     * Fires when the user repositions the scroll box in the scroll bar on the object.
     * @param ev The event.
     */
    var onscroll: EventHandler<Event>?
        get() = definedExternally
        set(value) = definedExternally

    var onsecuritypolicyviolation: EventHandler<SecurityPolicyViolationEvent>?
        get() = definedExternally
        set(value) = definedExternally


    /**
     * Occurs when the seek operation ends.
     * @param ev The event.
     */
    var onseeked: EventHandler<Event>?
        get() = definedExternally
        set(value) = definedExternally


    /**
     * Occurs when the current playback position is moved.
     * @param ev The event.
     */
    var onseeking: EventHandler<Event>?
        get() = definedExternally
        set(value) = definedExternally


    /**
     * Fires when the current selection changes.
     * @param ev The event.
     */
    var onselect: EventHandler<Event>?
        get() = definedExternally
        set(value) = definedExternally

    var onselectionchange: EventHandler<Event>?
        get() = definedExternally
        set(value) = definedExternally

    var onselectstart: EventHandler<Event>?
        get() = definedExternally
        set(value) = definedExternally

    var onslotchange: EventHandler<Event>?
        get() = definedExternally
        set(value) = definedExternally


    /**
     * Occurs when the download has stopped.
     * @param ev The event.
     */
    var onstalled: EventHandler<Event>?
        get() = definedExternally
        set(value) = definedExternally

    var onsubmit: EventHandler<SubmitEvent>?
        get() = definedExternally
        set(value) = definedExternally


    /**
     * Occurs if the load operation has been intentionally halted.
     * @param ev The event.
     */
    var onsuspend: EventHandler<Event>?
        get() = definedExternally
        set(value) = definedExternally


    /**
     * Occurs to indicate the current playback position.
     * @param ev The event.
     */
    var ontimeupdate: EventHandler<Event>?
        get() = definedExternally
        set(value) = definedExternally

    var ontoggle: EventHandler<Event>?
        get() = definedExternally
        set(value) = definedExternally

    var ontouchcancel: EventHandler<TouchEvent>?
        get() = definedExternally
        set(value) = definedExternally

    var ontouchend: EventHandler<TouchEvent>?
        get() = definedExternally
        set(value) = definedExternally

    var ontouchmove: EventHandler<TouchEvent>?
        get() = definedExternally
        set(value) = definedExternally

    var ontouchstart: EventHandler<TouchEvent>?
        get() = definedExternally
        set(value) = definedExternally

    var ontransitioncancel: EventHandler<TransitionEvent>?
        get() = definedExternally
        set(value) = definedExternally

    var ontransitionend: EventHandler<TransitionEvent>?
        get() = definedExternally
        set(value) = definedExternally

    var ontransitionrun: EventHandler<TransitionEvent>?
        get() = definedExternally
        set(value) = definedExternally

    var ontransitionstart: EventHandler<TransitionEvent>?
        get() = definedExternally
        set(value) = definedExternally


    /**
     * Occurs when the volume is changed, or playback is muted or unmuted.
     * @param ev The event.
     */
    var onvolumechange: EventHandler<Event>?
        get() = definedExternally
        set(value) = definedExternally


    /**
     * Occurs when playback stops because the next frame of a video resource is not available.
     * @param ev The event.
     */
    var onwaiting: EventHandler<Event>?
        get() = definedExternally
        set(value) = definedExternally

    var onwheel: EventHandler<WheelEvent>?
        get() = definedExternally
        set(value) = definedExternally

}
