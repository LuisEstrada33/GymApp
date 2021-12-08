package com.example.mygym2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class menu7 extends AppCompatActivity {

    EditText n3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu7);


        n3 = (EditText)findViewById(R.id.editTextNumber2);
        Button op = (Button) findViewById(R.id.button3);
        final TextView res = (TextView) findViewById(R.id.textView25);

        op.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float num = new Float(n3.getText().toString());
                res.setText("Resultado: " + (num * 35) + " ml de agua");
            }
        });
    }


}
