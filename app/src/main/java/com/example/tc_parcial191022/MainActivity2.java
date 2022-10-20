package com.example.tc_parcial191022;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

    }


    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_activity,menu);
        return super.onPrepareOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.corazon:
                Toast.makeText(this, "CORAZON", Toast.LENGTH_LONG).show();


        }
        switch (item.getItemId()){
            case R.id.buscar:
                Toast.makeText(this, "SEARCH", Toast.LENGTH_LONG).show();
        }
        switch (item.getItemId()){
            case R.id.compartir1:
                Toast.makeText(this, "BIENVENIDO ITEM 01", Toast.LENGTH_LONG).show();
        }

        switch (item.getItemId()){
            case R.id.compartir2:
               Toast.makeText(this, "BIENVENIDO ITEM 02", Toast.LENGTH_LONG).show();
        }

        return super.onOptionsItemSelected(item);
    }


}