# Java Debugging Bugs

Proyecto Maven para practicar depuración de programas Java con VS Code y JDK 21.

## Objetivo de la actividad

El alumnado debe elaborar un documento con capturas de VS Code demostrando el uso del depurador para localizar y corregir errores en programas Java.

No se debe entregar solo el código corregido. La parte importante es documentar el proceso de depuración.

## Requisitos

- JDK 21.
- Maven 3.9 o superior recomendado.
- Visual Studio Code.
- Extension Pack for Java de Microsoft para VS Code.

## Estructura del proyecto

```text
java-debugging-bugs/
├── pom.xml
├── README.md
├── .vscode/
│   ├── launch.json
│   └── settings.json
└── src/
    └── main/
        └── java/
            └── edu/
                └── debugging/
                    └── bugs/
                        ├── GradesBugs.java
                        ├── ShoppingCartBugs.java
                        ├── PasswordValidatorBugs.java
                        ├── CinemaSeatsBugs.java
                        ├── TemperatureBugs.java
                        ├── RaceResultsBugs.java
                        └── BookLoansBugs.java
```

## Programas incluidos

### `GradesBugs.java`

Informe de calificaciones con errores relacionados con arrays, acumuladores, mínimos, máximos, condiciones y límites de bucles.

### `ShoppingCartBugs.java`

Cálculo de un carrito de compra con errores de recorrido de arrays, subtotal, descuento, gastos de envío e IVA.

### `PasswordValidatorBugs.java`

Validador de contraseñas con errores en condiciones booleanas, recorrido de cadenas y combinación de requisitos.

### `CinemaSeatsBugs.java`

Reserva de butacas con matriz de caracteres. Contiene errores de filas, columnas, índices, impresión de matrices y conteo.

### `TemperatureBugs.java`

Análisis de temperaturas semanales con errores de condiciones, día máximo, media y recorrido del array.

### `RaceResultsBugs.java`

Clasificación de una carrera con errores de índice, mínimo/máximo, descalificados y cálculo de media.

### `BookLoansBugs.java`

Cálculo de multas de biblioteca con errores de acumuladores, condiciones y reglas de negocio.

## Cómo compilar

Desde la raíz del proyecto:

```bash
mvn clean compile
```

Los programas están diseñados para compilar correctamente, aunque algunos fallarán en tiempo de ejecución o producirán resultados incorrectos. Ese comportamiento es intencionado.

## Cómo ejecutar un programa con Maven

Ejemplo:

```bash
mvn exec:java -Dexec.mainClass="edu.debugging.bugs.GradesBugs"
```

Otros ejemplos:

```bash
mvn exec:java -Dexec.mainClass="edu.debugging.bugs.ShoppingCartBugs"
mvn exec:java -Dexec.mainClass="edu.debugging.bugs.PasswordValidatorBugs"
mvn exec:java -Dexec.mainClass="edu.debugging.bugs.CinemaSeatsBugs"
mvn exec:java -Dexec.mainClass="edu.debugging.bugs.TemperatureBugs"
mvn exec:java -Dexec.mainClass="edu.debugging.bugs.RaceResultsBugs"
mvn exec:java -Dexec.mainClass="edu.debugging.bugs.BookLoansBugs"
```

## Cómo depurar en VS Code

1. Abrir la carpeta del proyecto en VS Code.
2. Esperar a que VS Code importe el proyecto Maven.
3. Abrir el panel **Run and Debug**.
4. Seleccionar una configuración, por ejemplo **Debug GradesBugs**.
5. Colocar breakpoints en las líneas sospechosas.
6. Ejecutar el depurador.
7. Usar las herramientas:
   - Continue.
   - Step Over.
   - Step Into.
   - Step Out.
   - Variables.
   - Watch.
   - Debug Console.

## Entrega recomendada

El alumno debe entregar un documento PDF o DOCX con, al menos:

- Tres programas depurados.
- Dos errores explicados por programa.
- Captura del breakpoint utilizado.
- Captura del panel de variables.
- Explicación del síntoma observado.
- Hipótesis del error antes de corregirlo.
- Fragmento de código original y fragmento corregido.
- Pruebas finales que demuestren que el programa funciona.

## Tabla de análisis sugerida

| Programa | Síntoma observado | Breakpoint usado | Variable clave | Hipótesis | Corrección aplicada |
|---|---|---|---|---|---|
| GradesBugs.java |  |  |  |  |  |
| ShoppingCartBugs.java |  |  |  |  |  |
| PasswordValidatorBugs.java |  |  |  |  |  |
| CinemaSeatsBugs.java |  |  |  |  |  |
| TemperatureBugs.java |  |  |  |  |  |
| RaceResultsBugs.java |  |  |  |  |  |
| BookLoansBugs.java |  |  |  |  |  |

## Nota para el profesorado

Los errores son intencionados y están pensados para que el alumnado practique la depuración paso a paso. Algunos programas lanzan excepciones en tiempo de ejecución; otros producen resultados incorrectos sin fallar. Esta variedad permite trabajar diferentes síntomas de error.
