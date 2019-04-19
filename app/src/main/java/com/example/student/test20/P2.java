package com.example.student.test20;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class P2 extends AppCompatActivity {
    Button b1,b2;
    RadioButton r1,r2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p2);
        b1=(Button)findViewById(R.id.b1);
        b2=(Button)findViewById(R.id.b2);
        r1=(RadioButton) findViewById(R.id.r1);
        r2=(RadioButton) findViewById(R.id.r2);
        b1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent in=new Intent();
                        in.setClass(P2.this,MainActivity.class);
                        startActivity(in);
                    }
                }
        );
        b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String msg="";
                        if(r1.isChecked()){
                            msg="男性";
                        }else if(r2.isChecked()){
                            msg="女性";
                        }
                        msg="性別為："+msg;

                        Toast t=Toast.makeText(P2.this,msg,Toast.LENGTH_LONG);
                        t.setGravity(Gravity.CENTER,0,0);
                        t.show();
                    }
                });
    }
}
