package com.josueperez.aplicaciondecontactos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class ConfirmacionDeFormulario extends AppCompatActivity {
    Button EditarDatos;
    TextView receive;

EditText CopiarFecha;
    TextView EnviarTexto;
    TextView EnviarDate;
    TextView EnviarTelefono;
    TextView EnviarEmail;
    TextView EnviarDescripcion;
    Button EnviarContenidoTexto;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmacion_de_formulario);


        EnviarContenidoTexto = (Button) findViewById(R.id.button);


        EnviarTexto = (TextView) findViewById(R.id.textView2);
        EnviarDate = (TextView) findViewById(R.id.textView3);
        EnviarTelefono = (TextView) findViewById(R.id.textView4);
        EnviarEmail = (TextView) findViewById(R.id.textView5);
        EnviarDescripcion = (TextView) findViewById(R.id.textView6);

        EditarDatos = (Button) findViewById(R.id.button);
        EditarDatos.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {


            EditarDatos.setOnClickListener(this);



ConfirmacionDeFormulario.this.finish();

        };

                //Intent i= new Intent(getApplicationContext(), MainActivity.class);

                //startActivity(i);
            });


        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            return;
        }



        receive = (TextView)findViewById(R.id.textView2);
        receive.setText(getIntent().getStringExtra("ContenidoTexto"));


        receive = (TextView)findViewById(R.id.textView3);
        receive.setText(getIntent().getStringExtra("Contenidofecha"));

        receive = (TextView)findViewById(R.id.textView4);
        receive.setText(getIntent().getStringExtra("ContenidoTelefono"));

        receive = (TextView)findViewById(R.id.textView5);
        receive.setText(getIntent().getStringExtra("ContenidoEmail"));

        receive = (TextView)findViewById(R.id.textView6);
        receive.setText(getIntent().getStringExtra("ContenidoDescripcion"));

//String CopiarFecha = EnviarDate.getText().toString();

    }


    }


