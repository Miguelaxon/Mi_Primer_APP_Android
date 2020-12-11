package com.example.miprimerappandroid;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int resultado = add("");
        Log.d("Resultado1", String.valueOf(resultado));

        resultado = add("2");
        Log.d("Resultado2", String.valueOf(resultado));

        resultado = add("2,8");
        Log.d("Resultado3", String.valueOf(resultado));

        TextView miTexto = findViewById(R.id.textViewMain2);
        TextView miTexto2 = findViewById(R.id.textViewMain);
        miTexto.setText("El resultado es: " + resultado);
        miTexto2.setText("Hasta mañana.");

        EditText NUM1 = findViewById(R.id.editTextNumber);
        EditText NUM2 = findViewById(R.id.editTextNumber2);
        Button Sumar = findViewById(R.id.button);
        TextView Resul = findViewById(R.id.textView2);

        Sumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numero1 = Integer.parseInt(NUM1.getText().toString());
                int numero2 = Integer.parseInt(NUM2.getText().toString());
                int total = numero1 + numero2;

                Resul.setText(""+total);
            }
        });
    }
    private int add (String values) {
        if (values.isEmpty()) {
            return 0;
        } else if (values.length() == 3){
            String valuesArray[] = values.split(",");
            int result = Integer.parseInt(valuesArray[0]) + Integer.parseInt(valuesArray[1]);
            return result;
        } else {
            return Integer.parseInt(values);
        }
    }
}