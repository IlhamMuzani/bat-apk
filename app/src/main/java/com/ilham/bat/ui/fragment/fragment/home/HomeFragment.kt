package com.ilham.bat.ui.fragment.fragment.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.ilham.bat.R
import com.ilham.bat.data.database.PrefsManager
import com.ilham.bat.ui.sweetalert.SweetAlertDialog
import com.ilham.bat.ui.fragment.UserActivity

class HomeFragment : Fragment(), HomeContract.View {

    lateinit var prefsManager: PrefsManager
    lateinit var presenter: HomePresenter
//    lateinit var updateKm : RelativeLayout

    private lateinit var sLoading: SweetAlertDialog
    private lateinit var sSuccess: SweetAlertDialog
    private lateinit var sError: SweetAlertDialog
    private lateinit var sAlert: SweetAlertDialog

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_homedriver, container, false)

        presenter = HomePresenter(this)
        prefsManager = PrefsManager(requireActivity())

        initFragment(view)

        return view
    }

    override fun onStart() {
        super.onStart()
    }

    override fun initFragment(view: View) {

        sLoading = SweetAlertDialog(
            requireActivity(),
            SweetAlertDialog.PROGRESS_TYPE
        )
        sSuccess = SweetAlertDialog(
            requireActivity(),
            SweetAlertDialog.SUCCESS_TYPE
        ).setTitleText("Berhasil")
        sError = SweetAlertDialog(
            requireActivity(),
            SweetAlertDialog.ERROR_TYPE
        ).setTitleText("Gagal !")
        sAlert = SweetAlertDialog(
            requireActivity(),
            SweetAlertDialog.WARNING_TYPE
        ).setTitleText("Peringatan !")

//        updateKm = view.findViewById(R.id.labelupdatekm)

//        updateKm.setOnClickListener {
//            startActivity(Intent(context, Update_kmActivity::class.java))
//        }

//        updateKm.setOnClickListener {
//            if (prefsManager.prefIsLogin) {
//                startActivity(Intent(context, Update_kmActivity::class.java))
//            } else {
//                startActivity(Intent(context, LoginActivity::class.java))
//            }
//        }


    }

    override fun onLoadingswet(loading: Boolean, message: String?) {
        when (loading){
            true -> sLoading.setTitleText(message).show()
            false -> sLoading.dismiss()
        }
    }

    override fun showSuccesOk(message: String) {
        sSuccess
            .setContentText(message)
            .setConfirmText("Ok")
            .setConfirmClickListener {
                it.dismissWithAnimation()
                startActivity(Intent(requireActivity(), UserActivity::class.java))
            }.show()
    }

    override fun showSucces(message: String) {
        sSuccess
            .setContentText(message)
            .setConfirmText("Ok")
            .setConfirmClickListener {
                it.dismissWithAnimation()
            }.show()
    }

    override fun showError(message: String) {
        sError
            .setContentText(message)
            .setConfirmText("Gagal")
            .setConfirmClickListener {
                it.dismiss()
            }.show()
    }

    override fun showAlert(message: String) {
        sAlert
            .setContentText(message)
            .setConfirmText("Ya")
            .setConfirmClickListener {
                it.dismissWithAnimation()
            }
            .setConfirmText("Nanti")
            .setConfirmClickListener {
                it.dismiss()
            }.show()
        sAlert.setCancelable(true)
    }

}