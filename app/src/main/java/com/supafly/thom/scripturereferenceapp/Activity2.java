package com.supafly.thom.scripturereferenceapp;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.TextView;


public class Activity2 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        displayScripture();
    }

    protected void displayScripture(){
        // Get the message from the intent
        Intent intent = getIntent();
        String scripture = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        // Tell the user their favorite scripture
        String text = "Your favorite scripture is: \n";

        // Create the text view
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setTextColor(Color.parseColor("#0066FF"));
        textView.setGravity(17);
        textView.setText(text + scripture);

        // Set the text view as the activity layout
        setContentView(textView);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_activity2, menu);
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
}
