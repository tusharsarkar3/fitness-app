package com.example.dk0049tx.fithit;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main4Activity extends AppCompatActivity {
    public void open(View view)
    {
        Intent browserintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=AhdtowFDKT0"));
        startActivity(browserintent);

    }

    public void open1(View view)
    {
        Intent browserintent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=dZgVxmf6jkA"));
        startActivity(browserintent1);

    }


    public void open2(View view)
    {
        Intent browserintent2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=aclHkVaku9U"));
        startActivity(browserintent2);

    }


    public void open3(View view)
    {
        Intent browserintent3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=l4kQd9eWclE"));
        startActivity(browserintent3);

    }


    public void open4(View view)
    {
        Intent browserintent4 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=pSHjTRCQxIw"));
        startActivity(browserintent4);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
         Button button =(Button)findViewById(R.id.diet);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMain5Activity();
            }
        });

    }
    public void openMain5Activity(){
        Intent intent= new Intent(this,Main5Activity.class);
        startActivity(intent);
    }
}
