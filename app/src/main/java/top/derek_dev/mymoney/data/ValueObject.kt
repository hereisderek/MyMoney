package top.derek_dev.mymoney.data

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey


/**
 * @author derek
 * Created 8/16/2021 at 12:21 AM
 */


@Entity(tableName = "currency")
data class Currency(@PrimaryKey val code: String, val description: String? = null)

@JvmInline
value class ConversionCode(private val code: String) {
    val source: String get() = code.substring(0, 3)
    val target: String get() = code.substring(3)

    companion object {
        fun of(source: String, target: String) = ConversionCode("$source$target")
    }
}


@Entity(tableName = "conversion")
data class Conversion(
        @PrimaryKey val conversionCode: ConversionCode,
        val rate: Float
) {

    // constructor(conversionCode: String, rate: Float) : this(ConversionCode(conversionCode), rate)
    // lateinit var source: Currency
    // lateinit var target: Currency
}



data class Amount(
        val currency: Currency,
        val amount: Float
)

data class Category(
        val id: Int,
        val description: String?,
        @Embedded val initialAmount: Amount,
        val transaction: List<Transaction>
)

enum class TransactionType {
    INCOME, COST
}

data class Transaction(
        val currency: Currency,
        val amount: Float,
        val type: TransactionType,
        val description: String? = null
) {
    val effectiveDifference: Float = if (type == TransactionType.COST) (-1 * amount) else amount
}