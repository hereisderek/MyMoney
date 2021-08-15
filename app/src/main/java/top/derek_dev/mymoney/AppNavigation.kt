package top.derek_dev.mymoney

import androidx.compose.ui.graphics.vector.ImageVector
import top.derek_dev.mymoney.util.extensions.capitalizedWords


/**
 * Created by Derek Zhu on 26/7/21.
 * Project: My_Money
 *
 */



data class NavigationRes(
        val label: String? = null,
        val icon: ImageVector? = null,
        val iconDescription: String? = null
)


sealed class NavigationItem(
        val route: String,
        val res: NavigationRes? = null,
        private val parent: NavigationItem? = null
) {
    private val _children = ArrayList<NavigationItem>()

    private val isRoot get() = this == RootNavigationItem
    private val path: List<NavigationItem> = ArrayList()

    val children: List<NavigationItem> get() = _children


    init {
        addChild(this)
    }

    private fun addChild(child: NavigationItem) {
        parent?._children?.add(this)
    }



    sealed class HomeNavigationItem(
            route: String,
            label: String = route.capitalizedWords,
            parent: NavigationItem? = RootNavigationItem
    ) : NavigationItem(route, res = NavigationRes(label), parent = parent) {
        object Budgets : HomeNavigationItem("budgets")
        object Setting : HomeNavigationItem("setting")
    }

    companion object {
        object RootNavigationItem : NavigationItem("root")
    }
}
