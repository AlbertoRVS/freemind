# 🌳 Guía del Proyecto: FreeMind, App de Tareas estilo Studio Ghibli

> **Módulo:** Proyecto de Desarrollo de Aplicaciones Multiplataforma (DAM)
> **Alumno:** Alberto
> **Profesor/tutor:** Claude
> **Inicio:** 05/10/2026
> **Proyecto:** `C:\Users\PC\AndroidStudioProjects\FreeMind` · paquete `com.alberto.freemind`

---

## 0. Cómo usar esta guía

Esta guía es tu **libro de actividades**. Está dividida en **fases** y cada fase en **actividades** numeradas (`1.1`, `1.2`…). Cada actividad sigue siempre la misma estructura:

| Apartado | Para qué sirve |
|---|---|
| 🎯 **Objetivo** | Qué vas a aprender y construir. |
| 📖 **Teoría breve** | Lo mínimo que necesitas entender antes de escribir código. |
| 🧩 **Sintaxis y ejemplo análogo** | Un ejemplo **parecido pero no igual** a lo que tienes que hacer (libros, recetas, películas…). Tú lo adaptas a las tareas. |
| ✍️ **Enunciado** | Lo que tienes que programar tú. |
| ✅ **Criterios de aceptación** | Cómo sabremos que está bien hecho. Repásalos antes de pedirme corrección. |
| 💡 **Pistas** | Por si te atascas. Léelas solo si lo necesitas. |
| 📦 **Commit** | Mensaje de commit sugerido para cuando la actividad esté **aprobada**. |
| 🧪 **Test opcional** | Un test para comprobar automáticamente lo que acabas de hacer, con su propio commit. No es obligatorio, pero es lo que más valoran en las empresas. |

### Flujo de trabajo de cada actividad

```
1. Lees la actividad y escribes el código.
2. Lo pruebas (compila, se ejecuta, cumple los criterios).
3. Me escribes en el hilo:  "Actividad X.Y lista"
4. Reviso tus archivos y relleno su ficha en docs/SEGUIMIENTO.md.
5. Corriges lo que te marque  ->  vuelvo a revisar.
6. Cuando la ficha diga "✅ Aprobada", haces el commit (y el del test, si lo hiciste) y el push.
```

> 📌 **Regla de oro:** solo se hace commit de código **corregido y aprobado**. Así tu historial de Git queda limpio y profesional, que es lo que verán las empresas.

### Cuándo hacer commit (y cómo llamarlo)

- **Un commit por cada cosa que funciona por sí sola.** Normalmente es **una actividad = un commit**. Cuando una actividad sola no se puede usar ni probar (por ejemplo, las entidades sin sus conversores), se **agrupa** con la siguiente: la propia actividad te lo indica.
- **Actividades de teoría** (sin código): no llevan commit.
- **Tests opcionales:** van en un commit **aparte**, de tipo `test(...)`, justo después del commit de la actividad. Si haces el test antes de pedirme corrección, lo reviso junto con la actividad.
- **`SEGUIMIENTO.md`:** cada vez que lo actualizo te aparecerá como modificado. Súbelo en su propio commit: `docs: update tracking for activity X.Y`.
- **Orden de cada actividad aprobada:** `feat`/`chore` → `test` (si lo hiciste) → `docs` → `git push`.
- **El mensaje:** `tipo(ámbito): descripción` en inglés, en **imperativo** y diciendo **qué aporta** (no qué archivos toca). Cada actividad trae su mensaje sugerido; puedes cambiarlo si mantiene el formato.
- **Nombres de los tests:** que digan qué comprueban. En los tests de Kotlin se permiten frases entre comillas invertidas: ``fun `punctual task has two candies by default`()``.
- **Al terminar cada fase:** Pull Request de `fase-N` a `main`.

### Si te atascas

1. Relee la teoría y el ejemplo análogo.
2. Lee el error completo (el **primer** error de la lista suele ser el importante).
3. Pregúntame en el hilo. Te daré **pistas y sintaxis**, no la solución, salvo que me la pidas expresamente con "dame el código".

---

## 1. La aplicación que vamos a construir

### 1.1 El lore 🌿

Los **Susuwatari** (las bolitas de hollín) y los **Kodama** (los espíritus del bosque) llevan todo el día cargando carbón y a otros Kodamas a cuestas, mientras nosotros no hacemos nada. Cada tarea que completemos **libera** a uno de ellos de su trabajo y, en agradecimiento, nos da un **caramelo** 🍬.

Con los caramelos podemos viajar a la **Isla del Descanso** 🏝️ y canjearlos por tiempo libre (videojuegos, hobbies…). En la Isla viven los espíritus que hemos rescatado durante la semana.

### 1.2 Reglas de negocio (decididas el 05/10/2026)

| Concepto | Regla |
|---|---|
| **Tareas Puntuales** | Ocurren una vez, con fecha (ej. "Dentista el 14/10"). Al completarlas quedan archivadas como hechas. Liberan un **Kodama**. Por defecto dan **2 🍬**. |
| **Tareas Obligatorias** | Hogar, orden y estudio (ej. "Fregar los platos", "Arena de las gatas"). Tienen **frecuencia diaria o semanal**: vuelven a estar pendientes cada día (diaria) o cada semana (semanal, de lunes a domingo). Liberan un **Susuwatari**. Por defecto dan **1 🍬**. |
| **Tareas Opcionales** | Detalles y extras (ej. "Masaje de pies a mi pareja"). Se pueden repetir tantas veces como quieras. Liberan un **Kodama**. Por defecto dan **5 🍬**. |
| **Caramelos** | Cada tipo tiene un valor por defecto, pero al crear o editar una tarea se puede cambiar. |
| **Saldo** | Caramelos ganados − caramelos gastados en recompensas. |
| **Recompensas** | Catálogo que crea el usuario (ej. "1 h de videojuegos = 6 🍬"). Al canjear se descuenta el coste y queda en un **historial**. No se puede canjear sin saldo suficiente. |
| **Isla del Descanso** | Muestra el saldo, el catálogo, el historial y **los espíritus rescatados esta semana** (cada Susuwatari y Kodama aparece en la isla, con su conteo). El conteo se **reinicia cada lunes**. |
| **Castigos** | Ninguno. Si no haces una obligatoria, simplemente sigue pendiente. |

### 1.3 Pantallas

1. **Puntuales**: lista ordenada por fecha.
2. **Obligatorias**: pendientes de hoy/esta semana arriba, hechas abajo.
3. **Opcionales**: lista de "buenas acciones" repetibles.
4. **Isla del Descanso**: saldo, espíritus rescatados, catálogo de recompensas e historial.

Más un formulario para **crear/editar tareas** y otro para **crear/editar recompensas**.

### 1.4 Stack tecnológico (y por qué)

| Tecnología | Qué es | Por qué la usamos |
|---|---|---|
| **Kotlin** | Lenguaje oficial de Android. | Es el estándar en ofertas de empleo Android. |
| **Jetpack Compose + Material 3** | UI declarativa: describes la pantalla con funciones Kotlin, sin XML. | Es como se hacen las apps nuevas hoy. |
| **MVVM** | Arquitectura Model-View-ViewModel. | Separa la UI de la lógica; es lo que preguntan en entrevistas. |
| **Room** | Capa sobre **SQLite** (la BBDD que lleva Android). | BBDD local con comprobación de tus SQL en tiempo de compilación. |
| **Coroutines + Flow** | Programación asíncrona y flujos de datos reactivos. | La BBDD no puede bloquear la pantalla; y la UI se actualiza sola cuando cambian los datos. |
| **Navigation Compose** | Navegación entre pantallas. | Estándar oficial. |
| **Hilt** *(Fase 10)* | Inyección de dependencias. | Muy pedido en empresas. Primero lo haremos a mano para entenderlo. |
| **Git + GitHub** | Control de versiones. | Tu portfolio. Desde el primer día. |
| **JUnit** | Tests. | Un proyecto con tests destaca mucho en un portfolio. |

### 1.5 Mapa de la arquitectura final

```
┌─────────────────────────── UI (Compose) ───────────────────────────┐
│  PunctualScreen   MandatoryScreen   OptionalScreen   IslandScreen   │
│        │ observa estado (StateFlow)          ▲ envía eventos        │
└────────┼─────────────────────────────────────┼─────────────────────┘
         ▼                                     │
┌──────────────────────────── ViewModels ────────────────────────────┐
│  Transforma datos en "UiState" y ejecuta acciones (completar, ...)  │
└────────┬───────────────────────────────────────────────────────────┘
         ▼
┌──────────────────────────── Repository ────────────────────────────┐
│  Única puerta de entrada a los datos. Aplica reglas de negocio.     │
└────────┬───────────────────────────────────────────────────────────┘
         ▼
┌────────────────────── Room (SQLite local) ─────────────────────────┐
│  @Entity (tablas)   @Dao (consultas SQL)   @Database (la BBDD)      │
└────────────────────────────────────────────────────────────────────┘
```

### 1.6 Convención de idioma

- **Código en inglés**: clases, funciones, variables, tablas y columnas (`Task`, `completeTask()`, `candies`).
- **Comentarios en español**.
- **Textos de la interfaz en español**, guardados en `res/values/strings.xml` (nunca escritos "a pelo" en el código).

---

## 📅 Índice de fases

| Fase | Tema | Resultado visible |
|---|---|---|
| 0 | Entorno, proyecto Compose y Git/GitHub | Proyecto nuevo subido a GitHub |
| 1 | Kotlin esencial con el modelo de la app | Clases del dominio + primeros tests |
| 2 | Compose básico y tema Ghibli | Una tarjeta de tarea bonita con datos falsos |
| 3 | Navegación | 4 pestañas navegables |
| 4 | Base de datos con Room | Tareas guardadas en SQLite |
| 5 | Arquitectura MVVM | Pantalla de Puntuales funcionando de verdad |
| 6 | CRUD completo de tareas | Crear, editar, borrar y ver los 3 tipos |
| 7 | Caramelos y rescates | Completar tareas da caramelos y libera espíritus |
| 8 | La Isla del Descanso | Recompensas, canje, historial y espíritus de la semana |
| 9 | Pulido Ghibli | Dibujos, animaciones, icono, modo oscuro |
| 10 | Nivel profesional | Hilt, tests de ViewModel, CI, README de portfolio |

---

# FASE 0 · Entorno, proyecto y Git 🛠️

## Actividad 0.1 · Recrear el proyecto con Jetpack Compose

> ✏️ **Nota (05/10/2026):** finalmente el proyecto se creó como **FreeMind** en `C:\Users\PC\AndroidStudioProjects\FreeMind`, con el paquete `com.alberto.freemind`. Esa es ahora la carpeta del curso (y `docs/` vive dentro). Donde el resto de la guía diga `TAREAS` o `com.alberto.tareas`, entiende FreeMind.

🎯 **Objetivo:** tener un proyecto limpio basado en Compose, con un paquete propio y `minSdk` adecuado.

📖 **Teoría breve**

- El proyecto actual se creó con **Empty Views Activity** (pantallas en XML). Nosotros usaremos **Empty Activity**, que es la plantilla de **Compose**.
- **Package name / applicationId**: identificador único de la app en el mundo (y en Google Play). `com.example.*` **no se puede publicar**; usa algo tuyo, tipo dominio invertido: `com.alberto.tareas`.
- **minSdk**: la versión mínima de Android que soporta tu app. Usaremos **API 26 (Android 8.0)** porque a partir de ahí está disponible `java.time` (`LocalDate`, `DayOfWeek`…), que necesitaremos para las fechas y las semanas. Cubre la práctica totalidad de móviles en uso.

✍️ **Enunciado**

1. Actualiza Android Studio a la **última versión estable** (`Help > Check for Updates`).
2. **Guarda la carpeta `docs/`** (esta guía y el seguimiento): cópiala temporalmente al Escritorio.
3. Cierra Android Studio.
4. Abre Android Studio y crea un proyecto nuevo:
   - Plantilla: **Empty Activity** (la del logo de Compose).
   - Name: el nombre de la app que quieras (sugerencia: `Kodama Tasks`).
   - Package name: `com.alberto.tareas` (o el que prefieras, sin `example`).
   - Save location: `C:\Users\PC\AndroidStudioProjects\TAREAS_NUEVO`
   - Language: **Kotlin**. Minimum SDK: **API 26**. Build configuration language: **Kotlin DSL (build.gradle.kts)**.
5. Ejecuta la app en el emulador o tu móvil y comprueba que sale "Hello Android!".
6. Cierra Android Studio. En el Explorador de Windows:
   - Vacía `C:\Users\PC\AndroidStudioProjects\TAREAS` (borra su contenido).
   - Mueve **todo el contenido** de `TAREAS_NUEVO` dentro de `TAREAS`, y borra `TAREAS_NUEVO`.
   - Vuelve a poner la carpeta `docs/` dentro de `TAREAS`.
7. Abre `TAREAS` en Android Studio (`File > Open`), espera a que sincronice Gradle y vuelve a ejecutar.

> ⚠️ Mantener la carpeta `TAREAS` es importante: es la carpeta a la que tengo acceso para corregirte.

✅ **Criterios de aceptación**
- [ ] `app/src/main/java/.../MainActivity.kt` usa `setContent { ... }` (eso es Compose).
- [ ] No existe `res/layout/activity_main.xml`.
- [ ] `minSdk = 26` y el `namespace`/`applicationId` no contiene `example`.
- [ ] La app arranca sin errores.
- [ ] `docs/` está dentro de `TAREAS`.

💡 **Pistas**
- Si Gradle da un error del tipo *"requires compileSdk XX"*, sube `compileSdk` y `targetSdk` en `app/build.gradle.kts` al número que te pide el error.

📦 **Commit:** todavía no; lo haremos en la 0.3.

---

## Actividad 0.2 · Entender la estructura del proyecto

🎯 **Objetivo:** saber qué es cada archivo antes de tocar nada. En una entrevista te pueden preguntar "¿qué es Gradle?".

📖 **Teoría breve**

```
FreeMind/
├── settings.gradle.kts        -> Qué módulos tiene el proyecto y de dónde se bajan las librerías
├── build.gradle.kts           -> Configuración común (plugins)
├── gradle/libs.versions.toml  -> "Catálogo de versiones": TODAS las librerías y sus versiones en un sitio
├── gradle.properties          -> Opciones de Gradle
├── local.properties           -> Ruta de TU SDK. Nunca se sube a Git
└── app/
    ├── build.gradle.kts       -> Configuración del módulo app: sdk, dependencias...
    └── src/
        ├── main/
        │   ├── AndroidManifest.xml  -> "DNI" de la app: nombre, icono, permisos, actividad inicial
        │   ├── java/com/alberto/freemind/  -> Tu código Kotlin
        │   └── res/                  -> Recursos: textos, imágenes, iconos
        ├── test/          -> Tests que corren en tu PC (rápidos)
        └── androidTest/   -> Tests que corren en un móvil/emulador
```

**El catálogo de versiones (`libs.versions.toml`)** tiene 3 secciones:

```toml
[versions]          # números de versión con un alias
retrofit = "2.11.0"

[libraries]         # librerías, apuntando a una versión
retrofit = { group = "com.squareup.retrofit2", name = "retrofit", version.ref = "retrofit" }

[plugins]           # plugins de Gradle
```

Y luego en `app/build.gradle.kts` se usan así (los `-` se convierten en `.`):

```kotlin
dependencies {
    implementation(libs.retrofit)
}
```

✍️ **Enunciado:** abre cada uno de esos archivos y responde en el hilo, con tus palabras, estas 4 preguntas:
1. ¿Qué diferencia hay entre `compileSdk`, `minSdk` y `targetSdk`?
2. ¿Por qué `local.properties` no debe subirse a GitHub?
3. ¿Qué ventaja tiene el catálogo `libs.versions.toml` frente a escribir las versiones directamente?
4. En `MainActivity.kt`, ¿qué crees que hacen `setContent { }` y la anotación `@Preview`?

✅ **Criterios de aceptación:** respuestas correctas y con tus palabras (no copiadas).

---

## Actividad 0.3 · Git y GitHub desde el primer día

🎯 **Objetivo:** tener el proyecto en un repositorio de GitHub y saber el ciclo básico de Git.

📖 **Teoría breve**

Git guarda "fotos" (**commits**) de tu proyecto. GitHub es un servidor donde guardas una copia (**remoto**) y que sirve de portfolio.

```
Working directory --git add--> Staging area --git commit--> Repositorio local --git push--> GitHub
```

Comandos que más usarás (desde la terminal de Android Studio, pestaña **Terminal**):

```bash
git status                  # ¿qué ha cambiado?
git add .                   # preparar todos los cambios
git add ruta/archivo.kt     # preparar uno solo
git commit -m "mensaje"     # crear la "foto"
git push                    # subirla a GitHub
git log --oneline           # ver historial
git switch -c nombre-rama   # crear una rama y cambiarte a ella
git switch main             # volver a main
```

**Ramas por fase:** trabajaremos así para que tu GitHub parezca el de un equipo profesional:

```
main  ──●────────────────●──────────────●──>   (solo código terminado de cada fase)
         \              / \            /
fase-1    ●──●──●──●──●    \          /       (un commit por actividad aprobada)
                            fase-2 ●──●
```

Al acabar una fase, abrimos un **Pull Request** en GitHub de `fase-N` a `main` y lo fusionamos.

**Mensajes de commit:** usaremos **Conventional Commits**, el formato más extendido:

```
tipo(ámbito): descripción corta en imperativo

feat(tasks): add Task entity and DAO
fix(ui): correct card padding on small screens
docs: update README with screenshots
chore: configure gradle version catalog
test(repo): add tests for candy balance
```

✍️ **Enunciado**

1. Instala Git si no lo tienes (`git --version` en la terminal).
2. Configura tu identidad (una sola vez):
   ```bash
   git config --global user.name "Tu Nombre"
   git config --global user.email "tu-email-de-github"
   ```
3. Revisa el `.gitignore` de la raíz. Comprueba que ignora `local.properties`, `/build` y `.gradle`. Añade al final `/app/build` si no está.
4. En GitHub crea un repositorio **público** vacío (sin README, sin .gitignore) llamado, por ejemplo, `freemind`.
5. En la terminal, dentro de `FreeMind`:
   ```bash
   git init -b main
   git add .
   git status        # REVISA que no aparezcan local.properties ni carpetas build
   git commit -m "chore: initial Compose project and course docs"
   git remote add origin https://github.com/TU_USUARIO/freemind.git
   git push -u origin main
   ```
6. Pásame en el hilo el enlace a tu repositorio.

✅ **Criterios de aceptación**
- [ ] El repositorio existe y se ve el código en GitHub.
- [ ] `local.properties` **no** está en GitHub.
- [ ] El commit tiene formato Conventional Commits.

💡 **Pistas**
- Si al hacer `push` pide contraseña: GitHub ya no acepta la contraseña normal. Android Studio puede iniciar sesión por ti (`Settings > Version Control > GitHub`), o puedes usar un *Personal Access Token*.

📦 **Commit:** el del paso 5.

---

# FASE 1 · Kotlin esencial con el modelo de la app 🧠

> A partir de aquí, **cada fase empieza creando su rama**: `git switch -c fase-1`

## Actividad 1.1 · Paquetes y estructura de carpetas

🎯 **Objetivo:** organizar el código por capas desde el principio.

✍️ **Enunciado:** dentro de `com.alberto.freemind` crea estos paquetes (clic derecho > New > Package):

```
com.alberto.freemind
├── data          -> base de datos y repositorios (Fase 4-5)
├── domain        -> modelos y reglas de negocio puras
└── ui            -> pantallas, componentes y tema
    └── theme     -> (ya existe, la creó la plantilla)
```

Mueve el paquete `ui.theme` si la plantilla lo dejó en otro sitio.

✅ Los tres paquetes existen y la app sigue compilando.

📦 **Commit:** junto con la 1.2 (las carpetas vacías no se suben a Git). ✔️ Hecho: `583b022`.

---

## Actividad 1.2 · `enum class`: tipos de tarea, frecuencia y espíritus

🎯 **Objetivo:** modelar valores cerrados con `enum class` y asociarles datos.

📖 **Teoría breve:** un `enum` es un tipo con un conjunto **fijo** de valores. En Kotlin un enum puede tener **propiedades** y **funciones**.

🧩 **Ejemplo análogo (una biblioteca):**

```kotlin
// Género de un libro, con un dato asociado a cada valor
enum class BookGenre(val loanDays: Int) {
    NOVEL(21),
    COMIC(7),
    REFERENCE(0);          // <- el ";" es obligatorio si después hay funciones

    fun canBeBorrowed(): Boolean = loanDays > 0
}

// Uso:
val genre = BookGenre.COMIC
println(genre.loanDays)          // 7
println(genre.canBeBorrowed())   // true
println(BookGenre.entries)       // lista con todos los valores
```

✍️ **Enunciado:** en el paquete `domain`, crea un archivo `Enums.kt` (o uno por enum, como prefieras) con:

1. `TaskType` con los valores `PUNCTUAL`, `MANDATORY`, `OPTIONAL`. Cada valor debe saber:
   - cuántos caramelos da **por defecto** (2, 1 y 5).
   - qué **espíritu** libera (ver punto 3).
2. `Frequency` con `DAILY` y `WEEKLY`.
3. `Spirit` con `SUSUWATARI` y `KODAMA`.

✅ **Criterios de aceptación**
- [ ] `TaskType.MANDATORY.defaultCandies` devuelve `1`.
- [ ] `TaskType.OPTIONAL.spirit` devuelve `Spirit.KODAMA`.
- [ ] Nombres en inglés, comentario en español explicando cada enum.

💡 **Pista:** una propiedad de un enum puede ser de tipo otro enum: `enum class X(val y: OtroEnum)`. Declara `Spirit` antes o después, a Kotlin le da igual.

📦 **Commit (1.1 + 1.2):** `feat(domain): add task types, frequency and spirit enums`. ✔️ Hecho: `583b022`.

🧪 **Test opcional:** no aplica: los enums se prueban en la 1.3 y la 1.5.

---

## Actividad 1.3 · `data class` y null safety: el modelo `Task`

🎯 **Objetivo:** usar `data class`, valores por defecto y tipos que aceptan `null`.

📖 **Teoría breve**

- `data class` genera automáticamente `equals()`, `hashCode()`, `toString()` y `copy()`. Ideal para modelos de datos.
- `val` = no se puede reasignar. `var` = sí. **Preferimos `val`** e inmutabilidad: para "cambiar" un objeto se crea una copia con `copy()`.
- `String?` significa "un String **o null**". Kotlin te obliga a comprobarlo antes de usarlo:
  - `nombre?.length` → si es null, devuelve null en vez de explotar.
  - `nombre ?: "Sin nombre"` → operador Elvis: valor alternativo si es null.

🧩 **Ejemplo análogo:**

```kotlin
import java.time.LocalDate

data class Book(
    val id: Long = 0,                     // valor por defecto
    val title: String,
    val genre: BookGenre,
    val returnDate: LocalDate? = null,    // puede no tener fecha
    val pages: Int = genre.loanDays * 10  // un valor por defecto puede usar otro parámetro anterior
)

val b1 = Book(title = "Nausicaä", genre = BookGenre.COMIC)
val b2 = b1.copy(title = "Nausicaä vol. 2")   // copia cambiando solo el título
println(b2.returnDate?.dayOfMonth ?: "Sin fecha")
```

✍️ **Enunciado:** en `domain`, crea `Task` con:

| Propiedad | Tipo | Notas |
|---|---|---|
| `id` | `Long` | por defecto `0` |
| `title` | `String` | obligatorio |
| `description` | `String` | por defecto vacío |
| `type` | `TaskType` | |
| `candies` | `Int` | por defecto, los del tipo |
| `dueDate` | `LocalDate?` | solo las Puntuales la usan |
| `frequency` | `Frequency?` | solo las Obligatorias la usan |
| `isArchived` | `Boolean` | por defecto `false` (Puntual ya hecha) |

✅ **Criterios de aceptación**
- [ ] `Task(title = "Dentista", type = TaskType.PUNCTUAL).candies` vale `2` sin indicarlo.
- [ ] Todas las propiedades son `val`.

📦 **Commit** (cuando esté aprobada): `feat(domain): add Task model`

🧪 **Test opcional:** en `app/src/test/.../domain/TaskTest.kt` comprueba con `assertEquals` que una Puntual tiene 2 caramelos por defecto, que si pasas `candies = 7` se respeta, y que `copy(title = ...)` solo cambia el título.
Commit: `test(domain): add Task default values tests`

---

## Actividad 1.4 · Funciones, `when` y validación

🎯 **Objetivo:** escribir lógica de negocio pura y usar `when` como expresión.

📖 **Teoría breve:** `when` es el `switch` de Kotlin, pero **devuelve un valor** y, usado con enums, el compilador te avisa si te falta un caso.

🧩 **Ejemplo análogo:**

```kotlin
// Función de extensión: "añade" una función a una clase sin modificarla
fun Book.validationError(): String? = when {
    title.isBlank() -> "El título no puede estar vacío"
    genre == BookGenre.REFERENCE && returnDate != null -> "Los de consulta no se prestan"
    else -> null    // null = todo correcto
}

fun BookGenre.label(): String = when (this) {
    BookGenre.NOVEL -> "Novela"
    BookGenre.COMIC -> "Cómic"
    BookGenre.REFERENCE -> "Consulta"
}
```

✍️ **Enunciado:** en `domain`, crea `TaskRules.kt` con:

1. `fun Task.validationError(): String?` que devuelva un mensaje si:
   - el título está vacío,
   - es `PUNCTUAL` y no tiene `dueDate`,
   - es `MANDATORY` y no tiene `frequency`,
   - `candies` es menor que 1.
   Y `null` si es válida.
2. `fun Task.isPending(lastCompletion: LocalDate?, today: LocalDate): Boolean` que diga si una tarea está pendiente:
   - `PUNCTUAL`: pendiente si no está archivada.
   - `OPTIONAL`: siempre disponible (devuelve `true`).
   - `MANDATORY` + `DAILY`: pendiente si nunca se completó o la última vez no fue `today`.
   - `MANDATORY` + `WEEKLY`: pendiente si la última vez fue **antes del lunes de esta semana**.

💡 **Pistas**
- El lunes de la semana de una fecha: `today.with(java.time.DayOfWeek.MONDAY)`.
- Comparar fechas: `fecha1.isBefore(fecha2)`, `fecha1 == fecha2`.
- Recibir `today` como parámetro (en vez de llamar a `LocalDate.now()` dentro) es **a propósito**: así la función se puede testear con cualquier fecha. Esto es una buena práctica que gusta mucho en entrevistas.

📦 **Commit** (cuando esté aprobada): `feat(domain): add task validation and pending rules`

🧪 **Test:** los tests de estas reglas son la Actividad 1.5 (obligatoria).

---

## Actividad 1.5 · Tus primeros tests unitarios

🎯 **Objetivo:** comprobar automáticamente que tus reglas funcionan.

📖 **Teoría breve:** los tests de `src/test` se ejecutan en tu PC con JUnit. Estructura **AAA**: *Arrange* (preparar), *Act* (ejecutar), *Assert* (comprobar).

🧩 **Ejemplo análogo:**

```kotlin
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
import org.junit.Test

class BookRulesTest {

    @Test
    fun `book with blank title is invalid`() {
        // Arrange
        val book = Book(title = "  ", genre = BookGenre.NOVEL)
        // Act
        val error = book.validationError()
        // Assert
        assertEquals("El título no puede estar vacío", error)
    }

    @Test
    fun `valid novel has no errors`() {
        assertNull(Book(title = "Mononoke", genre = BookGenre.NOVEL).validationError())
    }
}
```

✍️ **Enunciado:** en `app/src/test/java/com/alberto/freemind/domain/` crea `TaskRulesTest` con **al menos 6 tests**: uno por cada error de validación, uno de tarea válida, y como mínimo dos de `isPending` para la semanal (completada este lunes → no pendiente; completada el domingo pasado → pendiente). Borra el `ExampleUnitTest` de la plantilla.

✅ **Criterios de aceptación**
- [ ] Todos los tests pasan (clic derecho sobre la clase > Run).
- [ ] Los nombres de los tests describen el comportamiento.

📦 **Commit** (cuando esté aprobada): `test(domain): add TaskRules unit tests` (incluye borrar `ExampleUnitTest`).

🔀 **Fin de la Fase 1:** cuando todas sus actividades estén aprobadas y subidas, abre en GitHub el Pull Request de `fase-1` a `main` y pásame el enlace. Lo revisamos juntos y lo fusionas.

---

# FASE 2 · Compose básico y tema Ghibli 🎨

## Actividad 2.1 · El tema: colores y tipografía Ghibli

🎯 **Objetivo:** entender `MaterialTheme` y personalizar la paleta.

📖 **Teoría breve:** Material 3 define **roles de color** (`primary`, `secondary`, `background`, `surface`, `onPrimary`…). Tú das los colores una vez en el tema y los componentes los usan solos. Nunca escribas un color "a pelo" en una pantalla: usa `MaterialTheme.colorScheme.primary`.

Paleta sugerida (inspirada en Ghibli, puedes cambiarla):

| Rol | Color | Inspiración |
|---|---|---|
| primary | `#4A7C59` | verde bosque de Mononoke |
| secondary | `#7FB7BE` | cielo de Laputa |
| tertiary | `#E8A87C` | atardecer / caramelo |
| background | `#FBF6E9` | papel acuarela |
| surface | `#FFFDF7` | |
| (oscuro) background | `#1E2A23` | bosque de noche |

🧩 **Sintaxis:**

```kotlin
// Color.kt
val ForestGreen = Color(0xFF4A7C59)   // 0xFF = opacidad total, luego RRGGBB

// Theme.kt
private val LightColors = lightColorScheme(
    primary = ForestGreen,
    background = ...,
)
```

Para una fuente redondeada tipo Ghibli, puedes descargar una de Google Fonts (sugerencia: **Nunito** o **Zen Maru Gothic**), meter los `.ttf` en `res/font/` y usarla en `Type.kt`:

```kotlin
val Nunito = FontFamily(
    Font(R.font.nunito_regular, FontWeight.Normal),
    Font(R.font.nunito_bold, FontWeight.Bold),
)
val Typography = Typography(
    bodyLarge = TextStyle(fontFamily = Nunito, fontSize = 16.sp),
    // ...
)
```

✍️ **Enunciado:** modifica `Color.kt`, `Theme.kt` y `Type.kt` de `ui/theme` con tu paleta (claro y oscuro) y tu fuente. Desactiva el *dynamic color* (`dynamicColor = false`) para que siempre se vean tus colores.

✅ La app arranca con tu fondo y tu fuente, en claro y en oscuro.

📦 **Commit** (cuando esté aprobada): `feat(ui): add Ghibli color scheme and typography`

🧪 **Test opcional:** no aplica: el tema se comprueba a ojo con `@Preview` en claro y oscuro.

---

## Actividad 2.2 · Composables, `Modifier` y `@Preview`

🎯 **Objetivo:** crear tu primer componente reutilizable.

📖 **Teoría breve**

- Un **composable** es una función con `@Composable` que **describe** UI. No devuelve nada; "emite" UI.
- Layouts básicos: `Column` (vertical), `Row` (horizontal), `Box` (apilado).
- `Modifier` encadena tamaño, padding, fondo, clics… **el orden importa**.
- `@Preview` permite ver el componente en Android Studio sin ejecutar la app.

🧩 **Ejemplo análogo:**

```kotlin
@Composable
fun BookCard(book: Book, modifier: Modifier = Modifier) {
    Card(modifier = modifier.fillMaxWidth()) {
        Row(
            modifier = Modifier.padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(modifier = Modifier.weight(1f)) {   // ocupa el espacio sobrante
                Text(book.title, style = MaterialTheme.typography.titleMedium)
                Text(book.genre.label(), style = MaterialTheme.typography.bodySmall)
            }
            Text("${book.pages} págs.")
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun BookCardPreview() {
    MyAppTheme {
        BookCard(Book(title = "El viaje de Chihiro", genre = BookGenre.NOVEL))
    }
}
```

✍️ **Enunciado:** en `ui/components` crea `TaskCard(task: Task, modifier: Modifier = Modifier)` que muestre título, descripción (solo si no está vacía), los caramelos con 🍬, y la fecha si la tiene. Crea **3 previews**: una por tipo de tarea.

✅ **Criterios de aceptación**
- [ ] Las 3 previews se ven bien.
- [ ] `TaskCard` recibe un `modifier` como parámetro (buena práctica de Compose).
- [ ] Los textos fijos ("caramelos", etc.) vienen de `strings.xml` con `stringResource(R.string.xxx)`.

📦 **Commit** (cuando esté aprobada): `feat(ui): add TaskCard component`

🧪 **Test opcional:** tu primer **test de interfaz** en `app/src/androidTest/.../ui/components/TaskCardTest.kt` (se ejecuta en el móvil o el emulador). Con `@get:Rule val rule = createComposeRule()` dibujas la tarjeta con `rule.setContent { TaskCard(...) }` y compruebas que se ve el título (`rule.onNodeWithText("...").assertIsDisplayed()`) y que una tarea sin descripción no la muestra (`assertDoesNotExist()`).
Commit: `test(ui): add TaskCard UI tests`

---

## Actividad 2.3 · Estado: `remember` y `mutableStateOf`

🎯 **Objetivo:** entender cómo Compose redibuja cuando cambia un dato.

📖 **Teoría breve:** Compose vuelve a ejecutar (**recomposición**) los composables cuyo **estado** cambia. `remember { mutableStateOf(x) }` crea un estado que sobrevive a las recomposiciones.

**State hoisting** ("elevar el estado"): un componente bonito y reutilizable **no guarda estado**, lo recibe y avisa con lambdas. Quien lo usa decide.

🧩 **Ejemplo análogo:**

```kotlin
// Componente "tonto": recibe el estado y avisa del evento
@Composable
fun FavoriteButton(isFavorite: Boolean, onToggle: () -> Unit) {
    IconToggleButton(checked = isFavorite, onCheckedChange = { onToggle() }) {
        Icon(
            imageVector = if (isFavorite) Icons.Filled.Favorite else Icons.Outlined.FavoriteBorder,
            contentDescription = null
        )
    }
}

// Quien lo usa guarda el estado
@Composable
fun BookScreen() {
    var fav by remember { mutableStateOf(false) }   // "by" = delegado, usas fav directamente
    FavoriteButton(isFavorite = fav, onToggle = { fav = !fav })
}
```

✍️ **Enunciado:** añade a `TaskCard` un `Checkbox` o botón de completar. `TaskCard` recibirá `isDone: Boolean` y `onDoneClick: () -> Unit`. En la preview, controla el estado con `remember` y comprueba en **modo interactivo** de la preview que se marca y desmarca.

📦 **Commit** (cuando esté aprobada): `feat(ui): add done checkbox to TaskCard`

🧪 **Test opcional:** en `TaskCardTest`, pulsa el check con `performClick()` y comprueba que se llamó a `onDoneClick` (pista: una `var clicked = false` que la lambda pone a `true`).
Commit: `test(ui): check TaskCard done click`

---

## Actividad 2.4 · Listas con `LazyColumn`

🎯 **Objetivo:** mostrar listas largas de forma eficiente.

📖 **Teoría breve:** `LazyColumn` solo dibuja lo que se ve en pantalla (es el equivalente moderno de `RecyclerView`). Usa siempre `key` para que Compose sepa qué elemento es cuál.

🧩 **Ejemplo análogo:**

```kotlin
@Composable
fun BookList(books: List<Book>, modifier: Modifier = Modifier) {
    LazyColumn(
        modifier = modifier,
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(books, key = { it.id }) { book ->
            BookCard(book)
        }
    }
}
```

✍️ **Enunciado:** crea en `ui` un archivo `FakeData.kt` con una lista de ~8 tareas de ejemplo (de los 3 tipos) y una pantalla `TaskListScreen` que las muestre. Ponla en `MainActivity` dentro de un `Scaffold` con una `TopAppBar` que diga el nombre de tu app.

✅ La app muestra la lista con tu tema y se puede hacer scroll.

📦 **Commit** (cuando esté aprobada): `feat(ui): add task list screen with fake data`

🧪 **Test opcional:** no aplica: los datos son falsos y desaparecerán en la Fase 5.

🔀 **Fin de la Fase 2:** cuando todas sus actividades estén aprobadas y subidas, abre en GitHub el Pull Request de `fase-2` a `main` y pásame el enlace. Lo revisamos juntos y lo fusionas.

---

# FASE 3 · Navegación 🧭

## Actividad 3.1 · Añadir dependencias con el catálogo

🎯 **Objetivo:** añadir librerías tú mismo.

✍️ **Enunciado:** añade al catálogo y a `app/build.gradle.kts`:
- `androidx.navigation:navigation-compose`
- El plugin `org.jetbrains.kotlin.plugin.serialization` y la librería `org.jetbrains.kotlinx:kotlinx-serialization-json` (Navigation las usa para las rutas con tipos).
- `androidx.compose.material:material-icons-extended` (más iconos).

🧩 **Sintaxis:**

```toml
[versions]
navigationCompose = "X.Y.Z"   # busca la última estable en developer.android.com/jetpack/androidx/releases/navigation

[libraries]
androidx-navigation-compose = { group = "androidx.navigation", name = "navigation-compose", version.ref = "navigationCompose" }

[plugins]
kotlin-serialization = { id = "org.jetbrains.kotlin.plugin.serialization", version.ref = "kotlin" }  # misma versión que Kotlin
```

```kotlin
// build.gradle.kts raíz
plugins { alias(libs.plugins.kotlin.serialization) apply false }
// app/build.gradle.kts
plugins { alias(libs.plugins.kotlin.serialization) }
dependencies { implementation(libs.androidx.navigation.compose) }
```

💡 **Ojo con tu versión:** tu proyecto usa **AGP 9**, que trae Kotlin integrado; por eso en tu `build.gradle.kts` no verás el plugin `kotlin-android`. El plugin de serialización sí hay que añadirlo como se indica arriba.

✅ Gradle sincroniza sin errores.

📦 **Commit** (cuando esté aprobada): `chore(deps): add navigation, serialization and extended icons`

🧪 **Test opcional:** no aplica: basta con que el proyecto compile tras el Sync.

---

## Actividad 3.2 · Rutas, `NavHost` y barra inferior

🎯 **Objetivo:** navegar entre las 4 pantallas con una `NavigationBar`.

📖 **Teoría breve**
- **Ruta**: identificador de una pantalla. Con Navigation moderno se definen como objetos `@Serializable`.
- **NavController**: el "mando" que navega.
- **NavHost**: el contenedor que muestra la pantalla de la ruta actual.

🧩 **Ejemplo análogo (app de recetas):**

```kotlin
@Serializable object Starters
@Serializable object Desserts
@Serializable data class RecipeDetail(val recipeId: Long)   // ruta con argumento

@Composable
fun RecipesNavHost(navController: NavHostController, modifier: Modifier = Modifier) {
    NavHost(navController, startDestination = Starters, modifier = modifier) {
        composable<Starters> { StartersScreen(onRecipeClick = { id -> navController.navigate(RecipeDetail(id)) }) }
        composable<Desserts> { DessertsScreen() }
        composable<RecipeDetail> { entry ->
            val route = entry.toRoute<RecipeDetail>()
            RecipeDetailScreen(route.recipeId)
        }
    }
}

// Barra inferior
NavigationBar {
    NavigationBarItem(
        selected = currentRoute == Starters,      // ver pista
        onClick = { navController.navigate(Starters) { launchSingleTop = true } },
        icon = { Icon(Icons.Default.Restaurant, contentDescription = null) },
        label = { Text("Entrantes") }
    )
}
```

✍️ **Enunciado**
1. En `ui/navigation` define las rutas: `PunctualRoute`, `MandatoryRoute`, `OptionalRoute`, `IslandRoute`.
2. Crea 4 pantallas provisionales en `ui/screens/...` (de momento, la lista falsa filtrada por tipo; la Isla puede ser un texto).
3. Monta en `MainActivity` un `Scaffold` con `bottomBar = { NavigationBar { ... } }` y el `NavHost` en el contenido (usando el `innerPadding`).
4. Iconos sugeridos: 📅 Event (Puntuales), 🧹 CleaningServices (Obligatorias), 💖 Favorite (Opcionales), 🏝️ Park/BeachAccess (Isla).

✅ **Criterios de aceptación**
- [ ] Se navega entre las 4 pestañas y la seleccionada se marca.
- [ ] Pulsar "atrás" no apila 20 veces la misma pantalla.

💡 **Pistas**
- Ruta actual: `val backStack by navController.currentBackStackEntryAsState()` y luego `backStack?.destination?.hasRoute<PunctualRoute>() == true`.
- Para la barra inferior "de manual": `popUpTo(navController.graph.findStartDestination().id) { saveState = true }`, `launchSingleTop = true`, `restoreState = true`.
- Haz una lista con los 4 destinos (`data class BottomDestination(val route: Any, val icon: ImageVector, @StringRes val label: Int)`) y recórrela con `forEach` para no repetir código.

📦 **Commit** (cuando esté aprobada): `feat(nav): add bottom navigation with four screens`

🧪 **Test opcional:** en `androidTest`, un test de interfaz que pulse la pestaña de la Isla (`onNodeWithText(...).performClick()`) y compruebe que aparece su pantalla.
Commit: `test(nav): add bottom navigation UI test`

🔀 **Fin de la Fase 3:** cuando todas sus actividades estén aprobadas y subidas, abre en GitHub el Pull Request de `fase-3` a `main` y pásame el enlace. Lo revisamos juntos y lo fusionas.

---

# FASE 4 · Base de datos local con Room 🗄️

## 📖 Introducción: de SQL a Room

Ya conoces SQL. Android trae **SQLite**, una base de datos SQL dentro de un archivo en el móvil. **Room** es una capa encima que:
- crea las tablas a partir de clases Kotlin,
- **comprueba tus consultas SQL al compilar** (si escribes mal una columna, no compila),
- convierte las filas en objetos Kotlin automáticamente,
- te avisa cuando los datos cambian (con `Flow`).

| SQL que ya conoces | Room |
|---|---|
| `CREATE TABLE books (...)` | Una clase con `@Entity` |
| Una columna | Una propiedad de la clase (`@ColumnInfo` para renombrarla) |
| `PRIMARY KEY AUTOINCREMENT` | `@PrimaryKey(autoGenerate = true)` |
| `FOREIGN KEY` | `foreignKeys = [ForeignKey(...)]` en `@Entity` |
| `INSERT`, `UPDATE`, `DELETE` | `@Insert`, `@Update`, `@Delete` en un `@Dao` |
| `SELECT ...` | `@Query("SELECT ...")` en un `@Dao` |
| La base de datos | Una clase abstracta con `@Database` |

**Sí, vas a escribir SQL**: todos los `SELECT` (y algunos `UPDATE`/`DELETE` especiales) se escriben a mano dentro de `@Query`.

### Diseño de nuestra base de datos

```
tasks                         task_completions                    rewards
─────────────────             ────────────────────────            ──────────────
id          PK                id            PK                    id        PK
title                         task_id       FK -> tasks.id        name
description                   completed_at  (fecha y hora)        description
type        (TEXT enum)       candies_earned                      cost
candies                       spirit        (TEXT enum)
due_date    (nullable)                                            redemptions
frequency   (nullable)                                            ──────────────
is_archived                                                       id         PK
created_at                                                        reward_id  FK -> rewards.id
                                                                  redeemed_at
                                                                  cost
```

Fíjate en tres ideas de diseño importantes:

1. **No guardamos "el saldo de caramelos"** en ninguna tabla. Se **calcula**: `SUM(candies_earned)` de `task_completions` − `SUM(cost)` de `redemptions`. Así nunca se desincroniza.
2. **El contador semanal de la Isla no se "reinicia" borrando nada**: es una consulta `WHERE completed_at >= lunes de esta semana`. El historial queda intacto.
3. `candies_earned` y `cost` se **copian** en el momento de completar/canjear. ¿Por qué? Si mañana cambias una tarea de 2 a 5 caramelos, lo que ganaste ayer no debe cambiar. (Esto se llama *snapshot* y es una pregunta típica de diseño de BBDD.)

---

## Actividad 4.1 · Añadir Room y KSP

📖 **Teoría breve:** Room **genera código** al compilar (las implementaciones de tus DAO). Para eso usa **KSP** (Kotlin Symbol Processing), un plugin.

✍️ **Enunciado:** añade al catálogo y al módulo `app`:
- Plugin `com.google.devtools.ksp`.
- `androidx.room:room-runtime`, `androidx.room:room-ktx` (como `implementation`) y `androidx.room:room-compiler` (como `ksp(...)`).

🧩 **Sintaxis:**

```kotlin
// app/build.gradle.kts
plugins {
    alias(libs.plugins.ksp)
}
dependencies {
    implementation(libs.androidx.room.runtime)
    implementation(libs.androidx.room.ktx)
    ksp(libs.androidx.room.compiler)        // <- ksp, no implementation
}
```

💡 **Pista:** la versión de KSP **debe ser compatible con tu versión de Kotlin**. Mira tu `kotlin = "..."` en el catálogo y busca en github.com/google/ksp/releases la versión de KSP correspondiente. Si no coinciden, el error lo dirá claramente. Room: última estable en developer.android.com/jetpack/androidx/releases/room.

✅ Gradle sincroniza y la app compila.

📦 **Commit** (cuando esté aprobada): `chore(deps): add Room and KSP`

🧪 **Test opcional:** no aplica: basta con que compile.

---

## Actividad 4.2 · Entidades (`@Entity`)

🧩 **Ejemplo análogo:**

```kotlin
@Entity(tableName = "books")
data class BookEntity(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val title: String,
    val genre: BookGenre,                               // Room guarda los enum como TEXT
    @ColumnInfo(name = "return_date") val returnDate: LocalDate?,   // necesita TypeConverter (4.3)
)

@Entity(
    tableName = "loans",
    foreignKeys = [ForeignKey(
        entity = BookEntity::class,
        parentColumns = ["id"],
        childColumns = ["book_id"],
        onDelete = ForeignKey.CASCADE          // si borras el libro, se borran sus préstamos
    )],
    indices = [Index("book_id")]               // índice en la FK: Room te avisará si falta
)
data class LoanEntity(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    @ColumnInfo(name = "book_id") val bookId: Long,
    @ColumnInfo(name = "loaned_at") val loanedAt: LocalDateTime,
)
```

✍️ **Enunciado:** en `data/local/entity` crea `TaskEntity`, `TaskCompletionEntity`, `RewardEntity` y `RedemptionEntity` según el diseño de arriba.

❓ **Pregunta para responder en el hilo:** si borro una tarea, ¿qué `onDelete` usarías para sus `task_completions`? Piensa qué pasaría con los caramelos que ya ganaste. (Hay más de una respuesta válida; quiero tu razonamiento.)

💡 **Pista:** ¿por qué `TaskEntity` y no reutilizar `Task` de `domain`? Separar el modelo de BBDD del modelo de dominio es una práctica habitual: la BBDD puede cambiar sin romper la app. Necesitarás funciones de conversión `fun TaskEntity.toDomain(): Task` y `fun Task.toEntity(): TaskEntity` (escríbelas en `data/local/mapper`).

📦 **Commit:** junto con la 4.3 (las entidades con fechas necesitan los conversores).

---

## Actividad 4.3 · `TypeConverter` para fechas

📖 **Teoría breve:** SQLite solo sabe guardar `INTEGER`, `REAL`, `TEXT` y `BLOB`. Para guardar `LocalDate` hay que decirle a Room cómo convertirlo.

🧩 **Ejemplo análogo (con `java.time.Duration`):**

```kotlin
class Converters {
    @TypeConverter
    fun durationToLong(value: Duration?): Long? = value?.toMinutes()

    @TypeConverter
    fun longToDuration(value: Long?): Duration? = value?.let { Duration.ofMinutes(it) }
}
```

✍️ **Enunciado:** crea `data/local/Converters.kt` con conversores para:
- `LocalDate` ↔ `Long` (usa `toEpochDay()` / `LocalDate.ofEpochDay()`).
- `LocalDateTime` ↔ `Long` (pista: pasa por `Instant` y `ZoneId.systemDefault()`, guardando milisegundos).

❓ ¿Por qué guardar fechas como número y no como texto `"2026-10-05"`? Piensa en `ORDER BY` y en comparar con `>=`.

📦 **Commit** (cuando esté aprobada): `feat(db): add entities and type converters` (4.2 + 4.3)

🧪 **Test opcional:** en `app/src/test/.../data/local/ConvertersTest.kt` (test normal, no necesita Android) comprueba el "viaje de ida y vuelta": convertir un `LocalDate` a `Long` y de vuelta da la misma fecha. Igual con `LocalDateTime`.
Commit: `test(db): add Converters unit tests`

---

## Actividad 4.4 · DAOs (`@Dao`) y tus primeras consultas

📖 **Teoría breve**
- Las funciones que **escriben** (`@Insert`, `@Update`, `@Delete`, `@Query` de `UPDATE`/`DELETE`) son `suspend`: se ejecutan en segundo plano con corrutinas.
- Las que **leen** y devuelven `Flow<...>` **no** son `suspend`: el `Flow` emite un valor nuevo **cada vez que cambia la tabla**. Esto es lo que hará que tu pantalla se actualice sola.
- En `@Query` usas los parámetros de la función con `:nombre`.

🧩 **Ejemplo análogo:**

```kotlin
@Dao
interface BookDao {

    @Insert
    suspend fun insert(book: BookEntity): Long          // devuelve el id generado

    @Update
    suspend fun update(book: BookEntity)

    @Delete
    suspend fun delete(book: BookEntity)

    @Query("SELECT * FROM books WHERE genre = :genre ORDER BY title ASC")
    fun observeByGenre(genre: BookGenre): Flow<List<BookEntity>>

    @Query("SELECT * FROM books WHERE id = :id")
    suspend fun getById(id: Long): BookEntity?          // lectura puntual, sin Flow

    @Query("SELECT COUNT(*) FROM loans WHERE loaned_at >= :since")
    fun observeLoansSince(since: Long): Flow<Int>

    @Query("SELECT COALESCE(SUM(pages), 0) FROM books")  // COALESCE: 0 si la tabla está vacía
    fun observeTotalPages(): Flow<Int>
}
```

✍️ **Enunciado:** crea en `data/local/dao`:

1. `TaskDao` con: insertar, actualizar, borrar, obtener por id, y **observar las tareas de un tipo** (las Puntuales ordenadas por fecha; no archivadas primero).
2. `TaskCompletionDao` con: insertar, borrar, **observar la última fecha de completado de cada tarea** (pista: `GROUP BY task_id` y `MAX(completed_at)`; necesitarás una pequeña `data class` de resultado con `taskId` y `lastCompletedAt`), **observar el total de caramelos ganados** y **observar cuántos espíritus de cada tipo se rescataron desde una fecha** (pista: `GROUP BY spirit`).
3. `RewardDao` y `RedemptionDao` con lo necesario para el catálogo, el historial y el total gastado.

💡 **Pista sobre resultados personalizados:** si un `SELECT` no devuelve una entidad completa, Room puede mapearlo a cualquier `data class` cuyos nombres de propiedad coincidan con los alias:

```kotlin
data class GenreCount(val genre: BookGenre, val total: Int)

@Query("SELECT genre, COUNT(*) AS total FROM books GROUP BY genre")
fun observeCountByGenre(): Flow<List<GenreCount>>
```

📦 **Commit:** junto con la 4.5 (los DAOs no se pueden usar ni probar sin la base de datos).

---

## Actividad 4.5 · La base de datos (`@Database`)

🧩 **Ejemplo análogo:**

```kotlin
@Database(
    entities = [BookEntity::class, LoanEntity::class],
    version = 1,
    exportSchema = true
)
@TypeConverters(Converters::class)
abstract class LibraryDatabase : RoomDatabase() {
    abstract fun bookDao(): BookDao
    abstract fun loanDao(): LoanDao

    companion object {
        @Volatile private var INSTANCE: LibraryDatabase? = null

        // Singleton: una sola instancia de la BBDD en toda la app
        fun getInstance(context: Context): LibraryDatabase =
            INSTANCE ?: synchronized(this) {
                INSTANCE ?: Room.databaseBuilder(
                    context.applicationContext,
                    LibraryDatabase::class.java,
                    "library.db"
                ).build().also { INSTANCE = it }
            }
    }
}
```

✍️ **Enunciado:** crea `data/local/AppDatabase.kt` con tus 4 entidades. Configura `exportSchema = true` y en `app/build.gradle.kts`:

```kotlin
ksp { arg("room.schemaLocation", "$projectDir/schemas") }
```

❓ ¿Para qué sirve el número `version` y qué pasaría si cambias una entidad sin subirlo? (Lo veremos de verdad en la Fase 9 con una migración.)

📦 **Commit** (cuando esté aprobada): `feat(db): add DAOs and AppDatabase` (4.4 + 4.5)

🧪 **Test:** el test de un DAO es la Actividad 4.6 (obligatoria).

---

## Actividad 4.6 · Test de un DAO

📖 **Teoría breve:** Room permite crear una BBDD **en memoria** para tests: se crea limpia en cada test y desaparece al acabar. Estos tests van en `androidTest` (necesitan Android).

🧩 **Ejemplo análogo:**

```kotlin
@RunWith(AndroidJUnit4::class)
class BookDaoTest {
    private lateinit var db: LibraryDatabase
    private lateinit var dao: BookDao

    @Before
    fun setUp() {
        db = Room.inMemoryDatabaseBuilder(
            ApplicationProvider.getApplicationContext(),
            LibraryDatabase::class.java
        ).build()
        dao = db.bookDao()
    }

    @After
    fun tearDown() = db.close()

    @Test
    fun insertedBookAppearsInGenreList() = runTest {
        dao.insert(BookEntity(title = "Totoro", genre = BookGenre.COMIC, returnDate = null))
        val comics = dao.observeByGenre(BookGenre.COMIC).first()   // primer valor del Flow
        assertEquals("Totoro", comics.single().title)
    }
}
```

✍️ **Enunciado:** crea `TaskCompletionDaoTest` con al menos 3 tests: el total de caramelos es 0 sin datos, el total suma bien tras varias inserciones, y el recuento de espíritus desde una fecha ignora los anteriores a esa fecha.

💡 Necesitarás `androidx.room:room-testing` y `org.jetbrains.kotlinx:kotlinx-coroutines-test` como `androidTestImplementation`.

✅ **Extra:** ejecuta la app y abre **App Inspection > Database Inspector** en Android Studio. ¡Puedes lanzar SQL a mano contra la BBDD del emulador!

📦 **Commit** (cuando esté aprobada): `test(db): add TaskCompletionDao tests`

🧪 **Test opcional:** con la misma técnica de BBDD en memoria, prueba `TaskDao`: insertar una tarea y leerla por id devuelve lo mismo, y observar las Puntuales las da ordenadas por fecha.
Commit: `test(db): add TaskDao tests`

🔀 **Fin de la Fase 4:** cuando todas sus actividades estén aprobadas y subidas, abre en GitHub el Pull Request de `fase-4` a `main` y pásame el enlace. Lo revisamos juntos y lo fusionas.

---

# FASE 5 · Arquitectura MVVM 🏛️

## 📖 Introducción

- **Repository:** la única clase que habla con los DAO. La UI no sabe si los datos vienen de Room, de internet o de un archivo.
- **ViewModel:** sobrevive a los giros de pantalla. Expone un **estado de UI** (`StateFlow<UiState>`) y funciones para los eventos (`onTaskDone(id)`).
- **Pantalla:** observa el estado y lo dibuja. **No contiene lógica**.

Flujo de datos unidireccional (**UDF**):

```
   evento (clic)                      nuevo estado
Pantalla ───────────> ViewModel ───────────────────> Pantalla
                         │  ▲
                 llama   ▼  │ Flow
                       Repository ──> DAO ──> Room
```

## Actividad 5.1 · Corrutinas y Flow: lo mínimo

🧩 **Ejemplo análogo:**

```kotlin
// Una función suspend puede "esperar" sin bloquear el hilo
suspend fun loadBook(id: Long): Book { ... }

// Lanzar una corrutina desde un ViewModel
viewModelScope.launch {
    repository.deleteBook(book)
}

// Transformar Flows
val titles: Flow<List<String>> = dao.observeByGenre(COMIC).map { list -> list.map { it.title } }

// Combinar dos Flows: emite cada vez que cambia cualquiera de los dos
val balance: Flow<Int> = combine(earnedFlow, spentFlow) { earned, spent -> earned - spent }

// Convertir un Flow en StateFlow (lo que observa la UI)
val uiState: StateFlow<BooksUiState> = titles
    .map { BooksUiState(titles = it) }
    .stateIn(
        scope = viewModelScope,
        started = SharingStarted.WhileSubscribed(5_000),
        initialValue = BooksUiState(isLoading = true)
    )
```

✍️ **Enunciado:** no hay código aún. Responde en el hilo: ¿qué diferencia hay entre una función `suspend` y una que devuelve `Flow`? ¿Por qué el DAO de lectura devuelve `Flow` y el de escritura es `suspend`?

📦 **Commit:** no hay (actividad teórica).

---

## Actividad 5.2 · El Repository

✍️ **Enunciado:** en `data/repository` crea `TaskRepository` (clase normal que recibe los DAOs en el constructor) con funciones que trabajen con modelos de **dominio** (`Task`, no `TaskEntity`):

- `fun observeTasks(type: TaskType): Flow<List<Task>>`
- `suspend fun getTask(id: Long): Task?`
- `suspend fun saveTask(task: Task)` → si `id == 0` inserta; si no, actualiza.
- `suspend fun deleteTask(task: Task)`

> 💼 **Nivel profesional (opcional):** define `TaskRepository` como `interface` y una implementación `OfflineTaskRepository`. Así en los tests podrás usar un repositorio falso. Lo usaremos en la Fase 10.

📦 **Commit** (cuando esté aprobada): `feat(data): add TaskRepository`

🧪 **Test opcional:** si has creado funciones de conversión (`toDomain()` / `toEntity()`), comprueba en un test normal que `task.toEntity().toDomain() == task`. Aquí el `data class` te regala el `equals()`.
Commit: `test(data): add task mapper tests`

---

## Actividad 5.3 · Inyección de dependencias "a mano": el `AppContainer`

📖 **Teoría breve:** el ViewModel necesita el Repository, que necesita los DAO, que necesitan la BBDD, que necesita un `Context`. ¿Quién crea todo eso? Un **contenedor** que vive en la clase `Application` (se crea una vez al arrancar la app). Más adelante Hilt lo hará por nosotros, pero hacerlo a mano primero te hará entender qué hace Hilt.

🧩 **Ejemplo análogo:**

```kotlin
class LibraryContainer(context: Context) {
    private val db = LibraryDatabase.getInstance(context)
    val bookRepository: BookRepository by lazy { BookRepository(db.bookDao()) }  // lazy: se crea al usarlo
}

class LibraryApp : Application() {
    lateinit var container: LibraryContainer
    override fun onCreate() {
        super.onCreate()
        container = LibraryContainer(this)
    }
}
// Y en AndroidManifest.xml:  <application android:name=".LibraryApp" ... >
```

✍️ **Enunciado:** crea `AppContainer` y tu clase `Application` (ej. `FreeMindApp`) y regístrala en el Manifest.

📦 **Commit** (cuando esté aprobada): `feat(app): add AppContainer and Application class`

🧪 **Test opcional:** no aplica: se comprueba al arrancar la app en la 5.4.

---

## Actividad 5.4 · ViewModel + UiState de Puntuales

🧩 **Ejemplo análogo:**

```kotlin
data class ComicsUiState(
    val books: List<Book> = emptyList(),
    val isLoading: Boolean = false,
)

class ComicsViewModel(private val repository: BookRepository) : ViewModel() {

    val uiState: StateFlow<ComicsUiState> = repository.observeByGenre(BookGenre.COMIC)
        .map { ComicsUiState(books = it) }
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5_000), ComicsUiState(isLoading = true))

    fun onDelete(book: Book) {
        viewModelScope.launch { repository.delete(book) }
    }

    companion object {
        // Fábrica: le dice a Android cómo crear este ViewModel con sus dependencias
        val Factory = viewModelFactory {
            initializer {
                val app = this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as LibraryApp
                ComicsViewModel(app.container.bookRepository)
            }
        }
    }
}

// En la pantalla:
@Composable
fun ComicsScreen(viewModel: ComicsViewModel = viewModel(factory = ComicsViewModel.Factory)) {
    val state by viewModel.uiState.collectAsStateWithLifecycle()
    ComicsContent(state = state, onDelete = viewModel::onDelete)   // separamos "pantalla" y "contenido"
}
```

✍️ **Enunciado**
1. Añade `androidx.lifecycle:lifecycle-viewmodel-compose` y `androidx.lifecycle:lifecycle-runtime-compose`.
2. Crea `PunctualViewModel` + `PunctualUiState` y conecta `PunctualScreen` a la BBDD real.
3. Divide la pantalla en `PunctualScreen` (conecta con el ViewModel) y `PunctualContent(state, ...)` (solo dibuja). La preview se hace de `PunctualContent` con datos falsos.
4. Como aún no hay formulario, añade un `FloatingActionButton` que inserte una tarea de prueba para comprobar que la lista se actualiza sola.
5. Si la lista está vacía, muestra un mensaje amable ("Ningún Kodama necesita ayuda ahora mismo 🌿").

✅ **Criterios de aceptación**
- [ ] Al pulsar el FAB aparece la tarea sin recargar nada.
- [ ] Al cerrar y abrir la app, las tareas siguen ahí (¡persistencia!).
- [ ] La pantalla no llama nunca a un DAO directamente.

📦 **Commit** (cuando esté aprobada): `feat(punctual): connect punctual screen to database`

🧪 **Test opcional:** en `androidTest`, dibuja `PunctualContent` con un estado de lista vacía y comprueba que aparece el mensaje amable. Aquí ves la ventaja de separar `Screen` y `Content`: se puede probar sin base de datos.
Commit: `test(punctual): add empty state UI test`

🔀 **Fin de la Fase 5:** cuando todas sus actividades estén aprobadas y subidas, abre en GitHub el Pull Request de `fase-5` a `main` y pásame el enlace. Lo revisamos juntos y lo fusionas.

---

# FASE 6 · CRUD completo de tareas ✏️

## Actividad 6.1 · Formulario de tarea (crear y editar)

🎯 **Objetivo:** formularios en Compose, validación y navegación con argumentos.

📖 **Teoría breve:** el estado del formulario vive en el ViewModel. Cada campo es una propiedad del `UiState` y cada cambio es un evento.

🧩 **Ejemplo análogo:**

```kotlin
data class BookFormState(
    val title: String = "",
    val genre: BookGenre = BookGenre.NOVEL,
    val error: String? = null,
    val isSaved: Boolean = false,
)

class BookFormViewModel(...) : ViewModel() {
    private val _state = MutableStateFlow(BookFormState())   // privado y mutable
    val state: StateFlow<BookFormState> = _state.asStateFlow() // público y solo lectura

    fun onTitleChange(value: String) = _state.update { it.copy(title = value, error = null) }

    fun onSave() {
        val book = Book(title = _state.value.title, genre = _state.value.genre)
        val error = book.validationError()
        if (error != null) { _state.update { it.copy(error = error) }; return }
        viewModelScope.launch {
            repository.save(book)
            _state.update { it.copy(isSaved = true) }
        }
    }
}

// UI
OutlinedTextField(
    value = state.title,
    onValueChange = viewModel::onTitleChange,
    label = { Text(stringResource(R.string.title)) },
    isError = state.error != null,
    supportingText = { state.error?.let { Text(it) } }
)
```

✍️ **Enunciado**
1. Ruta `TaskFormRoute(val taskId: Long? = null, val type: TaskType)`: sin `taskId` crea; con `taskId` edita.
2. `TaskFormViewModel` + `TaskFormScreen` con: título, descripción, caramelos (con valor por defecto del tipo y botones − / +), y según el tipo, **selector de fecha** (Puntual, usa `DatePickerDialog` de Material 3) o **selector de frecuencia** (Obligatoria, `SegmentedButton` o `RadioButton`).
3. Reutiliza `validationError()` de la Fase 1.
4. Al guardar, vuelve atrás (`navController.popBackStack()`).
5. El FAB de cada lista abre el formulario con su tipo. Pulsar una tarjeta abre el formulario en modo edición.

💡 **Pistas**
- El ViewModel puede leer los argumentos de la ruta con `SavedStateHandle`: `savedStateHandle.toRoute<TaskFormRoute>()`.
- Para reaccionar a `isSaved` en la UI: `LaunchedEffect(state.isSaved) { if (state.isSaved) onDone() }`.

📦 **Commit** (cuando esté aprobada): `feat(tasks): add create/edit task form`

🧪 **Test opcional:** en `androidTest`, dibuja el contenido del formulario con el título vacío, pulsa Guardar y comprueba que se ve el mensaje de error.
Commit: `test(tasks): add task form validation UI test`

---

## Actividad 6.2 · Pantallas de Obligatorias y Opcionales

✍️ **Enunciado**
1. `MandatoryViewModel`: combina (`combine`) las tareas obligatorias con las "últimas fechas de completado" del DAO y usa tu `isPending()` de la Fase 1 para separar **Pendientes** y **Hechas**. Muéstralas en dos secciones con cabecera (`stickyHeader` o un `item { Text(...) }`).
2. Indica en cada tarjeta si es diaria o semanal.
3. `OptionalViewModel` + pantalla: lista simple.
4. Revisa que las 3 pantallas comparten `TaskCard`. Si hay código repetido en ellas, extráelo.

❓ ¿Cómo sabe la pantalla de Obligatorias que ha cambiado el día si la app se queda abierta a medianoche? (Piénsalo; hay una solución sencilla y otra elegante. Lo hablamos.)

📦 **Commit** (cuando esté aprobada): `feat(tasks): add mandatory and optional screens`

🧪 **Test opcional:** si sacas a `domain` la lógica que separa Pendientes y Hechas (una función pura que recibe tareas, últimas fechas y `today`), pruébala con un test normal con fechas fijas.
Commit: `test(domain): add pending and done split tests`

---

## Actividad 6.3 · Borrar con confirmación

✍️ **Enunciado:** permite borrar una tarea deslizándola (`SwipeToDismissBox`) o desde el formulario de edición, **siempre** con un `AlertDialog` de confirmación ("¿Seguro que quieres borrar esta tarea?").

✅ **Criterios de aceptación de la fase**
- [ ] Se pueden crear, editar y borrar tareas de los 3 tipos.
- [ ] No se puede guardar una tarea inválida y el error se ve junto al campo.
- [ ] Al girar la pantalla en mitad del formulario no se pierden los datos.

📦 **Commit** (cuando esté aprobada): `feat(tasks): add delete with confirmation`

🧪 **Test opcional:** no aplica: se prueba a mano (deslizar, cancelar, confirmar).

🔀 **Fin de la Fase 6:** cuando todas sus actividades estén aprobadas y subidas, abre en GitHub el Pull Request de `fase-6` a `main` y pásame el enlace. Lo revisamos juntos y lo fusionas.

---

# FASE 7 · Caramelos y rescates 🍬

## Actividad 7.1 · Completar una tarea (transacción)

📖 **Teoría breve:** completar una tarea Puntual implica **dos escrituras**: insertar la completion y archivar la tarea. Si la app se cerrara justo entre las dos, los datos quedarían incoherentes. Una **transacción** garantiza que se hacen **las dos o ninguna** (igual que `BEGIN TRANSACTION ... COMMIT` en SQL).

🧩 **Ejemplo análogo:**

```kotlin
// Opción A: en el DAO
@Dao
interface LoanDao {
    @Transaction
    suspend fun lendBook(loan: LoanEntity, book: BookEntity) {
        insertLoan(loan)
        updateBook(book.copy(isAvailable = false))
    }
}

// Opción B: en el repositorio
db.withTransaction {           // de room-ktx
    loanDao.insert(loan)
    bookDao.update(...)
}
```

✍️ **Enunciado**
1. En el repositorio, `suspend fun completeTask(task: Task, now: LocalDateTime)` que inserte la completion copiando `candies` y el `spirit` del tipo, y si es Puntual la archive. En una transacción.
2. `suspend fun undoCompletion(...)` para poder deshacer (Puntuales: desarchivar; Obligatorias: borrar la completion de hoy/esta semana).
3. Conecta el check de `TaskCard` en las 3 pantallas.

📦 **Commit** (cuando esté aprobada): `feat(candies): complete and undo tasks in a transaction`

🧪 **Test opcional:** en `androidTest`, con BBDD en memoria: completar una Puntual la archiva y guarda una completion con sus caramelos; deshacer la desarchiva.
Commit: `test(data): add complete and undo tests`

---

## Actividad 7.2 · El saldo de caramelos siempre visible

✍️ **Enunciado:**
1. `CandyRepository` (o dentro de otro repositorio, tú decides y lo justificas) con `fun observeBalance(): Flow<Int>` combinando ganados − gastados.
2. Muestra el saldo en la `TopAppBar` de todas las pantallas (ej. `🍬 23`). Piensa **qué ViewModel** debería exponerlo si está en el `Scaffold` común.

📦 **Commit** (cuando esté aprobada): `feat(candies): show candy balance in top bar`

🧪 **Test opcional:** con BBDD en memoria, comprueba que el saldo es ganados − gastados (inserta completions y un canje a mano).
Commit: `test(data): add candy balance tests`

---

## Actividad 7.3 · "¡Has liberado a un Susuwatari!"

✍️ **Enunciado:** al completar una tarea muestra un `Snackbar` con el espíritu liberado y los caramelos ganados, con acción **"Deshacer"**.

🧩 **Sintaxis:**

```kotlin
val snackbarHostState = remember { SnackbarHostState() }
val scope = rememberCoroutineScope()
Scaffold(snackbarHost = { SnackbarHost(snackbarHostState) }) { ... }

scope.launch {
    val result = snackbarHostState.showSnackbar(
        message = "...", actionLabel = "Deshacer", duration = SnackbarDuration.Short
    )
    if (result == SnackbarResult.ActionPerformed) { /* deshacer */ }
}
```

💡 **Pista profesional:** los mensajes "de un solo uso" (como un snackbar) no son estado permanente. Investiga cómo exponer **eventos** desde un ViewModel (`Channel` + `receiveAsFlow()`) y comenta conmigo qué ventajas tiene frente a meterlo en el `UiState`.

✅ **Criterios de aceptación de la fase**
- [ ] Completar suma caramelos al saldo; deshacer los resta.
- [ ] Una Obligatoria diaria completada hoy pasa a "Hechas" y mañana vuelve a "Pendientes".
- [ ] Una Opcional se puede completar varias veces y suma cada vez.

📦 **Commit** (cuando esté aprobada): `feat(candies): add rescue snackbar with undo`

🧪 **Test opcional:** no aplica: se prueba a mano.

🔀 **Fin de la Fase 7:** cuando todas sus actividades estén aprobadas y subidas, abre en GitHub el Pull Request de `fase-7` a `main` y pásame el enlace. Lo revisamos juntos y lo fusionas.

---

# FASE 8 · La Isla del Descanso 🏝️

## Actividad 8.1 · Catálogo de recompensas

✍️ **Enunciado:** en la pantalla Isla, una sección **Catálogo** con las recompensas (nombre, descripción, coste en 🍬) y un formulario para crear/editar/borrar recompensas (reutiliza lo aprendido en la Fase 6). Ejemplos para probar: "1 h de videojuegos" (6 🍬), "Tarde de hobby" (10 🍬), "Capítulo de serie" (3 🍬).

📦 **Commit** (cuando esté aprobada): `feat(island): add rewards catalog`

🧪 **Test opcional:** no aplica: es el mismo patrón que el formulario de la Fase 6.

## Actividad 8.2 · Canjear

✍️ **Enunciado**
1. Botón **Canjear** en cada recompensa. Desactivado (`enabled = false`) si el saldo no llega.
2. Al pulsar, `AlertDialog` de confirmación y, si acepta, inserta una `redemption` copiando el coste.
3. **Doble seguridad**: aunque el botón esté desactivado, el repositorio debe comprobar el saldo antes de insertar (la UI nunca es la única barrera). Devuelve un resultado que indique si fue bien.

🧩 **Ejemplo análogo de resultado tipado:**

```kotlin
sealed interface LoanResult {
    data object Success : LoanResult
    data class NotAvailable(val reason: String) : LoanResult
}

when (val r = repository.lend(book)) {
    LoanResult.Success -> ...
    is LoanResult.NotAvailable -> showError(r.reason)
}
```

📦 **Commit** (cuando esté aprobada): `feat(island): redeem rewards with balance check`

🧪 **Test opcional:** **muy recomendado.** Con BBDD en memoria, comprueba que el repositorio **rechaza** un canje si el saldo no llega y que no inserta nada. Es la "doble seguridad" del enunciado.
Commit: `test(island): add redemption balance check tests`

## Actividad 8.3 · Historial de canjes

✍️ **Enunciado:** sección **Historial** con los canjes ordenados del más reciente al más antiguo: nombre de la recompensa, coste y fecha formateada en español (ej. "lun 5 oct, 18:30").

💡 **Pistas**
- Necesitas datos de dos tablas: `JOIN` en el `@Query` y una `data class` de resultado, **o** una relación de Room con `@Relation`. Prueba con `JOIN`: es SQL que ya conoces.
- Formatear: `DateTimeFormatter.ofPattern("EEE d MMM, HH:mm", Locale("es", "ES"))`.

📦 **Commit** (cuando esté aprobada): `feat(island): add redemption history`

🧪 **Test opcional:** saca el formateo de fecha a una función y comprueba en un test normal que `LocalDateTime.of(2026, 10, 5, 18, 30)` da `"lun 5 oct, 18:30"`.
Commit: `test(island): add history date format test`

## Actividad 8.4 · Los espíritus de la semana

✍️ **Enunciado:** la parte más bonita de la Isla. Muestra los Susuwatari y Kodamas **rescatados esta semana** (desde el lunes a las 00:00):
1. Un contador de cada uno ("12 Susuwatari · 7 Kodamas").
2. Una cuadrícula (`LazyVerticalGrid` o `FlowRow`) con un dibujito por cada espíritu rescatado (de momento un emoji o un círculo; en la Fase 9 los dibujaremos).
3. El lunes la isla aparece vacía de nuevo, pero el historial y el saldo **no** se tocan.

💡 **Pista:** la fecha "lunes de esta semana a las 00:00" la calculas en el ViewModel/Repository y se la pasas al DAO. Reutiliza la consulta con `GROUP BY spirit` de la Fase 4.

✅ **Criterios de aceptación de la fase**
- [ ] Puedo crear recompensas, canjearlas si tengo saldo y ver el historial.
- [ ] El saldo nunca puede quedar negativo.
- [ ] El recuento semanal es correcto (pruébalo cambiando la fecha del emulador).

📦 **Commit** (cuando esté aprobada): `feat(island): show spirits rescued this week`

🧪 **Test opcional:** prueba la función que calcula "el lunes de esta semana a las 00:00" con un miércoles, un lunes y un domingo.
Commit: `test(island): add start of week tests`

🔀 **Fin de la Fase 8:** cuando todas sus actividades estén aprobadas y subidas, abre en GitHub el Pull Request de `fase-8` a `main` y pásame el enlace. Lo revisamos juntos y lo fusionas.

---

# FASE 9 · Pulido Ghibli ✨

## Actividad 9.1 · Dibujar un Susuwatari con `Canvas`

📖 **Teoría breve:** `Canvas` de Compose te deja dibujar formas a mano: círculos, líneas, caminos. Un Susuwatari es un círculo negro con "pelitos" y dos ojos; un Kodama, una cabeza blanca redondeada con ojos y boca negros.

🧩 **Ejemplo análogo (un sol):**

```kotlin
@Composable
fun Sun(modifier: Modifier = Modifier) {
    Canvas(modifier = modifier.size(64.dp)) {
        val center = this.center
        val radius = size.minDimension / 4
        // rayos
        repeat(12) { i ->
            val angle = Math.toRadians(i * 30.0)
            val start = center + Offset((radius * 1.3f * cos(angle)).toFloat(), (radius * 1.3f * sin(angle)).toFloat())
            val end = center + Offset((radius * 1.9f * cos(angle)).toFloat(), (radius * 1.9f * sin(angle)).toFloat())
            drawLine(Color(0xFFFFC107), start, end, strokeWidth = 4f, cap = StrokeCap.Round)
        }
        drawCircle(Color(0xFFFFC107), radius, center)
    }
}
```

✍️ **Enunciado:** crea `SusuwatariIcon` y `KodamaIcon` con `Canvas` y úsalos en la Isla y en el snackbar/tarjetas.

📦 **Commit** (cuando esté aprobada): `feat(ui): draw susuwatari and kodama with Canvas`

🧪 **Test opcional:** no aplica: se comprueba con `@Preview`.

## Actividad 9.2 · Animaciones

✍️ **Enunciado** (elige al menos 3):
- Los Susuwatari de la Isla "botan" suavemente (`rememberInfiniteTransition`).
- El contador de caramelos anima el número al cambiar (`animateIntAsState` o `AnimatedContent`).
- Las tarjetas completadas se desvanecen (`AnimatedVisibility`, `animateItem()` en `LazyColumn`).
- El Kodama gira la cabeza (`graphicsLayer { rotationZ = ... }`), como en *La Princesa Mononoke*.

📦 **Commit** (cuando esté aprobada): `feat(ui): add animations`

🧪 **Test opcional:** no aplica.

## Actividad 9.3 · Icono, splash y modo oscuro

✍️ **Enunciado**
1. Icono adaptativo con `Image Asset Studio` (clic derecho en `res` > New > Image Asset).
2. Splash screen con la API `core-splashscreen`.
3. Revisa todas las pantallas en modo oscuro ("bosque de noche").
4. Revisa accesibilidad: `contentDescription` en iconos que significan algo y tamaño mínimo de botones (48 dp).

📦 **Commit** (cuando esté aprobada): `feat(app): add adaptive icon, splash screen and dark mode fixes`

🧪 **Test opcional:** no aplica: revisión visual y de accesibilidad.

## Actividad 9.4 · Tu primera migración de BBDD

✍️ **Enunciado:** añade un campo nuevo (por ejemplo `emoji` en `RewardEntity`, para que cada recompensa tenga su icono). Sube `version` a 2 y escribe una `Migration(1, 2)` con `ALTER TABLE`. Comprueba que **no pierdes los datos** que ya tenías en el móvil.

📦 **Commit** (cuando esté aprobada): `feat(db): add reward emoji with migration to v2`

🧪 **Test opcional:** un test de migración con `MigrationTestHelper` (librería `androidx.room:room-testing`) que cree la BBDD en versión 1, la migre a la 2 y compruebe que los datos siguen ahí.
Commit: `test(db): add migration 1 to 2 test`

🔀 **Fin de la Fase 9:** cuando todas sus actividades estén aprobadas y subidas, abre en GitHub el Pull Request de `fase-9` a `main` y pásame el enlace. Lo revisamos juntos y lo fusionas.

---

# FASE 10 · Nivel profesional 💼

## Actividad 10.1 · Hilt

📖 **Teoría breve:** Hilt sustituye a tu `AppContainer`: anotas qué se puede crear y cómo, y Hilt lo "inyecta" donde haga falta.

🧩 **Sintaxis:**

```kotlin
@HiltAndroidApp class LibraryApp : Application()

@AndroidEntryPoint class MainActivity : ComponentActivity()

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {
    @Provides @Singleton
    fun provideDb(@ApplicationContext ctx: Context): LibraryDatabase = Room.databaseBuilder(...).build()

    @Provides
    fun provideBookDao(db: LibraryDatabase): BookDao = db.bookDao()
}

class BookRepository @Inject constructor(private val dao: BookDao)

@HiltViewModel
class ComicsViewModel @Inject constructor(private val repo: BookRepository) : ViewModel()

// En Compose:
val vm: ComicsViewModel = hiltViewModel()
```

✍️ **Enunciado:** migra la app a Hilt y **elimina** `AppContainer` y las `Factory` de los ViewModels.

📦 **Commit** (cuando esté aprobada): `refactor(di): migrate to Hilt`

🧪 **Test:** no hay test nuevo, pero ejecuta **todos** los que tengas: un `refactor` no debe romper ninguno.

## Actividad 10.2 · Tests de ViewModel

✍️ **Enunciado:** crea un `FakeTaskRepository` (implementa tu interfaz con listas en memoria) y testea `MandatoryViewModel`: que separa bien pendientes y hechas, y que al completar una tarea cambia de sección. Para inyectar "hoy", usa un `java.time.Clock` en el constructor (igual que hicimos con `today` en la Fase 1).

📦 **Commit** (cuando esté aprobada): `test(vm): add MandatoryViewModel tests` (si antes tienes que convertir `TaskRepository` en interfaz, hazlo en un commit previo: `refactor(data): extract TaskRepository interface`).

## Actividad 10.3 · Integración continua con GitHub Actions

✍️ **Enunciado:** crea `.github/workflows/android.yml` que, en cada push y Pull Request, compile la app y ejecute los tests unitarios (`./gradlew testDebugUnitTest assembleDebug`). Añade el *badge* al README.

📦 **Commit** (cuando esté aprobada): `ci: add GitHub Actions build and test workflow`

🧪 **Test:** el propio workflow ejecuta todos tus tests en cada push.

## Actividad 10.4 · README de portfolio y release

✍️ **Enunciado**
1. `README.md` en la raíz: descripción, capturas/GIF, stack, arquitectura (puedes reutilizar el diagrama de esta guía), cómo ejecutarla y qué has aprendido.
2. Genera un APK firmado (`Build > Generate Signed App Bundle / APK`). **Nunca** subas el keystore ni sus contraseñas a GitHub.
3. Crea una **Release** en GitHub con el APK adjunto.

📦 **Commit** (cuando esté aprobada): `docs: add portfolio README`. Después, la Release en GitHub con su etiqueta (`v1.0.0`).

🔀 **Fin de la Fase 10:** cuando todas sus actividades estén aprobadas y subidas, abre en GitHub el Pull Request de `fase-10` a `main` y pásame el enlace. Lo revisamos juntos y lo fusionas.

---

## 🌟 Ideas extra (cuando acabes)

- **Recordatorios** de tareas Puntuales con notificaciones y `WorkManager`.
- **Rachas** de días con todas las Obligatorias hechas (sin castigos, solo celebración).
- **Temporizador** en la Isla del Descanso para el tiempo canjeado.
- **Widget** de pantalla de inicio con las tareas de hoy (Jetpack Glance).
- **Exportar/importar** la BBDD como copia de seguridad.
- **DataStore** para preferencias (nombre del usuario, tema).

---

## 📚 Recursos

- Documentación oficial: https://developer.android.com/develop/ui/compose
- Codelabs oficiales "Android Basics with Compose": https://developer.android.com/courses/android-basics-compose/course
- Room: https://developer.android.com/training/data-storage/room
- Kotlin: https://kotlinlang.org/docs/home.html
- Conventional Commits: https://www.conventionalcommits.org/es/v1.0.0/
