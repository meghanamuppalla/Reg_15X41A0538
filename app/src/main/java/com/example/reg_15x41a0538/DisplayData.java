package com.example.reg_15x41a0538;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public abstract class DisplayData extends AppCompatActivity {
        EditText et_name,et_password;
        SharedPreferences preferences;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_display_data);
            et_name=findViewById(R.id.name);
            et_password=findViewById(R.id.password);
            preferences=getSharedPreferences("ap",MODE_PRIVATE);
        }

        public void submit(View view) {
            String user_given_name=et_name.getText().toString();
            String user_given_password=et_password.getText().toString();
            String reg_user_name=preferences.getString("name","");
            String reg_user_password=preferences.getString("password","");
            if(user_given_name.equals(reg_user_name)&&user_given_password.equals(reg_user_password)) {

                Toast.makeText(this, "userlogin sucessful", Toast.LENGTH_SHORT).show();

            }
            else{
                Toast.makeText(this, "wrong credentionals", Toast.LENGTH_SHORT).show();
            }
        }
    }

