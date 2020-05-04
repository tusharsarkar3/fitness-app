package com.example.dk0049tx.fithit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main7Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

       Intent intent = getIntent();
        int x = intent.getIntExtra(Main5Activity.EXTRA_TEXT1,0);
        TextView textView = (TextView)findViewById(R.id.textView14);
        textView.setText("Your Weight is: " + x);

        int calorie,protein,carbs,fat;
        calorie = (int) (2.205*x*21);
        protein= (int) (1.7*x);
        int procalories= 4*protein;
        int fatcal =calorie/5;
        fat =fatcal/9;
        carbs= (int) ((calorie- procalories-fatcal)/9);
        TextView text2 = (TextView)findViewById(R.id.textView15);
        text2.setText("total calories: "+calorie+"\n total protein :"+protein+"gms \n total fat :"+ fat+ "gms \n total carbohydrates: "+carbs );
    }
}
