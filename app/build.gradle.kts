
plugins {
    id("com.android.application")
    kotlin("android")
    // kotlin("jvm")
    kotlin("kapt")
    id("dagger.hilt.android.plugin")
    kotlin("plugin.serialization")
    id("kotlin-parcelize")
    // id("realm-android")
}

dependencies {
    /* core */
    implementation(Google.android.material)
    implementation(AndroidX.appCompat)
    implementation(AndroidX.constraintLayout)
    implementation(AndroidX.core.ktx)
    implementation(AndroidX.fragment)
    implementation("com.jakewharton.timber:timber:_")


    /* compose */
    implementation(AndroidX.activity.compose)
    implementation(AndroidX.compose.ui)
    implementation(AndroidX.compose.ui.tooling)
    implementation(AndroidX.compose.foundation)
    implementation(AndroidX.compose.material)
    implementation(AndroidX.compose.material.icons.core)
    implementation(AndroidX.compose.material.icons.extended)
    implementation(AndroidX.compose.runtime.liveData)
    implementation(AndroidX.navigation.compose)
    implementation(Google.accompanist.insets)


    /* lifecycle */
    implementation(AndroidX.lifecycle.runtime)
    implementation(AndroidX.lifecycle.common)
    implementation(AndroidX.lifecycle.runtimeKtx)
    implementation(AndroidX.lifecycle.commonJava8)
    implementation(AndroidX.lifecycle.viewModelKtx)
    implementation(AndroidX.lifecycle.liveDataKtx)
    implementation(AndroidX.lifecycle.viewModelSavedState)
    implementation(AndroidX.lifecycle.service)
    implementation(AndroidX.lifecycle.process)
    kapt(AndroidX.lifecycle.compiler)

    /* Room */
    implementation(AndroidX.room.runtime)
    implementation(AndroidX.room.ktx)
    kapt(AndroidX.room.compiler)

    /**/
    implementation(Google.accompanist.insets)
    implementation(Google.accompanist.systemuicontroller)

    implementation(KotlinX.serialization.json)
    implementation(Google.dagger.hilt.android)
    kapt(Google.dagger.hilt.compiler)

    // UI Tests
    androidTestImplementation(AndroidX.compose.ui.testJunit4)
}

android {
    compileSdk = 30
    defaultConfig {
        applicationId = "top.derek_dev.mymoney"
        minSdk = 21
        targetSdk = 30
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        getByName("debug") {
            isMinifyEnabled = false
        }
        getByName("release") {
            isMinifyEnabled = false
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_1_8.toString()
        freeCompilerArgs = listOf(
            "-P",
            "plugin:androidx.compose.compiler.plugins.kotlin:suppressKotlinVersionCompatibilityCheck=true"
        )
    }

    buildFeatures {
        compose = true
    }

    composeOptions {
        // kotlinCompilerVersion = "1.5.10"
        kotlinCompilerExtensionVersion = "1.0.1"
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }

    packagingOptions {
        resources.excludes.add("META-INF/licenses/**")
        resources.excludes.add("META-INF/AL2.0")
        resources.excludes.add("META-INF/LGPL2.1")
    }
}
