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
}
