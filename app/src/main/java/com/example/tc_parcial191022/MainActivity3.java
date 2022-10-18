package com.example.tc_parcial191022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    private TextView tv1, tv2, txtDato;
    private Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        tv1=findViewById(R.id.tv1);
        tv2=findViewById(R.id.tv2);
        btn1=findViewById(R.id.btn1);


        Bundle datos= this.getIntent().getExtras();
        tv1.setText("#####: "+datos.getString("EDT1#"));
        tv2.setText("#####: "+datos.getString("EDT2#")); //edittext
      //  tv2.setText("#####: "+datos.getString("TV1#"));   textview


       //envio de nombre
        txtDato= findViewById(R.id.txt1);
        Bundle recibeDato = getIntent().getExtras();
        String info = recibeDato.getString("keydatos");
        txtDato.setText(info);






        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent= new Intent(getApplication(), MainActivity.class);
                startActivity(intent);

            }
        });











































    }
}