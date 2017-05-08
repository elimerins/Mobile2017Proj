package project.i5.mobile2017proj.Board;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DateFormat;
import java.util.Date;
import project.i5.mobile2017proj.R;

/**
 * Created by 지원오 on 2017-05-05.
 */
public class BoardRegister extends AppCompatActivity {
    Button registerBtn,cancelBtn;
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_board_register);
        setTitle("게시글 등록");
        registerBtn=(Button)findViewById(R.id.registerBtn);
        cancelBtn=(Button)findViewById(R.id.cancelBtn);
        text=(TextView)findViewById(R.id.username);
        text.setText("사용자 이름");
        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(BoardRegister.this, BoardMain.class);
                startActivity(intent);
                String date = DateFormat.getDateTimeInstance().format(new Date());
                Toast toast=Toast.makeText(BoardRegister.this,date+  "등록 되었습니다",Toast.LENGTH_SHORT);
                toast.show();
            }
        });
        cancelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(BoardRegister.this, BoardMain.class);
                startActivity(intent);
                Toast toast=Toast.makeText(BoardRegister.this,"취소 되었습니다",Toast.LENGTH_SHORT);
                toast.show();
            }
        });

    }
}
