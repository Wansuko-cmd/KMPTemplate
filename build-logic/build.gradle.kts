plugins {
    `kotlin-dsl`
    alias(libs.plugins.ktlint)
}

dependencies {
    implementation(libs.gradle.kotlin)
    implementation(libs.gradle.android)
    implementation(libs.gradle.roborazzi)
}

gradlePlugin {
    plugins {
        register("androidComposeApplication") {
            id = "com.template.compose.application"
            implementationClass = "plugins.AndroidComposeApplicationPlugin"
        }
        register("androidComposeLibrary") {
            id = "com.template.compose.library"
            implementationClass = "plugins.AndroidComposeLibraryPlugin"
        }
        register("composeMultiPlatform") {
            id = "com.template.compose.multiplatform"
            implementationClass = "plugins.ComposeMultiPlatformPlugin"
        }
        register("kotlinMultiPlatform") {
            id = "com.template.kotlin.multiplatform"
            implementationClass = "plugins.KotlinMultiPlatformPlugin"
        }
    }
}
