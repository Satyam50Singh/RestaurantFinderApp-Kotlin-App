plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
    id("com.google.dagger.hilt.android")
}

android {
    namespace = "com.finder.restaurantfinderapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.finder.restaurantfinderapp"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
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
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    implementation(Deps.core)
    implementation(Deps.lifecycleRuntime)
    implementation(Deps.activityCompose)
    implementation(platform(Deps.composeBom))
    implementation(Deps.ui)
    implementation(Deps.uiGraphics)
    implementation(Deps.uiToolingPreview)
    implementation(Deps.material3)
    testImplementation(TestImplementation.junit)
    androidTestImplementation(AndroidTestImplementation.junit)
    androidTestImplementation(AndroidTestImplementation.espresso)
    androidTestImplementation(platform(Deps.composeBom))
    androidTestImplementation(AndroidTestImplementation.uiTestJunit4)
    debugImplementation(DebugImplementation.uiTestManifest)
    debugImplementation(DebugImplementation.uiTooling)

    // Retrofit with Gson converter
    implementation(Libraries.Retrofit.retrofit)
    implementation(Libraries.Retrofit.gsonConverter)
    implementation(Libraries.Retrofit.okhttp)
    implementation(Libraries.Retrofit.loggingInterceptor)

    // Coroutines
    implementation(Libraries.Coroutines.core)
    implementation(Libraries.Coroutines.android)

    // Glide
    implementation(Libraries.Glide.glide)
    kapt(Libraries.Glide.glideCompiler)

    // ViewModel
    implementation(Libraries.ViewModel.viewModel)

    // Dagger
    implementation(Libraries.Dagger.dagger)
    kapt(Libraries.Dagger.daggerCompiler)

    // Hilt
    implementation(Libraries.Hilt.hiltAndroid)
    kapt(Libraries.Hilt.hiltCompiler)
    androidTestImplementation(Libraries.Hilt.hiltTesting)

    // Google Maps
    implementation(Libraries.GoogleMaps.maps)
    implementation(Libraries.GoogleMaps.location)
    implementation(Libraries.GoogleMaps.places)
    implementation(Libraries.GoogleMaps.mapsUtils)

    // Mockito
    testImplementation(Libraries.Mockito.mockitoCore)
    androidTestImplementation(Libraries.Mockito.mockitoAndroid)

    // Room Database
    implementation(Libraries.RoomDatabase.room)
    kapt(Libraries.RoomDatabase.roomCompiler)
    implementation(Libraries.RoomDatabase.roomKtx)

    // MVVM Libraries
    implementation(Libraries.MVVMLibs.lifecycleExtensions)
    implementation(Libraries.MVVMLibs.lifecycleViewModelKtx)
    implementation(Libraries.MVVMLibs.lifecycleLiveDataKtx)
    implementation(Libraries.MVVMLibs.lifecycleRuntimeKtx)
    implementation(Libraries.MVVMLibs.kotlinStdlib)
}