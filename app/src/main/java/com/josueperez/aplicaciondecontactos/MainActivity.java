package com.josueperez.aplicaciondecontactos;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.TextureView;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import java.io.*;


import static android.content.DialogInterface.*;

public class MainActivity extends AppCompatActivity {

    TextView receive;
    EditText recibirFecha;
    EditText EnviarTexto;
    DatePicker EnviarDia;

    EditText EnviarTelefono;
    EditText EnviarEmail;
    EditText EnviarDescripcion;
    Button EnviarContenidoTexto;
    Intent intent;
    int FECHAdia;
    int FECHAmes;
    int FECHAaño;


    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EnviarDia = (DatePicker) findViewById(R.id.datePicker);
        FECHAdia = EnviarDia.getDayOfMonth();
        FECHAmes = EnviarDia.getMonth();
        FECHAaño = EnviarDia.getYear();
        EnviarContenidoTexto = (Button) findViewById(R.id.button2);


        EnviarTexto = (EditText) findViewById(R.id.editText5);
        EnviarTelefono = (EditText) findViewById(R.id.editText6);
        EnviarEmail = (EditText) findViewById(R.id.editText7);
        EnviarDescripcion = (EditText) findViewById(R.id.editText8);
        EnviarContenidoTexto.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


                String dbDia;
                String dbMes;
                String dbAño;

                int displayDia;
                int displayMes;
                int displayAño;

                displayDia = EnviarDia.getDayOfMonth();
                if (displayDia<10)
                {dbDia = String.valueOf(displayDia);
                dbDia = "0"+Integer.toString(displayDia);}
                else
                {    dbDia = String.valueOf(displayDia);
                dbDia = Integer.toString(displayDia);}

                displayMes = EnviarDia.getMonth();
                displayMes = displayMes + 1;
                if (displayMes<10)
                {dbMes = String.valueOf(displayMes);
                dbMes = "0"+Integer.toString(displayMes);}
                else
                {dbMes = String.valueOf(displayMes);
                    dbMes = Integer.toString(displayMes);}

                displayAño = EnviarDia.getYear();
                dbAño = String.valueOf(displayAño);
                dbAño = Integer.toString(displayAño);

                String Datosfecha = dbDia + "/" + dbMes + "/" + dbAño;

                intent = new Intent(getApplicationContext(), ConfirmacionDeFormulario.class);
                intent.putExtra("Contenidofecha", Datosfecha);
                // intent.putExtra("LaFecha", EnviarDia.getCalendarView().getDate());
                intent.putExtra("ContenidoTexto", EnviarTexto.getText().toString());
                intent.putExtra("ContenidoTelefono", EnviarTelefono.getText().toString());
                intent.putExtra("ContenidoEmail", EnviarEmail.getText().toString());
                intent.putExtra("ContenidoDescripcion", EnviarDescripcion.getText().toString());

                startActivity(intent);


            }


        });




    }

}
