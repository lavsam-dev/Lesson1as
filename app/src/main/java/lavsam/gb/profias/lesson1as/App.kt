package lavsam.gb.profias.lesson1as

import android.app.Application
import lavsam.gb.profias.lesson1as.data.RepositoryImpl
import lavsam.gb.profias.lesson1as.domain.repositories.presenters.BasePresenter
import lavsam.gb.profias.lesson1as.presenters.MainActivityPresenter

class App : Application() {
    val mainActivityPresenter: BasePresenter by lazy {
        MainActivityPresenter(RepositoryImpl())
    }
    override fun onCreate() {
        super.onCreate()
        instance = this
    }

    companion object {
        lateinit var instance: App
            private set
    }
}