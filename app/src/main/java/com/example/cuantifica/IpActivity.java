package com.example.cuantifica;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class IpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ip);

        EditText ipInput = findViewById(R.id.ipInput);
        Button confirmButton = findViewById(R.id.confirmButton);

        confirmButton.setOnClickListener(v -> {
            String ip = ipInput.getText().toString().trim();
            if (ip.isEmpty()) {
                Toast.makeText(this, "¡Ingrese una IP válida!", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "IP guardada: " + ip, Toast.LENGTH_SHORT).show();
            }
        });
    }
}