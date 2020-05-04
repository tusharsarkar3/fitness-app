package com.example.dk0049tx.fithit;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main5Activity extends AppCompatActivity {
    static final String EXTRA_TEXT ="info";
    static final String EXTRA_TEXT1 ="info";
    public void name(View view) {
        EditText text1 = (EditText) findViewById(R.id.editText6);
        int x = Integer.parseInt(text1.getText().toString());
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        Button button=(Button)findViewById(R.id.button10);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMain6Activity();

            }
        });

        Button button1=(Button)findViewById(R.id.button11);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMain7Activity();

            }
        });
    }
    public void openMain6Activity(){
        EditText a= (EditText)findViewById(R.id.editText6);
        int w = Integer.parseInt(a.getText().toString());
        Intent intent=new Intent(this,Main6Activity.class);
        intent.putExtra(EXTRA_TEXT,w);
        startActivity(intent);
    }
    public void openMain7Activity(){
        EditText a= (EditText)findViewById(R.id.editText6);
        int w = Integer.parseInt(a.getText().toString());
        Intent intent=new Intent(this,Main7Activity.class);
        intent.putExtra(EXTRA_TEXT1,w);
        startActivity(intent);
    }
}
