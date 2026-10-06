# 📋 Seguimiento del Proyecto: FreeMind (App de Tareas)

> Documento de corrección y feedback. Lo relleno yo (Claude) cada vez que me escribes **"Actividad X.Y lista"** en el hilo.
> Las actividades están descritas en [`GUIA_PROYECTO.md`](GUIA_PROYECTO.md).

---

## 🧭 Cómo leer este documento

### Estados

| Estado | Significado |
|---|---|
| ⬜ Pendiente | Aún no empezada. |
| 🔵 En curso | La estás haciendo. |
| 🟡 En revisión | Me has pedido corrección. |
| 🟠 Correcciones | Hay cosas que **debes** cambiar antes del commit. |
| ✅ Aprobada | Lista para commit y push. |
| 📦 Subida | Commit hecho y en GitHub. |

### Tipos de comentario

- ❌ **Error**: algo que no funciona o incumple un criterio. **Obligatorio corregir.**
- ⚠️ **A mejorar**: funciona, pero no es buena práctica. **Obligatorio corregir** salvo que me convenzas de lo contrario.
- 💡 **Sugerencia**: idea para mejorar o aprender más. **Opcional.**
- 🌟 **Bien hecho**: algo que merece la pena destacar.
- ❓ **Pregunta**: algo que quiero que me expliques o razones.

### Rúbrica (cada criterio de 1 a 4)

> Se aplica a partir de la Fase 1. Las actividades de configuración de la Fase 0 solo se marcan como aprobadas o no.

| Criterio | 1 · Insuficiente | 2 · Suficiente | 3 · Notable | 4 · Excelente |
|---|---|---|---|---|
| **Funciona** | No compila o no cumple el enunciado | Cumple con fallos menores | Cumple todos los criterios | Cumple y cubre casos límite |
| **Código limpio** | Difícil de leer | Legible con nombres mejorables | Claro y bien organizado | Claro, conciso e idiomático |
| **Kotlin / Android** | No usa las herramientas vistas | Las usa a medias | Las usa correctamente | Las usa con criterio y sabe explicar por qué |
| **Arquitectura** | Mezcla capas | Alguna fuga entre capas | Capas bien separadas | Separación ejemplar y testeable |
| **Git** | Sin commit o mensaje pobre | Mensaje mejorable | Conventional Commits | Commits atómicos y bien descritos |

---

## 📊 Resumen de progreso

| Act. | Título | Estado | Nota (/20) | Commit |
|---|---|---|---|---|
| **0.1** | Recrear el proyecto con Compose | 📦 | — | `bea0e7a` (en la 0.3) |
| **0.2** | Entender la estructura del proyecto | ✅ | — | — |
| **0.3** | Git y GitHub | 📦 | — | `bea0e7a` |
| **1.1** | Paquetes | 📦 | | `583b022` |
| **1.2** | `enum class` | 📦 | | `583b022` |
| **1.3** | `data class` Task | ✅ | | |
| **1.4** | Reglas de negocio con `when` | ⬜ | | |
| **1.5** | Tests unitarios | ⬜ | | |
| **2.1** | Tema Ghibli | ⬜ | | |
| **2.2** | `TaskCard` y previews | ⬜ | | |
| **2.3** | Estado y state hoisting | ⬜ | | |
| **2.4** | `LazyColumn` | ⬜ | | |
| **3.1** | Dependencias | ⬜ | | |
| **3.2** | Navegación y barra inferior | ⬜ | | |
| **4.1** | Room y KSP | ⬜ | | |
| **4.2** | Entidades | ⬜ | | |
| **4.3** | TypeConverters | ⬜ | | |
| **4.4** | DAOs | ⬜ | | |
| **4.5** | AppDatabase | ⬜ | | |
| **4.6** | Test de DAO | ⬜ | | |
| **5.1** | Corrutinas y Flow (teoría) | ⬜ | | — |
| **5.2** | Repository | ⬜ | | |
| **5.3** | AppContainer | ⬜ | | |
| **5.4** | ViewModel de Puntuales | ⬜ | | |
| **6.1** | Formulario de tarea | ⬜ | | |
| **6.2** | Obligatorias y Opcionales | ⬜ | | |
| **6.3** | Borrar con confirmación | ⬜ | | |
| **7.1** | Completar (transacción) | ⬜ | | |
| **7.2** | Saldo de caramelos | ⬜ | | |
| **7.3** | Snackbar de rescate | ⬜ | | |
| **8.1** | Catálogo de recompensas | ⬜ | | |
| **8.2** | Canjear | ⬜ | | |
| **8.3** | Historial | ⬜ | | |
| **8.4** | Espíritus de la semana | ⬜ | | |
| **9.1** | Canvas: Susuwatari y Kodama | ⬜ | | |
| **9.2** | Animaciones | ⬜ | | |
| **9.3** | Icono, splash y modo oscuro | ⬜ | | |
| **9.4** | Migración de BBDD | ⬜ | | |
| **10.1** | Hilt | ⬜ | | |
| **10.2** | Tests de ViewModel | ⬜ | | |
| **10.3** | GitHub Actions | ⬜ | | |
| **10.4** | README y release | ⬜ | | |

**Repositorio GitHub:** https://github.com/AlbertoRVS/freemind

---

## 🧩 Plantilla de ficha (no borrar)

> Copio esta plantilla para cada actividad que corrijo.

```markdown
### Actividad X.Y · Título

**Estado:** 🟡 En revisión  ·  **Revisión nº:** 1  ·  **Fecha:** dd/mm/aaaa
**Archivos revisados:** `ruta/Archivo.kt`, ...

#### ✅ Criterios de aceptación
- [ ] Criterio 1
- [ ] Criterio 2

#### 🌟 Lo que está bien
- ...

#### ❌ Errores (obligatorio corregir)
1. **`Archivo.kt:línea`**: qué pasa, por qué es un problema y una pista para arreglarlo.

#### ⚠️ A mejorar (obligatorio corregir)
1. ...

#### 💡 Sugerencias (opcional)
- ...

#### ❓ Preguntas para ti
- ...

#### 📈 Rúbrica
| Funciona | Código limpio | Kotlin/Android | Arquitectura | Git | **Total** |
|---|---|---|---|---|---|
| /4 | /4 | /4 | /4 | /4 | **/20** |

#### 🔁 Historial de revisiones
- Rev. 1 (dd/mm): ...

#### 📦 Commit autorizado
- [ ] ✅ Aprobada. Mensaje: `tipo(ámbito): descripción`
```

---

# 📝 Fichas de corrección

## Fase 0 · Entorno, proyecto y Git

### Revisión inicial del proyecto (05/10/2026)

**Estado:** informativa (antes de empezar)
**Archivos revisados:** `build.gradle.kts`, `settings.gradle.kts`, `gradle/libs.versions.toml`, `gradle/wrapper/gradle-wrapper.properties`, `app/build.gradle.kts`, `AndroidManifest.xml`, `MainActivity.kt`, `res/layout/activity_main.xml` (del proyecto antiguo `TAREAS`)

Lo que encontré en el proyecto vacío original:

- La plantilla usada fue **Empty Views Activity** (interfaz en XML con `activity_main.xml` y `AppCompatActivity`). Como vamos a usar **Jetpack Compose**, se decidió recrear el proyecto (Actividad 0.1, opción A).
- Versiones: Gradle 8.9, Android Gradle Plugin 8.7.2, Kotlin 1.9.24, `compileSdk 34`, `minSdk 24`.
- ⚠️ El catálogo tenía `core-ktx 1.19.0` y `activity 1.13.0`, que requieren un `compileSdk` más alto que 34. Lo más probable es que no compilara. Por eso en la 0.1 se pide actualizar Android Studio antes de crear el proyecto nuevo.
- ⚠️ `minSdk 24` no incluye `java.time` sin configuración extra; en el nuevo usaremos **26**.
- ⚠️ El paquete era `com.example.tareas`; `com.example` no se puede publicar en Google Play.
- La carpeta no era todavía un repositorio Git.

---

### Actividad 0.1 · Recrear el proyecto con Compose

**Estado:** ✅ Aprobada  ·  **Revisión nº:** 3  ·  **Fecha:** 05/10/2026
**Archivos revisados:** `settings.gradle.kts`, `build.gradle.kts`, `gradle/libs.versions.toml`, `gradle/wrapper/gradle-wrapper.properties`, `app/build.gradle.kts`, `AndroidManifest.xml`, `MainActivity.kt`, `ui/theme/*.kt`, `res/values/strings.xml`

#### ✅ Criterios de aceptación
- [x] `MainActivity.kt` usa `setContent { ... }` y hereda de `ComponentActivity`: es Compose.
- [x] No existe `res/layout/activity_main.xml`.
- [x] `minSdk = 26` y el paquete es `com.alberto.freemind`, sin `example`.
- [x] La app arranca sin errores: ejecutada en el móvil, muestra el saludo (Rev. 2).
- [x] `docs/` está dentro de la carpeta del proyecto (restaurada por mí en `FreeMind/docs`, ver nota).

> ✏️ **Cambio de carpeta aceptado:** el enunciado pedía mantener `TAREAS`, pero creaste el proyecto como `FreeMind` en su propia carpeta. Está bien: a partir de ahora **FreeMind es la carpeta del curso** y ya tengo acceso a ella. La carpeta `docs/` se perdió por el camino y la he restaurado aquí.

#### 🌟 Lo que está bien
- Plantilla correcta (Empty Activity / Compose) y con herramientas al día: Gradle 9.6.0, AGP 9.4.1, Kotlin 2.2.10, `compileSdk 37`.
- Paquete propio `com.alberto.freemind`: publicable y con buena pinta en un portfolio.
- `minSdk 26`, tal y como pedía la actividad.
- Configuración en Kotlin DSL (`.kts`) y con catálogo de versiones.

#### ❌ Errores (obligatorio corregir)
1. ~~**Ejecutar la app**~~ ✅ Corregido en Rev. 2.

#### ⚠️ A mejorar (obligatorio corregir)
1. **`gradle/libs.versions.toml`**: la plantilla trae versiones antiguas de varias librerías (`coreKtx = "1.10.1"`, `lifecycleRuntimeKtx = "2.6.1"`, `activityCompose = "1.8.0"`, `junitVersion = "1.1.5"`, `espressoCore = "3.5.1"`), mientras que el resto del proyecto es muy reciente. Abre el archivo: Android Studio subraya en amarillo las que tienen versión nueva. Pon el cursor encima, pulsa `Alt + Enter` y elige actualizar. Después, **Sync Now** y vuelve a ejecutar.
   - **Rev. 2:** siguen las versiones antiguas y no te aparece el subrayado. Usa la otra vía: `File > Project Structure > Suggestions`, que lista todas las actualizaciones disponibles con un botón **Update**. Como referencia, `core-ktx 1.10.1` es de 2023, mientras que tu `composeBom` es de 2026.
   - **Rev. 3:** ✅ actualizadas a mano desde las páginas de novedades: `coreKtx 1.19.1`, `lifecycleRuntimeKtx 2.11.0`, `activityCompose 1.13.0`, `junitVersion 1.3.0`, `espressoCore 3.7.0`. Sync sin errores.
   - Esto te enseña a mantener las dependencias al día, algo que harás constantemente en una empresa.

#### 💡 Sugerencias (opcional)
- La carpeta antigua `C:\Users\PC\AndroidStudioProjects\TAREAS` ya no se usa. Cuando quieras, bórrala para no confundirte.
- Fíjate en que tu `app/build.gradle.kts` no tiene el plugin `kotlin-android` que verás en tutoriales antiguos: **AGP 9 trae Kotlin integrado**. Solo aparece `kotlin.compose`, el plugin del compilador de Compose.

#### ❓ Preguntas para ti
- En `app/build.gradle.kts` hay un bloque `optimization { enable = true }` dentro de `release`. ¿Qué crees que hace? No hace falta que lo investigues a fondo; lo usaremos en la Actividad 10.4.

#### 🔁 Historial de revisiones
- Rev. 1 (05/10): plantilla y configuración correctas. Pendiente ejecutar la app y actualizar las versiones antiguas del catálogo.
- Rev. 2 (05/10): la app ya se ejecuta en el móvil ✅. Siguen pendientes las versiones del catálogo.
- Rev. 3 (05/10): versiones del catálogo actualizadas y Sync correcto. **Aprobada.**

#### 📦 Commit autorizado
- [x] ✅ Aprobada. El commit se hace en la 0.3 (`chore: initial Compose project and course docs`). Antes de ese commit, ejecuta la app una vez más para confirmar que funciona con las versiones nuevas.

---

### Actividad 0.2 · Entender la estructura del proyecto

**Estado:** ✅ Aprobada  ·  **Revisión nº:** 2  ·  **Fecha:** 06/10/2026
**Archivos revisados:** respuestas en el hilo de correcciones

#### ✅ Criterios de aceptación
- [x] Respuestas correctas (Rev. 2, con la explicación de la P3 y del `targetSdk` añadida abajo)
- [x] Con tus palabras, no copiadas

#### 🌟 Lo que está bien
- **P2 (`local.properties`)**: correcta. Contiene la ruta del SDK de tu PC, que no sirve a nadie más.
- **P1 (`minSdk`)**: correcta. Es la versión mínima de Android en la que se puede instalar la app.
- **P4 (`setContent { }`)**: correcta en lo esencial. Define lo que se dibuja en la pantalla de la Activity.
- Respuestas escritas con tus palabras, que es justo lo que se pedía.

#### ❌ Errores (obligatorio corregir)
1. **P3 (`libs.versions.toml`)**: el catálogo **no** descarga ni actualiza nada. Quien descarga las librerías es Gradle, y lo hace igual si escribes la versión directamente en `app/build.gradle.kts`. Tampoco actualiza versiones (recuerda que en la 0.1 las tuviste que subir a mano).
   - Pista: imagina un proyecto con 5 módulos que usan Retrofit, cada uno con su versión escrita a mano. ¿Qué pasa el día que quieres actualizarlo? ¿Y si en un módulo se te olvida?
   - **Rev. 2:** ✅ ya ves que es un archivo que Gradle lee para saber qué versiones quieres. Explicación completa: (Retrofit es una librería para llamar a APIs de internet; era solo un ejemplo). La ventaja del catálogo es **centralizar**: cada versión se escribe una sola vez y todos los módulos la usan por su alias (`libs.retrofit`). Para actualizar cambias un número en un único sitio, todos los módulos usan la misma versión y Android Studio te autocompleta los alias.

#### ⚠️ A mejorar (obligatorio corregir)
1. **P1 (`compileSdk`)**: "la versión con la que se compila en nuestro PC" es vago. Pista: ¿qué pasaría si intentas usar una función que Android añadió en una versión más nueva que tu `compileSdk`? Explica qué limita.
   - **Rev. 2:** ✅ correcto: el compilador no conoce esas funciones y da error. `compileSdk` decide qué APIs puedes **usar al escribir código**, no en qué móviles se instala.
2. **P1 (`targetSdk`)**: vas bien encaminado con "para la que está preparada". Completa: ¿la app deja de funcionar en un móvil con una versión más nueva que el `targetSdk`? ¿Qué hace Android con esa información?
   - **Rev. 2:** explicación completa: la app sigue funcionando en móviles más nuevos. Android usa el `targetSdk` para saber con qué comportamientos fue probada: si una versión nueva cambia algo (por ejemplo, Android 6 empezó a pedir permisos en tiempo de ejecución), a las apps con un `targetSdk` antiguo les mantiene el comportamiento viejo. Además, Google Play obliga a subir el `targetSdk` cada año para publicar.
3. **P4 (`@Preview`)**: el panel de Preview sí muestra el composable sin ejecutar la app, pero en Compose **no** se modifican los elementos en ese lienzo. Eso era el editor de layouts XML (arrastrar y soltar). Pista: prueba a cambiar el texto del saludo desde el panel de Preview. ¿Puedes? ¿Dónde lo cambias entonces? ¿Esa función `GreetingPreview` aparece en el móvil?
   - **Rev. 2:** ✅ correcto: el Preview muestra el composable que tú le indicas para comprobar cómo se ve sin ejecutar la app. Las funciones `@Preview` no se muestran en el móvil. Más adelante lo usarás con varios `@Preview` (modo oscuro, distintos tamaños, datos de ejemplo).

#### 💡 Sugerencias (opcional)
- En `local.properties` a veces se guardan también claves (API keys, contraseñas de firma). Ese es el motivo más serio para no subirlo.

#### 🔁 Historial de revisiones
- Rev. 1 (06/10): P2 correcta. P3 incorrecta. P1 y P4 incompletas.
- Rev. 2 (06/10): P1 `compileSdk` y P4 correctas; P3 y `targetSdk` razonadas y completadas con la explicación. **Aprobada.**

#### 📦 Commit autorizado
- [ ] Actividad teórica: no lleva commit propio.

---

### Actividad 0.3 · Git y GitHub desde el primer día

**Estado:** 📦 Subida  ·  **Revisión nº:** 1  ·  **Fecha:** 06/10/2026
**Archivos revisados:** repositorio local (`git log`, `git status`, `git ls-files`), `.gitignore`, `app/.gitignore`

#### ✅ Criterios de aceptación
- [x] El repositorio existe y está conectado: `origin` = https://github.com/AlbertoRVS/freemind, rama `main` sincronizada con `origin/main`.
- [x] `local.properties` **no** está en el repositorio (ni carpetas `build`): 51 archivos versionados.
- [x] El commit tiene formato Conventional Commits: `bea0e7a chore: initial Compose project and course docs`.

#### 🌟 Lo que está bien
- Revisaste `git status` antes del commit y preguntaste lo que no entendías (avisos LF/CRLF, carpetas `build`). Eso es exactamente lo que hay que hacer.
- Borraste la copia de seguridad antes del commit: el repositorio solo tiene lo que debe.
- Rama `main` desde el principio (`git init -b main`).

#### 💡 Sugerencias (opcional)
- **Nombre del autor:** el commit aparece como `alberto_RVSÂ`, con un carácter raro al final (seguramente se coló al escribirlo). Corrígelo para los próximos commits con `git config --global user.name "..."` y compruébalo con `git config --global --list`. El commit ya subido déjalo así: cambiar historia que ya está en GitHub requiere `--force` y no compensa por esto.
- **Email público:** el email del commit se ve en GitHub. Si prefieres ocultarlo, en GitHub ve a `Settings > Emails` y activa *Keep my email addresses private*. Te dará una dirección `...@users.noreply.github.com` para usar en `user.email`.
- El punto 3 no hacía falta: `app/.gitignore` ya ignora la carpeta `build` del módulo. Aun así, añadir `/app/build` en la raíz no hace daño.

#### 🔁 Historial de revisiones
- Rev. 1 (06/10): repositorio creado y primer commit subido. **Aprobada.**

#### 📦 Commit autorizado
- [x] ✅ Hecho: `chore: initial Compose project and course docs` (`bea0e7a`). Esta ficha y la de la 0.2 se subirán en el siguiente commit de `docs`.

---

## Fase 1 · Kotlin esencial

### Actividad 1.1 · Paquetes y estructura de carpetas

**Estado:** ✅ Aprobada  ·  **Revisión nº:** 1  ·  **Fecha:** 06/10/2026
**Archivos revisados:** `app/src/main/java/com/alberto/freemind/` (estructura de carpetas), ramas de Git

#### ✅ Criterios de aceptación
- [x] Existen `data`, `domain` y `ui` dentro de `com.alberto.freemind`.
- [x] `ui.theme` está dentro de `ui` (la plantilla ya lo dejó bien).
- [x] La app sigue compilando: no se ha tocado código, solo carpetas.

#### 🌟 Lo que está bien
- Estructura exacta a la pedida y rama `fase-1` creada antes de empezar, como dice la guía.

#### 💡 Sugerencias (opcional)
- **Git no guarda carpetas vacías.** `data` y `domain` están vacías, así que ahora mismo no hay nada que subir de la 1.1. Entrarán en Git en cuanto tengan su primer archivo `.kt` (en la 1.2). Por eso el commit de la 1.1 va junto con el de la 1.2.
- En Android Studio, si en el panel *Project* ves `com.alberto.freemind.data` en una sola línea, es la opción *Compact Middle Packages* (rueda dentada del panel). Es solo visual.
- `SEGUIMIENTO.md` estaba modificado sin commit al crear la rama. No pasa nada: haz el commit `docs:` en `fase-1` y llegará a `main` con el Pull Request de la fase.

#### 🔁 Historial de revisiones
- Rev. 1 (06/10): estructura correcta. **Aprobada.**

#### 📦 Commit autorizado
- [x] ✅ Aprobada. Sin commit propio (carpetas vacías); va en el commit de la 1.2.


---

### Actividad 1.2 · `enum class`: tipos de tarea, frecuencia y espíritus

**Estado:** ✅ Aprobada  ·  **Revisión nº:** 3  ·  **Fecha:** 06/10/2026
**Archivos revisados:** `domain/Enums.kt`

#### ✅ Criterios de aceptación
- [x] `TaskType.MANDATORY.defaultCandies` devuelve `1` (Rev. 2)
- [x] `TaskType.OPTIONAL.spirit` devuelve `Spirit.KODAMA` (Rev. 2)
- [x] Nombres en inglés y comentario en español en cada enum (Rev. 3)

#### 🌟 Lo que está bien
- Los tres enums existen, con los valores correctos, en el paquete `domain`.
- Has entendido lo difícil: un enum con propiedades y una propiedad cuyo tipo es otro enum (`Spirit`).
- Los espíritus están bien asignados: `MANDATORY` libera `SUSUWATARI`, y `PUNCTUAL` y `OPTIONAL` liberan `KODAMA`.

#### ❌ Errores (obligatorio corregir)
> **Rev. 2:** ✅ los cuatro corregidos (5 caramelos, `defaultCandies`/`spirit`, sin clase envolvente y con comentarios KDoc).

1. **`Enums.kt:7`**: `OPTIONAL` da 4 caramelos y el enunciado (y las decisiones del proyecto) dicen **5**.
2. **`Enums.kt:4`**: los nombres de las propiedades no cumplen los criterios: el código del proyecto usará `defaultCandies` y `spirit`. Además, `enum` no dice qué guarda: un nombre debe explicar el dato, no su tipo.
3. **`Enums.kt:3`**: la `class Enums { }` que envuelve todo sobra. En Kotlin un archivo puede tener varias declaraciones sueltas (a nivel superior) sin clase alrededor. Con la clase, para usarlo tendrías que escribir `Enums.TaskType.MANDATORY` en vez de `TaskType.MANDATORY`. Pista: fíjate en `ui/theme/Color.kt`, que tiene varias variables sin ninguna clase.
4. **Faltan los comentarios** en español explicando cada enum (criterio de aceptación).

#### ⚠️ A mejorar (obligatorio corregir)
> **Rev. 2:** siguen pendientes los tres. Además, al quitar la clase la sangría se quedó desplazada (los `enum class` empiezan con 4 espacios): `Ctrl + Alt + L` lo arregla todo de golpe.
> **Rev. 3:** ✅ los tres corregidos: `Frequency`, sin `()` ni `;` sobrantes y archivo formateado.

1. **`Enums.kt:9`**: `Frecuency` → en inglés es `Frequency`. Las erratas en nombres se arrastran por todo el proyecto. Truco: `Shift + F6` sobre el nombre lo renombra en todos los sitios.
2. **`Enums.kt:9 y 13`**: los paréntesis vacíos `()` sobran cuando el enum no tiene propiedades, y el `;` final solo es obligatorio si después hay funciones (míralo en el ejemplo `BookGenre`).
3. **Formato**: `(val candy: Int,val enum: Spirit)` lleva espacio después de la coma, y no antes del paréntesis. `Ctrl + Alt + L` formatea el archivo entero.

#### 💡 Sugerencias (opcional)
- Detalles mínimos del archivo: hay dos líneas en blanco tras el `package` (con una basta) y en el comentario de `Spirit` falta la tilde de "espíritus".
- Acostúmbrate a pulsar `Ctrl + Alt + L` antes de cada commit.
- Para documentar, usa comentarios KDoc: `/** ... */` encima de la declaración. Android Studio los muestra al pasar el ratón por encima del nombre en cualquier parte del proyecto.

#### 🔁 Historial de revisiones
- Rev. 1 (06/10): estructura de enums correcta. Corregir caramelos de `OPTIONAL`, nombres de propiedades, clase envolvente, `Frequency` y comentarios.
- Rev. 2 (06/10): errores corregidos. Pendientes `Frequency`, `()` y `;` sobrantes y formato.
- Rev. 3 (06/10): todo corregido. **Aprobada.**

#### 📦 Commit autorizado
- [x] ✅ Aprobada. Un commit para 1.1 + 1.2 en `fase-1`, de tipo `feat(domain): ...` (descripción en inglés e imperativo, la escribe Alberto). El de `docs/SEGUIMIENTO.md`, aparte, con `docs:`.
- 📦 Subido a `fase-1`: `583b022 feat(domain): add domain package and Enums file` y `0155fb9 docs: reuploaded SEGUIMIENTO`.
  - 💡 Mensajes: el `feat` es válido, pero mejor describir **qué aporta** que qué archivos crea (`add TaskType, Frequency and Spirit enums`). El `docs` va en pasado y es vago: en imperativo y concreto sería `docs: update tracking for activities 0.2-1.2`. No se corrigen porque ya están en GitHub.

---

### Actividad 1.3 · `data class` y null safety: el modelo `Task`

**Estado:** ✅ Aprobada  ·  **Revisión nº:** 2  ·  **Fecha:** 06/10/2026
**Archivos revisados:** `domain/Task.kt`, `test/.../domain/TaskTest.kt`

#### ✅ Criterios de aceptación
- [x] `Task(title = "Dentista", type = TaskType.PUNCTUAL).candies` vale `2` sin indicarlo (comprobado con su test, Rev. 2)
- [x] Todas las propiedades son `val`

#### 🌟 Lo que está bien
- `candies: Int = type.defaultCandies`: has usado un parámetro anterior como valor por defecto. Es la parte más difícil de la actividad.
- Todas las propiedades son `val`, los nombres y tipos son los de la tabla, y has importado `java.time.LocalDate`.
- `dueDate: LocalDate? = null` está perfecto.

#### ❌ Errores (obligatorio corregir)
> **Rev. 2:** ✅ corregidos: `data class` y `frequency: Frequency? = null`.

1. **`Task.kt:5`**: es `class`, y el enunciado pide `data class`. Sin `data` no tienes `copy()`, `toString()` ni `equals()` automáticos. Pista: compara dos `Task` iguales con `==`; con `class` da `false`.
2. **`Task.kt:12`**: `frequency: Frequency?` no tiene valor por defecto, así que es obligatorio pasarlo y `Task(title = "Dentista", type = TaskType.PUNCTUAL)` no compila. Mira cómo lo hiciste en `dueDate`.

#### ⚠️ A mejorar (obligatorio corregir)
> **Rev. 2:** ✅ corregidos: comentario y llaves eliminados.

1. **`Task.kt:7`**: borra el comentario `//como lo hago obligatorio?`. `title` **ya es obligatorio**: un parámetro sin valor por defecto hay que pasarlo siempre.
2. **`Task.kt:14-15`**: las llaves vacías `{ }` sobran cuando la clase no tiene cuerpo.

#### 💡 Sugerencias (opcional)
- 🌟 **Rev. 2: primer test propio** (`TaskTest`), con JUnit 4 y plantillas de String. Para que entre en el commit: añadir `assertEquals(2, task1.candies)` (un test sin comprobación nunca falla), darle un nombre que diga qué comprueba (no `getCandies`) y formatear con `Ctrl + Alt + L`.
- Añade un comentario KDoc encima de `Task` explicando qué representa, como hiciste en los enums.
- Prueba tu código con un **test unitario** en `app/src/test/.../domain/TaskTest.kt` (ver Diario de dudas).

#### 🔁 Historial de revisiones
- Rev. 1 (06/10): buena base. Falta `data`, valor por defecto en `frequency`, comentario sobrante y llaves vacías.
- Rev. 2 (06/10): todo corregido y primer test creado. **Aprobada.**

#### 📦 Commit autorizado
- [x] ✅ Aprobada. En `fase-1`, según la guía actualizada: `feat(domain): add Task model` (solo `Task.kt`), después `test(domain): add Task default values tests` (`TaskTest.kt`, con su `assertEquals`) y `docs: update tracking for activity 1.3`.

## Fase 2 · Compose y tema Ghibli

_(sin fichas todavía)_

## Fase 3 · Navegación

_(sin fichas todavía)_

## Fase 4 · Room

_(sin fichas todavía)_

## Fase 5 · MVVM

_(sin fichas todavía)_

## Fase 6 · CRUD de tareas

_(sin fichas todavía)_

## Fase 7 · Caramelos y rescates

_(sin fichas todavía)_

## Fase 8 · La Isla del Descanso

_(sin fichas todavía)_

## Fase 9 · Pulido Ghibli

_(sin fichas todavía)_

## Fase 10 · Nivel profesional

_(sin fichas todavía)_

---

# 📌 Errores recurrentes

> Si un mismo tipo de fallo aparece en varias actividades, lo apunto aquí para que lo tengas presente.

| Error | Dónde apareció | Cómo evitarlo |
|---|---|---|
| No ceñirse a los nombres/valores del enunciado | 1.2 | Antes de pedir corrección, repasa los ✅ Criterios de aceptación uno por uno. |

---

# ❓ Diario de dudas

> Dudas que me has preguntado y su respuesta resumida, para que puedas repasarlas.

| Fecha | Duda | Respuesta breve |
|---|---|---|
| 06/10 | ¿Cómo hago obligatorio un parámetro? | No dándole valor por defecto: `val title: String` ya es obligatorio. |
| 06/10 | ¿Diferencia entre `Tipo?` y `Tipo? = null`? | `?` = **puede** valer null (tipo). `= null` = valor **por defecto** (se puede omitir al crear el objeto). Son cosas distintas y se combinan. |
| 06/10 | ¿Cómo pruebo mi código? | Tests unitarios en `app/src/test`: función con `@Test` y `assertEquals(esperado, real)`, se ejecuta con la flecha verde. |
| 06/10 | ¿Comentarios de una línea: `/** */` o `//`? | `/** Texto */` (KDoc) para documentar clases, enums y funciones: se ve al pasar el ratón. `//` para notas dentro del código. Se cierra con `*/`, no con `**/`. |
