package plugins

import com.android.build.api.dsl.ApplicationExtension
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.artifacts.VersionCatalogsExtension
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.getByType
import plugins.ext.configureCommonAndroidSetting
import plugins.ext.getBundle
import plugins.ext.getLibrary
import plugins.ext.implementation
import plugins.ext.libs
import plugins.ext.testImplementation

class AndroidComposeApplicationPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply("com.android.application")
                apply("org.jetbrains.kotlin.android")
            }

            extensions.configure<ApplicationExtension> {
                configureCommonAndroidSetting(this)
                buildFeatures {
                    compose = true
                }
            }

            dependencies {
                implementation(platform(libs.getLibrary("androidx.compose.bom")))
                implementation(libs.getBundle("androidx.compose"))
                testImplementation(libs.getBundle("androidx.compose.test"))
            }
        }
    }
}
