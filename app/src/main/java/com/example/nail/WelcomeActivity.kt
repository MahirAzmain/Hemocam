package com.example.nail

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class WelcomeActivity : AppCompatActivity() {

    private lateinit var nextButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        nextButton = findViewById(R.id.nextButton)

        nextButton.setOnClickListener {
            // Navigate to the ImageSelectionActivity
            val intent = Intent(this, ImageSelectionActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
