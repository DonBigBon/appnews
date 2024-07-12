plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
    kotlin("kapt")
}

android {
    namespace = "com.example.appnews"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.appnews"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.lifecycle.livedata.ktx)
    implementation(libs.androidx.lifecycle.viewmodel.ktx)
    implementation(libs.androidx.navigation.fragment.ktx)
    implementation(libs.androidx.navigation.ui.ktx)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    implementation(libs.lifecycle.viewmodel.ktx.v220)
    implementation(libs.androidx.room.runtime.v225)
    kapt("androidx.room:room-compiler:2.2.5")
    implementation(libs.androidx.room.ktx.v225)
    implementation(libs.kotlinx.coroutines.core.v135)
    implementation(libs.kotlinx.coroutines.android.v135)
    implementation(libs.androidx.lifecycle.runtime.ktx.v220)
    implementation(libs.retrofit.v260)
    implementation(libs.converter.gson.v260)
    implementation(libs.logging.interceptor)
    implementation(libs.navigation.fragment.ktx.v221)
    implementation(libs.navigation.ui.ktx.v221)
    implementation(libs.glide.v4110)
    kapt("com.github.bumptech.glide:compiler:4.11.0")
}