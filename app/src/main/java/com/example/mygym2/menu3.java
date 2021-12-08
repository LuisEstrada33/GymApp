package com.example.mygym2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class menu3 extends AppCompatActivity {

    EditText n2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu3);

         n2 = (EditText)findViewById(R.id.editTextNumber);
        Button op = (Button) findViewById(R.id.button2);
        final TextView res = (TextView) findViewById(R.id.textView20);

        op.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float num = new Float(n2.getText().toString());
                res.setText("Resultado: " + (num * .1) + " gramos de creatina");
            }
        });
    }
}
