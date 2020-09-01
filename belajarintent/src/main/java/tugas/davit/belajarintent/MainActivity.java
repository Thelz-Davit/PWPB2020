package tugas.davit.belajarintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button explicitintent;
    Button explicitintent2;
    Button implicitintent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        explicitintent = (Button)findViewById(R.id.explicitintent);
        explicitintent.setOnClickListener(this);
        implicitintent = (Button)findViewById(R.id.implicitintent);
        implicitintent.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.explicitintent:
                Intent explicit = new Intent(MainActivity.this, IntentActivity.class);
                startActivity(explicit);
                break;
            case R.id.implicitintent:
            Intent implicit = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.w3schools.com/"));
                startActivity(implicit);
                break;
            case R.id.explicitintent2:
                Intent explicit2 = new Intent(MainActivity.this, IntentActivity2.class);
                startActivity(explicit2);
            default:
                break;
        }
    }
}
