package com.example.odev4_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.odev4_1.databinding.ActivitySayfaYactivityBinding

class SayfaYActivity : AppCompatActivity() {

    private lateinit var tasarim :ActivitySayfaYactivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = ActivitySayfaYactivityBinding.inflate(layoutInflater)
        setContentView(tasarim.root)

        tasarim.button.setOnClickListener{
            val intent = Intent(this@SayfaYActivity,MainActivity::class.java)
            startActivity(intent)
        }
    }
}