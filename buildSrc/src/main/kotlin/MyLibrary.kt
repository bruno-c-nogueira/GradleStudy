import org.gradle.api.Plugin
import org.gradle.api.Project

class MyLibrary : Plugin<Project> {

    override fun apply(target: Project) {
        with(target) {
            pluginManager.apply("com.android.library")
            pluginManager.apply("org.jetbrains.kotlin.android")

            configureAndroid()
        }
    }

}