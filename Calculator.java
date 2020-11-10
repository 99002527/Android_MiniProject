package com.lnt.miniproject;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Calculator#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Calculator extends Fragment {
    EditText e1, e2;

    TextView t1;

    int num1,num2;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Calculator() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Calculator.
     */
    // TODO: Rename and change types and number of parameters
    public static Calculator newInstance(String param1, String param2) {
        Calculator fragment = new Calculator();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

    }

    public boolean getNumbers(){

        e1=(EditText)getView().findViewById(R.id.num1);

        e2=(EditText)getView().findViewById(R.id.num2);

        t1=(TextView)getView().findViewById(R.id.result);

        String s1=e1.getText().toString();

        String s2=e2.getText().toString();

        if(s1.equals("") && s2.equals("")){

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
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_calculator, container, false);
    }
    @Override
    public void onViewCreated(@NonNull final View view, @Nullable Bundle savedInstanceState) {

        super.onViewCreated(view, savedInstanceState);
        Button sumbtn = (Button) getView().findViewById(R.id.sum);
        Button subbtn = (Button) getView().findViewById(R.id.sub);
        Button mulbtn = (Button) getView().findViewById(R.id.mul);
        Button divbtn=(Button) getView().findViewById((R.id.div));
        Button powbtn=(Button) getView().findViewById((R.id.pow));
        Button modbtn=(Button) getView().findViewById((R.id.button));

        sumbtn.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if(getNumbers())
                {

                    int sum=num1+num2;

                    t1.setText(Integer.toString(sum));
                }
            }
        });
        subbtn.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if (getNumbers()) {

                    int sub = num1 - num2;

                    t1.setText(Integer.toString(sub));
                }
            }
        });

        mulbtn.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if(getNumbers())
                {
                    int mul=num1*num2;
                    t1.setText(Integer.toString(mul));
                }
            }
        });
        divbtn.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if(getNumbers())
                {
                    int div=num1/num2;
                    t1.setText(Integer.toString(div));
                }
            }
        });
        powbtn.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if (getNumbers()) {
                    double sum = Math.pow(num1, num2);
                    t1.setText(Double.toString(sum));
                }
            }
        });
        modbtn.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if (getNumbers()) {

                    int mod = num1 % num2;

                    t1.setText(Integer.toString(mod));
                }
            }
        });

}
}
