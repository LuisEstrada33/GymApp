package com.example.mygym2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class menu_protdiaria extends AppCompatActivity {
    /*EditText resultadoo;
    TextView fina;*/
    EditText n1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_protdiaria);
/*
        resultadoo = findViewById(R.id.editText);
        fina = findViewById(R.id.textView11);*/
        n1 = (EditText)findViewById(R.id.editText);
        Button op = (Button) findViewById(R.id.button1);
        final TextView res = (TextView) findViewById(R.id.textView11);

        op.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float num = new Float(n1.getText().toString());
                res.setText("Resultado: " + (num * .83) + " gramos de proteina");
            }
        });

    }
/*
    public void Calcular(View v)
    {
        double  resultado, fina;
        resultado = Double.parseDouble(resultadoo.getText().toString());

        fina = resultado * 0.83;
    }*/
}
