package top.derek_dev.mymoney.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import top.derek_dev.mymoney.ui.home.Home
import top.derek_dev.mymoney.ui.theme.MyMoneyTheme


/**
 * @author derek
 * Created 8/15/2021 at 5:16 PM
 */

@Composable
@Preview
fun App() {
    MyMoneyTheme {
        Home()
    }
}