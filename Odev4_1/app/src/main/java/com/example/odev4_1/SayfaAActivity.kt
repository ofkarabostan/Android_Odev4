package com.example.odev4_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.odev4_1.databinding.ActivitySayfaAactivityBinding

class SayfaAActivity : AppCompatActivity() {
    private lateinit var tasarim:ActivitySayfaAactivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = ActivitySayfaAactivityBinding.inflate(layoutInflater)
        setContentView(tasarim.root)


        tasarim.buttonGitB.setOnClickListener{
            val intent = Intent(this@SayfaAActivity,SayfaBActivity::class.java)
            startActivity(intent)
        }
    }
}