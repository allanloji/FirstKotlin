package com.allanlopez.firstkotlin

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class SegundaActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda)

        val n = intent.getIntExtra("numero", -1)
        val texto = findViewById<TextView>(R.id.textView2)
        texto.setText(n.toString())
    }
}
