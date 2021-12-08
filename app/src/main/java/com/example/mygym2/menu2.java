package com.example.mygym2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class menu2 extends AppCompatActivity {

    EditText n2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu2);
        n2 = (EditText)findViewById(R.id.editTextNumber5);
        Button op = (Button) findViewById(R.id.button4);
        final TextView res = (TextView) findViewById(R.id.textView34);

        op.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float num = new Float(n2.getText().toString());
                res.setText("Resultado: de " + (num * 3) +" a "+(num * 5)+ " gramos de carbohidratos");
            }
        });

    }
}
