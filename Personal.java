package space.t3space;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Personal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.personal);

    Button c = (Button) findViewById(R.id.Home);
        c.setOnClickListener (new View.OnClickListener () {
                                  public void onClick(View v) {
                                      Intent settings = new Intent(v.getContext(), Personal2.class);
                                      startActivityForResult(settings, 0);
                                  }
                              });


        Button a = (Button) findViewById(R.id.Car);
        a.setOnClickListener (new View.OnClickListener (){
            public void onClick (View v) {
                Intent hope = new Intent(v.getContext(), Car.class);
                startActivityForResult(hope, 0);
            }
        });
        Button b = (Button) findViewById(R.id.Phone);
        b.setOnClickListener(new View.OnClickListener(){
            public void onClick (View v) {
                Intent pray = new Intent (v.getContext(),Phone.class );
                startActivityForResult(pray,0);
            }
        });
    }
    }

