package com.lnt.miniproject;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link LenghtConvertor#newInstance} factory method to
 * create an instance of this fragment.
 */
public class LenghtConvertor extends Fragment {
    TextView from,to,result;
    EditText measure1,measure2,value;
    Button convert,inches,feet,clear,centimeter,meter,millimeter;
    double value1,value2;
    boolean in,foot;
    String Measure1,M1,M2;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public LenghtConvertor() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment LenghtConvertor.
     */
    // TODO: Rename and change types and number of parameters
    public static LenghtConvertor newInstance(String param1, String param2) {
        LenghtConvertor fragment = new LenghtConvertor();
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

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_lenght_convertor, container, false);
    }


    @Override
    public void onViewCreated(@NonNull final View view, @Nullable Bundle savedInstanceState) {

        try {
            convert = (Button) getView().findViewById(R.id.convert);
            inches = (Button) getView().findViewById(R.id.inches);
            feet = (Button) getView().findViewById(R.id.feet);
            clear = (Button) getView().findViewById(R.id.clear);
            centimeter = (Button) getView().findViewById(R.id.centimeter);
            meter = (Button) getView().findViewById(R.id.meter);
            millimeter = (Button) getView().findViewById(R.id.millimeter);

            measure1 = (EditText) getView().findViewById(R.id.measure1);
            measure2 = (EditText) getView().findViewById(R.id.measure2);
            value = (EditText) getView().findViewById(R.id.value);

            from = (TextView) getView().findViewById(R.id.from);
            to = (TextView) getView().findViewById(R.id.to);
            result = (TextView) getView().findViewById(R.id.result);

            measure1.setText("unit1");
            measure2.setText("unit2");


            inches.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Measure1 = measure1.getText().toString();

                    if (Measure1.matches("unit1")) {

                        measure1.setText("inches");
                    } else {

                        measure2.setText("inches");
                    }
                }
            });

            feet.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Measure1 = measure1.getText().toString();

                    if (Measure1.matches("unit1")) {

                        measure1.setText("feet");
                    } else {

                        measure2.setText("feet");
                    }
                }
            });

            meter.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Measure1 = measure1.getText().toString();

                    if (Measure1.matches("unit1")) {

                        measure1.setText("meter");

                    } else {

                        measure2.setText("meter");
                    }
                }
            });

            centimeter.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Measure1 = measure1.getText().toString();

                    if (Measure1.matches("unit1")) {

                        measure1.setText("centimeter");

                    } else {

                        measure2.setText("cm");
                    }
                }
            });

            millimeter.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Measure1 = measure1.getText().toString();

                    if (Measure1.matches("unit1")) {

                        measure1.setText("mm");

                    } else {

                        measure2.setText("mm");
                    }
                }
            });

            convert.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    value1 = Float.parseFloat(value.getText() + " ");
                    M1 = measure1.getText().toString();
                    M2 = measure2.getText().toString();

                    if ((M1.matches("inches")) && (M2.matches("feet"))) {

                        value2 = value1 * 0.083;

                        result.setText(value2 + " ");
                    } else if ((M1.matches("inches")) && M2.matches("millimeter")) {

                        value2 = value1 * 25.4;

                        result.setText(value2 + " ");
                    } else if ((M1.matches("feet")) && (M2.matches("inches"))) {

                        value2 = value1 * 12;

                        result.setText(value2 + "");
                    } else if ((M1.matches("feet")) && (M2.matches("millimeter"))) {

                        value2 = value1 * 304.8;

                        result.setText(value2 + " ");

                    } else if ((M1.matches("inches")) && (M2.matches("centimeter"))) {
                        value2 = value1 * 2.54;
                        result.setText(value2 + " ");
                    } else if ((M1.matches("inches")) && (M2.matches("meter"))) {
                        value2 = value1 * 0.0254;
                        result.setText(value2 + " ");
                    } else if ((M1.matches("feet")) && (M2.matches("centimeter"))) {
                        value2 = value1 * 30.48;
                        result.setText(value2 + " ");
                    } else if ((M1.matches("feet")) && (M2.matches("meter"))) {
                        value2 = value1 * 0.3048;
                        result.setText(value2 + " ");
                    } else if ((M1.matches("centimeter")) && (M2.matches("meter"))) {
                        value2 = value1 * 0.01;
                        result.setText(value2 + " ");
                    } else if ((M1.matches("centimeter")) && (M2.matches("inches"))) {
                        value2 = value1 * 0.393701;
                        result.setText(value2 + " ");
                    } else if ((M1.matches("centimeter")) && (M2.matches("feet"))) {
                        value2 = value1 * 0.0328084;
                        result.setText(value2 + " ");
                    } else if ((M1.matches("centimeter")) && (M2.matches("millimeter"))) {
                        value2 = value1 * 10;
                        result.setText(value2 + " ");
                    } else if ((M1.matches("meter")) && (M2.matches("feet"))) {
                        value2 = value1 * 3.28084;
                        result.setText(value2 + " ");
                    } else if ((M1.matches("meter")) && (M2.matches("inches"))) {
                        value2 = value1 * 39.3701;
                        result.setText(value2 + " ");
                    } else if ((M1.matches("meter")) && (M2.matches("centimeter"))) {
                        value2 = value1 * 100;
                        result.setText(value2 + " ");
                    } else if ((M1.matches("meter")) && (M2.matches("millimeter"))) {
                        value2 = value1 * 1000;
                        result.setText(value2 + " ");
                    } else if ((M1.matches("millimeter")) && (M2.matches("inches"))) {
                        value2 = value1 * 0.0393701;
                        result.setText(value2 + " ");
                    } else if ((M1.matches("millimeter")) && (M2.matches("feet"))) {
                        value2 = value1 * 0.00328084;
                        result.setText(value2 + " ");
                    } else if ((M1.matches("millimeter")) && (M2.matches("centimeter"))) {
                        value2 = value1 * 0.1;
                        result.setText(value2 + " ");
                    } else if ((M1.matches("millimeter")) && (M2.matches("meter"))) {
                        value2 = value1 * 0.001;
                        result.setText(value2 + " ");
                    } else if ((M1.matches("millimeter")) && (M2.matches("millimeter"))) {
                        value2 = value1;
                        result.setText(value2 + " ");
                    } else if ((M1.matches("meter")) && (M2.matches("meter"))) {
                        value2 = value1;
                        result.setText(value2 + " ");
                    } else if ((M1.matches("centimeter")) && (M2.matches("centimeter"))) {
                        value2 = value1;
                        result.setText(value2 + " ");
                    } else if ((M1.matches("feet")) && (M2.matches("feet"))) {
                        value2 = value1;
                        result.setText(value2 + " ");
                    } else if ((M1.matches("inches")) && (M2.matches("inches"))) {
                        value2 = value1;
                        result.setText(value2 + " ");
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

        }catch(Exception e){
            Toast.makeText(getContext(),"Try Again", Toast.LENGTH_LONG).show();
            // Toast toast = Toast.makeText(getApplicationContext(), "This is a message displayed in a Toast", Toast.LENGTH_SHORT).show();
        }
    }


}