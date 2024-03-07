/*
 * This file was generated by the Gradle 'init' task.
 *
 * This is a general purpose Gradle build.
 * To learn more about Gradle by exploring our Samples at https://docs.gradle.org/8.6/samples
 */

plugins {
    java
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(17)
    }
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("io.cucumber:cucumber-java:7.15.0")
}

configurations {
    val cucumberRuntime: Configuration by configurations.creating {
        extendsFrom(configurations["testImplementation"])
    }
}

task("cucumber") {
    dependsOn("assemble", "compileTestJava")
    doLast {
        javaexec {
            mainClass.set("io.cucumber.core.cli.Main")
            classpath = configurations["cucumberRuntime"] + sourceSets["main"].output + sourceSets["test"].output
            args = listOf("--plugin", "pretty",
                    "--glue", "cc.secondbrain.trade",
                    "src/test/resources")
        }
    }
}