package com.example.ejercicioactivities1reservas15_02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    }//FIN ONCREATE

public void clickbtnreservar (View view){

    Intent reserva=new Intent(getApplicationContext(),ReservaActivity.class);
    startActivity(reserva);

}


}//FIN MAINACTIVITY
