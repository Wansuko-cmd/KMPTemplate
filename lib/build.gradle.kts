plugins {
    alias(buildLogic.plugins.kotlin.multiplatform)
}

android {
    namespace = "com.template.lib"
}

kotlin {
    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(projects.utils)

                implementation(libs.kotlin.coroutine)
                implementation(libs.kotlin.datetime)
            }
        }
    }
}
