package com.example.mustafa.webtoontemp;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;


public class Reader_adapter extends BaseAdapter {

        private String imageurl[]=null;
        private Context context=null;
        int x;
        int y;

        Reader_adapter(Activity activity, String[] imageurl,int x,int y)
        {
            this.context=activity;
            this.imageurl=imageurl;
            this.x=x;
            this.y=y;
        }

        @Override
        public int getCount() {
            return imageurl.length;
        }

        @Override
        public Object getItem(int arg0) {
            return arg0;
        }

        @Override
        public long getItemId(int arg0) {
            return arg0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            View view = convertView;
            final ViewHolder holder;

            if (convertView == null) {
                view = ((Activity) context).getLayoutInflater().inflate(R.layout.Reader_row, parent, false);
                holder = new ViewHolder();
                holder.image = (ImageView) view.findViewById(R.id.satir_img);
                view.setTag(holder);
            } else {
                holder = (ViewHolder) view.getTag();
            }

            Picasso.with(this.context)
                    .load(imageurl[position])
                    .resize(x,y)
                    .placeholder(R.drawable.ic_launcher)
                    .into(holder.image);

            return view;
        }

        public class ViewHolder {
            public ImageView image;
        }
}