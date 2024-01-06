plugins {
    alias(libs.plugins.paperdev)
}

dependencies {
    // internal
    compileOnly(project(":mewnms:api"))

    // nms
    paperweight.paperDevBundle("1.20.4-R0.1-SNAPSHOT")
}

tasks {
    assemble {
        dependsOn(reobfJar)
    }
}
