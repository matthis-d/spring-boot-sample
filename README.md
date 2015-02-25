# Simple Spring Boot sample

This project is a simple example of how Spring Boot can be used

## Configuration required
In order to use this project, you need to have Java 8 and Maven installed on your computer.

Java 8 features are not used here but if you use another Java version, you first have to change the pom.xml file and the configuration of the maven-compiler-plugin.

## Start the app
To start the application, in your favourite console, go into the project location and type : 
```mvn spring-boot:run```

If you want to compile the app, simply use ```mvn package``` as you would have done with any Maven project.

Any code change in an existing method will not require an app reboot since we use Spring Loaded.