package com.example.tc_parcial191022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView txtDato, tv1;
    private RadioGroup radiogroup;
    private EditText edt1,edt2,et1,et2;
    private RadioButton rbtn1, rbtn2;
    private Button btn1,btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        radiogroup=findViewById(R.id.RadioGroup);
        edt1=findViewById(R.id.edt1);
        edt2=findViewById(R.id.edt2);
        rbtn1=findViewById(R.id.rbtn1);
        rbtn2=findViewById(R.id.rbtn2);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        tv1=findViewById(R.id.tv1);
        txtDato= findViewById(R.id.txt1);
        Bundle recibeDato = getIntent().getExtras();
        String info = recibeDato.getString("keydatos");
        txtDato.setText(info);

        radiogroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton radioButton = findViewById(i);
                if(rbtn1.getId()==radioButton.getId()){
                    edt1.setText("200");
                    edt2.setText("50");
                }
                if(rbtn2.getId()==radioButton.getId()){
                    edt1.setText("200");
                    edt2.setText("50");
                }
            }
        });


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                et1=(EditText)findViewById(R.id.edt1);
                et2=(EditText)findViewById(R.id.edt2);

                int n1,n2,opera;
                n1=Integer.parseInt(et1.getText().toString());
                n2=Integer.parseInt(et2.getText().toString());

                opera=(n1+n2);
                tv1.setText(""+opera);

            }
        });


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplication(), MainActivity3.class);
                intent.putExtra("EDT1#", edt1.getText().toString());
                intent.putExtra("EDT2#", edt2.getText().toString());
                intent.putExtra("TV1#", tv1.getText().toString());
                startActivity(intent);



            }
        });




    }
}