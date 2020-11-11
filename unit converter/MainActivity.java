package com.lnt.unitconverter1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
          TextView from,to,result;
           EditText measure1,measure2,value;
           Button convert,inches,feet,clear,centimeter,meter,millimeter;
           double value1,value2;
           boolean in,foot;
           String Measure1,M1,M2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       convert=(Button)findViewById(R.id.convert);
       inches=(Button)findViewById(R.id.inches);
        feet=(Button)findViewById(R.id.feet);
        clear=(Button)findViewById(R.id.clear);
        centimeter=(Button)findViewById(R.id.centimeter);
        meter=(Button)findViewById(R.id.meter);
        millimeter=(Button)findViewById(R.id.millimeter);

        measure1=(EditText)findViewById(R.id.measure1);
        measure2=(EditText)findViewById(R.id.measure2);
        value=(EditText)findViewById(R.id.value);

        from=(TextView)findViewById(R.id.from);
        to=(TextView)findViewById(R.id.to);
        result=(TextView)findViewById(R.id.result);

        measure1.setText("unit1");
        measure2.setText("unit2");

        
        
        inches.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 Measure1=measure1.getText().toString();

                 if(Measure1.matches("unit1")){

                     measure1.setText("inches");
                 }

                 else{

                     measure2.setText("inches");
                 }
            }
        });

        feet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Measure1=measure1.getText().toString();

                if(Measure1.matches("unit1")){

                    measure1.setText("feet");
                }

                else{

                    measure2.setText("feet");
                }
            }
        });

        meter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Measure1=measure1.getText().toString();

                if(Measure1.matches("unit1")){

                    measure1.setText("meter");

                }

                else{

                    measure2.setText("meter");
                }
            }
        });

       centimeter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Measure1=measure1.getText().toString();

                if(Measure1.matches("unit1")){

                    measure1.setText("centimeter");

                }

                else{

                    measure2.setText("cm");
                }
            }
        });

        millimeter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Measure1=measure1.getText().toString();

                if(Measure1.matches("unit1")){

                    measure1.setText("mm");

                }

                else{

                    measure2.setText("mm");
                }
            }
        });

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value1=Float.parseFloat(value.getText()+" ");
                M1=measure1.getText().toString();
                M2=measure2.getText().toString();

                if((M1.matches("inches"))&&(M2.matches("feet"))){

                    value2=value1*0.083;

                    result.setText(value2+" ");
                }

                else if((M1.matches("inches")) && M2.matches("millimeter")){

                    value2=value1*25.4;

                    result.setText(value2+" ");
                }

                else if((M1.matches("feet"))&&(M2.matches("inches"))){

                    value2=value1*12;

                    result.setText(value2+"");
                }

                else if((M1.matches("feet"))&&(M2.matches("millimeter"))){

                    value2=value1*304.8;

                    result.setText(value2+" ");

                }

               else if((M1.matches("inches")) && (M2.matches("centimeter"))) {
                    value2 = value1 * 2.54;
                    result.setText(value2+" ");
                }
                else if((M1.matches("inches")) && (M2.matches("meter"))) {
                    value2 = value1 *0.0254;
                    result.setText(value2+" ");
                }
                else if((M1.matches("feet")) && (M2.matches("centimeter"))) {
                    value2 = value1 * 30.48;
                    result.setText(value2+" ");
                }
                else if((M1.matches("feet")) && (M2.matches("meter"))) {
                    value2 = value1 *0.3048;
                    result.setText(value2+" ");
                }
                else if((M1.matches("centimeter")) && (M2.matches("meter"))) {
                    value2 = value1 *0.01;
                    result.setText(value2+" ");
                }
                else if((M1.matches("centimeter")) && (M2.matches("inches"))) {
                    value2 = value1 *0.393701;
                    result.setText(value2+" ");
                }
                else if((M1.matches("centimeter")) && (M2.matches("feet"))) {
                    value2 = value1 *0.0328084;
                    result.setText(value2+" ");
                }
                else if((M1.matches("centimeter")) && (M2.matches("millimeter"))) {
                    value2 = value1 * 10;
                    result.setText(value2+" ");
                }
                else if((M1.matches("meter")) && (M2.matches("feet"))) {
                    value2 = value1 *3.28084;
                    result.setText(value2+" ");
                }
                else if((M1.matches("meter")) && (M2.matches("inches"))) {
                    value2 = value1 *39.3701;
                    result.setText(value2+" ");
                }
                else if((M1.matches("meter")) && (M2.matches("centimeter"))) {
                    value2 = value1 *100;
                    result.setText(value2+" ");
                }
                else if((M1.matches("meter")) && (M2.matches("millimeter"))) {
                    value2 = value1 * 1000;
                    result.setText(value2+" ");
                }
                else if((M1.matches("millimeter")) && (M2.matches("inches"))) {
                    value2 = value1 * 0.0393701;
                    result.setText(value2+" ");
                }
                else if((M1.matches("millimeter")) && (M2.matches("feet"))) {
                    value2 = value1 *0.00328084;
                    result.setText(value2+" ");
                }
                else if((M1.matches("millimeter")) && (M2.matches("centimeter"))) {
                    value2 = value1 *0.1;
                    result.setText(value2+" ");
                }
                else if((M1.matches("millimeter")) && (M2.matches("meter"))) {
                    value2 = value1 *0.001;
                    result.setText(value2+" ");
                }
                else if((M1.matches("millimeter")) && (M2.matches("millimeter"))) {
                    value2 = value1;
                    result.setText(value2+" ");
                }
                else if((M1.matches("meter")) && (M2.matches("meter"))) {
                    value2 = value1;
                    result.setText(value2+" ");
                }
                else if((M1.matches("centimeter")) && (M2.matches("centimeter"))) {
                    value2 = value1;
                    result.setText(value2+" ");
                }
                else if((M1.matches("feet")) && (M2.matches("feet"))) {
                    value2 = value1;
                    result.setText(value2+" ");
                }
                else if((M1.matches("inches")) && (M2.matches("inches"))) {
                    value2 = value1;
                    result.setText(value2+" ");
                }
            }
        });

                clear.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        measure1.setText("unit1");
                        measure2.setText("unit2");
                        value.setText("value");
                        result.setText("result");
                    }
                });
    }
}