package id.putraprima.marketplacelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void user(View view){
        Intent i = new Intent(this,RegisterActivity.class);
        startActivity(i);
    }

    public void sprovider(View view) {
        Intent i = new Intent(this, LoginActivity.class);
        startActivity(i);
    }

    public void guest(View view) {
        Intent i = new Intent(this,ProfileActivity.class);
        startActivity(i);
    }
}
