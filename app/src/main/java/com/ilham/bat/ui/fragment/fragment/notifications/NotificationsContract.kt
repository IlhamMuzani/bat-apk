package com.ilham.bat.ui.fragment.fragment.notifications

interface NotificationsContract {

   interface View{
       fun initFragment(view: android.view.View)
       fun showMessage(message: String)
   }

}