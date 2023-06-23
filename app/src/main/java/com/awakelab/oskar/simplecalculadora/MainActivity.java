package com.awakelab.oskar.simplecalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnAdd = findViewById(R.id.add);
        Button btnSubt = findViewById(R.id.subtract);
        Button btnDiv = findViewById(R.id.divide);
        Button btnMult = findViewById(R.id.multiply);

        EditText num1 = findViewById(R.id.n1);
        EditText num2 = findViewById(R.id.n2);
        TextView resultant = (TextView) findViewById(R.id.total);

        //Suma
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (num1.getText().toString().trim().isEmpty() || num2.getText().toString().trim().isEmpty()) {
                    Toast.makeText(getBaseContext(), "Falta rellenar los campos vacios.", Toast.LENGTH_SHORT).show();
                    return;
                }
                Long num1In = Long.parseUnsignedLong(num1.getText().toString());
                Long num2In = Long.parseUnsignedLong(num2.getText().toString());
                Long result =  num1In + num2In;
                resultant.setText(String.valueOf(result));
                Toast.makeText(getBaseContext(), "Suma " + num1.getText().toString() + " + " + num2.getText().toString(), Toast.LENGTH_SHORT).show();
                //      Toast.makeText(getBaseContext(), "El Resultado es:  " + Integer.toString(result), Toast.LENGTH_LONG).show();
            }
        });

        //Resta
        btnSubt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (num1.getText().toString().trim().isEmpty() || num2.getText().toString().trim().isEmpty()) {
                    Toast.makeText(getBaseContext(), "Falta rellenar los campos vacios.", Toast.LENGTH_SHORT).show();
                    return;
                }
                Long num1In = Long.parseUnsignedLong(num1.getText().toString());
                Long num2In = Long.parseUnsignedLong(num2.getText().toString());
                Long result =  num1In - num2In;
                resultant.setText(String.valueOf(result));
                Toast.makeText(getBaseContext(), "Resta " + num1.getText().toString() + " - " + num2.getText().toString(), Toast.LENGTH_SHORT).show();
                //       Toast.makeText(getBaseContext(), "El Resultado es:  " + Integer.toString(result), Toast.LENGTH_LONG).show();
            }
        });

        //Division
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (num1.getText().toString().trim().isEmpty() || num2.getText().toString().trim().isEmpty()
                 || num1.getText().toString().equals("0")
                 || Integer.parseInt(num2.getText().toString()) == 0 ) {
                    Toast.makeText(getBaseContext(), "Falta rellenar los campos vacios o en cero", Toast.LENGTH_SHORT).show();
                    resultant.setText(R.string.error);
                    return;
                }
                Float num1In = Float.parseFloat(num1.getText().toString());
                Float num2In = Float.parseFloat(num2.getText().toString());
                Float result = num1In / num2In;
                resultant.setText(String.valueOf(result));
                Toast.makeText(getBaseContext(), "Divide " + num1.getText().toString() + " / " + num2.getText().toString(), Toast.LENGTH_SHORT).show();
                //       Toast.makeText(getBaseContext(), "El Resultado es:  " + Integer.toString(result), Toast.LENGTH_LONG).show();
            }
        });

        //Multiplicacion
        btnMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (num1.getText().toString().trim().isEmpty() || num2.getText().toString().trim().isEmpty()) {
                    Toast.makeText(getBaseContext(), "Falta rellenar los campos vacios.", Toast.LENGTH_SHORT).show();
                    return;
                }
                Long num1In = Long.parseUnsignedLong(num1.getText().toString());
                Long num2In = Long.parseUnsignedLong(num2.getText().toString());
                Long result = num1In * num2In;
                resultant.setText(String.valueOf(result));
                Toast.makeText(getBaseContext(), "Multiplica " + num1.getText().toString() + " * " + num2.getText().toString(), Toast.LENGTH_SHORT).show();
             //   Toast.makeText(getBaseContext(), "El Resultado es:  " + Integer.toString(result), Toast.LENGTH_LONG).show();
            }
        });
    }
}
