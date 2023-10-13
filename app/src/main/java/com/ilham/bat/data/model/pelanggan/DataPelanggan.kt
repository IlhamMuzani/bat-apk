package com.ilham.bat.data.model.pelanggan

import com.google.gson.annotations.SerializedName

class DataPelanggan (
    @SerializedName( "id") val id: Long?,
    @SerializedName( "nama_alias") val nama_alias: String?,
)