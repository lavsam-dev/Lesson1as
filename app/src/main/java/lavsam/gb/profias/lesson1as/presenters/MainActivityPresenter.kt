package lavsam.gb.profias.lesson1as.presenters

import lavsam.gb.profias.lesson1as.data.RepositoryImpl
import lavsam.gb.profias.lesson1as.domain.repositories.presenters.BasePresenter
import lavsam.gb.profias.lesson1as.ui.BaseActivity

class MainActivityPresenter(private val repositoryImpl: RepositoryImpl) : BasePresenter {
    private var activity: BaseActivity? = null

    override fun attach(baseActivity: BaseActivity) {
        activity = baseActivity
    }

    override fun detach() {
        activity = null
    }

    override fun getData() {
        val data = repositoryImpl.providedata()
        activity?.setDataToTextView(data)
    }
}