package com.example.mobilecomputing;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private FirebaseUser firebaseUser;
    private TextView textName;
    private Button btnLogout;
    private ImageButton kubusku, kerucutku, balokku, tabungku;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textName = findViewById(R.id.name);
        btnLogout = findViewById(R.id.btn_logout);

        kubusku =findViewById(R.id.kubus);
        kerucutku =findViewById(R.id.kerucut);
        balokku =findViewById(R.id.balok);
        tabungku =findViewById(R.id.tabung);

        firebaseUser = FirebaseAuth.getInstance().getCurrentUser();
        if (firebaseUser != null) {
            textName.setText(firebaseUser.getDisplayName());
        }else {
            textName.setText("Login Gagal");
        }

        btnLogout.setOnClickListener( v -> {
            FirebaseAuth.getInstance().signOut();
            startActivity(new Intent(getApplicationContext(), LoginActivity.class));
            finish();
        });

        balokku.setOnClickListener( v -> {
            startActivity(new Intent(getApplicationContext(), balokActivity.class));
        });
        kubusku.setOnClickListener( v -> {
            startActivity(new Intent(getApplicationContext(), KubusActivity.class));
        });
        tabungku.setOnClickListener( v -> {
            startActivity(new Intent(getApplicationContext(), tabungActivity.class));
        });
        kerucutku.setOnClickListener( v -> {
            startActivity(new Intent(getApplicationContext(), kerucutActivity.class));
        });
    }

    @Override
    public void onClick(View v) {

    }
    public void onBackPressed(){
        new AlertDialog.Builder(this)
                .setMessage("Apa Mr.Aldi ingin Exit?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        moveTaskToBack(true);
                    }
                })
                .setNegativeButton("No", null)
                .show();
    }
}
