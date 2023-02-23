package com.example.dz_1_6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.navigation.NavController
import com.example.dz_1_6.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var editText: EditText
    private lateinit var ui: ActivityMainBinding
    private lateinit var navController : NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ui  = ActivityMainBinding.inflate(layoutInflater)
        setContentView(ui.root)
        editText = findViewById(R.id.et_edit_text)

        initListeners()



    }

    private fun initListeners() {

        ui.btnButton.setOnClickListener {
            if(ui.etEditText.text.isNotEmpty()){
                val inputValue: String = ui.etEditText.text.toString()
            val intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("text", editText.text.toString())
                startActivity(intent)


                }else{
                    Toast.makeText(this, "Поле не должно быть пустым",Toast.LENGTH_SHORT).show()
            }
            }
        }
    }
