package com.example.student.test20;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button a1,a2;
    CheckBox c1,c2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        a1=(Button)findViewById(R.id.a1);
        a2=(Button)findViewById(R.id.a2);
        c1=(CheckBox) findViewById(R.id.c1);
        c2=(CheckBox) findViewById(R.id.c2);
        a1.setOnClickListener(k);
        a2.setOnClickListener(k2);

    }
    private Button.OnClickListener k=new Button.OnClickListener(){
        @Override
        public void onClick(View view) {
            Intent in=new Intent();
            in.setClass(MainActivity.this,P2.class);
            startActivity(in);
        }
    };
    private Button.OnClickListener k2=new Button.OnClickListener(){
        @Override
        public void onClick(View view) {
            String msg="";
            if(c1.isChecked())msg=msg+"足球\n";
            if(c2.isChecked())msg=msg+"棒球";
            msg="比賽項目:\n"+msg;
            Toast t=Toast.makeText(MainActivity.this,msg,Toast.LENGTH_LONG);
            t.setGravity(Gravity.CENTER,0,0);
            t.show();
        }
    };
}
