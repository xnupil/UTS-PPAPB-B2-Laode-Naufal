package com.example.utsandro

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity

class InputDataActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_input_data)

        // Menggunakan findViewById untuk mengakses elemen-elemen tampilan
        val foodNameEditText: EditText = findViewById(R.id.editTextFoodName)
        val mealTimeSpinner: Spinner = findViewById(R.id.spinnerMealTime)
        val caloriesEditText: EditText = findViewById(R.id.editTextCalories)
        val saveButton: Button = findViewById(R.id.buttonSaveInput)

        // Menangani klik tombol "Simpan Input"
        saveButton.setOnClickListener {
            // Ambil data dari elemen-elemen tampilan
            val foodName = foodNameEditText.text.toString()
            val mealTime = mealTimeSpinner.selectedItem.toString()
            val calories = caloriesEditText.text.toString()

            // Simpan data atau lakukan apa yang Anda butuhkan di sini

            // Pindah kembali ke halaman Home
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
