package top.derek_dev.mymoney.util.extensions

import java.util.*


/**
 * @author derek
 * Created 8/15/2021 at 3:38 PM
 */
 

val String.capitalizedWords: String get() = replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }