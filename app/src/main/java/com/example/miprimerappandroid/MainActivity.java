package com.example.miprimerappandroid;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
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

        TextView miTexto = findViewById(R.id.textViewMain);
        miTexto.setText("El resultado es: " + resultado);

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