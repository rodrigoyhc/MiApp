package com.example.miapp.onBoardViews

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.miapp.R
import com.example.miapp.data.PageData
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.rememberPagerState

@OptIn  (ExperimentalPagerApi::class)
@Composable
fun MainOnBoarding() {
    val items = ArrayList<PageData>()

    items.add(
        PageData(
            R.drawable.warriors,
            title = "Golden State Warriors",
            description = "4-3",
            R.drawable.logow
        )
    )

//    items.add(
//        PageData(
//            R.drawable.canasta,
//            title = "",
//            description = "",
//
//        )
//    )

    items.add(
        PageData(
            R.drawable.heat,
            title = "Miami Heat",
            description = "2-5",
            R.drawable.logoh
        )
    )

    val pagerState = rememberPagerState(
        pageCount = items.size,
        initialOffscreenLimit = 2,
        infiniteLoop = false,
        initialPage = 0

    )

    OnBoardingPager(
        item = items, pagerState = pagerState, modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    )

}