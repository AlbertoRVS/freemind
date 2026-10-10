package com.alberto.freemind.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import com.alberto.freemind.R

/** Fuente del proyecto: Zen Maru Gothic con sus 5 pesos */
val ZenMaru = FontFamily(
    Font(R.font.zen_maru_gothic_light, FontWeight.Light),
    Font(R.font.zen_maru_gothic_regular, FontWeight.Normal),
    Font(R.font.zen_maru_gothic_medium, FontWeight.Medium),
    Font(R.font.zen_maru_gothic_bold, FontWeight.Bold),
    Font(R.font.zen_maru_gothic_black, FontWeight.Black),
)

/** Estilos por defecto de Material 3: copiamos sus tamaños y solo cambiamos la fuente */
private val base = Typography()

val FreeMindTypography = Typography(
    displayLarge = base.displayLarge.copy(fontFamily = ZenMaru),
    displayMedium = base.displayMedium.copy(fontFamily = ZenMaru),
    displaySmall = base.displaySmall.copy(fontFamily = ZenMaru),

    headlineLarge = base.headlineLarge.copy(fontFamily = ZenMaru, fontWeight = FontWeight.Bold),
    headlineMedium = base.headlineMedium.copy(fontFamily = ZenMaru, fontWeight = FontWeight.Bold),
    headlineSmall = base.headlineSmall.copy(fontFamily = ZenMaru, fontWeight = FontWeight.Bold),

    titleLarge = base.titleLarge.copy(fontFamily = ZenMaru, fontWeight = FontWeight.Bold),
    titleMedium = base.titleMedium.copy(fontFamily = ZenMaru, fontWeight = FontWeight.Bold),
    titleSmall = base.titleSmall.copy(fontFamily = ZenMaru, fontWeight = FontWeight.Bold),

    bodyLarge = base.bodyLarge.copy(fontFamily = ZenMaru),
    bodyMedium = base.bodyMedium.copy(fontFamily = ZenMaru),
    bodySmall = base.bodySmall.copy(fontFamily = ZenMaru),

    labelLarge = base.labelLarge.copy(fontFamily = ZenMaru, fontWeight = FontWeight.Medium),
    labelMedium = base.labelMedium.copy(fontFamily = ZenMaru, fontWeight = FontWeight.Medium),
    labelSmall = base.labelSmall.copy(fontFamily = ZenMaru, fontWeight = FontWeight.Medium),
)
