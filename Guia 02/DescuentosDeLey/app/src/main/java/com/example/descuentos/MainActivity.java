package com.example.descuentos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button calcular;
    private EditText nombre;
    private EditText horas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre=(EditText)findViewById(R.id.txtnombre);
        horas=(EditText)findViewById(R.id.txthoras);
        calcular=(Button)findViewById(R.id.btncalcular);

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String horass=horas.getText().toString(),
                        nombrestring=nombre.getText().toString();

                int horas=Integer.parseInt(horass);
                double SalarioBruto=horas*8.5;
                double descuentoisss=SalarioBruto*0.02;
                double descuentoafp=SalarioBruto*0.03;
                double descuentoRenta=SalarioBruto*0.04;
                double SalarioNeto=SalarioBruto-descuentoafp-descuentoisss-descuentoRenta;

                Intent intent=new Intent(MainActivity.this,resultados.class);
                intent.putExtra("Nombre",nombrestring);
                intent.putExtra("SalarioBruto",SalarioBruto);
                intent.putExtra("descuentoisss",descuentoisss);
                intent.putExtra("descuentoafp",descuentoafp);
                intent.putExtra("descuentorenta",descuentoRenta);
                intent.putExtra("SalarioNeto",SalarioNeto);
                startActivity(intent);
            }
        });
    }

}