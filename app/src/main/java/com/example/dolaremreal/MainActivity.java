package com.example.dolaremreal;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    EditText txtprecodolar, txtvalor;
    TextView txtresultado;
    TextView valdol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtprecodolar = findViewById(R.id.txtprecodolar);
        txtvalor = findViewById(R.id.txtvalor);

        txtresultado = findViewById(R.id.txtresultado);

        valdol = (TextView) findViewById(R.id.valdol);
        valdol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=valor+do+dolar&oq=valor+do&aqs=chrome.1.69i57j0i433i512l3j0i433i457i512j0i402j69i61j69i60.2440j0j7&sourceid=chrome&ie=UTF-8")));
            }
        });

    }

    @SuppressLint("SetTextI18n")
    public void calcular(View view) {

        double valor = Double.parseDouble(txtvalor.getText().toString());
        double preco = Double.parseDouble(txtprecodolar.getText().toString());

        double real = preco * valor;

        DecimalFormat decimal = new DecimalFormat("0.00");
        String valorformatado = decimal.format(real);

        txtresultado.setText(valorformatado + "R$");

    }

}