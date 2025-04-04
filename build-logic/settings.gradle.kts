@file:Suppress("UnstableApiUsage")

dependencyResolutionManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
    versionCatalogs {
        create("libs") {
            from(files("../gradle/libs.versions.toml"))
        }
        create("projects") {
            from(files("../gradle/projects.versions.toml"))
        }
    }
}

rootProject.name = "build-logic"
