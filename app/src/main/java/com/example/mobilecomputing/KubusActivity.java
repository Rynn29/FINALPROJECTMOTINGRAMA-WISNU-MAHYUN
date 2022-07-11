package com.example.mobilecomputing;



import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.BreakIterator;

public class KubusActivity extends AppCompatActivity {

    EditText txtpanjang;
    Button btn,btn1;
    TextView txtvolume,txtluas;
    private BreakIterator tvVolume;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kubus);

        txtpanjang=findViewById(R.id.panjang);
        btn=findViewById(R.id.btnVolume);
        btn1=findViewById(R.id.btnLuas);
        txtvolume=findViewById(R.id.tvVolume);
        txtluas=findViewById(R.id.tvLuas);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double volume;
                int p;


                if(txtpanjang.getText().toString().isEmpty()){
                    txtpanjang.setError("harap diisi dahulu");
                    return;
                }

                else {
                    p=Integer.parseInt(txtpanjang.getText().toString());
                    volume = p * p * p ;

                    txtvolume.setText(String.valueOf(volume));
                }
            }
        });


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double luas;
                int p;

                if(txtpanjang.getText().toString().isEmpty()){
                    txtpanjang.setError("harap diisi dahulu");
                    return;
                }

                else {
                    p=Integer.parseInt(txtpanjang.getText().toString());

                    luas = 6 * p * p;

                    txtluas.setText(String.valueOf(luas));
                }
            }
        });

    }
}