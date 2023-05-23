plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    compileSdk = 33

    defaultConfig {
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    flavorDimensions += "paidMode"

    productFlavors {
        create("free") {
            dimension = "paidMode"
            applicationIdSuffix = ".free"
            manifestPlaceholders["appRedirectScheme"] =  "free app"


        }

        create("paid") {
            dimension = "paidMode"
            applicationIdSuffix = ".paid"
            manifestPlaceholders["appRedirectScheme"] =  "paid app"


        }
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }

        getByName("debug") {
            isDebuggable = false
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

}
