package com.example.example031;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // get the button from the layout and add a listener to it
        btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener()
        {
            // overridden method to handle a button click
            public void onClick(View v)
            {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // inflate the menu and return true
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if(id == R.id.mi_main)
        {
            // TODO: Navigate to 'Main'
            return true;
        }
        else if(id == R.id.mi_second)
        {
            // TODO: Navigate to 'Second'
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}