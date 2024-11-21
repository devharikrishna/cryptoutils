plugins {
    id("java-library")
    alias(libs.plugins.jetbrains.kotlin.jvm)
    id("maven-publish")
}

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

kotlin {
    compilerOptions {
        jvmTarget = org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_11
    }
}


publishing {
    publications {
        create<MavenPublication>("release") {
            groupId = "com.github.devharikrishna"
            artifactId = "cryptoutils"
            version = "1.0.0"
        }
    }
}