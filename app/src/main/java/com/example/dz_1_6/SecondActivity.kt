package com.example.dz_1_6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.ScriptGroup.Binding
import android.widget.TextView
import com.example.dz_1_6.databinding.ActivityMainBinding
import com.example.dz_1_6.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var ui:ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ui  = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(ui.root)
        val intentValue = intent.getStringExtra("text")
        findViewById<TextView>(R.id.tv_textview).apply {
            text = intentValue.toString()
        }



    }
}