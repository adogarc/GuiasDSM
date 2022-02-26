package com.example.descuentos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class resultados extends AppCompatActivity {
        private TextView tnombre;
        private TextView tsalariobruto;
        private TextView tdescuentoisss;
        private TextView tdescuentoafp;
        private TextView tdescuentorenta;
        private TextView tsalarioneto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultados);

        //Recuperar valores del main

        Intent i=getIntent();
        String nombre2=i.getStringExtra("Nombre");
        double salariobruto2=i.getDoubleExtra("SalarioBruto",0);
        double descuentoisss=i.getDoubleExtra("descuentoisss",0);
        double descuentoafp=i.getDoubleExtra("descuentoafp",0);
        double descuentorenta=i.getDoubleExtra("descuentorenta",0);
        double salarioneto2=i.getDoubleExtra("SalarioNeto",0);

        //obtener widget de vista
        TextView tnombre=findViewById(R.id.txtnombre);
        TextView tsalario=findViewById(R.id.txtsalariob);
        TextView tdescuentoisss=findViewById(R.id.txtdescuentoisss);
        TextView tdescuentoafp=findViewById(R.id.txtdescuentoafp);
        TextView tdescuentorenta=findViewById(R.id.txtdescuentorenta);
        TextView tSalarioneto=findViewById(R.id.txtsalarion);

        String mnombre="Bienvenido "+nombre2+ " a la calculadora de salario";
        tnombre.setText(mnombre);

        String msalariobruto="El salario obtenido sin descuentos es: "+salariobruto2;
        tsalario.setText(msalariobruto);

        String mdescuentoiss="El descuento del isss es: "+descuentoisss;
        tdescuentoisss.setText(mdescuentoiss);

        String mdescuentoafp="El descuento del afp es: "+descuentoafp;
        tdescuentoafp.setText(mdescuentoafp);

        String mdescuentorenta="El descuento de la renta es: "+descuentorenta;
        tdescuentorenta.setText(mdescuentorenta);

        String msalarion="El salario obtenido con losdescuentos es: "+salarioneto2;
        tSalarioneto.setText(msalarion);
    }
}