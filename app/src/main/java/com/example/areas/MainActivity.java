package com.example.areas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText year;
    Button calculate;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        year = (EditText)findViewById(R.id.year);
        calculate = (Button)findViewById(R.id.btnCalcular);
        result = (TextView)findViewById(R.id.resultado);
        calculate.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int anio = Integer.parseInt(year.getText().toString());
        if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)))
            result.setText("El año es bisiesto");
        else
            result.setText("El año no es bisiesto");
    }
}
