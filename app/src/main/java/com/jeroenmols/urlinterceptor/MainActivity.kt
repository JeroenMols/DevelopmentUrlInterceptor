package com.jeroenmols.urlinterceptor

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.Settings
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<MaterialButton>(R.id.button).setOnClickListener {
            val intent = Intent(
                Settings.ACTION_APP_OPEN_BY_DEFAULT_SETTINGS,
                Uri.parse("package:${this.packageName}"))
            this.startActivity(intent)
        }
    }
}