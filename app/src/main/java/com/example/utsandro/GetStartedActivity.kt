package com.example.utsandro

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity

class GetStartedActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_get_started)

        // Menggunakan findViewById untuk mengakses elemen-elemen tampilan
        val nameEditText: EditText = findViewById(R.id.editTextName)
        val currentWeightEditText: EditText = findViewById(R.id.editTextCurrentWeight)
        val targetWeightEditText: EditText = findViewById(R.id.editTextTargetWeight)
        val dietGoalSpinner: Spinner = findViewById(R.id.spinnerDietGoal)
        val targetDateEditText: EditText = findViewById(R.id.editTextTargetDate)
        val maxCaloriesEditText: EditText = findViewById(R.id.editTextMaxCalories)
        val weightUnitSpinner: Spinner = findViewById(R.id.spinnerWeightUnit)
        val saveButton: Button = findViewById(R.id.buttonSave)

        // Menangani klik tombol "Simpan" untuk menyimpan data dan pindah ke halaman Home
        saveButton.setOnClickListener {
            // Ambil data dari elemen-elemen tampilan
            val name = nameEditText.text.toString()
            val currentWeight = currentWeightEditText.text.toString()
            val targetWeight = targetWeightEditText.text.toString()
            val dietGoal = dietGoalSpinner.selectedItem.toString()
            val targetDate = targetDateEditText.text.toString()
            val maxCalories = maxCaloriesEditText.text.toString()
            val weightUnit = weightUnitSpinner.selectedItem.toString()

            // Simpan data atau lakukan apa yang Anda butuhkan di sini

            // Pindah ke halaman Home
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
