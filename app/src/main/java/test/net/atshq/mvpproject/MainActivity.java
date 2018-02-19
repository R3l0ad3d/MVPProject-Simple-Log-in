package test.net.atshq.mvpproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import test.net.atshq.mvpproject.MVP.model.LogInModel;
import test.net.atshq.mvpproject.MVP.view.LogInView;

public class MainActivity extends AppCompatActivity implements LogInView{

    private EditText etUserName;
    private EditText etPassword;

    private LogInModel logInModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUserName = findViewById(R.id.etUserName);
        etPassword = findViewById(R.id.etPassword);

        logInModel= new LogInModel(MainActivity.this);
    }

    public void signUpClick(View view) {
        logInModel.logIn(etUserName.getText().toString(),etPassword.getText().toString());
    }

    @Override
    public void onLoginSuccess() {
        Toast.makeText(this, "Log in Success ...", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onLoginError() {
        Toast.makeText(this, "Log in Error ...", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onValidationError() {
        Toast.makeText(this, "Validation Error ...", Toast.LENGTH_SHORT).show();
    }
}
