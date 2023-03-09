@file:Suppress("UnstableApiUsage")

plugins {
    id(Plugins.androidCompose)
    id(Plugins.daggerHilt)
}

dependencies {
    implementation(libs.bundles.androidx)

    testImplementation(libs.bundles.test)

    androidTestImplementation(libs.bundles.androidx.test)
}
