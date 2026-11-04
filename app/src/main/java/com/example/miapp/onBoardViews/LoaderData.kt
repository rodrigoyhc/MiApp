package com.example.miapp.onBoardViews

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.LottieConstants
import com.airbnb.lottie.compose.rememberLottieComposition

@Composable
fun LoaderData(
    modifier: Modifier = Modifier,
    @DrawableRes image: Int
) {
    Image(
        painter = painterResource(id = image),
        contentDescription = null,
        modifier = modifier,
        contentScale = ContentScale.Fit
    )
}