package com.lnt.miniproject.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import com.lnt.miniproject.R;
public class HomeFragment extends Fragment {
    Button button;
    EditText editTextTextPassword,editTextTextPersonName;
    String[] strArray = new String[]{"Abk", "Afi", "Ara",};
    String[] strArray1 = new String[]{"Abhi@123", "Afri@123", "Arav@123",};

    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        //final TextView textView = root.findViewById(R.id.text_home);
//        homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
////            @Override
////            public void onChanged(@Nullable String s) {
////                textView.setText(s);
////            }
////        });
        return root;
    }
    @Override
    public void onViewCreated(@NonNull final View view, @Nullable Bundle savedInstanceState ) {

        super.onViewCreated(view, savedInstanceState);
        Button button = (Button) getView().findViewById(R.id.button4);
        final EditText NameEdit=(EditText)getView().findViewById(R.id.editTextTextPersonName);
        final EditText PassEdit=(EditText)getView().findViewById(R.id.editTextTextPassword);
        button.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                final String Name=NameEdit.getText().toString();
                final String pas1=PassEdit.getText().toString();
                if(Name.length()==0)
                {
                    NameEdit.requestFocus();
                    NameEdit.setError("FIELD CANNOT BE EMPTY");
                }
                else if(!Name.matches("[a-zA-Z ]+"))
                {
                    NameEdit.requestFocus();
                    NameEdit.setError("ENTER ONLY ALPHABETICAL CHARACTER");
                }
                else if(pas1.length()==0)
                {
                    PassEdit.requestFocus();
                    PassEdit.setError("FIELD CANNOT BE EMPTY");
                }
                else if((Name.equals("Abhishek"))&&(pas1.equals("12345")))
                {
                    Toast.makeText(getContext(),"Validation Successful", Toast.LENGTH_LONG).show();
                    final NavController navController = Navigation.findNavController(view);
                    navController.navigate(R.id.action_nav_home_to_nav_slideshow);
                }
                else if((Name.equals("Afridi"))&&(pas1.equals("123678")))
                {
                    Toast.makeText(getContext(),"Validation Successful", Toast.LENGTH_LONG).show();
                    final NavController navController = Navigation.findNavController(view);
                    navController.navigate(R.id.action_nav_home_to_nav_slideshow);
                }
                else if((Name.equals("Aravind"))&&(pas1.equals("12345678")))
                {
                    Toast.makeText(getContext(),"Validation Successful", Toast.LENGTH_LONG).show();
                    final NavController navController = Navigation.findNavController(view);
                    navController.navigate(R.id.action_nav_home_to_nav_slideshow);
                }
                else
                {
                    Toast.makeText(getContext(),"Logged", Toast.LENGTH_LONG).show();

                }

            }
        });
    }
}