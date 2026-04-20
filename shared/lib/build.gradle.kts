plugins {
    alias(buildLogic.plugins.kotlin.multiplatform)
}

kotlin {
    android {
        namespace = "com.template.shared.lib"
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(libs.kotlin.coroutine)
                implementation(libs.kotlin.datetime)
            }
        }
    }
}
