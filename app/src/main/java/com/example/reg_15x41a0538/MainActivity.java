package com.example.reg_15x41a0538;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText n,m,i;
    RadioButton m1,f1;
    TextView textView;
    String gender;
    Spinner branch;
    CheckBox c1,c2;


    public void login(View view) {
        Intent i = new Intent(this, DisplayData.class);
        startActivity(i);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        branch=findViewById(R.id.sp1);
        textView=findViewById(R.id.tv);

        n=findViewById(R.id.name);
        m=findViewById(R.id.phone);
        i=findViewById(R.id.rollid);
        m1=findViewById(R.id.male);
        f1=findViewById(R.id.female);
    }

    public void getdata(View view)
    {
        String name= n.getText().toString();
        String mobile=m.getText().toString();
        String id=i.getText().toString();
        if(m1.isChecked())
        {
            gender=m1.getText().toString();
        }
        else if(f1.isChecked())
        {
            gender=f1.getText().toString();
        }
        String b=branch.getSelectedItem().toString();
        StringBuilder sb=new StringBuilder();
        if (c1.isChecked())
        {
            sb.append("First\n");
        }
        else if(c2.isChecked())
        {
            sb.append("Second\n");
        }

        textView.setText(name+"\n"+"\n"+mobile+"\n"+id+"\n"+gender+"\n"+b+"\n"+sb);



    }
}