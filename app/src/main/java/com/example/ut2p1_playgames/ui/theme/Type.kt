package com.example.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.ut2p1_playgames.R

val AppTypography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )
)

val courgetteRegularFamily = FontFamily(
    Font(R.font.courgetteregular, FontWeight.Light),
    Font(R.font.courgetteregular, FontWeight.Normal),
    Font(R.font.courgetteregular, FontWeight.Normal, FontStyle.Italic),
    Font(R.font.courgetteregular, FontWeight.Medium),
    Font(R.font.courgetteregular, FontWeight.Bold),
)
