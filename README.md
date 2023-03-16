# BEDU-Equipo5-PostWorks


## PostWork 1 ##

Desarrollar aplicación para transformar [este ejemplo](http://www.unexpected-vortices.com/sw/rippledoc/quick-markdown-example.html) de Markdown en HTML a través de Gradle usando [Gradle Markdown Plugin](https://github.com/kordamp/markdown-gradle-plugin).

1. Ingresar al directorio del Post Work 1 y generar los archivos necesarios:
```bash
cd Post\ work\ 1
nano build.gradle
mkdir src/markdown
nano src/markdown/example.md
```
2. Generar HTML a partir del archivo .md:
```bash
gradle markdownToHtml
```
3. Verificar que se haya creado el archivo .html:
```bash
ls -lah build/gen-html
```

## PostWork 5 ##

Aplicación generada en el sitio [Spring Initializr](https://start.spring.io) con las siguientes configuraciones:

* **Project**: Gradle - Groovy
* **Language**: Java
* **Spring Boot**: 2.7.9
* **Project Metadata**:
    * **Group**: org.bedu.java.backend
    * **Artifact**: sesion05-postwork
    * **Name**: sesion05-postwork
    * **Description**: Java Beans y la Inversión de Control (IoC)
    * **Package name**: org.bedu.java.backend.sesion05-postwork
    * **Packaging**: Jar
    * **Java**: 11

## PostWork 6 ##

Aplicación generada en el sitio [Spring Initializr](https://start.spring.io) con las siguientes configuraciones:

* **Project**: Gradle - Groovy
* **Language**: Java
* **Spring Boot**: 2.7.9
* **Project Metadata**:
    * **Group**: org.bedu.java.backend
    * **Artifact**: sesion06-postwork
    * **Name**: sesion06-postwork
    * **Description**: Introducción a Spring MVC
    * **Package name**: org.bedu.java.backend.sesion06-postwork
    * **Packaging**: Jar
    * **Java**: 11
* **Dependencias**:
    * Spring Web
