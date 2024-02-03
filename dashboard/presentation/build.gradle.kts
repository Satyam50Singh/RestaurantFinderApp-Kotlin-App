plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
    id("com.google.dagger.hilt.android")
}

android {
    namespace = "com.finder.dashboard.presentation"
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
    implementation(Deps.appCompat)
    implementation(Deps.androidMaterial)
    testImplementation(TestImplementation.junit)
    androidTestImplementation(AndroidTestImplementation.junit)
    androidTestImplementation(AndroidTestImplementation.espresso)

    // Jetpack Compose
    implementation(platform(Deps.composeBom))
    implementation(Deps.ui)
    implementation(Deps.uiGraphics)
    implementation(Deps.uiToolingPreview)
    implementation(Deps.material3)
    androidTestImplementation(platform(Deps.composeBom))
    androidTestImplementation(AndroidTestImplementation.uiTestJunit4)
    debugImplementation(DebugImplementation.uiTestManifest)
    debugImplementation(DebugImplementation.uiTooling)

    // Jetpack Compose Navigation
    implementation(Libraries.JetpackNavigation.navigationUiKtx)
    implementation(Deps.navigationCompose)

    // Hilt
    implementation(Libraries.Hilt.hiltAndroid)
    kapt(Libraries.Hilt.hiltAndroidCompiler)
    kapt(Libraries.Hilt.hiltCompiler)
}