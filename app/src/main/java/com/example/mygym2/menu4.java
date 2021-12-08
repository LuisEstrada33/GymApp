package com.example.mygym2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class menu4 extends AppCompatActivity {

    EditText n2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu4);
        n2 = (EditText)findViewById(R.id.editTextNumber6);
        Button op = (Button) findViewById(R.id.button5);
        final TextView res = (TextView) findViewById(R.id.textView38);
        final TextView res1 = (TextView) findViewById(R.id.textView39);

        op.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float num = new Float(n2.getText().toString());
                res.setText("Resultado para hombres: " + ((num*15.057)+692.2) + " calorias");
                res1.setText("Resultado para mujeres: " + ((num*14.818)+486.6) + " calorias");
            }
        });
    }
}
