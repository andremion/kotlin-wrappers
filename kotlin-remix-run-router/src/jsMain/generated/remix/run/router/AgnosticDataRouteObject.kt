@file:JsModule("@remix-run/router")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NAME_CONTAINS_ILLEGAL_CHARS",
)

package remix.run.router


/**
 * A data route object, which is just a RouteObject with a required unique ID
 */
typealias AgnosticDataRouteObject = Any /* AgnosticDataIndexRouteObject | AgnosticDataNonIndexRouteObject */