package com.example.dotoring.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import com.example.dotoring.R

// Set of Material typography styles to start with

val nanumSquareFamily = FontFamily(
    Font(R.font.nanumsquare_light, FontWeight.Light),
    Font(R.font.nanumsquare_regular, FontWeight.Normal),
    Font(R.font.nanumsquare_bold, FontWeight.Bold),
    Font(R.font.nanumsquare_extrabold, FontWeight.ExtraBold),
    Font(R.font.nanumsquare_ac_light, FontWeight.Light),
    Font(R.font.nanumsquare_ac_regular, FontWeight.Normal),
    Font(R.font.nanumsquare_ac_bold, FontWeight.Bold),
    Font(R.font.nanumsquare_ac_extrabold, FontWeight.ExtraBold)
)

val DotoringTypography = Typography(
    defaultFontFamily = nanumSquareFamily
)


