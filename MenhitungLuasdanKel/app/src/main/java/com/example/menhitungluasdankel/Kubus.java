package com.example.menhitungluasdankel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Kubus extends AppCompatActivity {
    TextView hasilLuas, hasilKeliling;
    Button hasil;
    EditText sisi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kubus);

        hasilLuas = (TextView) findViewById(R.id.HasilLuas);
        hasilKeliling = (TextView) findViewById(R.id.HasilKEl);
        sisi = (EditText) findViewById(R.id.EtVolum);
        hasil = (Button) findViewById(R.id.btnHasil);
        hasil.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String s = sisi.getText().toString();

                if(s.length() != 0){
                    String hLuas = luas(s);
                    String hKeliling = keliling(s);
                    hasilLuas.setText("Luas = "+hLuas+" cm²");
                    hasilKeliling.setText("Keliling = "+hKeliling+" cm");
                } else {
                    Toast.makeText(getApplicationContext(), "masukkan nilai pada sisi",Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    private String luas(String s){
        Double sisi = Double.parseDouble(s);
        Double dLuas = sisi * sisi * sisi;
        String dHasil = String.valueOf(dLuas);
        return dHasil;
    }

    private String keliling(String s){
        Double sisi = Double.parseDouble(s);
        Double dKeliling = 12 * sisi;
        String dHasil = String.valueOf(dKeliling);
        return dHasil;

    }
}