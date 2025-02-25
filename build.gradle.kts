task<Delete>("clean") {
    delete(rootProject.buildFile)
}

plugins {
    alias(libs.plugins.compose.compiler) apply false
    alias(projects.plugins.ktlint)
}
