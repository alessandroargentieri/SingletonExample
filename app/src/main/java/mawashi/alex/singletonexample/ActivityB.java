package mawashi.alex.singletonexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ActivityB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.b_layout);

        //Show the string value of the singleton
        Toast.makeText(getApplicationContext(),Singleton.getInstance().getString(), Toast.LENGTH_SHORT).show();
        //Change the string value and launch intent to ActivityB
        Singleton.getInstance().setString("Singleton A");
    }

    public void Vai(View v){
        Intent intent = new Intent(getApplicationContext(),ActivityA.class);
        this.startActivity(intent);
        finish();
    }
}
