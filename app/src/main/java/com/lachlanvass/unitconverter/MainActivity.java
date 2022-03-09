package com.lachlanvass.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button convertButton = findViewById(R.id.convertButton);

        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Spinner unitSpinner = findViewById(R.id.unitSpinner);
                String unitSelected = unitSpinner
                        .getSelectedItem()
                        .toString();

                EditText userInput = findViewById(R.id.userinput);
                TextView outputText1 = findViewById(R.id.output1);
                TextView outputText2 = findViewById(R.id.output2);
                TextView outputText3 = findViewById(R.id.output3);

                String inputText = userInput.getText().toString();
                Double inputDouble = Double.parseDouble(inputText);

                if (unitSelected.equals("Metres")) {

                    MetreConverter metreConverter = new MetreConverter(inputDouble);
                    outputText1.setText("Centimetres: " + metreConverter.Centimetre.toString());
                    outputText2.setText("Foot: " + metreConverter.Foot.toString());
                    outputText3.setText("Inch: " + metreConverter.Inch.toString());
                }

                if (unitSelected.equals("Kilogram")) {

                    WeightConverter weightConverter = new WeightConverter(inputDouble);
                    outputText1.setText("Centimetres: " + weightConverter.Grams.toString());
                    outputText2.setText("Foot: " + weightConverter.Ounce.toString());
                    outputText3.setText("Inch: " + weightConverter.Pound.toString());
                }

            }
        });



//        if (unitSelected === "Metres") {
//
//        }
    }

}