package com.example.uu119632.hellokotlin

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.TextView

/**
 * Created by uu119632 on 2017/08/29.
 */

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setListener()

    }

    private fun setListener() {
        findViewById(R.id.button1).setOnClickListener(this)
        findViewById(R.id.button2).setOnClickListener(this)
    }

    override fun onClick(view: View) {
        when (view.id) {
            R.id.button1 -> {
                val textView = findViewById(R.id.text) as TextView
                textView.text = "画面遷移"
            }
            R.id.button2 -> {
                val intent = Intent(this@MainActivity, SubActivity::class.java)
                startActivity(intent)
            }
            else -> {
            }
        }

    }


}
