buildscript {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
        jcenter()
    }

    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:_")
        classpath("org.jetbrains.kotlin:kotlin-serialization:_")
        // the latest version (7.1.0-alpha04) at the time of writing has a bug that crashes the app on launch
        classpath("com.android.tools.build:gradle:_")
        classpath("com.google.dagger:hilt-android-gradle-plugin:_")
        // classpath("io.realm:realm-gradle-plugin:_")
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
