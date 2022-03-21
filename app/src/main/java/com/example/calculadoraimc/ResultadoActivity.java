package com.example.calculadoraimc;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.ColorSpace;
import android.os.Bundle;
import android.widget.TextView;

public class ResultadoActivity extends AppCompatActivity {

    TextView textViewOla;
    TextView textViewEsta;
    TextView textViewAcima;
    TextView textViewAbaixo;
    TextView textViewDentro;
    TextView textViewIdeal;
    TextView textViewNomeUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        textViewOla = findViewById(R.id.textViewOla);
        textViewEsta= findViewById(R.id.textViewEsta);
        textViewAcima = findViewById(R.id.textViewAcima);
        textViewAbaixo = findViewById(R.id.textViewAbaixo);
        textViewDentro = findViewById(R.id.textViewDentro);
        textViewIdeal = findViewById(R.id.textViewIdeal);
        textViewNomeUsuario = findViewById(R.id.textViewNomeUsuario);

        textViewNomeUsuario.setText(Util.Nome);

        if(Util.IMC>26){
            textViewAcima.setBackgroundColor(Color.parseColor("#FF7F50"));
        }
        else if(Util.IMC<18){
            textViewAbaixo.setBackgroundColor(Color.parseColor("#9ACD32"));
        }
        else{
            textViewDentro.setBackgroundColor(Color.parseColor("#BA55D3"));
        }

    }
}