package top.derek_dev.mymoney.data.model

import androidx.annotation.Keep
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


/**
 * @author derek
 * Created 8/15/2021 at 9:40 PM
 */

interface BaseResponse {
    @SerialName("success")
    val success: Boolean // true
    @SerialName("terms")
    val terms: String // https://currencylayer.com/terms
    @SerialName("privacy")
    val privacy: String // https://currencylayer.com/privacy
    @SerialName("timestamp")
    val timestamp: Int // 1628941924
}


@Keep
@Serializable
data class LiveResponse(
        @SerialName("success")
        override val success: Boolean, // true
        @SerialName("terms")
        override val terms: String, // https://currencylayer.com/terms
        @SerialName("privacy")
        override val privacy: String, // https://currencylayer.com/privacy
        @SerialName("timestamp")
        override val timestamp: Int, // 1628941924
        @SerialName("source")
        val source: String, // USD
        @SerialName("quotes")
        val quotes: Quotes
) : BaseResponse {
    @Keep
    @Serializable
    data class Quotes(
            @SerialName("USDEUR")
            val uSDEUR: Double, // 0.847716
            @SerialName("USDGBP")
            val uSDGBP: Double, // 0.721241
            @SerialName("USDCAD")
            val uSDCAD: Double, // 1.251445
            @SerialName("USDPLN")
            val uSDPLN: Double // 3.872375
    )
}

