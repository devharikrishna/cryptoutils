package com.irah.cryptoutils

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.irah.cryptoutils.R.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val textView = findViewById<TextView>(R.id.tv)
        textView.textSize = 30f
        textView.text = (newFunction() + newFunction2()).toString()

    }

    private fun newFunction(): Int {
        val a = 1
        val b = 2
        val c = a + b
        return c
    }

    private fun newFunction2(): Int {
        val a = 5
        val b = 2
        return a - b
    }

}