package com.example.lab_week_03

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_detail)

        val btnBack = findViewById<Button>(R.id.button2)
        btnBack.setOnClickListener {
            // Menutup halaman sekarang dan kembali ke halaman sebelumnya
            finish()
        }
    }
}