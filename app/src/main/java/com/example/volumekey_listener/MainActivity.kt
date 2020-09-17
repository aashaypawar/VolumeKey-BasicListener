package com.example.volumekey_listener

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {

        if (keyCode == KeyEvent.KEYCODE_VOLUME_DOWN) {
            Toast.makeText(applicationContext,"Volume Down Key Pressed",Toast.LENGTH_SHORT).show()
        }

        if (keyCode == KeyEvent.KEYCODE_VOLUME_UP) {
            Toast.makeText(applicationContext,"Volume Up Key Pressed",Toast.LENGTH_SHORT).show()
        }

        if (keyCode == KeyEvent.KEYCODE_BACK) {
            Toast.makeText(applicationContext,"Back Key Pressed",Toast.LENGTH_SHORT).show()
        }
        return true
    }
}