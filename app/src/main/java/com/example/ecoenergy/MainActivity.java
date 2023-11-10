package com.example.ecoenergy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Decalrar las variables y enlazarlas

        Button btn_consumo = findViewById(R.id.btn_consumo);
        btn_consumo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //VAMOS A GENERAR UNA VENTANA DE ALGUNA INFORMACION
                Toast.makeText(getApplicationContext(),"¡Vamos adelante!",Toast.LENGTH_SHORT).show();
                //Vamos a crear el intento para ir a otra pagina
                Intent irAPag2 = new Intent(MainActivity.this, Activity2.class);
                startActivity(irAPag2);
            }
        });


    }
}