package com.example.dk0049tx.fithit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static com.example.dk0049tx.fithit.R.id.textView2;

public class Main6Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        Intent intent = getIntent();
        int x = intent.getIntExtra(Main5Activity.EXTRA_TEXT,0);
        TextView textView = (TextView)findViewById(R.id.textView13);
        textView.setText("Your Weight is: " + x);

         int calorie,protein,carbs,fat;
        calorie = (int) (2.205*x*23);
        protein= (int) (1.7*x);
        int procalories= 4*protein;
        int fatcal =calorie/5;
        fat =fatcal/9;
        carbs= (int) ((calorie- procalories-fatcal)/9);
        TextView text2 = (TextView)findViewById(R.id.textView7);
        text2.setText("total calories: "+calorie+"\n total protein :"+protein+"gms \n total fat :"+fat+"gms \n total carbohydrates: "+carbs );
    }
}
