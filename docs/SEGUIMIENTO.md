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
| **0.1** | Recrear el proyecto con Compose | ✅ | — | (en la 0.3) |
| **0.2** | Entender la estructura del proyecto | ✅ | — | — |
| **0.3** | Git y GitHub | ⬜ | — | |
| **1.1** | Paquetes | ⬜ | | |
| **1.2** | `enum class` | ⬜ | | |
| **1.3** | `data class` Task | ⬜ | | |
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

**Repositorio GitHub:** _(pendiente, Actividad 0.3)_

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

## Fase 1 · Kotlin esencial

_(sin fichas todavía)_

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
| | | |

---

# ❓ Diario de dudas

> Dudas que me has preguntado y su respuesta resumida, para que puedas repasarlas.

| Fecha | Duda | Respuesta breve |
|---|---|---|
| | | |
