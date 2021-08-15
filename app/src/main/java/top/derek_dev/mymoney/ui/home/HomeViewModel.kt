package top.derek_dev.mymoney.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import top.derek_dev.mymoney.base.Result
import top.derek_dev.mymoney.data.Category
import top.derek_dev.mymoney.data.repo.Repo
import javax.inject.Inject


/**
 * @author derek
 * Created 8/16/2021 at 2:07 AM
 */

class HomeViewModel @Inject constructor(
        private val repo: Repo
) : ViewModel() {

    private val _categories = liveData<Result<Category>> {

    }
    // private val _categories = MutableLiveData<Result<Category>>()
    val categories : LiveData<Result<Category>> get() = _categories

    fun createNewCategory() {

    }

    fun refresh() {

    }

    fun loadMore() {

    }
}