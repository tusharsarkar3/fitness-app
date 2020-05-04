package com.example.dk0049tx.fithit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    static final String EXTRA_TEXT2 ="info1";
    static final String EXTRA_TEXT3 ="info2";
    static final String EXTRA_TEXT4 ="info3";
    static final String EXTRA_TEXT5="info4";
    static final String EXTRA_TEXT6="info5";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        String text = intent.getStringExtra(MainActivity.EXTRA_TEXT);
        TextView textView1 = (TextView)findViewById(R.id.textView2);
        textView1.setText("Welcome " +text);

        Button button1=(Button)findViewById(R.id.button2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMain3Activity();


            }
        });
    }
    public void openMain3Activity(){
        EditText a1= (EditText)findViewById(R.id.editText);
        String text3 = a1.getText().toString();


        EditText a2= (EditText)findViewById(R.id.editText2);
        int x = Integer.parseInt(a2.getText().toString());


        EditText a3= (EditText)findViewById(R.id.editText3);
        int y = Integer.parseInt(a3.getText().toString());

        EditText a4= (EditText)findViewById(R.id.editText4);
        int z = Integer.parseInt(a4.getText().toString());

        EditText a5= (EditText)findViewById(R.id.editText5);
        int w = Integer.parseInt(a5.getText().toString());

        Intent intent1 =new Intent(this,Main3Activity.class);
        intent1.putExtra(EXTRA_TEXT2,x);
        intent1.putExtra(EXTRA_TEXT3,y);
        intent1.putExtra(EXTRA_TEXT4,z);
        intent1.putExtra(EXTRA_TEXT5,w);
        intent1.putExtra(EXTRA_TEXT6,text3);
        startActivity(intent1);
    }
}
