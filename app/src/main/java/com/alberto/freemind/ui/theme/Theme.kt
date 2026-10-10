package com.alberto.freemind.ui.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext

private val DarkFreeMindColorScheme = darkColorScheme(
    primary = MossLight,
    secondary = BlueSky,
    tertiary = LastLight,
    background = DarkForest,
    surface = NightForest,
    surfaceContainerHighest = NightForest, // fondo de las Card
    onPrimary = DarkForest,
    onSecondary = DarkForest,
    onTertiary = DarkForest,
    onSurface = WaterPaper,
    onBackground = WaterPaper
)

private val LightFreeMindColorScheme = lightColorScheme(
    primary = ForestGreen,
    secondary = BlueSky,
    tertiary = LastLight,
    background = WaterPaper,
    surface = Cream,
    surfaceContainerHighest = Cream, // fondo de las Card
    onPrimary = WaterPaper,
    onSecondary = DarkForest,
    onTertiary = DarkForest,
    onSurface = DarkForest,
    onBackground = DarkForest
)

@Composable
fun FreeMindTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = false,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> DarkFreeMindColorScheme
        else -> LightFreeMindColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = FreeMindTypography,
        content = content
    )
}