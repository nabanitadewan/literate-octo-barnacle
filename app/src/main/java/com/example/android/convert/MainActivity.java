
package com.example.android.convert;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
public void dollar(View view){
    EditText d1=(EditText)findViewById(R.id.editText);
    Double rupees=Double.parseDouble(d1.getText().toString());
    displayAmount((float)(rupees*0.015));
    }
    public void pound(View view){
        EditText d1=(EditText)findViewById(R.id.editText);
        Double rupees=Double.parseDouble(d1.getText().toString());
        displayAmount((float)(rupees*0.011));
    }
    public void yen(View view){
        EditText d1=(EditText)findViewById(R.id.editText);
        Double rupees=Double.parseDouble(d1.getText().toString());
        displayAmount((float)(rupees*1.64));
    }
    public void dirham(View view){
        EditText d1=(EditText)findViewById(R.id.editText);
        Double rupees=Double.parseDouble(d1.getText().toString());
        displayAmount((float)(rupees*0.055));
    }
    public void feet(View view){
        EditText d1=(EditText)findViewById(R.id.editText);
        Double rupees=Double.parseDouble(d1.getText().toString());
        displayAmount((float)(rupees*3.28));
    }
    public void yard(View view){
        EditText d1=(EditText)findViewById(R.id.editText);
        Double length=Double.parseDouble(d1.getText().toString());
        displayAmount((float)(length*1.09));
    }
    public void inch(View view){
        EditText d1=(EditText)findViewById(R.id.editText);
        Double length=Double.parseDouble(d1.getText().toString());
        displayAmount((float)(length*39.37));
    }
    public void mile(View view){
        EditText d1=(EditText)findViewById(R.id.editText);
        Double length=Double.parseDouble(d1.getText().toString());
        displayAmount((float)(length*0.00062));
    }
    public void reset(View view){
        displayAmount(0);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public void displayAmount(float amt){
        TextView scoreView=(TextView) findViewById(R.id.textView);
        scoreView.setText(String.valueOf(amt));
    }
}
