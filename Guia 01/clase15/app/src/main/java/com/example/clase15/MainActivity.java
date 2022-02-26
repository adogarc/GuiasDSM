package com.example.clase15;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    private ToggleButton btnToggle;
    private TextView txtresultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtresultado=(TextView) findViewById(R.id.txtmesajeid);
        btnToggle=(ToggleButton) findViewById(R.id.toggleButton);

        btnToggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    txtresultado.setVisibility(View.VISIBLE);
                }else{
                    txtresultado.setVisibility(View.INVISIBLE);
                }
            }
        });//evento de cambia de estado
    }
}