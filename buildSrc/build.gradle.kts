plugins {
    `kotlin-dsl`
}

dependencies {
    implementation(libs.gradle.kotlin)
    implementation(libs.gradle.android)
    implementation(libs.gradle.hilt)
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
        register("ktlint") {
            id = "com.template.ktlint"
            implementationClass = "plugins.KtlintPlugin"
        }
    }
}
