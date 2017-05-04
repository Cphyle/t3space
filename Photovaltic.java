package space.t3space;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by elk85 on 4/30/2017.
 */

public class Photovaltic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.photovaltic);
        Button a = (Button) findViewById(R.id.goback);
        a.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), ChoosPanel.class);
                startActivityForResult(myIntent, 0);
            }

        });
    }
}
