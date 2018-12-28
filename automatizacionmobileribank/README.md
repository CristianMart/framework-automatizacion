# app personas
Un proyecto donde se ejemplifica el uso del patrón screenplay en una aplicación movil
[screenplay](http://serenity-bdd.info/docs/serenity/#_serenity_and_the_screenplay_pattern) con cucumber y gradle.

Las pruebas de este ejemplo se corren contra la sucursal virtual personas del banco.

Por defecto, los tests corren en android 5.1.1, así que es necesario tener un emulador con esa versión adicional a appium.

## Detalles generales de la implementación

Los tests usan tareas (tasks), interacciones (interactions), preguntas (questions), elementos de páginas (userinterface)
definidas en `co.com.bancolombia.certificación.apppersonas`.

La estructura completa del proyecto es la siguiente:

````
+ exceptions
    Clases que controlan las posibles excepciones técnicas y de negocios que se presentan durante la ejecución de pruebas
+ model
    Clases relacionadas con el modelo de dominio y sus respectivos builder cuando es necesario
+ tasks
    Clases que representan tareas que realiza el actor a nivel de proceso de negocio
+ interacion
    Clases que representan las interacciones directas con la interfaz de usuario
+ userinterface
    Page Objects y Page Elements. Mapean los objetos de la interfaz de usuario
+ questions
    Objetos usados para consultar acerca del estado de la aplicación
+ integration
    Clases que se comunican con el "backend", aplica el patrón facade
+ util
    Clases de utilidad
+ runners
    Clases que permiten correr los tests
+ step definitions
    Clases que mapean las líneas Gherkin a código java
+ app
    Archivos ejecutables de la aplicación a probar
+ features
    La representación de las historias en archivos cucumber
````

## Requerimientos

Para correr el proyecto se necesita Java JDK 1.8 y Gradle preferiblemente con la versión 4.7. Adicional a appium
preferiblemente con la versión 1.8.1.

Se requiere modificar los capabilities agregando el id del emulador o celular usado para la prueba, (el comando
">adb devices" entrega esa información). Adicional se requiere cambiar la ruta donde está ubicado el apk y finalmente el
paquete de la aplicación según el apk qe se use.

## Para correr el proyecto

clean test aggregate es el comando que correrá los tests y generará el reporte en la carpeta /target/site/serenity/
