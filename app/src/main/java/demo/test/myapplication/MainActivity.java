package demo.test.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView agreeTv;
    TextView opposeTv;
    int agreeCount = 167;
    int opposeCount= 16;
    float agreeRate;
    float opposeRate;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        agreeTv = (TextView)findViewById(R.id.agree);
        opposeTv = (TextView)findViewById(R.id.oppose);
        agreeRate = (float)agreeCount/(agreeCount + opposeCount);
        opposeRate = (float)opposeCount/(agreeCount + opposeCount);

        agreeTv.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT, 1- agreeRate));
        opposeTv.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT, 1 - opposeRate));


    }









}
