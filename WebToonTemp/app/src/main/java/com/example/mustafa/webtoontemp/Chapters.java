package com.example.mustafa.webtoontemp;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


public class Chapters extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bolumler);

        final ListView list= (ListView) findViewById(R.id.lstw);
        list.setAdapter(new Chapters_adapter(this));
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent i=new Intent(Chapters.this,Reader.class);
                Bundle b=new Bundle();
                TextView t1 = (TextView)view.findViewById(R.id.t1);
                TextView t2 = (TextView)view.findViewById(R.id.t2);
                b.putString(list.getItemAtPosition(position).toString(), list.getItemAtPosition(position).toString());
                i.putExtras(b);

                //startActivity(i);//Diğer activity'e geçiş
            }
        });
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_bolumler, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
