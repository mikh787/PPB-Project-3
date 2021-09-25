package com.example.menhitungluasdankel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Segitiga extends AppCompatActivity {
    TextView hasilLuas, hasilKeliling;
    Button hasil;
    EditText alas,tinggi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);

        hasilLuas = (TextView) findViewById(R.id.HasilLuas);
        hasilKeliling = (TextView) findViewById(R.id.HasilKEl);
        alas = (EditText) findViewById(R.id.EtAlas);
        tinggi = (EditText) findViewById(R.id.EtTinggi);
        hasil = (Button) findViewById(R.id.btnHasil);
        hasil.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String a = alas.getText().toString();
                String t = tinggi.getText().toString();

                if(a.length() != 0){
                    if(t.length() !=0){
                        String hLuas = luas(a,t);
                        String hKeliling = keliling(a,t);
                        hasilLuas.setText("Luas = "+hLuas+" cm²");
                        hasilKeliling.setText("Keliling = "+hKeliling+" cm");
                    }else {
                        Toast.makeText(getApplicationContext(), "masukkan nilai pada sisi", Toast.LENGTH_LONG).show();
                    }
                } else {
                    Toast.makeText(getApplicationContext(), "masukkan nilai pada sisi",Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    private String luas(String a ,String t){
        Double alas = Double.parseDouble(a);
        Double tinggi = Double.parseDouble(t);
        Double dLuas = 0.5 * alas * tinggi;
        String dHasil = String.valueOf(dLuas);
        return dHasil;
    }

    private String keliling(String a ,String t){
        Double sisi = Double.parseDouble(a);
        Double dKeliling = 3 * sisi;
        String dHasil = String.valueOf(dKeliling);
        return dHasil;
    }
}