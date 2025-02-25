plugins {
    `kotlin-dsl`
}

dependencies {
    implementation(libs.gradle.kotlin)
    implementation(libs.gradle.android)
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
        register("kotlinMultiPlatform") {
            id = "com.template.multiplatform"
            implementationClass = "plugins.KotlinMultiPlatformPlugin"
        }
    }
}
