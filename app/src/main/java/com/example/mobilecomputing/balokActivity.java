package com.example.mobilecomputing;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.BreakIterator;

public class balokActivity extends AppCompatActivity {

    EditText txtpanjang, txtlebar, txttinggi;
    Button btn,btn1;
    TextView txtvolume,txtluas;
    private BreakIterator tvVolume;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balok);

        txtpanjang=findViewById(R.id.panjang);
        txtlebar=findViewById(R.id.lebar);
        txttinggi=findViewById(R.id.tinggi);
        btn=findViewById(R.id.btnVolume);
        btn1=findViewById(R.id.btnLuas);
        txtvolume=findViewById(R.id.tvVolume);
        txtluas=findViewById(R.id.tvLuas);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double volume;
                int p;
                int l;
                int t;

                if(txtpanjang.getText().toString().isEmpty()){
                    txtpanjang.setError("harap diisi dahulu");
                    return;
                }
                if(txtlebar.getText().toString().isEmpty()){
                    txtlebar.setError("harap diisi dahulu");
                    return;
                }
                if(txttinggi.getText().toString().isEmpty()){
                    txttinggi.setError("harap diisi dahulu");
                    return;
                }
                else {
                    p=Integer.parseInt(txtpanjang.getText().toString());
                    l=Integer.parseInt(txtlebar.getText().toString());
                    t=Integer.parseInt(txttinggi.getText().toString());
                    volume = p * l * t ;

                    txtvolume.setText(String.valueOf(volume));
                }
            }
        });


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double luas;
                int p,l,t;

                if(txtpanjang.getText().toString().isEmpty()){
                    txtpanjang.setError("harap diisi dahulu");
                    return;
                }
                if(txtlebar.getText().toString().isEmpty()){
                    txtlebar.setError("harap diisi dahulu");
                    return;
                }
                if(txttinggi.getText().toString().isEmpty()){
                    txttinggi.setError("harap diisi dahulu");
                    return;
                }
                else {
                    p=Integer.parseInt(txtpanjang.getText().toString());
                    l=Integer.parseInt(txtlebar.getText().toString());
                    t=Integer.parseInt(txttinggi.getText().toString());
                    luas = 2 * (p*l + p*t + l*t);

                    txtluas.setText(String.valueOf(luas));
                }
            }
        });

    }
}