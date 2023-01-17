package org.tensorflow.lite.examples.detection;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle( "Ayo Cek Daun Tomatmu");
        setContentView(R.layout.home_activity);
    }
    public void Start(View view) { startActivity(new Intent(this, DetectorActivity.class));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.help,menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.help_button:
                Intent helpIntent = new Intent(this, HelpActivity.class);

                startActivity(helpIntent);

                return true;

        }
        return false;
    }

}
