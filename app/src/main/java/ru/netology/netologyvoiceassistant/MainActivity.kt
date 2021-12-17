package ru.netology.netologyvoiceassistant

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import ru.netology.netologyvoiceassistant.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name: String = "Nikita"
        val surname: String = "Shumskii"
        val age: Int = 26
        val height: Double = 180.0
        val summary: String = "name: $name surname: $surname age: $age height: $height"
        binding.output.text = summary

        Log.d(TAG, summary)
    }

    companion object {
        const val TAG = "MainActivity"
    }
}
