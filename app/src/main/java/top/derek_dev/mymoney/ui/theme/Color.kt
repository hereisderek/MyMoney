package top.derek_dev.mymoney.ui.theme


import androidx.compose.material.Colors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.compositeOver

/**
 * Created by Derek Zhu on 22/7/21.
 * Project: My_Money
 *
 */

/**
 * Return the fully opaque color that results from compositing [onSurface] atop [surface] with the
 * given [alpha]. Useful for situations where semi-transparent colors are undesirable.
 */
@Composable
fun Colors.compositedOnSurface(alpha: Float): Color {
    return onSurface.copy(alpha = alpha).compositeOver(surface)
}

fun getMyMoneyColors(isDarkTheme: Boolean) = if (isDarkTheme) MyMoneyDarkColors else MyMoneyLightColors

private val MyMoneyLightColors = lightColors(
    primary = MaterialColors.MD_LIGHT_BLUE_700,
    primaryVariant = MaterialColors.MD_BLUE_900,
    onPrimary = Color.White,
    secondary = MaterialColors.MD_GREEN_500,
    secondaryVariant = MaterialColors.MD_GREEN_900,
    onSecondary = Color.White,
    error = MaterialColors.MD_RED_300
)


private val MyMoneyDarkColors = lightColors(
    primary = MaterialColors.MD_LIGHT_BLUE_300,
    primaryVariant = MaterialColors.MD_BLUE_700,
    onPrimary = Color.Black,
    secondary = MaterialColors.MD_GREEN_300,
    secondaryVariant = MaterialColors.MD_GREEN_700,
    onSecondary = Color.Black,
    error = MaterialColors.MD_RED_200
)

