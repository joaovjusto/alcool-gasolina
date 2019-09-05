package com.example.alcoolougasolina

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Cálculo principal

        button3.setOnClickListener {

            if (idAlcool.text.trim().isEmpty() || idGasolina.text.trim().isEmpty()) {
                Toast.makeText(applicationContext, "Favor inserir algo no input", Toast.LENGTH_LONG).show();
                textView.text = "";
                idGasolina.setText("");
                idAlcool.setText("")
            } else {

                // Getting the values
                val alcool = findViewById<EditText>(R.id.idAlcool);
                val gasolina = findViewById<EditText>(R.id.idGasolina);
                val textView: TextView = findViewById(R.id.textView);

                var resultado = "";

                val valorGasolina: Double;

                valorGasolina = gasolina.text.toString().toDouble() * 0.7;

                val valorAlcool = alcool.text.toString().toDouble()

                if (valorGasolina >= valorAlcool) {
                    resultado = "Vale mais a pena álcool";
                } else {
                    resultado = "Vale mais a pena gasolina";
                }

                textView.text = resultado;
                Toast.makeText(applicationContext, resultado, Toast.LENGTH_LONG).show();
                gasolina.setText("");
                alcool.setText("");
            }

        }

    }
}
