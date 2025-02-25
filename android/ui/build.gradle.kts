plugins {
    alias(projects.plugins.android.compose.library)
    alias(libs.plugins.compose.compiler)
}

android {
    namespace = "com.template.android.ui"
}

dependencies {
    implementation(libs.bundles.androidx)

    testImplementation(libs.bundles.test)

    androidTestImplementation(libs.bundles.androidx.test)
}
