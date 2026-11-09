package com.example.miapp.onBoardViews

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.miapp.data.PageData
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.PagerState

@OptIn(ExperimentalPagerApi::class)
@Composable
fun OnBoardingPager(
    item: List<PageData>,
    pagerState: PagerState,
    modifier: Modifier = Modifier
) {
    Box(modifier = modifier.fillMaxSize()) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            HorizontalPager(
                state = pagerState,
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
            ) { page ->
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp)
                ) {
                    item[page].imageL?.let { logoRes ->
                        Image(
                            painter = painterResource(id = logoRes),
                            contentDescription = "Logo del equipo",
                            modifier = Modifier
                                .padding(top = 24.dp)
                                .size(60.dp)
                                .align(Alignment.TopStart)
                        )
                    }

                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .align(Alignment.Center), // Centrado vertical
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        LoaderData(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(180.dp),
                            image = item[page].image
                        )

                        Text(
                            text = item[page].title,
                            modifier = Modifier.padding(top = 16.dp),
                            color = Color.Black,
                            style = MaterialTheme.typography.displayLarge,
                            fontWeight = FontWeight.Bold,
                            fontSize = 20.sp
                        )

                        Text(
                            text = item[page].description,
                            modifier = Modifier.padding(top = 8.dp),
                            color = Color.Black,
                            style = MaterialTheme.typography.displayMedium,
                            fontWeight = FontWeight.Light,
                            fontSize = 14.sp
                        )

                        Contador(currentPage = page)
                    }
                }
            }

            PagerIndicator(
                size = item.size,
                currentPage = pagerState.currentPage
            )
        }
    }
}