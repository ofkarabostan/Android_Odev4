package com.example.odev4_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.odev4_1.databinding.ActivitySayfaAactivityBinding
import com.example.odev4_1.databinding.ActivitySayfaBactivityBinding

class SayfaBActivity : AppCompatActivity() {
    private lateinit var tasarim: ActivitySayfaBactivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = ActivitySayfaBactivityBinding.inflate(layoutInflater)
        setContentView(tasarim.root)

        tasarim.buttonGitY.setOnClickListener{
            val intent = Intent(this@SayfaBActivity,SayfaYActivity::class.java)
            startActivity(intent)
        }
    }
}