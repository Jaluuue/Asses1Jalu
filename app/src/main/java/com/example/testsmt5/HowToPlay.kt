package com.example.testsmt5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class HowToPlay : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_how_to_play)
    }

    fun btn_submit(view: View?) {
        val a = Intent(this@HowToPlay, MainActivity::class.java)
        startActivity(a)
    }
}