package com.example.dolaremreal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    EditText txtprecodolar, txtvalor;
    TextView txtresultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtprecodolar = findViewById(R.id.txtprecodolar);
        txtvalor = findViewById(R.id.txtvalor);

        txtresultado = findViewById(R.id.txtresultado);

    }

    public void calcular(View view) {

        double valor = Double.parseDouble(txtvalor.getText().toString());
        double preco = Double.parseDouble(txtprecodolar.getText().toString());

        double real = preco * valor;
        DecimalFormat decimal = new DecimalFormat("0.00");
        String valorformatado = decimal.format(real);

        txtresultado.setText("R$: " + valorformatado);

    }

}