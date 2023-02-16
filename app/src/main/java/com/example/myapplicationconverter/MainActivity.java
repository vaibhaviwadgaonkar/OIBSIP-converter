package com.example.myapplicationconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {
    EditText edittext;
    TextView textview, textView2, textView4, textView3;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textview = findViewById(R.id.textView2);
        textView2 = findViewById(R.id.textView4);
        textView4 = findViewById(R.id.textView3);
        edittext = findViewById(R.id.editTextNumber);
        textView3 = findViewById(R.id.textView3);
        btn = findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConvertFromKiloToPound();
            }
        });
    }

    private void ConvertFromKiloToPound() {
        String ValueEnteredinKilo = edittext.getText().toString();
        double kilo = Double.parseDouble(ValueEnteredinKilo);
        double pounds = kilo * 2.205;
        textView3.setText(" "+ pounds);
    }
}



