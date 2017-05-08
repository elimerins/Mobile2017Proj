package project.i5.mobile2017proj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import project.i5.mobile2017proj.Board.BoardMain;

public class Intro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button btn;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
        btn=(Button)findViewById(R.id.page);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intro.this, BoardMain.class);
                startActivity(intent);
            }
        });
    } // Intro of App
}
