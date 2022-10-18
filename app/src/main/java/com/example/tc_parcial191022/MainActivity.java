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
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText txt1, txt2;
    private Button btn1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt1 = findViewById(R.id.edt1);
        txt2 = findViewById(R.id.edt2);
        btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String login = "christian";
                String password = "1234";
                String log = txt1.getText().toString();
                String pass= txt2.getText().toString();

                if(log.equals("")){
                    Toast.makeText(getApplicationContext(),"campos vacios.."+pass, Toast.LENGTH_LONG).show();

                }else{
                    if(log.equals(login)){
                        Bundle enviadato = new Bundle();
                        enviadato.putString("keydatos", txt1.getText().toString());

                        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                        intent.putExtras(enviadato);
                        startActivity(intent);


                    }else{
                        Toast.makeText(getApplicationContext(),"datos incorrectos"+pass, Toast.LENGTH_LONG).show();
                    }
                }


            }
        });

    }
//se agrega en menu_activity los iconos en base a lo que quieras
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_activity,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.nube:   //nombre de tu icono en menu_activity
                Toast.makeText(this, "Agregar sentencia", Toast.LENGTH_SHORT).show();

        }
        return super.onOptionsItemSelected(item);
    }
}

// https://www.develou.com/recursos-de-menu-en-android/      todos los necesarios xd