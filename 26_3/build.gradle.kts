plugins {
    id("io.papermc.paperweight.userdev") version "2.0.0-beta.24"
}

dependencies {
    paperweightDevelopmentBundle("io.papermc.paper:dev-bundle:26.3.build.+")
    compileOnly(project(":common"))
}

paperweight.reobfArtifactConfiguration = io.papermc.paperweight.userdev.ReobfArtifactConfiguration.REOBF_PRODUCTION