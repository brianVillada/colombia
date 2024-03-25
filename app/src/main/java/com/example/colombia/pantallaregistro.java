package com.example.colombia;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class pantallaregistro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {





        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_pantallaregistro);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button btnRegistro = findViewById(R.id.btnregistro);
        btnRegistro.setOnClickListener(v -> {
            // Define la intención para iniciar la actividad 'busqueda.class'
            Intent intent = new Intent(pantallaregistro.this, busqueda.class);
            startActivity(intent); // Inicia la actividad 'busqueda.class'
        });

    }
}