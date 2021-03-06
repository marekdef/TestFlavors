package marekdef.pl.testflavors;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import marekdef.pl.mylibrary.Library;


public class MainActivity extends AppCompatActivity {

    private TextView mApp;
    private TextView mLibrary;
    private TextView mCall;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mApp = (TextView) findViewById(R.id.app);
        mLibrary = (TextView) findViewById(R.id.library);
        mCall = (TextView) findViewById(R.id.call);

        mApp.setText(BuildConfig.FLAVOR + BuildConfig.BUILD_TYPE);
        mLibrary.setText(marekdef.pl.mylibrary.BuildConfig.FLAVOR + marekdef.pl.mylibrary.BuildConfig.BUILD_TYPE);
        mCall.setText(new Library().getFlavor());
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
}
