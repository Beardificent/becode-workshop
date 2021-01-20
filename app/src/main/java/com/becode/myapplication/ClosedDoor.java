package com.becode.myapplication;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class ClosedDoor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_closed_door);

        Button doorbell = (Button) findViewById(R.id.doorbell);
        doorbell.setText("");


    }

    public void ringBell(View view){
       Intent openDoor = new Intent(this, OpenDoor.class);
       startActivity(openDoor);
    }

}