package com.ilham.bat.data.model.kendaraan

import com.google.gson.annotations.SerializedName

class ResponseKendaraanUpdate (
    @SerializedName("status") val status: Boolean,
    @SerializedName("msg") val msg: String
)