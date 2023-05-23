import com.android.build.gradle.AppExtension
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure

class MyApplication : Plugin<Project> {

    override fun apply(target: Project) {
        with(target) {
            pluginManager.apply("com.android.application")
            pluginManager.apply("org.jetbrains.kotlin.android")

            configureAndroid()
            configure<AppExtension> {
                defaultConfig {

                    versionCode = 1
                    versionName = "1.0"

                }
                flavorDimensions("paidMode")

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

            }
        }
    }

}