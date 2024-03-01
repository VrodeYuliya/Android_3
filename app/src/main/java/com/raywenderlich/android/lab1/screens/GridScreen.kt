package com.raywenderlich.android.lab1.screens

import androidx.compose.runtime.Composable

private val items = listof(
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