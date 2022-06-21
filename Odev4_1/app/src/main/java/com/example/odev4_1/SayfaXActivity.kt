package com.example.odev4_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.odev4_1.databinding.ActivitySayfaXactivityBinding

class SayfaXActivity : AppCompatActivity() {
    private lateinit var tasarim : ActivitySayfaXactivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = ActivitySayfaXactivityBinding.inflate(layoutInflater)
        setContentView(tasarim.root)

        tasarim.buttonGitY2.setOnClickListener{
            val intent = Intent(this@SayfaXActivity,SayfaYActivity::class.java)
            startActivity(intent)
        }
    }
}