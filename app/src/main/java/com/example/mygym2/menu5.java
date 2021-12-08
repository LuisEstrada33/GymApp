package com.example.mygym2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class menu5 extends AppCompatActivity {
    EditText n2, n1,n3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu5);
        n1 = (EditText)findViewById(R.id.editTextNumber7);
        n2 = (EditText)findViewById(R.id.editTextNumber8);
        n3 = (EditText)findViewById(R.id.editTextNumber9);
        Button op = (Button) findViewById(R.id.button6);
        final TextView res = (TextView) findViewById(R.id.textView45);
        final TextView res1 = (TextView) findViewById(R.id.textView46);

        op.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float num1 = new Float(n1.getText().toString());
                float num2 = new Float(n2.getText().toString());
                float num3 = new Float(n2.getText().toString());
                res.setText("Resultado para hombres: " + (66+(13.7*num1)+(5*num2)-(6.5*num3)) + " MB");
                res1.setText("Resultado para mujeres: " + (655+(9.6*num1)+(1.8*num2)-(4.7*num3)) + " MB");
            }
        });
    }
}
