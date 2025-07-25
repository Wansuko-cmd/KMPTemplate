plugins {
    alias(libs.plugins.kotlin) apply false

    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.android.library) apply false
    alias(libs.plugins.compose.compiler) apply false
    alias(libs.plugins.roborazzi) apply false

    alias(libs.plugins.ktlint) apply false
}

tasks.register<Delete>(name = "clean") {
    delete(rootProject.layout.buildDirectory)
}
