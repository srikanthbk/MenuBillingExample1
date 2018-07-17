package com.sribilling.menubillingexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MenuGroupActivity extends AppCompatActivity implements View.OnClickListener {
    ImageButton simpleImageButton1,simpleImageButton2,simpleImageButton3,simpleImageButton4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_group);
        declareAllIds();
    }
    private void declareAllIds(){
        simpleImageButton1=(ImageButton)findViewById(R.id.simpleImageButton1);
        simpleImageButton2=(ImageButton)findViewById(R.id.simpleImageButton2);
        simpleImageButton3=(ImageButton)findViewById(R.id.simpleImageButton3);
        simpleImageButton4=(ImageButton)findViewById(R.id.simpleImageButton4);
        simpleImageButton1.setOnClickListener(this);
        simpleImageButton2.setOnClickListener(this);
        simpleImageButton3.setOnClickListener(this);
        simpleImageButton4.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.simpleImageButton1:
                Intent i=new Intent(this,ItemListActivity.class);
                startActivity(i);
                break;
            case R.id.simpleImageButton2:
                break;
            case R.id.simpleImageButton3:
                break;
            case R.id.simpleImageButton4:
                break;
        }
    }
}
