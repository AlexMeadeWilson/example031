package com.example.example031;

// second activity class that will be launched from Main Activity

// imports
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

// class definition
public class SecondActivity extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        // call the super class method and set the content for this activity
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
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
