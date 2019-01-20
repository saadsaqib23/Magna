package com.example.saad.magna19;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Custom_Comp extends ArrayAdapter<String> {

    private String[] comp;
    private Integer[] imgid;
    private Context context;


    public String[] getComp() {
        return comp;
    }

    public Integer[] getImgid() {
        return imgid;
    }

    public Custom_Comp(Context context, String[] comp, Integer[] imgid) {
        super(context, R.layout.comp_row_item,comp);

   this.context = context;
   this.comp = comp;
   this.imgid = imgid;

    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View r = convertView;
        ViewHolder viewHolder;
        if(r==null)
        {
            LayoutInflater layoutInflater = LayoutInflater.from(getContext());
            r = layoutInflater.inflate(R.layout.comp_row_item,parent,false);
            viewHolder = new ViewHolder(r);
            r.setTag(viewHolder);
        }
        else
        {
            viewHolder = (ViewHolder) r.getTag();
        }

        viewHolder.linearLayout.setBackgroundResource(imgid[position]);
        viewHolder.textView.setText(comp[position]);

        return r;
    }

    class ViewHolder{
        LinearLayout linearLayout;
        TextView textView;

        ViewHolder(View v){
            linearLayout = v.findViewById(R.id.complayout);
            textView = v.findViewById(R.id.competition);
        }

    }

}
