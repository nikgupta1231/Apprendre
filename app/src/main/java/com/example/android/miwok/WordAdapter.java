package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;


class WordAdapter extends ArrayAdapter<Word> {

    WordAdapter(Context context, ArrayList<Word> wordArrayList) {

        super(context, 0, wordArrayList);

    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        //this.context=context;
        //layoutInflater=LayoutInflater.from(context);
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.custom_list, parent,false);

        Word word = getItem(position);
        TextView textView1 = (TextView) convertView.findViewById(R.id.wordFrench);
        assert word != null;
        textView1.setText(word.getFrenchTranslation());

        TextView textView2 = (TextView) convertView.findViewById(R.id.wordEnglish);
        textView2.setText(word.getDefaultTranslation());

        LinearLayout linearLayout = (LinearLayout) convertView.findViewById(R.id.linearLayout);
        linearLayout.setBackgroundColor(16616969);

        ImageView imageView = (ImageView) convertView.findViewById(R.id.imageView);

        if(word.getImageResourceId()!=-1) {
            imageView.setImageResource(word.getImageResourceId());
        }
        else{
            imageView.setVisibility(View.GONE);
        }


        return convertView;

    }

}
