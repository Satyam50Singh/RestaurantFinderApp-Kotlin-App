object Version {
    const val core = "1.12.0"
    const val junit = "4.13.2"
    const val appCompat = "1.6.1"
    const val androidMaterial = "1.11.0"
    const val androidTestImplementationJunit = "1.1.5"
    const val espresso = "3.5.1"
    const val composeBom = "2023.08.00"
    const val navigationCompose = "2.6.0-alpha05" //
}

object Deps {
    const val core = "androidx.core:core-ktx:${Version.core}" //
    const val activityCompose = "androidx.activity:activity-compose:1.8.2"
    const val composeBom = "androidx.compose:compose-bom:${Version.composeBom}"
    const val ui = "androidx.compose.ui:ui"
    const val uiGraphics = "androidx.compose.ui:ui-graphics"
    const val uiToolingPreview = "androidx.compose.ui:ui-tooling-preview"
    const val material3 = "androidx.compose.material3:material3"
    const val androidMaterial = "com.google.android.material:material:${Version.androidMaterial}" //
    const val appCompat = "androidx.appcompat:appcompat:${Version.appCompat}" //
    const val navigationCompose =
        "androidx.navigation:navigation-compose:${Version.navigationCompose}" //

}

object TestImplementation {
    const val junit = "junit:junit:${Version.junit}" //
}

object AndroidTestImplementation {
    const val junit = "androidx.test.ext:junit:${Version.androidTestImplementationJunit}" //
    const val espresso = "androidx.test.espresso:espresso-core:${Version.espresso}" //
}

object DebugImplementation {
    const val uiTestManifest = "androidx.compose.ui:ui-test-manifest"
    const val uiTooling = "androidx.compose.ui:ui-tooling"
}

object Libraries {
    object LibVersions {
        const val retrofit = "2.9.0"
        const val gson = "2.9.0"
        const val okhttpBom = "4.12.0"
        const val coroutines = "1.7.3"
        const val glide = "4.16.0"
        const val hilt = "2.44"
        const val googleMaps = "18.1.0"
        const val location = "21.0.1"
        const val places = "3.1.0"
        const val mapsUtils = "2.2.0"
        const val mockito = "4.2.0"
        const val mockitoKotlin = "2.0.0"
        const val mockitoInline = "2.25.0"
        const val room = "2.6.1"
        const val lifecycle = "2.2.0"
        const val kotlin = "1.9.0"
        const val navigation = "2.7.6"
        const val swipeRefresh = "1.1.0"
        const val lottieAnimations = "3.4.2"
    }

    object Retrofit {
        const val retrofit = "com.squareup.retrofit2:retrofit:${LibVersions.retrofit}" //
        const val gsonConverter = "com.squareup.retrofit2:converter-gson:${LibVersions.gson}" //
        const val okhttpBom = "com.squareup.okhttp3:okhttp-bom:${LibVersions.okhttpBom}" //
        const val okhttp = "com.squareup.okhttp3:okhttp"
    }

    object Coroutines {
        const val core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${LibVersions.coroutines}"
        const val android =
            "org.jetbrains.kotlinx:kotlinx-coroutines-android:${LibVersions.coroutines}"
    }

    object CoroutineLifecycleScope {
        const val lifecycleRuntime = "androidx.lifecycle:lifecycle-runtime-ktx:2.7.0" //
        const val lifecycleViewModel ="androidx.lifecycle:lifecycle-viewmodel-ktx:2.7.0" //
    }
    object Glide {
        const val glide = "com.github.bumptech.glide:glide:${LibVersions.glide}" //
        const val glideCompilerAnnotationProcessor = "com.github.bumptech.glide:compiler:${LibVersions.glide}" //
    }

    object Hilt {
        const val hiltAndroid = "com.google.dagger:hilt-android:${LibVersions.hilt}" //
        const val hiltAndroidCompiler = "com.google.dagger:hilt-android-compiler:${LibVersions.hilt}" //
        const val hiltCompiler = "com.google.dagger:hilt-compiler:${LibVersions.hilt}" //

        // For instrumented tests.
        const val daggerHiltAndroidTestImpl = "com.google.dagger:hilt-android-testing:${LibVersions.hilt}"
        const val daggerHiltAndroidTestKapt = "com.google.dagger:hilt-android-compiler:${LibVersions.hilt}"
    }

    object GoogleMaps {
        const val maps = "com.google.android.gms:play-services-maps:${LibVersions.googleMaps}"
        const val location =
            "com.google.android.gms:play-services-location:${LibVersions.location}"
        const val places = "com.google.android.libraries.places:places:${LibVersions.places}"
        const val mapsUtils = "com.google.maps.android:maps-utils-ktx:${LibVersions.mapsUtils}"
    }

    object Mockito {
        const val mockitoCore = "org.mockito:mockito-core:${LibVersions.mockito}"
        const val mockitoAndroid = "org.mockito:mockito-android:${LibVersions.mockito}"
        const val mockitoKotlin = "com.nhaarman.mockitokotlin2:mockito-kotlin:${LibVersions.mockitoKotlin}"
        const val mockitoInline = "org.mockito:mockito-inline:${LibVersions.mockitoInline}"
    }

    object RoomDatabase {
        const val roomCompiler = "androidx.room:room-compiler:${LibVersions.room}" //
        const val roomKtx = "androidx.room:room-ktx:${LibVersions.room}" //
    }

    object MVVMLibs {
        const val lifecycleExtensions =
            "androidx.lifecycle:lifecycle-extensions:${LibVersions.lifecycle}"
        const val lifecycleLiveDataKtx =
            "androidx.lifecycle:lifecycle-livedata-ktx:${LibVersions.lifecycle}"
        const val kotlinStdlib = "org.jetbrains.kotlin:kotlin-stdlib:${LibVersions.kotlin}"
        const val lifecycleCompiler = "androidx.lifecycle:lifecycle-compiler:${LibVersions.lifecycle}"
    }

    object JetpackNavigation {
        const val navigationFragmentKtx =
            "androidx.navigation:navigation-fragment-ktx:${LibVersions.navigation}"
        const val navigationUiKtx =
            "androidx.navigation:navigation-ui-ktx:${LibVersions.navigation}"
        const val navigationDynamicFeaturesFragment =
            "androidx.navigation:navigation-dynamic-features-fragment:${LibVersions.navigation}"
    }
    object CircularProgressBar {
        const val swipeRefresh =
            "androidx.swiperefreshlayout:swiperefreshlayout:${LibVersions.swipeRefresh}"
    }

    object LottieAnimations {
        const val lottieAnimations = "com.airbnb.android:lottie:${LibVersions.lottieAnimations}"
    }
}
