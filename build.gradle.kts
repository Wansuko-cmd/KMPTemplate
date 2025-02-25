task<Delete>("clean") {
    delete(rootProject.buildFile)
}

plugins {
    alias(libs.plugins.compose.compiler) apply false
}

buildscript {
    dependencies {
        classpath(libs.gradle.kotlin)
        classpath(libs.gradle.android)
    }
}
