package project.i5.mobile2017proj;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Intro extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
        findViewById(R.id.signin).setOnClickListener(this);
        findViewById(R.id.signup).setOnClickListener(this);
    } // Intro of App
    public void onClick(View v){
        switch(v.getId()){
            case R.id.signin:
                startActivity(new Intent(this, MainMenu.class));
                break;
            case R.id.signup:
                startActivity(new Intent(this, Signup.class));
                break;
        }
    }
}
