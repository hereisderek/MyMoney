package top.derek_dev.mymoney.data

import androidx.room.Database
import androidx.room.RoomDatabase


/**
 * @author derek
 * Created 8/16/2021 at 2:35 AM
 */


@Database(
        entities = [
            Currency::class,
            Conversion::class
        ],
        version = 1,
        exportSchema = false
)
abstract class CurrencyDb : RoomDatabase() {
    abstract fun currencyDao(): CurrencyDao
    abstract fun conversionDao(): ConversionDao
}
