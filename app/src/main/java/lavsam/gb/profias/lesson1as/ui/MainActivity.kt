package lavsam.gb.profias.lesson1as.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import lavsam.gb.profias.lesson1as.R
import lavsam.gb.profias.lesson1as.domain.Cat
import lavsam.gb.profias.lesson1as.interfaceAdapters.MainActivityViewModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mainActivityViewModel = MainActivityViewModel() // not for use
        mainActivityViewModel.feedCat(Cat())
    }
}