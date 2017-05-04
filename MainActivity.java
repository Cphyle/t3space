package space.t3space;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    Button a = (Button) findViewById(R.id.personal);
    a.setOnClickListener(new View.OnClickListener(){
        public void onClick(View v) {
            Intent myIntent = new Intent(v.getContext(), Personal.class);
            startActivityForResult(myIntent, 0);
        }

        });

    Button b = (Button) findViewById(R.id.business);
    b.setOnClickListener(new View.OnClickListener(){
        public void onClick (View v) {
            Intent business = new Intent(v.getContext(), Business.class);
            startActivityForResult(business, 0);
        }

        });
    Button c = (Button) findViewById(R.id.setting);
        c.setOnClickListener (new View.OnClickListener () {
            public void onClick (View v){
                Intent settings = new Intent(v.getContext(),cog1.class);
                startActivityForResult(settings, 0);
            }
            });
}
}


