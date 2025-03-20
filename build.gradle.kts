// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.compose) apply false
    id("org.sonarqube") version "6.0.1.5171"
    alias(libs.plugins.ktlint)
    id("com.google.gms.google-services") version "4.4.2" apply false
}

version = "1.0-SNAPSHOT"
