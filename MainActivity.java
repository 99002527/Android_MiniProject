package com.lnt.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


TextView t1;

int num1,num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);*-
        setContentView(R.layout.activity_main);
    }

    public boolean getNumbers(){

        e1=(EditText)findViewById(R.id.num1);

        e2=(EditText)findViewById(R.id.num2);

        t1=(TextView)findViewById(R.id.result);

        String s1=e1.getText().toString();

        String s2=e2.getText().toString();

        if((s1.equals(null) && s2.equals(null)) || (s1.equals("") && s2.equals(""))){

            String result="Pls enter a value";

            t1.setText(result);

            return false;
        }



        else
        {

            num1=Integer.parseInt(e1.getText().toString());

            num2=Integer.parseInt(e2.getText().toString());
        }

        return true;
    }

    public void doSum(View v){

        if(getNumbers())
        {

            int sum=num1+num2;

            t1.setText(Integer.toString(sum));
        }
    }

    public void doSub(View v){

        if(getNumbers())
        {

            int sub=num1-num2;

            t1.setText(Integer.toString(sub));
        }
    }


    public void doMul(View v){

        if(getNumbers())
        {

            int mul=num1*num2;

            t1.setText(Integer.toString(mul));
        }
    }

    public void doDiv(View v){

        if(getNumbers())
        {

            int div=num1/num2;

            t1.setText(Integer.toString(div));
        }
    }

    public void doPow(View v){
        if (getNumbers()) {
            double sum = Math.pow(num1, num2);
            t1.setText(Double.toString(sum));
        }

    }

    public void doMod(View v){

        if(getNumbers()){

            int mod=num1%num2;

            t1.setText(Integer.toString(mod));
        }
    }

}
