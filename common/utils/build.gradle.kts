plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
    id("com.google.dagger.hilt.android")
}

android {
    namespace = "com.finder.common.utils"
    compileSdk = 34

    defaultConfig {
        minSdk = 24

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {

    implementation(Deps.core)
    implementation(Deps.appCompat)
    implementation(Deps.androidMaterial)
    testImplementation(TestImplementation.junit)
    androidTestImplementation(AndroidTestImplementation.junit)
    androidTestImplementation(AndroidTestImplementation.espresso)

    // Dagger
    implementation(Libraries.Dagger.dagger)
    kapt(Libraries.Dagger.daggerCompiler)

    // Hilt
    implementation(Libraries.Hilt.hiltAndroid)
    kapt(Libraries.Hilt.hiltCompiler)
    androidTestImplementation(Libraries.Hilt.hiltTesting)

    // Jetpack Navigation
    implementation(Libraries.JetpackNavigation.navigationFragmentKtx)
    implementation(Libraries.JetpackNavigation.navigationUiKtx)
    implementation(Libraries.JetpackNavigation.navigationDynamicFeaturesFragment)

}