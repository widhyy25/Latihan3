package latihan3.example.com.latihan3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnPindah;
    String koper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnPindah=(Button) findViewById(R.id.btn_pindah);
        btnPindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                koper="ini koper yang pindah";
                Intent pindah=new Intent(MainActivity.this,KeduaaActivity.class);
                pindah.putExtra("data1",koper);
                startActivity(pindah);
            }
        });
    }
}