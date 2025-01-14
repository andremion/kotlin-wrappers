const ts = require("typescript");
const karakum = require("karakum");

module.exports = function (node, context) {
    if (
        ts.isTypeAliasDeclaration(node)
        && node.name.text === "RouteProps"
    ) {
        const typeScriptService = context.lookupService(karakum.typeScriptServiceKey)
        const inheritanceModifierService = context.lookupService(karakum.inheritanceModifierServiceKey)

        const inheritanceModifier = inheritanceModifierService?.resolveInheritanceModifier(node, context)

        return `${karakum.ifPresent(inheritanceModifier, it => `${it} `)}external interface RouteProps : react.Props /* ${typeScriptService?.printNode(node)} */`
    }
    return null
}
