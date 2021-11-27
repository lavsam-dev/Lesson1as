package lavsam.gb.profias.lesson1as.presenters

import android.app.Activity
import lavsam.gb.profias.lesson1as.ui.BaseActivity

interface BasePresenter {
    fun attach(baseActivity: BaseActivity)
    fun detach()
    fun getData()
}