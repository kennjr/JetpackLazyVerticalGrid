package com.ramanie.jetpacklazyverticalgrid

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.rememberLazyGridState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun HomeFragment() {
    // we can use this state for various functions eg: scrolling to a specific position in the list
    val state = rememberLazyGridState()

    LazyVerticalGrid(state = state, columns = GridCells.Adaptive(minSize = 100.dp)){
        items(100){ index ->
            Box(modifier = Modifier
                .padding(6.dp)
                // the aspectRatio() will make the cell square
                .aspectRatio(1f)
                .clip(RoundedCornerShape(4.dp))
                .background(Color.Gray),
                contentAlignment = Alignment.Center){
                Text(text = "Cell $index")
            }
        }
    }
}