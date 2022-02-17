package com.example.radiobuttonandradiogroup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    // initialize data
    RadioButton johnCena, randyOrton, goldBerg, romanReigns, sheamus;
    String selectedSuperStar;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // initialize view's
        johnCena = findViewById(R.id.radioButtonJohnCena);
        randyOrton = findViewById(R.id.radioButtonRandyOrton);
        goldBerg = findViewById(R.id.radioButtonGoldBerg);
        romanReigns = findViewById(R.id.radioButtonRomanReigns);
        sheamus = findViewById(R.id.radioButtonSheamus);
        submit = findViewById(R.id.submitButton);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (randyOrton.isChecked()) {
                    selectedSuperStar = randyOrton.getText().toString();
                } else if (sheamus.isChecked()) {
                    selectedSuperStar = sheamus.getText().toString();
                } else if (johnCena.isChecked()) {
                    selectedSuperStar = johnCena.getText().toString();
                } else if (romanReigns.isChecked()) {
                    selectedSuperStar = romanReigns.getText().toString();
                } else if (goldBerg.isChecked()) {
                    selectedSuperStar = goldBerg.getText().toString();
                }
                Toast.makeText(
                    getApplicationContext(),
                    selectedSuperStar,
                    Toast.LENGTH_LONG
                ).show();
            }
        });
    }
}