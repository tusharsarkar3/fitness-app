package com.example.dk0049tx.fithit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import java.lang.Math;

import java.util.Objects;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Intent intent1 = getIntent();
        int x = intent1.getIntExtra(Main2Activity.EXTRA_TEXT2,0);
        int y = intent1.getIntExtra(Main2Activity.EXTRA_TEXT3,0);
        int z = intent1.getIntExtra(Main2Activity.EXTRA_TEXT4,0);
        int w = intent1.getIntExtra(Main2Activity.EXTRA_TEXT5,0);
        String text3 = intent1.getStringExtra(Main2Activity.EXTRA_TEXT6);

        TextView textView2 = (TextView)findViewById(R.id.textView3);
        TextView textView3 = (TextView)findViewById(R.id.textView8);
        TextView textView4 = (TextView)findViewById(R.id.textView9);
        TextView textView5 = (TextView)findViewById(R.id.textView10);
        TextView message = (TextView)findViewById(R.id.textView11);

        textView2.setText("Your Height is: " + x);
        textView3.setText("Your Waist is: " + y);
        textView4.setText("Your Neck is: " + z);
        textView5.setText("Your Hip is: " + w);

        if(Objects.equals(text3, "male")) {
            double bf = (495/(1.0324 - 0.19077 * Math.log10(y-z) + 0.15456 *Math.log10(x))) - 450;;
            message.setText("Your Body fat is: " + bf);
           // TextView textView6 = (TextView) findViewById(R.id.textView11);
            //textView6.setText("Your Body fat is: " + bf + "%");
        }//Toast.makeText(Main3Activity.this,"Your Body fat is "+ bf +"%",Toast.LENGTH_LONG).show();
        else if(Objects.equals(text3, "female"))
        {
            double bf =495/((1.29579 - 0.35004 * Math.log10(y+w-z) + 0.22100 * Math.log10(x))) - 450;
            message.setText("Your Body fat is: " + bf);
            //TextView textView6 = (TextView) findViewById(R.id.textView11);
            //textView6.setText("Your Body fat is: " + bf + "%");
         }

        Button button2=(Button)findViewById(R.id.button3);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMain4Activity();


            }
        });
    }

    public void openMain4Activity(){
        Intent intent2 =new Intent(this,Main4Activity.class);
        startActivity(intent2);
    }

}
