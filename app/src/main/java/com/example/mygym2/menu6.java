package com.example.mygym2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class menu6 extends AppCompatActivity {

    EditText n1,n2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu6);

        n1 = (EditText)findViewById(R.id.editTextNumber3);
        n2 = (EditText)findViewById(R.id.editTextNumber4);
        Button op = (Button) findViewById(R.id.button);
        final TextView res = (TextView) findViewById(R.id.textView29);


        op.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float num = new Float(n1.getText().toString());
                float num2 = new Float(n2.getText().toString());
                res.setText("Resultado: " + (num / (Math.pow(num2,2))));
            }
        });
    }
}
