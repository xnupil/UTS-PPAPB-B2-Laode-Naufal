import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.example.utsandro.R
import com.example.utsandro.WelcomingPageActivity

class MainActivity : AppCompatActivity() {
    private val splashTimeout: Long = 3000 // Waktu tampilan Splash Screen (3 detik)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash) // Menggunakan layout Splash Screen

        // Handler untuk menangani perpindahan ke WelcomingPageActivity setelah splashTimeout
        Handler().postDelayed({
            val intent = Intent(this, WelcomingPageActivity::class.java)
            startActivity(intent)
            finish() // Tutup Splash Screen
        }, splashTimeout)
    }
}
