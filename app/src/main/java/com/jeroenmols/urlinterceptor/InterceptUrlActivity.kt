package com.jeroenmols.urlinterceptor

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class InterceptUrlActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (intent.action === Intent.ACTION_VIEW) {
            // TODO change this to your preferred development browser
            val development_browser_package="com.android.chrome"

            val intent = Intent(Intent.ACTION_VIEW, intent.data)
            intent.setPackage(development_browser_package)
            startActivity(intent)
        }

        finish()
    }
}