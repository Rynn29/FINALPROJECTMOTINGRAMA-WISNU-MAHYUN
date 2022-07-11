package com.example.mobilecomputing;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.BreakIterator;

public class kerucutActivity extends AppCompatActivity {

    EditText txtpanjang, txtselimut, txttinggi;
    Button btn,btn1;
    TextView txtvolume,txtluas;
    private BreakIterator tvVolume;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kerucut);

        txtpanjang=findViewById(R.id.panjang);
        txtselimut=findViewById(R.id.selimut);
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
                int t;

                if(txtpanjang.getText().toString().isEmpty()){
                    txtpanjang.setError("harap diisi dahulu");
                    return;
                }
                if(txtselimut.getText().toString().isEmpty()){
                    txtselimut.setError("harap diisi dahulu");
                    return;
                }
                if(txttinggi.getText().toString().isEmpty()){
                    txttinggi.setError("harap diisi dahulu");
                    return;
                }
                else {
                    p=Integer.parseInt(txtpanjang.getText().toString());
                    t=Integer.parseInt(txttinggi.getText().toString());

                    volume = 3.14 * p * p * t /3;

                    txtvolume.setText(String.valueOf(volume));
                }
            }
        });


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double luas;
                int p,s;

                if(txtpanjang.getText().toString().isEmpty()){
                    txtpanjang.setError("harap diisi dahulu");
                    return;
                }
                if(txtselimut.getText().toString().isEmpty()){
                    txtselimut.setError("harap diisi dahulu");
                    return;
                }
                if(txttinggi.getText().toString().isEmpty()){
                    txttinggi.setError("harap diisi dahulu");
                    return;
                }
                else {
                    p=Integer.parseInt(txtpanjang.getText().toString());
                    s=Integer.parseInt(txtselimut.getText().toString());

                    luas = 3.14 * p * s;

                    txtluas.setText(String.valueOf(luas));
                }
            }
        });

    }
}