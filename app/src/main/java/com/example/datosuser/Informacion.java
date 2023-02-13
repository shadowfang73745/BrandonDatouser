package com.example.datosuser;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Informacion extends AppCompatActivity{
    TextView etiquetNombre, etiquetaEdad, etiquetaEstatus;
    Button btnRegresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Referencias
        super.onCreate(savedInstanceState);
        setContentView(R.layout.informacionact);

        etiquetNombre = findViewById(R.id.tvNombre);
        etiquetaEdad = findViewById(R.id.tvEdad);
        etiquetaEstatus = findViewById(R.id.tvMayoria);
        btnRegresar = findViewById(R.id.btnRegresar);

        //Evento regresar
        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                regresar();
            }

        });
    }
    public void regresar(){
        //Intent ventana = new Intent(Informacion.this, MainActivity.class);
        //startActivity(ventana);
        finish();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Bundle hayDatos = getIntent().getExtras();
        if(hayDatos!=null){
            String nombre = hayDatos.getString("nombre");
            int edad = hayDatos.getInt("edad");

            etiquetNombre.setText("nombre: " + nombre);
            etiquetaEdad.setText("edad: " + edad);

        }
    }
}
