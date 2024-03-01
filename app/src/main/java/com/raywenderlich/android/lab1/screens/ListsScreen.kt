package com.raywenderlich.android.lab1.screens

import androidx.annotation.StringRes
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.raywenderlich.android.lab1.router.BackButtonHandler
import com.raywenderlich.android.lab1.router.FundamentalsRouter
import com.raywenderlich.android.lab1.router.Screen

private val items = listof(
    BookCategory(
        R.string. android,
        listof(
                R. drawable.android_aprentice,
        R.drawable.saving_data_android,
        R.drawable.advanced_architecture_android
        )
    ),
    BookCategory(
        R.string.kotlin,
        listof(
            R. drawable. kotlin_coroutines,
            R.drawable. kotlin_aprentice
        )
        ),
        BookCategory(
            R.string. swift,
            listof (
                    R.drawable.combine,
                R.drawable.rx_swift,
            R.drawable.swift_apprentice,
            )
        ),
        BookCategory(
            R.string.ios,
            Listof (
                R. drawable. core_data,
        R.drawable.ios_apprentice,
            )
        )
)
@Composable
fun ListScreen(){
    MyList()

    BackButtonHandler {
        FundamentalsRouter.navigateTo(Screen.Navigation)
    }
}
@Composable
fun MyList(){
    //TODO  add your code here
}
@Composable
fun ListItem(bookCategory:BookCategory,modifier: Modifier = Modifier){
    //TODO add your code here
}
data class BookCategory (
    @StringRes
    val categoryResourceId: Int,
    val bookImageResources: List<Int>
)