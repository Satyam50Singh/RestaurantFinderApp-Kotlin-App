plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
    id("com.google.dagger.hilt.android")
}

android {
    namespace = "com.finder.location.data"
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

    // Retrofit with Gson converter
    implementation(Libraries.Retrofit.retrofit)
    implementation(Libraries.Retrofit.gsonConverter)
    implementation(Libraries.Retrofit.okhttp)
    implementation(Libraries.Retrofit.loggingInterceptor)

    // Hilt
    implementation(Libraries.Hilt.hiltAndroid)
    kapt(Libraries.Hilt.hiltAndroidCompiler)
    kapt(Libraries.Hilt.hiltCompiler)

    // Google Maps
    implementation(Libraries.GoogleMaps.maps)
    implementation(Libraries.GoogleMaps.location)
    implementation(Libraries.GoogleMaps.places)
    implementation(Libraries.GoogleMaps.mapsUtils)

}