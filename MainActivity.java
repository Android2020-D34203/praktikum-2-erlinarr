package com.example.kalkulatorsederhana;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText1, editText2, editText3;
    Button button;
    TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.ptbil1);
        editText2 = findViewById(R.id.ptbil2);
        editText3 = findViewById(R.id.ptopbil);
        button = findViewById(R.id.btnhitung);
        textView2 = findViewById(R.id.tvophasil);
    }

    public void hitung(View view){
        double ptbil1 = Double.parseDouble(editText1.getText().toString());
        double ptbil2 = Double.parseDouble(editText2.getText().toString());
        String ptopbil = editText3.getText().toString();
        double tvophasil;

        if (ptopbil.equals("+")){
            tvophasil = ptbil1+ptbil2;
            textView2.setText("Hasil Operasi Adalah: " +tvophasil);
        } else if (ptopbil.equals("-")){
            tvophasil = ptbil1-ptbil2;
            textView2.setText("Hasil Operasi Adalah: " +tvophasil);
        } else if (ptopbil.equals("*")){
            tvophasil = ptbil1*ptbil2;
            textView2.setText("Hasil Operasi Adalah: " +tvophasil);
        } else if (ptopbil.equals("/")){
            tvophasil = ptbil1/ptbil2;
            textView2.setText("Hasil Operasi Adalah: " +tvophasil);
        } else{
            textView2.setText("Operasi Aritmatik Tidak Sesuai!");
        }

    }
}