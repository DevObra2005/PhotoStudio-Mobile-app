package com.ucucite.photostudio;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.widget.Button;
import android.widget.TextView;


public class account_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_account_page);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;


        });

        TextView clickableTextView = findViewById(R.id.txt_signin);
        clickableTextView.setOnClickListener(view -> {
            // Start the SecondActivity
            Intent intent = new Intent(account_page.this, register_page.class);
            startActivity(intent);
        });

        Button button= findViewById(R.id.btn_signup);
        button.setOnClickListener(view -> {

            Intent intent = new Intent(account_page.this, signin_page.class);
            startActivity(intent);
        });
    }
}
