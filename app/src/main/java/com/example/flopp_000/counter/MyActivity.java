package com.example.flopp_000.counter;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.*;
import android.widget.Button;
import android.widget.TextView;

public class MyActivity extends Activity implements View.OnClickListener {

    Button  btnAdd,btnReset;
    int count = 0;
    TextView displayCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        btnAdd = (Button)findViewById(R.id.countPlus);
        btnReset = (Button)findViewById(R.id.reset);
        displayCount = (TextView)findViewById(R.id.textView);

        btnAdd.setOnClickListener(this);
        btnReset.setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {
        if (view == btnAdd) {
            count++;
            displayCount.setText(Integer.toString(count));
        }
        if (view == btnReset) {
            count = 0;
            displayCount.setText(Integer.toString(count));
        }

    }
}
