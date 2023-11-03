package com.example.appodontologia;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btnAnc = findViewById(R.id.btnAnc);

        btnAnc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Cuando se haga clic en el nuevo botón, abrir la segunda actividad
                Intent intent = new Intent(MainActivity.this, activity5.class); // Asegúrate de que sea la actividad correcta
                startActivity(intent);
            }
        });



        Button btnAdul = findViewById(R.id.btnAdul);

        btnAdul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Cuando se haga clic en el nuevo botón, abrir la segunda actividad
                Intent intent = new Intent(MainActivity.this, activity4.class); // Asegúrate de que sea la actividad correcta
                startActivity(intent);
            }
        });




        Button btnAdol = findViewById(R.id.btnAdol);

        btnAdol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Cuando se haga clic en el nuevo botón, abrir la segunda actividad
                Intent intent = new Intent(MainActivity.this, activity3.class); // Asegúrate de que sea la actividad correcta
                startActivity(intent);
            }
        });










        // Obtener una referencia al botón de la interfaz de usuario

        Button btnBebe = findViewById(R.id.btnBebe);

        btnBebe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Cuando se haga clic en el botón, abrir Activity_main2.xml
                Intent intent = new Intent(MainActivity.this, activity2.class);
                startActivity(intent);
            }
        });
    }
}
