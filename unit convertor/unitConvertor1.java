package com.lnt.miniproject;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;



/**
 * A simple {@link Fragment} subclass.
 * Use the {@link unitConvertor1#newInstance} factory method to
 * create an instance of this fragment.
 */
public class unitConvertor1 extends Fragment {
    TextView from1, to1, result1,v;
    EditText measure11, measure21, val1;
    Button convert1, dollar, rupee, yen, canaddol, dir, euro, yuan,clear1;
    double value11, value21;
    boolean in, foot;
    String Measure11, M11, M21;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public unitConvertor1() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment unitConvertor1.
     */
    // TODO: Rename and change types and number of parameters
    public static unitConvertor1 newInstance(String param1, String param2) {
        unitConvertor1 fragment = new unitConvertor1();
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
        return inflater.inflate(R.layout.fragment_unit_convertor1, container, false);
    }

    @Override
    public void onViewCreated(@NonNull final View view, @Nullable Bundle savedInstanceState) {

        super.onViewCreated(view, savedInstanceState);
        convert1 = (Button) getView().findViewById(R.id.convert1);
        dollar = (Button) getView().findViewById(R.id.dollar);
        euro = (Button) getView().findViewById(R.id.euro);
        clear1 = (Button) getView().findViewById(R.id.clear1);
        rupee = (Button) getView().findViewById(R.id.rupee);
        canaddol = (Button) getView().findViewById(R.id.canaddol);
        yuan = (Button) getView().findViewById(R.id.yuan);
        yen = (Button) getView().findViewById(R.id.yen);
        dir = (Button) getView().findViewById(R.id.dir);

        measure11 = (EditText) getView().findViewById(R.id.measure11);
        measure21 = (EditText) getView().findViewById(R.id.measure21);
        val1 = (EditText) getView().findViewById(R.id.val1);
        from1 = (TextView) getView().findViewById(R.id.from1);
        to1 = (TextView) getView().findViewById(R.id.to1);
        result1 = (TextView) getView().findViewById(R.id.v);
        measure11.setText("unit1");
        measure21.setText("unit2");


        try {


            dollar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Measure11 = measure11.getText().toString();
                    if (Measure11.matches("unit1")) {
                        measure11.setText("dollar");
                    } else {
                        measure21.setText("dollar");
                    }
                }
            });

            euro.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Measure11 = measure11.getText().toString();
                    if (Measure11.matches("unit1")) {
                        measure11.setText("euro");
                    } else {
                        measure21.setText("euro");
                    }
                }
            });

            yen.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Measure11 = measure11.getText().toString();
                    if (Measure11.matches("unit1")) {
                        measure11.setText("yen");
                    } else {
                        measure21.setText("yen");
                    }
                }
            });

            yuan.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Measure11 = measure11.getText().toString();
                    if (Measure11.matches("unit1")) {
                        measure11.setText("yuan");
                    } else {
                        measure21.setText("yuan");
                    }
                }
            });

            dir.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Measure11 = measure11.getText().toString();
                    if (Measure11.matches("unit1")) {
                        measure11.setText("dir");
                    } else {
                        measure21.setText("dir");
                    }
                }
            });
            rupee.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Measure11 = measure11.getText().toString();
                    if (Measure11.matches("unit1")) {
                        measure11.setText("rupee");
                    } else {
                        measure21.setText("rupee");
                    }
                }
            });

            canaddol.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Measure11 = measure11.getText().toString();
                    if (Measure11.matches("unit1")) {
                        measure11.setText("canaddol");
                    } else {
                        measure21.setText("canaddol");
                    }
                }
            });

            convert1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    value11 = Float.parseFloat(val1.getText() + "");
                    M11 = measure11.getText().toString();
                    M21 = measure21.getText().toString();
                    if ((M11.matches("dollar")) && (M21.matches("euro"))) {
                        value21 = value11 * 0.85;
                        result1.setText(value21 + " ");
                    } else if ((M11.matches("dollar")) && (M21.matches("yuan"))) {
                        value21 = value11 * 6.73;
                        result1.setText(value21 + " ");
                    } else if ((M11.matches("dollar")) && (M21.matches("rupee"))) {
                        value21 = value11 * 73.31;
                        result1.setText(value21 + " ");
                    } else if ((M11.matches("dollar")) && (M21.matches("dir"))) {
                        value21 = value11 * 3.67;
                        result1.setText(value21 + " ");
                    } else if ((M11.matches("dollar")) && (M21.matches("yen"))) {
                        value21 = value11 * 105.5;
                        result1.setText(value21 + " ");
                    } else if ((M11.matches("dollar")) && (M21.matches("canaddol"))) {
                        value21 = value11 * 1.31;
                        result1.setText(value21 + " ");
                    } else if ((M11.matches("euro")) && (M21.matches("dollar"))) {
                        value21 = value11 * 1.18;
                        result1.setText(value21 + " ");
                    } else if ((M11.matches("euro")) && (M21.matches("yuan"))) {
                        value21 = value11 * 7.94;
                        result1.setText(value21 + " ");
                    } else if ((M11.matches("euro")) && (M21.matches("rupee"))) {
                        value21 = value11 * 86.4;
                        result1.setText(value21 + " ");
                    } else if ((M11.matches("euro")) && (M21.matches("dir"))) {
                        value21 = value11 * 4.33;
                        result1.setText(value21 + " ");
                    } else if ((M11.matches("euro")) && (M21.matches("yen"))) {
                        value21 = value11 * 124.35;
                        result1.setText(value21 + " ");
                    } else if ((M11.matches("euro")) && (M21.matches("canaddol"))) {
                        value21 = value11 * 1.55;
                        result1.setText(value21 + " ");
                    } else if ((M11.matches("yuan")) && (M21.matches("dollar"))) {
                        value21 = value11 * 0.15;
                        result1.setText(value21 + " ");
                    } else if ((M11.matches("yuan")) && (M21.matches("euro"))) {
                        value21 = value11 * 0.13;
                        result1.setText(value21 + " ");
                    } else if ((M11.matches("yuan")) && (M21.matches("rupee"))) {
                        value21 = value11 * 10.88;
                        result1.setText(value21 + " ");
                    } else if ((M11.matches("yuan")) && (M21.matches("dir"))) {
                        value21 = value11 * 0.55;
                        result1.setText(value21 + " ");
                    } else if ((M11.matches("yuan")) && (M21.matches("yen"))) {
                        value21 = value11 * 15.67;
                        result1.setText(value21 + " ");
                    } else if ((M11.matches("yuan")) && (M21.matches("canaddol"))) {
                        value21 = value11 * 0.19;
                        result1.setText(value21 + " ");
                    } else if ((M11.matches("rupee")) && (M21.matches("dollar"))) {
                        value21 = value11 * 0.013;
                        result1.setText(value21 + " ");
                    } else if ((M11.matches("rupee")) && (M21.matches("euro"))) {
                        value21 = value11 * 0.0115;
                        result1.setText(value21 + " ");
                    } else if ((M11.matches("rupee")) && (M21.matches("yuan"))) {
                        value21 = value11 * 0.091;
                        result1.setText(value21 + " ");
                    } else if ((M11.matches("rupee")) && (M21.matches("dir"))) {
                        value21 = value11 * 0.050;
                        result1.setText(value21 + " ");
                    } else if ((M11.matches("rupee")) && (M21.matches("yen"))) {
                        value21 = value11 * 1.44;
                        result1.setText(value21 + " ");
                    } else if ((M11.matches("rupee")) && (M21.matches("canaddol"))) {
                        value21 = value11 * 0.018;
                        result1.setText(value21 + " ");
                    } else if ((M11.matches("dir")) && (M21.matches("dollar"))) {
                        value21 = value11 * 0.27;
                        result1.setText(value21 + " ");
                    } else if ((M11.matches("dir")) && (M21.matches("euro"))) {
                        value21 = value11 * 0.23;
                        result1.setText(value21 + " ");
                    } else if ((M11.matches("dir")) && (M21.matches("yuan"))) {
                        value21 = value11 * 1.83;
                        result1.setText(value21 + " ");
                    } else if ((M11.matches("dir")) && (M21.matches("rupee"))) {
                        value21 = value11 * 20;
                        result1.setText(value21 + " ");
                    } else if ((M11.matches("dir")) && (M21.matches("yen"))) {
                        value21 = value11 * 28.72;
                        result1.setText(value21 + " ");
                    } else if ((M11.matches("dir")) && (M21.matches("canaddol"))) {
                        value21 = value11 * 0.36;
                        result1.setText(value21 + " ");
                    } else if ((M11.matches("yen")) && (M21.matches("dollar"))) {
                        value21 = value11 * 0.00947;
                        result1.setText(value21 + " ");
                    } else if ((M11.matches("yen")) && (M21.matches("euro"))) {
                        value21 = value11 * 0.0080;
                        result1.setText(value21 + " ");
                    } else if ((M11.matches("yen")) && (M21.matches("yuan"))) {
                        value21 = value11 * 0.063;
                        result1.setText(value21 + " ");
                    } else if ((M11.matches("yen")) && (M21.matches("rupee"))) {
                        value21 = value11 * 0.694;
                        result1.setText(value21 + " ");
                    } else if ((M11.matches("yen")) && (M21.matches("dir"))) {
                        value21 = value11 * 0.0348;
                        result1.setText(value21 + " ");
                    } else if ((M11.matches("yen")) && (M21.matches("canaddol"))) {
                        value21 = value11 * 0.012;
                        result1.setText(value21 + " ");
                    } else if ((M11.matches("canaddol")) && (M21.matches("dollar"))) {
                        value21 = value11 * 0.7633;
                        result1.setText(value21 + " ");
                    } else if ((M11.matches("canaddol")) && (M21.matches("euro"))) {
                        value21 = value11 * 0.645;
                        result1.setText(value21 + " ");
                    } else if ((M11.matches("canaddol")) && (M21.matches("yuan"))) {
                        value21 = value11 * 5.26;
                        result1.setText(value21 + " ");
                    } else if ((M11.matches("canaddol")) && (M21.matches("rupee"))) {
                        value21 = value11 * 55.555;
                        result1.setText(value21 + " ");
                    } else if ((M11.matches("canaddol")) && (M21.matches("dir"))) {
                        value21 = value11 * 2.777;
                        result1.setText(value21 + " ");
                    } else if ((M11.matches("canaddol")) && (M21.matches("yen"))) {
                        value21 = value11 * 83.333;
                        result1.setText(value21 + " ");
                    }
                }

                ;
            });
            clear1.setOnClickListener(new View.OnClickListener() {
                //@Override
                public void onClick(View v) {
                    measure11.setText("unit1");
                    measure21.setText("unit2");
                    val1.setText("value");
                    result1.setText("Result");
                    //Duplicate.setText("");
                }
            });
        }catch(Exception e){
            result1.setText("Something Went Wrong!!");
            // Toast toast = Toast.makeText(getApplicationContext(), "This is a message displayed in a Toast", Toast.LENGTH_SHORT).show();
        }

    }
}
