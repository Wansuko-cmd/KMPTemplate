package plugins

import com.android.build.gradle.LibraryExtension
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.artifacts.VersionCatalogsExtension
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.getByType
import plugins.ext.configureCommonAndroidSetting
import plugins.ext.implementation
import plugins.ext.testImplementation

class AndroidComposeLibraryPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply("com.android.library")
                apply("org.jetbrains.kotlin.android")
            }

            val libs = extensions.getByType<VersionCatalogsExtension>().named("libs")
            extensions.configure<LibraryExtension> {
                configureCommonAndroidSetting(this)

                buildFeatures {
                    compose = true
                }
            }

            dependencies {
                implementation(platform(libs.findLibrary("androidx.compose.bom").get()))
                implementation(libs.findBundle("androidx.compose").get())
                testImplementation(libs.findBundle("androidx.compose.test").get())
            }
        }
    }
}
