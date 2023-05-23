plugins {
    `kotlin-dsl`
}

repositories {
    mavenCentral()
    google()
}

dependencies {
    implementation(kotlin("gradle-plugin"))
    implementation("com.android.tools.build:gradle:7.4.0")
}

gradlePlugin {
    plugins{
        create("myApplication"){
            id = "dev.programador.app"
            implementationClass = "MyApplication"
        }

        create("myLibrary"){
            id = "dev.programador.lib"
            implementationClass = "MyLibrary"
        }
    }
}