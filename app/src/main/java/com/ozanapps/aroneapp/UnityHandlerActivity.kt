package com.ozanapps.aroneapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ozanapps.aroneapp.databinding.ActivityUnityHandlerBinding
import com.unity3d.player.UnityPlayerActivity

class UnityHandlerActivity : AppCompatActivity() {

    // view binding
    private lateinit var binding: ActivityUnityHandlerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_unity_handler)

        // using findViewById to get the button from the layout
        val button = findViewById<Button>(R.id.buttonOpenUnity)
        button.setOnClickListener {
            startActivity(Intent(this, UnityPlayerActivity::class.java))
        }

    }
}