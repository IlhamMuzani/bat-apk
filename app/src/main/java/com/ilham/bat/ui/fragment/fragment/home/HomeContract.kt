package com.ilham.bat.ui.fragment.fragment.home



interface HomeContract {

    interface Presenter{
    }

    interface View{
        fun initFragment(view: android.view.View)
        fun onLoadingswet(loading: Boolean, message: String? = "Menampilkan..")
        fun showSuccesOk(message: String)
        fun showSucces(message: String)
        fun showError(message: String)
        fun showAlert(message: String)
    }
}