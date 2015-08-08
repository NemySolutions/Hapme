package sg.nemysolutions.hapme;

/**************** Home Page ******************/
/* This page is to allow users to select whether
* they want to join or create operation.*/

//Key person: Yeekeng and Ming Sheng
/*********************************************/

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        Button bn_create = (Button) findViewById(R.id.bn_create);
        Button bn_join = (Button) findViewById(R.id.bn_join);

        bn_create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, Create.class);
                startActivity(intent);
            }
        });

        bn_join.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, Join.class);
                startActivity(intent);
            }
        });

    }

}
