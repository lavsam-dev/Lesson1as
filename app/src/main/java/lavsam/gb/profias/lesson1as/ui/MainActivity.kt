package lavsam.gb.profias.lesson1as.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import lavsam.gb.profias.lesson1as.App
import lavsam.gb.profias.lesson1as.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), BaseActivity {
    private val presenter = App.instance.mainActivityPresenter
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        presenter.attach(this)
        binding.button.setOnClickListener {
            presenter.getData()
        }
    }

    override fun setDataToTextView(string: String) {
        binding.textView.text = string
    }

    override fun onDestroy() {
        presenter.detach()
        super.onDestroy()
    }


}