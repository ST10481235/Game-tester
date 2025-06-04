package vcmsa.ci.gametester

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)


        val DateTextView = findViewById<EditText>(R.id.DateTextView)
        val minuteTextNumber = findViewById<EditText>(R.id.minutesTextNumber)
        val AddEntrybtn = findViewById<Button>(R.id.AddEntrybtn)



    }
    }
}