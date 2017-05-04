package space.t3space;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


/**
 * Created by elk85 on 4/29/2017.
 */

public class Personal2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.personal_2);

        Button a = (Button) findViewById(R.id.Calculate);
        a.setOnClickListener(new android.view.View.OnClickListener(){
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), Finnal.class);
                startActivityForResult(myIntent, 0);
            }

        });

        EditText bedroom = (EditText) findViewById(R.id.Number_of_Bedrooms);
            Editable numbedroom = bedroom.getText();

        int numberoom = Integer.parseInt("0123456789");

//            EditText bathroom = (EditText) findViewById(R.id.Number_of_Bathrooms);
//            int bathroomnum = Integer.parseInt(bathroom.getText().toString());
//
//            EditText refridgerators = (EditText) findViewById(R.id.Number_of_Refrigerators);
//            int refridgeratornum = Integer.parseInt(refridgerators.getText().toString());
//
//            EditText peopleinhouse = (EditText) findViewById(R.id.peopleinhouse);
//            int housepeople = Integer.parseInt(peopleinhouse.getText().toString());
//
//            EditText roofsize = (EditText) findViewById(R.id.Number_of_Roof_Space);
//            int sizeofroof = Integer.parseInt(roofsize.getText().toString());
//
//            EditText teslalife = (EditText) findViewById(R.id.Tesla_life);
//            int teslacar = Integer.parseInt(teslalife.getText().toString());
//
//
//            double tbed = bedroomnum * 4.8;
//            double tbath = bathroomnum * 1.7;
//            double trefridg = refridgeratornum * 1.9;
//            double thouse = housepeople * 101.5;
//            double twater = thouse / 50;
//            double twaterp = twater * 16.5;
//            int tesla = teslacar * 85;
//            double tKWH = tbed + tbath + trefridg + twaterp + tesla;
        }
    }


