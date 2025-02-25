task<Delete>("clean") {
    delete(rootProject.buildFile)
}

plugins {
    alias(libs.plugins.compose.compiler) apply false
}

subprojects {
    apply(plugin = Plugins.ktlint)
}
