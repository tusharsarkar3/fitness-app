package com.example.dk0049tx.fithit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
      static final String EXTRA_TEXT ="info";

public void name(View view){
    EditText user=(EditText)findViewById(R.id.name);
    Log.i("Info",user.getText().toString());
    Toast.makeText(MainActivity.this,"Welcome "+user.getText().toString(),Toast.LENGTH_LONG).show();

}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button=(Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMain2Activity();

            }
        });
        }
    public void openMain2Activity(){
        EditText a= (EditText)findViewById(R.id.name);
        String text = a.getText().toString();
        Intent intent=new Intent(this,Main2Activity.class);
        intent.putExtra(EXTRA_TEXT,text);
        startActivity(intent);
    }
}

