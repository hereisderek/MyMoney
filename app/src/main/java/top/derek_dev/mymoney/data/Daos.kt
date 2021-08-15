package top.derek_dev.mymoney.data

import androidx.lifecycle.LiveData
import androidx.room.*


/**
 * @author derek
 * Created 8/16/2021 at 12:10 AM
 */

@Dao
interface CurrencyDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(currency: Currency)

    @Query("SELECT * FROM Currency WHERE code = :code")
    fun findByCode(code: String): LiveData<Currency>
}

@Dao
interface ConversionDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(conversion: Conversion)

    @Query("SELECT * FROM conversion WHERE conversionCode = :conversionCode")
    fun findByCode(conversionCode: ConversionCode): LiveData<Conversion>
}