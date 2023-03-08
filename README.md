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
