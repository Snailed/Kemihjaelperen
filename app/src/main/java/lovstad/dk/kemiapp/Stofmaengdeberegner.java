package lovstad.dk.kemiapp;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Stofmaengdeberegner extends Activity implements View.OnClickListener {
    private EditText masse;
    private EditText molarmasse;
    private TextView stofmængde;
    private Button beregn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stofmaengdeberegner);
        masse = (EditText) findViewById(R.id.editTextStofmængdeMasse);
        molarmasse = (EditText) findViewById(R.id.editTextStofmængdeMolarmasse);
        stofmængde = (TextView) findViewById(R.id.textViewStofmængdeResultat);
        beregn = (Button) findViewById(R.id.buttonStofmængdeBeregn);
        beregn.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_stofmaengdeberegner, menu);
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

    @Override
    public void onClick(View v) {
        double m = Double.parseDouble(masse.getText().toString());
        double molar = Double.parseDouble(molarmasse.getText().toString());
        stofmængde.setText("n = "+(m/molar)+" mol");
    }
}
