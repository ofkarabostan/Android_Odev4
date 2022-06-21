package com.example.odev4_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.odev4_1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var tasarim:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        tasarim = ActivityMainBinding.inflate(layoutInflater)
        setContentView(tasarim.root)

        tasarim.buttonGitA.setOnClickListener{
            val intent = Intent(this@MainActivity,SayfaAActivity::class.java)
            startActivity(intent)
        }
        tasarim.buttonGitX.setOnClickListener{
            val intent = Intent(this@MainActivity,SayfaXActivity::class.java)
            startActivity(intent)
        }
    }
}