//29 April 2023
//Latihan Bloodshare
//10120902
//Dina Sri Hartini
//IF-10

package com.example.lat2_if10_10120902_dinasrihartini

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class AlmostActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnalmost : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_almost_there)

        btnalmost = findViewById(R.id.button4)

        btnalmost.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.button4 ->{
                val intenBiasa3 = Intent(this@AlmostActivity, VerifyActivity::class.java)
                startActivity(intenBiasa3)
            }
        }
    }
}