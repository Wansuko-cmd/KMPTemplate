plugins {
    alias(buildLogic.plugins.compose.multiplatform)
}

kotlin {
    android {
        namespace = "com.template.shared.ui"
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(projects.shared.lib)

                implementation(libs.kotlin.coroutine)
                implementation(libs.kotlin.datetime)

                implementation(libs.bundles.compose)
            }
        }
    }
}
