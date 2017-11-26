package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("Red","Le Rouge",R.drawable.color_red));
        words.add(new Word("Yellow","Le Jaune",R.drawable.color_dusty_yellow));
        words.add(new Word("Blue","Le Bleu",R.drawable.color_red));
        words.add(new Word("Black","Le Noir",R.drawable.color_black));
        words.add(new Word("White","Le Blanc",R.drawable.color_white));
        words.add(new Word("Green","Le Verte",R.drawable.color_green));
        words.add(new Word("Orange","Le Orange",R.drawable.color_red));
        words.add(new Word("Grey","Le Gris",R.drawable.color_gray));
        words.add(new Word("Pink","Le Rose",R.drawable.color_brown));
        words.add(new Word("Silver","Le Argent",R.drawable.color_red));
        words.add(new Word("Gold","Le Or",R.drawable.color_mustard_yellow));
        words.add(new Word("Brown","Le Marron",R.drawable.color_brown));
        words.add(new Word("Purple","Le Pourpre",R.drawable.color_red));
        words.add(new Word("Violet","Le Violet",R.drawable.color_red));
        WordAdapter wordAdapter = new WordAdapter(this,words);

        LinearLayout linearLayout = (LinearLayout)findViewById(R.id.activity_main4);
        ListView listView = new ListView(this);
        assert linearLayout != null;
        linearLayout.addView(listView);
        listView.setAdapter(wordAdapter);
    }
}
