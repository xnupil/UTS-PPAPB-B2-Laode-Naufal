package com.example.utsandro
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class WelcomingPageActivity : AppCompatActivity() {
    private lateinit var getStartedButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcoming_page)

        // Inisialisasi tampilan menggunakan findViewById
        getStartedButton = findViewById(R.id.buttonGetStarted)

        // Tambahkan tindakan klik ke tombol "Get Started"
        getStartedButton.setOnClickListener {
            // Tindakan yang diambil ketika tombol "Get Started" ditekan
            // Misalnya, navigasi ke halaman Get Started atau halaman lainnya
        }
    }
}
