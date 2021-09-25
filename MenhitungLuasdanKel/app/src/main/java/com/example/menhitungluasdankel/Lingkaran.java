package com.example.menhitungluasdankel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Lingkaran extends AppCompatActivity {
    TextView hasilLuas, hasilKeliling;
    Button hasil;
    EditText jari_jari;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);
        hasilLuas = (TextView) findViewById(R.id.HasilLuas);
        hasilKeliling = (TextView) findViewById(R.id.HasilKEl);
        jari_jari = (EditText) findViewById(R.id.Etjari1);
        hasil = (Button) findViewById(R.id.btnHasil);
        hasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = jari_jari.getText().toString();

                if (s.length() != 0) {
                    String hLuas = luas(s);
                    String hKeliling = keliling(s);
                    hasilLuas.setText("Luas = " + hLuas + " cm²");
                    hasilKeliling.setText("Keliling = " + hKeliling + " cm");
                } else {
                    Toast.makeText(getApplicationContext(), "masukkan nilai pada sisi", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
    public String luas(String s){
        Double jr = Double.parseDouble(s);
        Double jri = Double.parseDouble(s);
        Double dLuas = 3.14 * jr * jri;
        String dHasil = String.valueOf(dLuas);
        return dHasil;
    }
    public String keliling(String s){
        Double jr = Double.parseDouble(s);
        Double dKeliling = 2 * 3.14 * jr ;
        String dHasil = String.valueOf(dKeliling);
        return dHasil;
    }
}