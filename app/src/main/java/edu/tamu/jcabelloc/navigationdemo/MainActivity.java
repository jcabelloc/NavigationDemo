package edu.tamu.jcabelloc.navigationdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button goSwipeButton = (Button)findViewById(R.id.GoSwipeButton);

    }

    public void goSwipe(View view) {
        Intent intent = new Intent(getApplicationContext(), SwipeView.class);
        startActivity(intent);
    }
}
