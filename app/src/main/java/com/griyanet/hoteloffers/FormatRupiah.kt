package com.griyanet.hoteloffers

import java.text.NumberFormat
import java.util.*

class FormatRupiah {
    companion object {
        fun rupiah(number: Any): String {
            val localID = Locale("in", "ID")
            val numberFormat = NumberFormat.getCurrencyInstance(localID)
            return numberFormat.format(number).toString()
        }
    }
}
