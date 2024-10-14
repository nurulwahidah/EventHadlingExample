package nurul.polbeng.ac.id.eventhadlingexample

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.view.View
import com.google.android.material.snackbar.Snackbar
import android.widget.Toast
import nurul.polbeng.ac.id.eventhadlingexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnDisplayMessage.setOnClickListener {
            Toast.makeText(
                applicationContext,
                "Hello World",
                Toast.LENGTH_LONG
            ).show()
        }
        binding.btnDisplayMessage.setOnLongClickListener {
            Snackbar.make(binding.rootLayout, "Long Click",
                Snackbar.LENGTH_LONG).show()
            true
        }
    }
}

