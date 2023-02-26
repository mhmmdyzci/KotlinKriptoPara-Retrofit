package com.example.retrofitkotlin.model

import com.google.gson.annotations.SerializedName


data class CryptoModel(
 //   @SerializedName(value = "currency")
    val currency: String,
    // @SerializedName(value = "price")
    val price: String

    )