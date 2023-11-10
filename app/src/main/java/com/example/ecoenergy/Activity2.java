package com.example.ecoenergy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        //Declaracion de variables y declaracion con el diseño
        EditText et1= findViewById(R.id.et1);
        EditText et2= findViewById(R.id.et2);
        EditText et3= findViewById(R.id.et3);
        EditText et4= findViewById(R.id.et4);
        RadioButton rd1= findViewById(R.id.rd1);
        RadioButton rd2= findViewById(R.id.rd2);
        RadioButton rd3= findViewById(R.id.rd3);

        CheckBox cb1= findViewById(R.id.cb1);
        CheckBox cb2= findViewById(R.id.cb2);
        CheckBox cb3= findViewById(R.id.cb3);

        Button btn_enviar = findViewById(R.id.btn_eviar);
        btn_enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Vamos a digirtar lo que el usuario escribe

                String  msj= " Nombre: "+et1.getText().toString()+" Direccion: "+et2.getText().toString()+" Telefono: "+et3.getText().toString()+" Correo: "+et4.getText().toString();
/*
                Toast.makeText(getApplicationContext(),msj,Toast.LENGTH_SHORT).show();

                //Vamos a crear las condiciones para que me muestre de acuerdo al readio button
                if(rd1.isChecked()){
                    Toast.makeText(getApplicationContext(),"Usteb vive en Casa",Toast.LENGTH_SHORT)
                }
                if(rd2.isChecked()){
                    Toast.makeText(getApplicationContext(),"Usteb vive en Apartamento",Toast.LENGTH_SHORT)
                }
                if(rd3.isChecked()){
                    Toast.makeText(getApplicationContext(),"Usteb vive en Zona Rural",Toast.LENGTH_SHORT)
                }
*/
                //Vamos a crear las condiciones
                if(cb1.isChecked()){
                    Toast.makeText(getApplicationContext()," Estas utilizando paneles solares",Toast.LENGTH_SHORT);
                }
                if(cb2.isChecked()){
                    Toast.makeText(getApplicationContext(),"Estas utilizando Autogeneradores",Toast.LENGTH_SHORT);
                }
                if(cb3.isChecked()){
                    Toast.makeText(getApplicationContext(),"Estas utilizando Otros Sistemas de Conbusion",Toast.LENGTH_SHORT);
                }
            }
        });
    }
}