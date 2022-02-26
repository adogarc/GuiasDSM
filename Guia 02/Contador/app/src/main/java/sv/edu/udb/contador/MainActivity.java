package sv.edu.udb.contador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int i=0;
    Button sumar;
    TextView display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sumar=(Button) findViewById(R.id.sumar);
        display=(TextView) findViewById(R.id.ver);

        sumar.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                for(i=0;i<=9;i++){
                i++;
                display.setText("La cuenta va en "+i);
                }
                i=0;
            }
        });
    }
}