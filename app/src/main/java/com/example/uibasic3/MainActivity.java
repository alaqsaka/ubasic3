package com.example.uibasic3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private CheckBox checkBoxWarga;
    private CheckBox checkBoxKetua;
    private RadioGroup userGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBoxWarga = findViewById(R.id.checkBoxWarga);
        checkBoxKetua = findViewById(R.id.checkBoxKetua);

        userGender = findViewById(R.id.rgUserGender);
        userGender.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.radioBtnLaki:
                        Toast.makeText(MainActivity.this, "Laki-laki", Toast.LENGTH_SHORT).show();
                    case R.id.radioBtnPerempuan:
                        Toast.makeText(MainActivity.this, "Perempuan", Toast.LENGTH_SHORT).show();
                    default:
                        break;
                }
            }
        });
        
        if(checkBoxWarga.isChecked()) {
            Toast.makeText(this, "Kamu ingin terdaftar sebagai warga", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Kamu belum ingin terdaftar sebagai warga", Toast.LENGTH_SHORT).show();
        }

        checkBoxWarga.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(MainActivity.this, "Sebagai warga", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Tidak jadi sebagai warga", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}