@Composable
fun Scrollingscreen() {
    MyScrollingScreen()

    BackButtonHandler {
        FundamentalsRouter.navigateTo(Screen.Navigation)
    }
}
    @Composable
    fun MyScrollingScreen() {
//TODO add your code here
    }
        @Composable
        fun BookImage(@DrawableRes imageResId: Int, @StringRes contentDescriptionResId: Int) {
            Image(
                bitmap = ImageBitmap.imageResource(imageResId),
                contentDescription = stringResource(contentDescriptionResId),
                contentScale = ContentScale.FillBounds,
                modifier = Modifier.size(476.dp, 616.dp)
            )
        }