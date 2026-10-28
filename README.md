# Kata2

### 👥 Autor
[Enrique Sosa Ojeda](https://github.com/Enric1005)

## 1. Objetivo de la entrega

Proyecto Java para practicar la **entrada y salida de datos mediante streams**. El programa lee un pequeño conjunto de datos desde un `InputStream`, transforma cada fila en un objeto de dominio, calcula un resumen y lo escribe en un `OutputStream`.

El objetivo es mostrar con claridad los diferentes orígenes y destinos de los datos (fichero, URL), separándolos de la lógica encargada de transformarlos y resumirlos, sin necesidad de utilizar una biblioteca sofisticada.

## 2. Cómo compilar y ejecutar

**Desde IntelliJ IDEA:** abrir la carpeta del proyecto y ejecutar `Main` con el botón ▶ junto al método `main`.

## 3. Dependencias y versión de JDK

- JDK: Oracle OpenJDK 27 ``
- Gestor de dependencias: Maven
  
## 4. Estructura de la entrega y clases principales

```
kata2/
├── src/
│   ├── main/
│   │   ├── java/software/ulpgc/katas/
│   │   │   ├── io/
│   │   │   │   ├── EmployeeReader
│   │   │   │   ├── FileEmployeeReader
│   │   │   │   └── UrlEmployeeReader
│   │   │   ├── model/
│   │   │   │   ├── Employee
|   |   |   |   ├── Gender
│   │   │   └── Main.java
│   │   └── resources/
│   └── test/
├── employees.tsv
├── document.txt
├── pom.xml
├── .gitignore
└── README.md
```

- **`EmployeeReader`** (interfaz): Recibe un origen y devuelve la colección de entidades leídas.
- **`FileEmployeeReader`**: adaptador de entrada que lee desde un fichero mediante `FileInputStream`. Es el responsable de la cabecera y del separador.
- **`UrlEmployeeReader`**: adaptador de entrada que lee desde una URL mediante `URL.openStream()`, con el mismo formato.
- **`[Employee]`** (`model`): entidad que representa una fila del dataset.
- **`[Clase de resumen]`** (`model`): calcula `[el resumen]` a partir de la colección de entidades, sin abrir ficheros ni URLs.
- **`[Clase escritora]`**: recibe un `OutputStream` y escribe el resumen, sin saber si el destino es consola, fichero o memoria.
- **`Main`**: conecta `InputStream`, transformación y `OutputStream`. No contiene el parsing.

Paquete base: `software.ulpgc.katas`.

## 5. Flujo Git usado

- **Ramas:** `master` y `develop`.
- **Proceso:** el trabajo y los commits se realizaron en `develop`. Al final se integró en `master` mediante un merge y se hizo push de ambas ramas a GitHub..

## 6. Vídeo explicativo (máximo 7 minutos)

▶️ [Ver vídeo](https://www.youtube.com/watch?v=bWrX2_maTdQ)
