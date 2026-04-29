package com.terabyte.core.designsystem.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.terabyte.core.designsystem.R

val AppFontFamily = FontFamily(
    Font(R.font.lato_light),
    Font(R.font.lato_regular),
    Font(R.font.lato_bold),
)


val AppTypography = Typography(
    headlineLarge = TextStyle(
        fontWeight = FontWeight.Bold,
        fontSize = 32.sp,
        lineHeight = 40.sp,
        letterSpacing = 0.sp,
        fontFamily = AppFontFamily
    ),
    headlineMedium = TextStyle(
        fontWeight = FontWeight.Normal,
        fontSize = 28.sp,
        lineHeight = 36.sp,
        fontFamily = AppFontFamily
    ),
    headlineSmall = TextStyle(
        fontWeight = FontWeight.Light,
        fontSize = 24.sp,
        lineHeight = 32.sp,
        fontFamily = AppFontFamily
    ),


    bodyLarge = TextStyle(
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        fontFamily = AppFontFamily
    ),
    bodyMedium = TextStyle(
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        fontFamily = AppFontFamily
    ),
    bodySmall = TextStyle(
        fontWeight = FontWeight.Light,
        fontSize = 12.sp,
        lineHeight = 16.sp,
        fontFamily = AppFontFamily
    ),

    labelLarge = TextStyle(
        fontWeight = FontWeight.Bold,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.1.sp,
        fontFamily = AppFontFamily
    ),
    labelMedium = TextStyle(
        fontWeight = FontWeight.Bold,
        fontSize = 12.sp,
        lineHeight = 16.sp,
        fontFamily = AppFontFamily
    )
)