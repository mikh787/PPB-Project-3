package com.example.menhitungluasdankel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listview);

        String[] values = new String[]{"Persegi", "Segitiga", "Lingkaran", "Kubus"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this, android.R.layout.simple_list_item_1,
                android.R.id.text1, values);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0){
                    Intent intent = new Intent(view.getContext(), Persegi.class);
                    startActivity(intent);
                }

                if (position == 1){
                    Intent intent = new Intent(view.getContext(), Segitiga.class);
                    startActivity(intent);
                }

                if (position == 2){
                    Intent intent = new Intent(view.getContext(), Lingkaran.class);
                    startActivity(intent);
                }

                if (position == 3){
                   Intent intent = new Intent(view.getContext(), Kubus.class);
                   startActivity(intent);
                }
            }
        });
    }
}