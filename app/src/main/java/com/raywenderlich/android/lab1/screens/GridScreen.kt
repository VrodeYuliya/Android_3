package com.raywenderlich.android.lab1.screens

import android.content.Intent.ShortcutIconResource
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.raywenderlich.android.lab1.R
import com.raywenderlich.android.lab1.router.BackButtonHandler
import com.raywenderlich.android.lab1.router.FundamentalsRouter
import com.raywenderlich.android.lab1.router.Screen
import kotlin.math.ceil

private val items = listOf(
    Icons. Filled. Check,
    Icons.Filled. Close,
    Icons. Filled. ThumbUp,
    Icons. Filled. Build,
    Icons. Filled. Delete,
    Icons.Filled. Home,
    Icons.Filled. Close,
    Icons.Filled. ThumbUp,
    Icons.Filled. Build,
    Icons. Filled. ThumbUp,
)
    @Composable
    fun GridScreen() {
        GridView(columnCount = 3)

        BackButtonHandler {
            FundamentalsRouter.navigateTo(Screen.Navigation)
        }
    }
    @Composable
    fun GridView(columnCount: Int) {
//TODO add your code here
    }
    @Composable
    fun RowItem(rowItems: List<IconResource>) {
//TODO add your code here
        }
    @Composable
    fun RowScope.GridIcon(iconResource: IconResource) {
//TODO add your code here
    }
    data class IconResource(val imageVector: ImageVector, val isVisible: Boolean)