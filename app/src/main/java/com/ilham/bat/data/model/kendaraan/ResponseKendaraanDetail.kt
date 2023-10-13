package com.ilham.bat.data.model.kendaraan

import com.google.gson.annotations.SerializedName

class ResponseKendaraanDetail (
    @SerializedName("status") val status: Boolean,
    @SerializedName("msg") val msg: String,
    @SerializedName("kendaraan") val kendaraan: DataKendaraan
)