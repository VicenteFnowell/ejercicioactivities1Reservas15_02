package com.example.ejercicioactivities1reservas15_02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ReservadestinoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservadestino);



    }//FIN ONCREATE


    public void clickbtnaceptar (View view){

        Intent vuelvemenu =new Intent(getApplicationContext(),MainActivity.class);
        startActivity(vuelvemenu);

    }




}
