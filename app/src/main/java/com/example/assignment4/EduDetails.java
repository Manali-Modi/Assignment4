
package com.example.assignment4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class EduDetails extends AppCompatActivity {

    Spinner spnboard, spndegree;
    SeekBar skbboard, skbdegree;
    TextView txtboardpr, txtdegreepr;
    Button btndone;

    List<String> board;
    List<String> degree;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edu_details);

        AllocateMemory();
        spinner();
        seekbar();

        btndone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"All is done",Toast.LENGTH_LONG).show();
            }
        });

    }

    private void AllocateMemory() {
        spnboard = findViewById(R.id.spnboard);
        spndegree = findViewById(R.id.spndegree);
        skbboard = findViewById(R.id.skbboard);
        skbdegree = findViewById(R.id.skbdegree);
        txtboardpr = findViewById(R.id.txtboardpr);
        txtdegreepr = findViewById(R.id.txtdegreepr);
        btndone = findViewById(R.id.btndone);
    }

    private void seekbar() {
        skbboard.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {
                txtboardpr.setText(progress + "%");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        skbdegree.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {
                txtdegreepr.setText(progress + "%");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

    private void spinner() {
        board = new ArrayList<String>();
        board.add("SSC");
        board.add("HSC");

        spnboard.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,board);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spnboard.setAdapter(adapter1);

        degree = new ArrayList<String>();
        degree.add("B.C.A.");
        degree.add("B.Com.");

        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,degree);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spndegree.setAdapter(adapter2);
    }
}