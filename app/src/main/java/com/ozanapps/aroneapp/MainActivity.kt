package com.ozanapps.aroneapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ozanapps.aroneapp.databinding.ActivityMainBinding
import com.unity3d.player.UnityPlayerActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startActivity(Intent(this, UnityHandlerActivity::class.java))
        finish()
    }
}