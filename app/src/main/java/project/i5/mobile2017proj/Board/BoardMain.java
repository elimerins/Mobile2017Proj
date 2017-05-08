package project.i5.mobile2017proj.Board;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import project.i5.mobile2017proj.R;


public class BoardMain extends AppCompatActivity {
    int upCount;
    int hits;
    ListView ListView;
    Button addBtn;
    final String [] LIST_MENU={"1","2","3","4","5","6","7","8","9"};
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        menu.add(0, 1, 0, "사용자 게시판");
        menu.add(0, 2, 0, "공공기관 게시판");
        return true;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_board_main);
        setTitle("사용자 게시판");
        ListView=(ListView)findViewById(R.id.List);
        addBtn=(Button)findViewById(R.id.addBtn);
        View header = getLayoutInflater().inflate(R.layout.activity_board_listview_header,null,false) ;
        ListView.addHeaderView(header);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, LIST_MENU) ;
        ListView.setAdapter(adapter);
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(BoardMain.this, BoardRegister.class);
                startActivity(intent);
            }
        });




}
}