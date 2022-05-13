package sv.edu.udb.dsm.guia3.ejemplo2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void showFame(View view){
        Intent intent=new Intent(MainActivity.this, frame_layout.class);
        StartActivity(intent);
    }
    public void showLinear(View view){
        Intent intent=new Intent(MainActivity.this, linear_layout.class);
        StartActivity(intent);
    }
    public void showRelative(View view){
        Intent intent=new Intent(MainActivity.this, relative_layout.class);
        StartActivity(intent);
    }
    public void showTable(View view){
        Intent intent=new Intent(MainActivity.this, table_layout.class);
        StartActivity(intent);
    }

}