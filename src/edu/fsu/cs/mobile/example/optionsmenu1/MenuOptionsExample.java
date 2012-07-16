package edu.fsu.cs.mobile.example.optionsmenu1;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MenuOptionsExample extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
        case R.id.set_text:
        	TextView tv = (TextView) findViewById(R.id.textView1);
        	tv.setText("First Option Selected!");
        	break;
        case R.id.close:
        	Toast.makeText(this, "Goodbye!", Toast.LENGTH_LONG).show();
        	finish();
        	break;
        }
        
        return true;
    }
}