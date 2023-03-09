@file:Suppress("UnstableApiUsage")

plugins {
    id(Plugins.androidLibrary)
    id(Plugins.daggerHilt)
}

android {

    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.0"
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation(libs.bundles.androidx)

    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.bundles.androidx.compose)

    testImplementation(libs.bundles.test)
    testImplementation(libs.bundles.androidx.compose.test)

    androidTestImplementation(libs.bundles.androidx.test)
}
