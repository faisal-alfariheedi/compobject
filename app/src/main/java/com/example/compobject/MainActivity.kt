package com.example.compobject

import android.graphics.Color.BLACK
import android.graphics.Color.WHITE
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var tv1: TextView
    lateinit var ed1: EditText
    lateinit var but: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv1 = findViewById(R.id.textView)
        ed1 = findViewById(R.id.ed1)
        but = findViewById(R.id.but1)
        but.setOnClickListener{
            when(ed1.text.toString().lowercase()){
                "day" -> {time.backtime(findViewById(R.id.mm),0)
                    ed1.setTextColor(BLACK)
                    tv1.setTextColor(BLACK)
                }
                "night" ->{time.backtime(findViewById(R.id.mm),1)
                    ed1.setTextColor(WHITE)
                    tv1.setTextColor(WHITE)

                }

            }
        }

    }
}