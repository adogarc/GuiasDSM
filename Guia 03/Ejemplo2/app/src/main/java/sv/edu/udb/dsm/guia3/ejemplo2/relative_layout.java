package sv.edu.udb.dsm.guia3.ejemplo2;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class ejemplo_relative_layout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejemplo_relative_layout);
    }
    public void finalizarActividad(View v){
        finish();
    }
}