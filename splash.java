package space.t3space;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by elk85 on 4/29/2017.
 */

public class splash extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        int secondsDelayd = 1;
        new Handler().postDelayed(new Runnable() {
            public void run (){
                startActivity(new Intent(splash.this, MainActivity.class));
                finish();
            }
        }, secondsDelayd * 2000);
    }
}
