plugins{
    id("java")
    id("application")
}

application{
    mainClass = "Main"
}

repositories{
    mavenCentral()
}

dependencies{
    compileOnly("org.projectlombok:lombok:1.18.30")
    annotationProcessor("org.projectlombok:lombok:1.18.30")

    testCompileOnly("org.projectlombok:lombok:1.18.30")
    testAnnotationProcessor("org.projectlombok:lombok:1.18.30")
}

tasks.register<JavaExec>("runApp") {
    mainClass.set("Main")  // Nome da sua classe principal (adiciona o 'Kt' para Kotlin)
    classpath = sourceSets["main"].runtimeClasspath
    standardInput = System.`in`
    standardOutput = System.out
    errorOutput = System.err
}
