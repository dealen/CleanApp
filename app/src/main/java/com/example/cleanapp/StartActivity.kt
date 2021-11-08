package com.example.cleanapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.cleanapp.databinding.ActivityStartBinding

class StartActivity : AppCompatActivity() {

    private lateinit var binding: ActivityStartBinding
    private lateinit var btnGoToSecondPage: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityStartBinding.inflate(layoutInflater)

        setContentView(R.layout.activity_start)
        val t = Toast.makeText(applicationContext, "Hello! 111", Toast.LENGTH_LONG)
        t.show()
    }

    fun click(view: View){
        val t = Toast.makeText(applicationContext, "2222222222222", Toast.LENGTH_LONG)
        t.show()
    }
}