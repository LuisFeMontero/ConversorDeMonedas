# Conversor de Monedas en Java

![Portada del Proyecto](/Imágenes/close-up-coins-table.jpg)

[![Java Badge](https://img.shields.io/badge/Java-17.0.1-blue.svg)](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html)
[![Gson Badge](https://img.shields.io/badge/Gson-2.9.1-green.svg)](https://www.javadoc.io/doc/com.google.code.gson/gson/latest/com.google.gson/module-summary.html)
[![License Badge](https://img.shields.io/badge/license-MIT-green)](LICENSE)

---

## Índice

- [Descripción del Proyecto](#descripción-del-proyecto)
- [Estado del Proyecto](#estado-del-proyecto)
- [Demostración de Funciones y Aplicaciones](#demostración-de-funciones-y-aplicaciones)
- [Acceso al Proyecto](#acceso-al-proyecto)
- [Tecnologías Utilizadas](#tecnologías-utilizadas)
- [Personas Contribuyentes](#personas-contribuyentes)
- [Personas Desarrolladoras del Proyecto](#personas-desarrolladoras-del-proyecto)
- [Licencia](#licencia)

---

## Descripción del Proyecto

El **Conversor de Monedas en Java** es una herramienta simple y efectiva que permite convertir cantidades entre diferentes divisas utilizando una API de tasas de cambio en tiempo real. Este proyecto fue desarrollado como parte del proceso de aprendizaje del programa **Oracle Next Education (ONE) G7**, con el objetivo de aplicar conceptos fundamentales de Java, manejo de APIs externas, serialización de datos en JSON y uso de bibliotecas como Gson.

### Funcionalidades:
- Conversión entre varias monedas internacionales, como USD, ARS, BRL, COP, EUR y JPY.
- Registro de las conversiones realizadas con fecha y hora usando `LocalDateTime`.
- Almacenamiento y carga de los registros de conversiones en un archivo JSON.
- Interfaz de usuario en consola, fácil de usar, que permite seleccionar las monedas y visualizar el historial de conversiones.

## Estado del Proyecto

El proyecto se encuentra **completado**. Todas las funcionalidades previstas han sido implementadas y probadas. Es un proyecto educativo desarrollado como parte de la formación en Oracle Next Education.

## Demostración de Funciones y Aplicaciones

### Menú Principal:
Al ejecutar el programa, los usuarios pueden seleccionar entre diferentes opciones de conversión de monedas:
```text
Selecciona las monedas a convertir:
1. Dólar (USD) a Peso Argentino (ARS)
2. Peso Argentino (ARS) a Dólar (USD)
3. Dólar (USD) a Real Brasileño (BRL)
4. Real Brasileño (BRL) a Dólar (USD)
5. Dólar (USD) a Peso Colombiano (COP)
6. Peso Colombiano (COP) a Dólar (USD)
7. Dólar (USD) a Euro (EUR)
8. Euro (EUR) a Dólar (USD)
9. Dólar (USD) a Yen Japonés (JPY)
10. Yen Japonés (JPY) a Dólar (USD)
11. Mostrar historial de conversiones
12. Salir
```
## Ejemplo de Conversión:
El usuario selecciona una opción, introduce la cantidad a convertir, y el resultado es mostrado en pantalla. También se guarda un registro de la conversión realizada.

## Historial de Conversiones:
El historial se almacena en un archivo JSON y muestra la fecha, moneda origen, moneda destino, cantidad y resultado de la conversión:
```
2024-10-05T14:23:45 - 100 USD a 98.76 EUR
```
## Acceso al Proyecto
Puedes clonar este repositorio desde GitHub y ejecutar el proyecto localmente.

git clone https://github.com/LuisFeMontero/ConversorDeMonedas
cd conversor-monedas-java

## Ejecución del proyecto:
- Asegúrate de tener Java JDK 17 o superior instalado.
- Ejecuta el proyecto desde tu entorno de desarrollo o usa la línea de comandos con javac y java.
```
  javac ConversionApp.java
  java ConversionApp
```
## Tecnologías Utilizadas

- **Java 17**: Lenguaje de programación utilizado para la lógica del proyecto.
    - [Documentación de Java](https://docs.oracle.com/javase/7/docs/api/java/lang/Object.html)
    - [FileWriter](https://docs.oracle.com/javase/7/docs/api/java/io/FileWriter.html)
    - [FileReader](https://docs.oracle.com/javase/7/docs/api/java/io/FileReader.html)
    - [LocalDateTime](https://docs.oracle.com/javase/8/docs/api/java/time/LocalDateTime.html)

- **Gson 2.9.1**: Biblioteca de Google para serialización/deserialización de objetos Java a JSON y viceversa.
    - [Documentación de Gson](https://www.javadoc.io/doc/com.google.code.gson/gson/latest/com.google.gson/module-summary.html)

- **API Exchange Rate**: Fuente de tasas de cambio en tiempo real.

## Personas Contribuyentes

Este proyecto ha sido desarrollado como parte de un ejercicio académico en **Oracle Next Education ONE G7**. No ha contado con contribuciones externas.

## Personas Desarrolladoras del Proyecto

- **Luis Felipe Montero**
    - [LinkedIn](https://www.linkedin.com/in/psicologofelipemontero/)

## Licencia

Este proyecto está licenciado bajo la **Licencia MIT**. Puedes ver más detalles en el archivo [LICENSE](src/License/LICENSE).
