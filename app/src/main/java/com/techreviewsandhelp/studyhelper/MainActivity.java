package com.techreviewsandhelp.studyhelper;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView lv;
    private ArrayList <String> strArr;
    private Context c;
    private ArrayAdapter<String> adapter;
    private FloatingActionButton fab;
    private LinearLayout editqa;
    private TextView question, answer;
    private EditText edquestion, edanswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ID
        lv = (ListView)findViewById(R.id.listView);
        fab = (FloatingActionButton)findViewById(R.id.fab);
        editqa = (LinearLayout)findViewById(R.id.editqa);
        question = (TextView)findViewById(R.id.question);
        answer = (TextView)findViewById(R.id.answer);
        edquestion = (EditText)findViewById(R.id.etquestion);
        edanswer = (EditText)findViewById(R.id.etanswer);

        //making the list dynamic
        strArr = new ArrayList<String>();
        for (int i = 0; i < 2; i++){
            strArr.add("Row:"+i);
        }
        adapter = new ArrayAdapter<String>(c, android.R.layout.simple_list_item_1, strArr);
        lv.setAdapter(adapter);



        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
