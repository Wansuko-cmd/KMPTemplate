plugins {
    id(Plugins.androidComposeLibrary)
}

android {
    namespace = "com.template.android.ui"
}

dependencies {
    implementation(libs.bundles.androidx)

    testImplementation(libs.bundles.test)

    androidTestImplementation(libs.bundles.androidx.test)
}
