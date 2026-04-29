package com.terabyte.core.designsystem.theme

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color

val Orange = Color(0xFFFF9800)
val Cherry = Color(0xFFC62828)
val Peach = Color(0xFFFFB74D)

val DarkBg = Color(0xFF121212)
val DarkSurface = Color(0xFF1E1E1E)

val LightColorScheme = lightColorScheme(
    primary = Orange,
    secondary = Cherry,
    tertiary = Peach,
    onPrimary = Color.White,
    onSecondary = Color.White,
    onBackground = Color.Black,
    onSurface = Color.Black,
)

val DarkColorScheme = darkColorScheme(
    primary = Orange,
    secondary = Cherry,
    tertiary = Peach,
    background = DarkBg,
    surface = DarkSurface,
    onPrimary = Color.White,
    onSecondary = Color.White,
    onBackground = Color.White,
    onSurface = Color.White
)
