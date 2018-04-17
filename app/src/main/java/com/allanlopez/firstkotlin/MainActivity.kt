package com.allanlopez.firstkotlin

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import java.util.*

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    var rvlue: Int = 0

    fun random(view: View){
        val r = Random()
        rvlue = r.nextInt(100)
        val text = findViewById<TextView>(R.id.textView)
        text.setText(rvlue.toString())


    }

    fun next(view: View){
        val intent = Intent(this, SegundaActivity::class.java )
        intent.putExtra("numero", rvlue)
        startActivity(intent)
    }
}
