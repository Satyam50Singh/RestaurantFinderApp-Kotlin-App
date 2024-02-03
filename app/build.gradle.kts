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

    // Include other modules
    implementation(project(":common:utils"))
    implementation(project(":location:data"))
    implementation(project(":location:domain"))
    implementation(project(":location:presentation"))
    implementation(project(":dashboard:data"))
    implementation(project(":dashboard:presentation"))

    implementation(Deps.core) //
    implementation(Deps.appCompat) //
    implementation(Deps.androidMaterial) //
    implementation(Libraries.CoroutineLifecycleScope.lifecycleRuntime)
    implementation(Libraries.CoroutineLifecycleScope.lifecycleViewModel)
    implementation(Deps.activityCompose) //
    implementation(platform(Deps.composeBom)) //
    implementation(Deps.ui) //
    implementation(Deps.uiGraphics)
    implementation(Deps.uiToolingPreview)
    implementation(Deps.material3)
    implementation(Deps.navigationCompose)
    testImplementation(TestImplementation.junit) //
    androidTestImplementation(AndroidTestImplementation.junit) //
    androidTestImplementation(AndroidTestImplementation.espresso) //
    androidTestImplementation(platform(Deps.composeBom))
    debugImplementation(DebugImplementation.uiTestManifest)
    debugImplementation(DebugImplementation.uiTooling) //

    // Retrofit with Gson converter
//    implementation(Libraries.Retrofit.retrofit)
//    implementation(Libraries.Retrofit.gsonConverter)
//    implementation(platform(Libraries.Retrofit.okhttpBom))
//    implementation(Libraries.Retrofit.okhttp)

    // Coroutines
    implementation(Libraries.Coroutines.core)
    implementation(Libraries.Coroutines.android)

    // Glide
    implementation(Libraries.Glide.glide)
    kapt(Libraries.Glide.glideCompilerAnnotationProcessor)

    // Hilt
    implementation(Libraries.Hilt.hiltAndroid)
    kapt(Libraries.Hilt.hiltAndroidCompiler)
    kapt(Libraries.Hilt.hiltCompiler)

    // Google Maps
    implementation(Libraries.GoogleMaps.maps)
    implementation(Libraries.GoogleMaps.location)
    implementation(Libraries.GoogleMaps.places)
    implementation(Libraries.GoogleMaps.mapsUtils)

    // Mockito
    testImplementation(Libraries.Mockito.mockitoCore)
    androidTestImplementation(Libraries.Mockito.mockitoAndroid)

    // Room Database
    kapt(Libraries.RoomDatabase.roomCompiler)
    implementation(Libraries.RoomDatabase.roomKtx)

    // MVVM Libraries
    implementation(Libraries.MVVMLibs.lifecycleExtensions)
    implementation(Libraries.MVVMLibs.lifecycleLiveDataKtx)
    implementation(Libraries.MVVMLibs.kotlinStdlib)
    kapt(Libraries.MVVMLibs.lifecycleCompiler)

    // Jetpack Navigation
    implementation(Libraries.JetpackNavigation.navigationFragmentKtx)
    implementation(Libraries.JetpackNavigation.navigationUiKtx)
    implementation(Libraries.JetpackNavigation.navigationDynamicFeaturesFragment)
}