package fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.onlineclothingshoppingapp.R;

import java.io.PrintStream;

public class RegisterFragment extends Fragment implements View.OnClickListener{
    private EditText register_name;
    private EditText register_email;
    private EditText register_password;
    private Button btn_register;

    public RegisterFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_register, container, false);

        register_name = view.findViewById(R.id.register_name);
        register_email = view.findViewById(R.id.register_email);
        register_password = view.findViewById(R.id.register_password);
        btn_register = view.findViewById(R.id.btn_register);

        btn_register.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Register();
            }
        });

        return view;
    }

    private void Register() {
//        try {
//            PrintStream printStream = new PrintStream(openFileOutput());
//        }
    }


    @Override
    public void onClick(View v) {

    }

}
