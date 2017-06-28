package ajaymehta.stringbuilder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // StringBuilder are mutable..the can change..value can be overritten..

    static TextView abc, tvAppend , tvInsert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        abc = (TextView) findViewById(R.id.tv_abc);
        tvAppend = (TextView) findViewById(R.id.tv_apped);
        tvInsert = (TextView) findViewById(R.id.tv_insert);

        new StringBuilderExample().print();
        new StringBuilderExample2().print();
        new StringBuilderExample2().print();
        new InsertExample().print();

    }
}
