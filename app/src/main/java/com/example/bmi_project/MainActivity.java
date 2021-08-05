package com.example.bmi_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button calculate;
    private EditText height,weight;
    private TextView result,bmiresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calculate=findViewById(R.id.btncalculate);
        height=findViewById(R.id.height);
        weight=findViewById(R.id.weight);
        result=findViewById(R.id.result);
        bmiresult=findViewById(R.id.bmiresult);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getw=weight.getText().toString();
                String geth=height.getText().toString();

                Float w=Float.parseFloat(getw);
                Float h=Float.parseFloat(geth);

                Float newh=h/100;
                Float bmi=w/(newh*newh);



                bmiresult.setText(String.format("%.2f",bmi));


                if(bmi<18.5){
                    result.setText("Underweight");
                }
                else if(bmi>=18.5 && bmi<25){
                    result.setText("Normal");
                }
                else if(bmi>=25 && bmi<30){
                    result.setText("Overweight");
                }
                else{
                    result.setText("Obese");
                }
            }
        });

    }
}