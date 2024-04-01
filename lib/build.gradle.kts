plugins {
    id(Plugins.kotlinMultiPlatform)
}

android {
    namespace = "com.template.lib"
}

kotlin {
    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(project(":utils"))

                implementation(libs.kotlin.coroutine)
                implementation(libs.kotlin.datetime)
            }
        }
    }
}
