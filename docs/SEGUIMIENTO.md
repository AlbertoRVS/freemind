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
| **1.3** | `data class` Task | 📦 | | `08a88aa` + test `e07d693` |
| **1.4** | Reglas de negocio con `when` | 📦 | | `70b71ae` |
| **1.5** | Tests unitarios | 📦 | | `b78774c` |
| **2.1** | Tema Ghibli | 📦 | | `77c370f` |
| **2.2** | `TaskCard` y previews | 📦 | | `533e5bd` + konpeitos `2273536` |
| **2.3** | Estado y state hoisting | 📦 | | `8e84a5f` |
| **2.4** | `LazyColumn` | ✅ | | |
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

**Pull Requests de fase:**
- Fase 1 → `main`: https://github.com/AlbertoRVS/freemind/pull/1 (merge commit, 07/10/2026)

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

---

### Actividad 1.4 · Funciones, `when` y validación

**Estado:** ✅ Aprobada  ·  **Revisión nº:** 4  ·  **Fecha:** 06/10/2026
**Archivos revisados:** `domain/TaskRules.kt`

#### ✅ Criterios de aceptación
- [x] `validationError()` detecta los 4 casos y devuelve `null` si es válida
- [x] `isPending()` cumple las 4 reglas (Rev. 4)

#### 🌟 Lo que está bien
- `validationError()` como función de extensión con `when` sin argumento: estructura correcta y en el orden del enunciado.
- Has usado **guardas en `when`** (`TaskType.PUNCTUAL if ...`), una novedad de Kotlin 2.2. Bien investigado.
- Recibes `today` como parámetro en vez de usar `LocalDate.now()`: eso hará la función testeable en la 1.5.

#### ❌ Errores (obligatorio corregir)
> **Rev. 2:** ✅ corregidos el 3 (Puntual archivada) y gran parte del 4 y 5 (ya usa `lastCompletion` y no `dueDate`). **Siguen pendientes:**
> - **1 y 2**: la `class TaskRules` y el import de Compose siguen ahí.
> - **Nuevo, líneas 23-24**: `!isArchived || ...` hace que las Obligatorias salgan **siempre** pendientes: una Obligatoria nunca se archiva, así que `!isArchived` siempre es `true` y el `||` ya no mira lo de la derecha. Las Obligatorias no usan `isArchived`.
> - **Nuevo, líneas 23-24**: si nunca se completó (`lastCompletion == null`), `null?.isBefore(...) == true` da `false`: sale "no pendiente" y debería ser pendiente. El caso null hay que comprobarlo explícitamente con `lastCompletion == null || ...`.

1. **`TaskRules.kt:6`**: otra vez una clase envolvente (`class TaskRules { }`). Dentro de una clase, las funciones de extensión solo se pueden usar dentro de esa clase: `task.validationError()` no funcionaría en el resto de la app. Quítala, como en `Enums.kt`.
2. **`TaskRules.kt:3`**: `import androidx.compose.ui.Modifier.Companion.then` sobra (se coló con un autocompletado). Además, `domain` debe ser Kotlin puro, **sin nada de Android ni Compose**: así se puede testear y reutilizar.
3. **`TaskRules.kt:19 y 25`**: una Puntual **archivada** no entra en la línea 19 y cae en `else -> true`, así que sale pendiente. Pista: en vez de guarda, que la rama de `PUNCTUAL` **devuelva** la condición.
4. **`TaskRules.kt:21`**: la diaria mira `isArchived` y `dueDate`, que no tienen nada que ver (esos campos son de las Puntuales). La regla depende de **`lastCompletion`**, que ahora no usas en ninguna línea. Traduce el enunciado tal cual: "nunca se completó" (¿cómo se escribe "es null"?) **o** "la última vez no fue `today`".
5. **`TaskRules.kt:22-23`**: la semanal también usa `dueDate` en vez de `lastCompletion`. Además, si `dueDate` es `null`, `isBefore(null)` **lanza una excepción** en tiempo de ejecución. Regla: pendiente si nunca se completó **o** si la última vez es anterior al lunes de esta semana. Fíjate en el orden: es `lastCompletion.isBefore(lunes)`, no al revés.

> **Rev. 3:** ✅ quitadas la clase y el import, y `isArchived` ya no está en diaria/semanal. **Queda uno:** si `lastCompletion` es `null` (nunca se completó), diaria y semanal devuelven `false`, y el enunciado dice que debe estar **pendiente**. `null?.isBefore(x) == true` es `false` cuando es null.

> **Rev. 4:** ✅ resuelto con `lastCompletion == null || lastCompletion.isBefore(...)`, aprovechando el *smart cast* (tras el `== null ||`, Kotlin sabe que no es null).

#### ⚠️ A mejorar (obligatorio corregir)
> **Rev. 2:** ✅ los dos corregidos: `isBlank()` y `when (frequency)` anidado sin `else`.

1. **`TaskRules.kt:10`**: `isEmpty()` deja pasar un título `"   "`. Usa `isBlank()`.
2. **`TaskRules.kt:25`**: el `else -> true` esconde errores (el de la Puntual archivada viene de ahí). Si cubres todos los casos, no necesitas `else` y el compilador te avisa si te dejas uno. Pista: rama `MANDATORY ->` con un `when (frequency)` dentro que trate `DAILY`, `WEEKLY` y `null`.

#### 💡 Sugerencias (opcional)
- Mensajes: "el Título de la tarea esta vacío." → "El título no puede estar vacío." (mayúscula inicial, tilde en "está").
- Importa `java.time.DayOfWeek` arriba y escribe solo `DayOfWeek.MONDAY`.
- Escribe los tests de la 1.5 mientras corriges: son justo los casos de este fallo.

#### 🔁 Historial de revisiones
- Rev. 1 (06/10): validación casi correcta; `isPending` no usa `lastCompletion` y falla la Puntual archivada.
- Rev. 4 (07/10): caso `null` resuelto. **Aprobada.**
- Rev. 3 (06/10): solo queda el caso `lastCompletion == null` en diaria y semanal.
- Rev. 2 (06/10): estructura `when` correcta. Faltan quitar la clase y el import, y arreglar la lógica de diaria/semanal (`isArchived` sobrante y caso `null`).

#### 📦 Commit autorizado
- [x] ✅ Aprobada: `feat(domain): add task validation and pending rules` (solo `TaskRules.kt`).

---

### Actividad 1.5 · Tus primeros tests unitarios

**Estado:** ✅ Aprobada (con un retoque antes del commit)  ·  **Revisión nº:** 4  ·  **Fecha:** 06/10/2026
**Archivos revisados:** `test/.../domain/TaskRulesTest.kt`, `TaskTest.kt`, `ExampleUnitTest.kt`

#### ✅ Criterios de aceptación
- [x] Al menos 6 tests (Rev. 4: 13 tests; ver nota del domingo): uno por error de validación (✅ los 4), uno de tarea válida (falta) y dos de la semanal: completada este lunes y completada el domingo pasado (faltan)
- [x] Todos los tests pasan y comprueban lo que dice el enunciado
- [x] Los nombres describen el comportamiento
- [x] Borrar `ExampleUnitTest` (Rev. 2)

#### 🌟 Lo que está bien
- 11 tests, con los 4 errores de validación cubiertos y fechas fijas a partir de `today`: has entendido `minusDays`, `plusDays` y por qué no usar `now()`.
- Comentarios KDoc explicando qué espera cada test.

#### ❌ Errores (obligatorio corregir)
1. **`TaskRulesTest.kt:84-94`**: el test espera `false` para una diaria que nunca se completó, y el comentario lo justifica con lo que hace tu código. **Un test se escribe a partir del enunciado, no del código**: si adaptas el test al fallo, el test deja de servir. El enunciado dice "pendiente si nunca se completó", así que debe ser `assertTrue`. Este test en rojo te llevará directo al fallo que queda en la 1.4.
2. **`TaskRulesTest.kt:110-117`**: se llama "Weekly" pero crea la tarea con `Frequency.DAILY`.
3. **Faltan los dos tests de la semanal** que pide el enunciado: completada **este lunes** (no pendiente: es el caso límite, el más importante) y completada **el domingo pasado** (pendiente). Pista: `today.with(DayOfWeek.MONDAY)` y ese lunes `.minusDays(1)`.
4. **Falta el test de tarea válida**: con todos los datos correctos, `validationError()` devuelve `null` (`assertNull`).
5. **`ExampleUnitTest.kt`** sigue ahí: el enunciado pide borrarlo.

> **Rev. 2:** ✅ corregidos el 1 (ahora `assertTrue`), el 4 (`validationOk`) y el 5 (`ExampleUnitTest` borrado). **Siguen pendientes:**
> - **2**: `mandatoryWeeklyLastWeekComletionIsPending` sigue usando `Frequency.DAILY` (línea 126), así que no prueba la semanal.
> - **3**: siguen faltando los dos casos del enunciado. "Ayer" (martes 6) no es el caso límite: hace falta completada **el lunes 5** (no pendiente) y **el domingo 4** (pendiente). Si el código usara mal la comparación (por ejemplo, `isAfter` en vez de `isBefore`, o el lunes de otra semana), el test del martes seguiría en verde y el del lunes no.

> **Rev. 3:** ✅ el último test ya usa `WEEKLY` y hay un test nuevo de "completada el domingo → pendiente" (bien pensado, con `today` = lunes). **Solo falta el caso "completada este lunes → no pendiente"** (con `today` = miércoles y `lastCompletion` = el lunes de esa semana).

> **Rev. 4:** ✅ añadido "completada el lunes → no pendiente". ⚠️ Pero el test del **domingo** (Rev. 3) ha desaparecido: se sustituyó en vez de añadir uno nuevo. Hay que **restaurarlo antes del commit** (es el otro borde que pide el enunciado). No hace falta volver a enviarlo a revisión.

#### ⚠️ A mejorar (obligatorio corregir)
> **Rev. 4:** ✅ todos corregidos: sin `isArchived` sobrante, `assertTrue`/`assertFalse`/`assertNull` y sin erratas.
> **Rev. 3:** ✅ nombres con comillas invertidas. Quedan: "comletion", `isArchived = true` en Opcional y diarias, y `assertEquals(true/false/null, ...)`.
> **Rev. 2:** siguen pendientes los tres (nombres, `isArchived = true` sobrante, `assertEquals(true/false/null, ...)` → `assertTrue`/`assertFalse`/`assertNull`).

1. **Nombres**: usa un solo estilo, el de comillas invertidas, que se lee como una frase (`` `weekly task completed this monday is not pending` ``). Corrige también "Comletion".
2. **Datos que despistan**: en las Opcionales y Obligatorias pones `isArchived = true`, pero esas tareas nunca se archivan. Un test debe tener solo los datos que importan.
3. `assertEquals(false, ...)` y `assertEquals(true, ...)` → `assertFalse(...)` y `assertTrue(...)`, más claros.

#### 💡 Sugerencias (opcional)
- En `TaskTest.kt`, el import `junit.framework.TestCase.assertEquals` es de una versión antigua de JUnit. Usa `org.junit.Assert.assertEquals` en todos los tests.
- Puedes quitar el `println` de `TaskTest`: ya lo comprueba el `assertEquals`.

#### 🔁 Historial de revisiones
- Rev. 4 (07/10): test del lunes y retoques hechos. **Aprobada**, restaurando antes del commit el test del domingo.
- Rev. 3 (07/10): test del domingo y frecuencia corregidos, nombres con comillas. Falta el test del lunes y los retoques.
- Rev. 2 (07/10): corregidos el test adaptado al fallo, la tarea válida y `ExampleUnitTest`. Faltan los casos lunes/domingo, la frecuencia del último test y los ⚠️.
- Rev. 1 (06/10): buena base de 11 tests. Falta tarea válida, los dos casos semanales del enunciado y borrar `ExampleUnitTest`. Un test está adaptado al fallo.

#### 📦 Commit autorizado
- [x] ✅ Aprobada: `test(domain): add TaskRules unit tests` (`TaskRulesTest.kt` + borrado de `ExampleUnitTest.kt`), después del commit de la 1.4.

## Fase 2 · Compose y tema Ghibli

### Actividad 2.1 · El tema: colores y tipografía Ghibli

**Estado:** ✅ Aprobada  ·  **Revisión nº:** 3  ·  **Fecha:** 07/10/2026
**Archivos revisados:** `ui/theme/Color.kt`, `ui/theme/Theme.kt`, `ui/theme/Type.kt`, `MainActivity.kt`, `res/font/`

#### ✅ Criterios de aceptación
- [x] Paleta propia en `Color.kt` (claro y oscuro)
- [x] `Theme.kt` con esquema claro y oscuro y `dynamicColor = false`
- [x] Fuente propia (Zen Maru Gothic, 5 pesos) aplicada en `Type.kt`
- [x] La app arranca con tu fondo y tu fuente, en claro y en oscuro (previews de día y de noche)

#### 🌟 Lo que está bien
- Roles bien asignados: `primary` verde bosque, `secondary` cielo, `tertiary` atardecer (para los caramelos), `background` papel y `surface` crema.
- Modo oscuro bien invertido: fondo bosque de noche, `surface` algo más clara y un `primary` más claro (MossLight) para que contraste.
- Todos los colores `on…` definidos y con buen contraste (texto oscuro sobre colores claros y al revés).
- Color.kt limpio: sin los Purple/Pink de la plantilla y con nombres en PascalCase.
- Dos `@Preview` (normal y `UI_MODE_NIGHT_YES`) envueltas en `Surface` para ver el tema real.

#### ❌ Errores (obligatorio corregir)
> **Rev. 2:** ✅ todos corregidos.
1. **`res/font/`**: los `.ttf` tenían mayúsculas y guiones (`ZenMaruGothic-Regular.ttf`). En `res/` solo se admiten minúsculas, números y `_`, así que no compilaba. Renombrados a `zen_maru_gothic_*.ttf`.
2. **`Theme.kt`**: la paleta de día estaba en `DarkColorScheme` (con `background = BlueSky` y `secondary = WaterPaper`) y el claro seguía con los Purple.
3. **`Theme.kt`**: `dynamicColor = true`. En Android 12+ el sistema ignora tu paleta.

#### ⚠️ A mejorar (obligatorio corregir)
> **Rev. 3:** ✅ corregidos.
1. Faltaban `onSecondary`, `onTertiary` y `onSurface` en el claro, y el oscuro era una copia del claro.
2. Las previews salían en blanco y negro: `Greeting` es solo un `Text` sin fondo. Se arregla envolviéndolo en `Surface`.
3. `import android.app.Activity` sin usar, y bloque de comentario de la plantilla.

#### 💡 Sugerencias (opcional)
- `@Preview()` → `@Preview`: los paréntesis vacíos sobran.

#### 🔁 Historial de revisiones
- Rev. 3 (07/10): previews con `Surface`, ya se ven los dos temas. **Aprobada.**
- Rev. 2 (07/10): Color.kt y Theme.kt completos (claro y oscuro, `dynamicColor = false`). Previews sin fondo.
- Rev. 1 (07/10): guía de roles de color. Fuentes con nombres no válidos, paleta en el esquema equivocado y `dynamicColor = true`. **Type.kt:** Alberto escribió la `FontFamily` y el patrón `base.x.copy(fontFamily = ...)`; los 15 estilos los completó Claude a petición suya.

#### 📦 Commit autorizado
- [x] ✅ Aprobada: `feat(ui): add Ghibli color scheme and typography` (incluye `res/font/` y `MainActivity.kt`).

### Actividad 2.2 · Composables, `Modifier` y `@Preview`

**Estado:** ✅ Aprobada  ·  **Revisión nº:** 3  ·  **Fecha:** 07/10/2026
**Archivos revisados:** `ui/components/TaskCard.kt`, `res/values/strings.xml`, `app/build.gradle.kts`, `gradle/libs.versions.toml`

#### ✅ Criterios de aceptación
- [x] Las 3 previews se ven bien (una por tipo de tarea)
- [x] `TaskCard` recibe un `modifier` como parámetro
- [x] Los textos fijos vienen de `strings.xml` con `stringResource(R.string.xxx)`
- [x] Muestra título, descripción solo si no está vacía, caramelos con 🍬 y fecha si la tiene

#### 🌟 Lo que está bien
- Estructura `Card` → `Row` → `Column(weight(1f))` bien entendida, con el `modifier` recibido aplicado a la `Card` y no a los hijos.
- Descripción condicional con `isNotBlank()` y fecha solo si no es `null`.
- Ya usas los estilos del tema (`MaterialTheme.typography...`) y envuelves las previews en `FreeMindTheme` + `Surface`.
- Datos de las previews fijos (`LocalDate.of`), sin `now()`.

#### ❌ Errores (obligatorio corregir)
1. **`TaskCard.kt:60`**: `mandatoryTask` se crea con `TaskType.OPTIONAL`, así que no hay preview de Obligatoria.
2. **`TaskCard.kt:34`**: los caramelos se muestran como un número suelto, sin 🍬 y sin `strings.xml`. Pista: `<string name="..">%1$d 🍬</string>` y `stringResource(R.string.xxx, task.candies)`. Su sitio natural es el `Text("")` vacío de la línea 43, a la derecha de la tarjeta.
3. **`build.gradle.kts` y `libs.versions.toml`**: se ha añadido `androidx.ui` con versión fija `1.12.1`. Compose UI ya viene con el BOM (`libs.androidx.compose.ui`), y una versión fija se salta el BOM y puede mezclar versiones. Deshacer con `git restore app/build.gradle.kts gradle/libs.versions.toml`.

#### ⚠️ A mejorar (obligatorio corregir)
1. **`TaskCard.kt:17`**: import de `Greeting` sin usar.
2. La fecha sale como `2026-10-11` y sin texto fijo. Usa una cadena con parámetro (`%1$s`) para que se lea como una fecha de entrega.
3. Las previews deben ser `private`: solo sirven dentro de este archivo.
4. Formato: `today.plusDays(4),)` y cierres de paréntesis en la misma línea. Ctrl+Alt+L.

#### 💡 Sugerencias (opcional)
- Caramelos con `color = MaterialTheme.colorScheme.tertiary`: para eso definiste el color atardecer.
- Pon una preview en modo claro, y no las tres en noche.
- El repo es público: los textos de ejemplo de las previews los puede leer cualquiera.
- Tildes en los textos de ejemplo ("médico", "Urólogo").

#### ❓ Preguntas para ti
- ¿Por qué crees que el `modifier` del parámetro se usa en la `Card` y en el `Row` se escribe `Modifier` con mayúscula?

#### 🔁 Historial de revisiones
- Extra (07/10, a petición de Alberto): Claude añadió los konpeitos de los Susuwatari en lugar de 🍬. Son 5 vectores `res/drawable/ic_konpeito_*.xml` y `ui/components/Konpeito.kt` (color al azar con `remember { lista.random() }`). En `strings.xml`, `candy` se cambia por `candies` ("caramelos"), usado como `contentDescription`.
- Rev. 3 (07/10): ✅ todo corregido: `task.candies` como `Int`, caramelos a la derecha y fecha con `R.string.date`. El "todo en rojo" era el `git restore` de `build.gradle.kts` sin volver a sincronizar Gradle. Claude quitó las dos líneas de `androidx-ui` que quedaban en `libs.versions.toml` y dio formato al bloque de la fecha. **Aprobada.**
- Rev. 2 (07/10): ✅ tipo Obligatoria, import, `private` y formato. ❌ `stringResource(R.string.candy, task.candies.toString())`: `%1$d` espera un `Int` y recibe un `String`, lo que provoca el *render error* de las previews (en el móvil sería un cierre de la app). Siguen pendientes: los caramelos a la derecha, el texto de la fecha y deshacer la dependencia `androidx.ui`.
- Rev. 1 (07/10): buena estructura. Falta el tipo Obligatoria, los caramelos con 🍬 desde `strings.xml` y quitar la dependencia `androidx.ui` añadida.

#### 📦 Commit autorizado
- [x] ✅ Aprobada: `feat(ui): add TaskCard component`

### Actividad 2.3 · Estado: `remember` y `mutableStateOf`

**Estado:** 🟡 Aprobada con retoques  ·  **Revisión nº:** 1  ·  **Fecha:** 10/10/2026
**Archivos revisados:** `ui/components/TaskCard.kt`

#### ✅ Criterios de aceptación
- [x] `TaskCard` recibe `isDone: Boolean` y `onDoneClick: () -> Unit`
- [x] `Checkbox` con `checked = isDone` y `onCheckedChange` que avisa con `onDoneClick()`
- [x] Las previews controlan el estado con `var ... by remember { mutableStateOf(false) }`
- [x] Funciona en modo interactivo

#### 🌟 Lo que está bien
- State hoisting correcto: la tarjeta no guarda estado; lo recibe y avisa.
- `by` + `var` con los imports `getValue`/`setValue`.
- Cada preview tiene su propio estado, así que se marcan por separado.

#### ⚠️ A mejorar (obligatorio corregir)
1. **`TaskCard.kt:32-37`**: orden de parámetros. Convención de Compose: primero los obligatorios (`task`, `isDone`, `onDoneClick`), luego `modifier: Modifier = Modifier`. Así se puede llamar `TaskCard(task, isDone, onDoneClick)` sin nombrar nada, y `modifier` queda como primer parámetro opcional.
2. **Previews**: `isRead` viene del ejemplo de libros. En tu dominio es `isDone`, como el parámetro.
3. Formato: el import `setValue` está fuera de orden (Ctrl+Alt+O los ordena), la línea en blanco 64 sobra y `})` en la línea 127. Ctrl+Alt+L.

#### 💡 Sugerencias (opcional)
- En las apps de tareas, el check suele ir **a la izquierda** del título: es lo primero que busca el ojo.

#### 🔁 Historial de revisiones
- Rev. 1 (10/10): funciona y el state hoisting está bien entendido. Faltan retoques de orden de parámetros, nombres y formato.

#### 📦 Commit autorizado
- [x] ✅ Aprobada tras los retoques (no hace falta volver a revisar): `feat(ui): add done checkbox to TaskCard`

### Actividad 2.4 · Listas con `LazyColumn`

**Estado:** ✅ Aprobada  ·  **Revisión nº:** 2  ·  **Fecha:** 10/10/2026
**Archivos revisados:** `ui/FakeData.kt`, `ui/screens/TaskListScreen.kt`, `MainActivity.kt`

#### ✅ Criterios de aceptación
- [x] `FakeData.kt` con ~8 tareas de los 3 tipos, cada una con su `id`
- [x] `TaskListScreen` con `LazyColumn`, `key` y el estado de hechas
- [x] `Scaffold` con `TopAppBar` con el nombre de la app
- [x] La app muestra la lista con tu tema y se puede hacer scroll

#### 🌟 Lo que está bien
- `TaskListScreen` muy limpia: `Set` de ids con `in`, `+` y `-`, `key = { it.id }`, `contentPadding` y `spacedBy`.
- `innerPadding` aplicado a la pantalla dentro del `Scaffold`.
- Ids del 1 al 8 sin repetir y los tres tipos representados.

#### ❌ Errores (obligatorio corregir)
1. **`MainActivity.kt:43-47`**: tu función se llama `TopAppBar`, igual que la de Material. Dentro no llama a ninguna barra: `title = { ... }` es una asignación a una variable que no existe. Además falta `import androidx.compose.material3.TopAppBar`. Pista: renombra tu función (por ejemplo `FreeMindTopBar`) y, dentro, **llama** a la `TopAppBar` de Material pasándole `title = { ... }` como parámetro.

#### ⚠️ A mejorar (obligatorio corregir)
1. `MainActivity`: `Greeting` y sus dos previews ya no los usa nadie. Bórralos (y los imports que queden sin usar).

#### 💡 Sugerencias (opcional)
- `colors = TopAppBarDefaults.topAppBarColors(...)` con `primary`/`onPrimary` para que la barra sea verde bosque.
- Una preview de `TaskListScreen` con `fakeTasks` para ver la lista sin instalar la app.

#### 🔁 Historial de revisiones
- Extra (10/10): preview de `TaskListScreen` con `fakeTasks`. Las tarjetas salían gris lavanda porque `Card` usa `surfaceContainerHighest`, que no estaba en el tema. Claude lo añadió a los dos esquemas (Cream / NightForest) y dio a la preview un `Surface` a pantalla completa con color `background`.
- Rev. 2 (10/10): ✅ `FreeMindAppBar` llama a la `TopAppBar` de Material, con colores `primary`/`onPrimary`. `Greeting` y previews antiguas borrados. **Aprobada.** Queda como extra la preview de `TaskListScreen` con `fakeTasks`.
- Rev. 1 (10/10): lista y datos bien. La barra superior no se crea: la función se llama igual que la de Material y no la llama.

#### 📦 Commit autorizado
- [x] ✅ Aprobada: `feat(ui): add task list screen with fake data`

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
| Clase envolvente innecesaria (`class Enums`, `class TaskRules`) | 1.2, 1.4 | En Kotlin, enums, funciones y funciones de extensión van sueltos en el archivo. Solo crea una clase si necesitas crear objetos de ella. |

---

# ❓ Diario de dudas

> Dudas que me has preguntado y su respuesta resumida, para que puedas repasarlas.

| Fecha | Duda | Respuesta breve |
|---|---|---|
| 06/10 | ¿Cómo hago obligatorio un parámetro? | No dándole valor por defecto: `val title: String` ya es obligatorio. |
| 06/10 | ¿Diferencia entre `Tipo?` y `Tipo? = null`? | `?` = **puede** valer null (tipo). `= null` = valor **por defecto** (se puede omitir al crear el objeto). Son cosas distintas y se combinan. |
| 06/10 | ¿Cómo pruebo mi código? | Tests unitarios en `app/src/test`: función con `@Test` y `assertEquals(esperado, real)`, se ejecuta con la flecha verde. |
| 07/10 | ¿Es buena práctica nombrar los tests con comillas invertidas? | Sí, en Kotlin es lo habitual en tests: se leen como una frase. Solo en `src/test`; en `androidTest` (móvil) usa camelCase, porque Android no admite espacios en nombres de función. |
| 06/10 | ¿Comentarios de una línea: `/** */` o `//`? | `/** Texto */` (KDoc) para documentar clases, enums y funciones: se ve al pasar el ratón. `//` para notas dentro del código. Se cierra con `*/`, no con `**/`. |
