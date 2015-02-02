package com.example.mustafa.webtoontemp;


import android.app.Activity;
import android.graphics.Point;
import android.os.Bundle;
import android.view.Display;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;


public class Reader extends Activity {


    private ListView listview=null;
    private String [] imageUrls={"http://www.webtoontr.com/Files/w/1/22/1.jpg",
            "http://www.webtoontr.com/Files/w/1/22/2.jpg",
            "http://www.webtoontr.com/Files/w/1/22/3.jpg",
            "http://www.webtoontr.com/Files/w/1/22/4.jpg",
            "http://www.webtoontr.com/Files/w/1/22/5.jpg",
            "http://www.webtoontr.com/Files/w/1/22/6.jpg",
            "http://www.webtoontr.com/Files/w/1/22/7.jpg",
            "http://www.webtoontr.com/Files/w/1/22/8.jpg",
            "http://www.webtoontr.com/Files/w/1/22/9.jpg",
            "http://www.webtoontr.com/Files/w/1/22/10.jpg",
            "http://www.webtoontr.com/Files/w/1/22/11.jpg",
            "http://www.webtoontr.com/Files/w/1/22/12.jpg",
            "http://www.webtoontr.com/Files/w/1/22/13.jpg",
            "http://www.webtoontr.com/Files/w/1/22/14.jpg",
            "http://www.webtoontr.com/Files/w/1/22/15.jpg",
            "http://www.webtoontr.com/Files/w/1/22/16.jpg",
            "http://www.webtoontr.com/Files/w/1/22/17.jpg",
            "http://www.webtoontr.com/Files/w/1/22/18.jpg",
            "http://www.webtoontr.com/Files/w/1/22/19.jpg",
            "http://www.webtoontr.com/Files/w/1/22/20.jpg"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reader);

        Display display = getWindowManager().getDefaultDisplay();
        final Point size = new Point();
        display.getSize(size);
        listview=(ListView)findViewById(R.id.listView_r);
        Reader_adapter adapter=new Reader_adapter(Reader.this, imageUrls,size.x,size.y);
        listview.setAdapter(adapter);

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_reader, menu);
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
