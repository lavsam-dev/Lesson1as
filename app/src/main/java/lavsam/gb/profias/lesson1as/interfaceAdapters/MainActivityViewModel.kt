package lavsam.gb.profias.lesson1as.interfaceAdapters

import androidx.lifecycle.ViewModel
import lavsam.gb.profias.lesson1as.domain.Cat
import lavsam.gb.profias.lesson1as.usCases.CatFeeder

class MainActivityViewModel: ViewModel() {
    private val catFeeder = CatFeeder()

    fun feedCat(cat: Cat) = catFeeder.feed(cat)
}