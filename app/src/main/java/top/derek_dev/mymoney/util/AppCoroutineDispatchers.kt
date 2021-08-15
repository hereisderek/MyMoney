package top.derek_dev.mymoney.util

import kotlinx.coroutines.CoroutineDispatcher


/**
 * Created by Derek Zhu on 26/7/21.
 * Project: My_Money
 *
 */

data class AppCoroutineDispatchers(
    val io: CoroutineDispatcher,
    val computation: CoroutineDispatcher,
    val main: CoroutineDispatcher
)
