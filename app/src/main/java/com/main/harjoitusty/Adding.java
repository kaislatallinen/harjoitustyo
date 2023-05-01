package com.main.harjoitusty;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;



public class Adding extends AppCompatActivity {


        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_adding);
        }

        public void addItem(View view) {
                RadioGroup rgItemtype = findViewById(R.id.radiogroup);
                EditText editTextName = findViewById(R.id.text_nimi);
                String name = editTextName.getText().toString();
                Lutemon newName;

                switch (rgItemtype.getCheckedRadioButtonId()){
                        case R.id.valkoinen_radioButton:
                                newName= new White(name);
                                break;
                        case R.id.vihrea_radioButton:
                                newName = new Green();
                                break;
                        case R.id.pinkki_radioButton:
                                newName= new Pink();
                                break;
                        case R.id.oranssi_radioButton:
                                newName= new Orange();
                                break;
                        case R.id.musta_radioButton:
                                newName= new Black();
                                break;
                        default:
                                return;
                }
                newName.setName(name);
                Storage.getInstance().addLutemon(newName);

        }

        public void backToTheBeginning(View view){
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
        }
}

