package top.derek_dev.mymoney

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber


/**
 * @author derek
 * Created 8/15/2021 at 4:56 PM
 */


@HiltAndroidApp
class MyMoneyApplication : Application() {


    override fun onCreate() {
        super.onCreate()

        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }
}