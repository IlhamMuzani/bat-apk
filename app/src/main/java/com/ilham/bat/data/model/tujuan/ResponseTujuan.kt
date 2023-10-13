package com.ilham.bat.data.model.tujuan

import com.google.gson.annotations.SerializedName

class ResponseTujuan (
    @SerializedName("status") val status: Boolean,
    @SerializedName("message") val message: List<String>,
    @SerializedName("data") val data: List<DataTujuan>
)