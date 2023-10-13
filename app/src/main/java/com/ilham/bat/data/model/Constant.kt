package com.ilham.bat.data.model

class Constant {
    companion object {

//        var IP: String = "http://192.168.2.138/bat/"
        var IP: String = "http://192.168.2.164/bat/"
//        var IP: String = "https://bat.id/"
        var IP_IMAGE: String = IP + "public/storage/uploads/"

        const val LOCATION_PERMISSION_REQUEST_CODE = 1;

        var KENDARAAN_ID: Long = 0
        var KEYWORD: String = ""

        var Kendar_id: Int = 0
        var Kendar_name: String = ""

        var Pelanggan_id: Int = 0
        var Pelanggan_name: String = ""

        var Tujuan_id: Int = 0
        var Tujuan_name: String = ""

        var UPDATE: Boolean = false
    }
}