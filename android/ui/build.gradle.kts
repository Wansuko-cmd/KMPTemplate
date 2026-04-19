import com.android.build.api.dsl.LibraryExtension

plugins {
    alias(buildLogic.plugins.android.compose.library)
    alias(libs.plugins.compose.compiler)
}

configure<LibraryExtension> {
    namespace = "com.template.android.ui"
}

dependencies {
    implementation(libs.bundles.androidx)
}
