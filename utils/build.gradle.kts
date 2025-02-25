plugins {
    alias(projects.plugins.kotlin.multiplatform)
}

android {
    namespace = "com.template.utils"
}

kotlin {
    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(libs.kotlin.datetime)
            }
        }
    }
}
