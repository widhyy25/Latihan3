package latihan3.example.com.latihan3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class KeduaaActivity extends AppCompatActivity {
    TextView txtKoper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keduaa);
        txtKoper=(TextView)findViewById(R.id.txt_koper);
        Intent datanya=getIntent();
        String tulisannya=datanya.getStringExtra("data1");
        txtKoper.setText(tulisannya);
    }
}
