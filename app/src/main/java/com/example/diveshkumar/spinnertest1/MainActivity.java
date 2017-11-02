package com.example.diveshkumar.spinnertest1;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    TextView textView;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.textView);
        button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Submitted", Toast.LENGTH_SHORT).show();
            }
        });
        Spinner spinner = (Spinner) findViewById(R.id.spinner);

        spinner.setOnItemSelectedListener(this);

        List<String> country = new ArrayList<>();
        country.add("Delhi");
        country.add("Nepal");
        country.add("China");
        ArrayAdapter<String> Count = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,country);
        spinner.setAdapter(Count);


        }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {
         String item = parent.getItemAtPosition(i).toString();
        Toast.makeText(parent.getContext(), "Selected : " + item, Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }


}

