buildscript {

    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath(Dependencies.other.buildTools)

        //Actual kotlin version
        classpath(Dependencies.other.kotlinCore)

        classpath(Dependencies.di.daggerHilt)
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

