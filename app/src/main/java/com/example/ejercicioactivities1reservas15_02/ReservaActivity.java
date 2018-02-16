package com.example.ejercicioactivities1reservas15_02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class ReservaActivity extends AppCompatActivity {

    EditText etNombre, etNumeropers,etObservaciones;
    Spinner spDia,spHoras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reserva);

        etNombre = (EditText)findViewById(R.id.etresnombre);
        etNumeropers = (EditText)findViewById(R.id.etresnumpers);
        etObservaciones = (EditText)findViewById(R.id.etresobserva);
        spDia = (Spinner)findViewById(R.id.spdias);
        spHoras = (Spinner)findViewById(R.id.sphoras);

        String [] diassemana = {"Selecciona","Lunes","Martes","Miércoles","Jueves","Viernes","Sábado","Domingo"};
        ArrayAdapter<String> adaptadordias = new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,diassemana);
        spDia.setAdapter(adaptadordias);

        String [] horassemana = {"Selecciona","13:00","13:30","14:00","14:30","15:00","15:30","16:00"};
        ArrayAdapter<String> adaptadorhoras = new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,horassemana);
        spDia.setAdapter(adaptadorhoras);


    }//FIN ONCREATE


    public void clickbtnreservafin (View view){

        Intent reservafin =new Intent(getApplicationContext(),ReservadestinoActivity.class);
        startActivity(reservafin);

    }




}//FIN MAINACTIVITY
