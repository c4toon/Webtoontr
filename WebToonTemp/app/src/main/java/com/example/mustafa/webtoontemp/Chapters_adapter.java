package com.example.mustafa.webtoontemp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;


class Chapters_prop {
    String chapterName;
    String chapterNumber;
    String definition;

    Chapters_prop(String name, String number, String definition){
        this.chapterName=name;
        this.chapterNumber=number;
        this.definition=definition;
    }
}

public class Chapters_adapter extends BaseAdapter {

    public String[] name={"iphone","samsung","general mobile","nokia","motorola","lg","piranha"};
    public String[] number={"1","2","3","4","5","6","7"};
    public String[] definition={"phone","phone","phone","phone","phone","phone","phone"};
    Context context;
    ArrayList<Chapters_prop> list;


    Chapters_adapter(Context c){
        context=c;
        list=new ArrayList<>();
        for(int i=0;i<name.length;i++){
            //list.add(new Chapters_prop(obj.name[i],obj.number[i],obj.definition[i]));
            list.add(new Chapters_prop(name[i],number[i],definition[i]));
        }
    }


    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater= (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);

        View row=inflater.inflate(R.layout.Chapters_row,parent,false);
        TextView number=(TextView) row.findViewById(R.id.t1);
        TextView name= (TextView) row.findViewById(R.id.t2);
        TextView definition=(TextView) row.findViewById(R.id.t3);

        Chapters_prop temp=list.get(position);
        number.setText(temp.chapterNumber);
        name.setText(temp.chapterName);
        definition.setText(temp.definition);

        return row;
    }
}
