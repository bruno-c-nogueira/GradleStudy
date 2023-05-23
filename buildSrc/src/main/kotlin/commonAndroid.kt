import com.android.build.gradle.AppExtension
import com.android.build.gradle.BaseExtension
import com.android.build.gradle.LibraryExtension
import org.gradle.api.JavaVersion
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure

fun Project.configureAndroid() {
    configure<BaseExtension> {
        compileSdkVersion(33)

        defaultConfig {
            minSdk = 24
            targetSdk = 33

            testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"

        }

        buildTypes {
            getByName("release") {
                isMinifyEnabled =  this@configure is AppExtension
            }

            getByName("debug") {
                isMinifyEnabled =  this@configure is AppExtension

            }
        }

        compileOptions {
            sourceCompatibility = JavaVersion.VERSION_1_8
            targetCompatibility = JavaVersion.VERSION_1_8
        }

    }
}