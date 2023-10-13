//package com.ilham.bat.ui.fragment.fragment.home
//
//import android.content.Context
//import android.content.Intent
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import androidx.recyclerview.widget.RecyclerView
//import com.ilham.javaline.R
//import com.ilham.javaline.data.model.Constant
//import com.ilham.javaline.data.model.kendaraan.DataKendaraan
//import com.ilham.javaline.ui.update_km.Update_kmActivity
//import kotlinx.android.synthetic.main.adapter_kendaraan.view.*
//import kotlin.collections.ArrayList
//
//
//class KendaraanAdapter (val context: Context, var dataKendaraan: ArrayList<DataKendaraan>,
//                        val clickListener: (DataKendaraan, Int, String) -> Unit ):
//    RecyclerView.Adapter<KendaraanAdapter.ViewHolder>() {
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(
//        LayoutInflater.from(parent.context).inflate(R.layout.adapter_kendaraan, parent, false)
//    )
//
//    override fun getItemCount() = dataKendaraan.size
//
////    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
////        holder.bing(dataKendaraan[position])
//
////        holder.view.txvUpdate.setOnClickListener {
////            Constant.KENDARAAN_ID = dataKendaraan[position].id!!
////            context.startActivity(Intent(context, Update_kmActivity::class.java ))
////        }
////    }
//
//    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
//        val view = view
//        fun bing(dataKendaraan: DataKendaraan) {
//            view.txvnokabin.text = dataKendaraan.no_kabin
//            view.txvnopol.text = dataKendaraan.no_pol
////            view.txvnokm.text = dataKendaraan.km
////            if (dataKendaraan.km != null)
////            {
////                view.txvnokmnull.visibility = View.GONE
////                view.txvnokm.visibility = View.VISIBLE
////            }else
////            {
////            view.txvnokmnull.visibility = View.VISIBLE
////            view.txvnokm.visibility = View.GONE
////        }
//        }
//    }
//
//    fun setData(newDataKendaraan: List<DataKendaraan>) {
//        dataKendaraan.clear()
//        dataKendaraan.addAll(newDataKendaraan)
//        notifyDataSetChanged()
//    }
//}