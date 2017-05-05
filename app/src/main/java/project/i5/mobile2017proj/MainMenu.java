package project.i5.mobile2017proj;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import project.i5.mobile2017proj.Map.MapMain;

public class MainMenu extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        findViewById(R.id.button).setOnClickListener(this);
    }
    public void onClick(View v){
        switch(v.getId()){
            case R.id.button:
                startActivity(new Intent(this, MapMain.class));;
        }
    }

}
