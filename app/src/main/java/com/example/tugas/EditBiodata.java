package com.example.tugas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class EditBiodata extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_biodata);

        Button edit = (Button) findViewById(R.id.edit);
        EditText txtName = (EditText) findViewById(R.id.namaEdit);
        EditText txtNim = (EditText) findViewById(R.id.nimEdit);
        EditText txtKelas = (EditText) findViewById(R.id.kelasEdit);
        TextView viewName = (TextView) findViewById(R.id.nama);
        TextView viewNim = (TextView) findViewById(R.id.nim);
        TextView viewKelas = (TextView) findViewById(R.id.kelas);
        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewName.setText(txtName.getText().toString());
                viewNim.setText(txtNim.getText().toString());
                viewKelas.setText(txtKelas.getText().toString());
            }
        });
    }
}