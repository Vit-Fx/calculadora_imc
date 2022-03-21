package com.example.calculadoraimc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editTextNome;
    EditText editTextPeso;
    EditText editTextAltura;
    Button buttonCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNome = findViewById(R.id.editTextNome);
        editTextPeso = findViewById(R.id.editTextPeso);
        editTextAltura = findViewById(R.id.editTextAltura);
        buttonCalcular = findViewById(R.id.buttonCalcular);

        buttonCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                 if(editTextAltura.getText().toString().trim().equals("") || editTextPeso.getText().toString().trim().equals("")) {
                     Toast.makeText(getApplicationContext(), "Preencha todos os campos", Toast.LENGTH_LONG).show();
                     return;
                 }

                double Peso = Double.parseDouble(editTextPeso.getText().toString());
                double Altura = Double.parseDouble(editTextAltura.getText().toString());

                double IMC  = Peso/(Altura*Altura);
                Util.IMC = IMC;
                Util.Nome = editTextNome.getText().toString().trim();

                if(Util.Nome.equals("")){
                    Util.Nome = "Anônimo";
                }

                Intent intent = new Intent(MainActivity.this, ResultadoActivity.class);
                intent.putExtra(Util.Nome, editTextNome.getText().toString().trim());

                startActivity(intent);
            }
        });
    }
}