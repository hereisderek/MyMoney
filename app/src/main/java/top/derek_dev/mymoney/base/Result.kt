package top.derek_dev.mymoney.base


/**
 * @author derek
 * Created 8/15/2021 at 5:25 PM
 */

sealed class Result<out R> {
    data class Success<out T>(val data: T) : Result<T>()
    data class Error(val exception: Exception) : Result<Nothing>()
    data class Loading<out T>(val data: T? = null) : Result<T>()

    companion object {
        val loading = Loading<Nothing>()
    }
}
