```bash

It is a project where I document the step-by-step process of creating a Dockerized image for Java applications.

Below are some useful Java compile commands:

a) This Java program defines a simple class named HelloWorld that prints "Hello, World!" to the console when executed.

# vi HelloWorld.java

public class HelloWorld {
    public static void main(String args[]){
        System.out.println("Hello World!");
    }
}

b) Compile Your Java Class
If you haven't already compiled your HelloWorld.java to HelloWorld.class, you can do so using,
# javac HelloWorld.java
# This will create the HelloWorld.class file in the same directory.

c) Create MANIFEST.MF file contains like this,
Manifest-Version: 1.0
Created-By: Me
Main-Class: HelloWorld

d) Create the JAR File
# jar cfm HelloWorld.jar MANIFEST.MF HelloWorld.class
c – Create a new archive.
f – Specify the archive file name.
m – Include the manifest file

e) Check if everything works correctly, type

# java -jar HelloWorld.jar
Hello World!

Please note: in order to copy a file from a container to the host, you can use the following command

# docker cp <containerId>:/file/path/within/container /host/path/target
# docker 7ee:/usr/local/tomcat/SampleWebApp/index.html /home/ubuntu




