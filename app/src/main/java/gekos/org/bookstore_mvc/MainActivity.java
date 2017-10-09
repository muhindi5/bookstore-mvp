package gekos.org.bookstore_mvc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button signupButton;
    private EditText txPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txPassword = (EditText)findViewById(R.id.txt_password);
        signupButton = (Button)findViewById(R.id.btn_signup);
        signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!checkPassword(txPassword.getText().toString())){
                    signupButton.setText(R.string.invalid_password_message);
                }else{
//                    signupButton.setText(R.string.close_msg);
                    startActivity(new Intent(getApplicationContext(),Home.class));
                }
            }
        });
    }


    private boolean checkPassword(String password){
        if(password.equals("")){
            return false;
        }
        return true;
    }

}
