package com.example.gk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnxacnhan;
    EditText edtusername, edtpassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actvitylogin);
        Anhxa();
        btnxacnhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = edtusername.getText().toString().trim();
                String password = edtpassword.getText().toString().trim();
                if(username.equals("triet") && password.equals("123123")){
                    openhomepage();
                }
                else{
                    Toast.makeText(MainActivity.this, "Dang nhap that bai", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void openhomepage() {
        Intent it=new Intent(this, Homepage.class);
        startActivity(it);
    }

    private  void Anhxa(){
        btnxacnhan = (Button) findViewById(R.id.button);
        edtpassword = (EditText) findViewById(R.id.edtpass);
        edtusername = (EditText) findViewById(R.id.edtuser);
    }
}