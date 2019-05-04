package fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.onlineclothingshoppingapp.R;

import java.io.PrintStream;


public class LoginFragment extends Fragment implements View.OnClickListener{
    private EditText login_email;
    private EditText login_password;
    private Button btn_login;


    public LoginFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_login, container, false);

        login_email = view.findViewById(R.id.login_email);
        login_password = view.findViewById(R.id.login_password);
        btn_login = view.findViewById(R.id.btn_login);

        return view;
    }


    @Override
    public void onClick(View v) {

    }

}
