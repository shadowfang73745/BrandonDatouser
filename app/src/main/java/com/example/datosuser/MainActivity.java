package com.example.datosuser;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Definir los objetos de la clase
    Button envi;
    EditText Name,cajitaedad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Referencias
        envi = findViewById(R.id.btnEnviar);
        Name = findViewById(R.id.Nombredepersona);
        cajitaedad = findViewById(R.id.txtedad);

        //Asignar un evento
        envi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Aqui se programa lo que quiero que haga el boton
                DatoA();
            }
        });

    }
    public void DatoA(){
        try{
            String Name1;
            int edad=0;
            Name1 = Name.getText().toString();
            if (cajitaedad.getText().toString().equals("")) {
                Toast.makeText(this, "Introduzca un valor numerico en la caja", Toast.LENGTH_SHORT).show();
            }else {
                edad = Integer.parseInt(cajitaedad.getText().toString());
                Intent ventana = new Intent(MainActivity.this, Informacion.class);
                ventana.putExtra("nombre", edad);
                setContentView(R.layout.informacionact);
                //Toast.makeText(this, "Hola " + Name + ", Tu edad es " + edad, Toast.LENGTH_SHORT).show();
            }

        }catch (Exception error){
            Log.e("error mainactivity", error.getMessage());
        }

    }
}