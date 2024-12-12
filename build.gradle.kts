// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.7.0" apply false
    id("org.jetbrains.kotlin.android") version "1.9.10" apply false
    id("org.jetbrains.kotlin.plugin.compose") version "2.0.20"
}

buildscript {
    dependencies {
        classpath("com.android.tools.build:gradle:8.7.0") // Use the latest Android Gradle plugin
        classpath("com.google.gms:google-services:4.3.15") // This line is needed for Firebase
    }
}

allprojects {
    // Remove the 'repositories' block entirely.
}

