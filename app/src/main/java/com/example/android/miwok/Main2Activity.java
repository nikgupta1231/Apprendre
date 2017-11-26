package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.ListView;


import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("One", "Un ", R.drawable.number_one));
        words.add(new Word("Two", "Deux", R.drawable.number_two));
        words.add(new Word("Three", "Trois", R.drawable.number_three));
        words.add(new Word("Four", "Quatre", R.drawable.number_four));
        words.add(new Word("Five", "Cinq", R.drawable.number_five));
        words.add(new Word("Six", "Six", R.drawable.number_six));
        words.add(new Word("Seven", "Sept", R.drawable.number_seven));
        words.add(new Word("Eight", "Huit", R.drawable.number_eight));
        words.add(new Word("Nine", "Neuf", R.drawable.number_nine));
        words.add(new Word("Ten", "Dix", R.drawable.number_ten));

        WordAdapter wordAdapter = new WordAdapter(this, words);

        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.activity_main2);
        ListView listView = new ListView(this);
        assert linearLayout != null;
        linearLayout.addView(listView);
        listView.setAdapter(wordAdapter);
    }

}