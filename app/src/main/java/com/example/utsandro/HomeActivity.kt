package com.example.utsandro

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // Menggunakan findViewById untuk mengakses elemen-elemen tampilan
        val targetCaloriesTextView: TextView = findViewById(R.id.textViewTargetCalories)
        val remainingCaloriesTextView: TextView = findViewById(R.id.textViewRemainingCalories)
        val inputDataButton: Button = findViewById(R.id.buttonInputData)

        // Menangani klik tombol "Input Data" untuk pindah ke halaman Input Data
        inputDataButton.setOnClickListener {
            val intent = Intent(this, InputDataActivity::class.java)
            startActivity(intent)
        }

        // Di sini Anda dapat mengatur teks untuk target kalori dan kalori tersisa
        val targetCalories = 2000 // Gantilah dengan nilai sesuai kebutuhan Anda
        val remainingCalories = 1500 // Gantilah dengan nilai sesuai kebutuhan Anda

        targetCaloriesTextView.text = "Target Kalori Harian: $targetCalories"
        remainingCaloriesTextView.text = "Sisa Kalori: $remainingCalories"
    }
}
