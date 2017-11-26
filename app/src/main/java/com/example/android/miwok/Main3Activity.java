package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("Father","Le pere",R.drawable.family_father));
        words.add(new Word("Mother","Le mere",R.drawable.family_mother));
        words.add(new Word("Son","Le fils",R.drawable.family_son));
        words.add(new Word("Daughter","Le fille",R.drawable.family_daughter));
        words.add(new Word("Brother","Le frere",R.drawable.family_younger_brother));
        words.add(new Word("Sister","Le soeur",R.drawable.family_younger_sister));
        words.add(new Word("Husband","L'époux",R.drawable.family_older_brother));
        words.add(new Word("Wife","L'épouse",R.drawable.family_older_sister));
        words.add(new Word("Uncle","L'oncle",R.drawable.family_father));
        words.add(new Word("Aunty","La tante",R.drawable.family_mother));
        words.add(new Word("Cousin","Le Or",R.drawable.family_son));
        words.add(new Word("Grand-Father","Le grand-pere",R.drawable.family_grandfather));
        words.add(new Word("Grant-Mother","La grand-mere ",R.drawable.family_grandmother));
        words.add(new Word("Mother-in-Law","La belle-mere",R.drawable.family_grandmother));
        words.add(new Word("Father-in-Law","Le beau-pere",R.drawable.family_grandfather));
        words.add(new Word("Nephew","Le neveu",R.drawable.family_son));
        words.add(new Word("Niece","La niece",R.drawable.family_daughter));
        words.add(new Word("Friend","L'ami(Male)",R.drawable.family_son));
        words.add(new Word("Boy-friend","Le petit ami",R.drawable.family_father));
        words.add(new Word("Girl-friend","la petite amine",R.drawable.family_mother));
        WordAdapter wordAdapter = new WordAdapter(this,words);

        LinearLayout linearLayout = (LinearLayout)findViewById(R.id.activity_main3);
        ListView listView = new ListView(this);
        assert linearLayout != null;
        linearLayout.addView(listView);
        listView.setAdapter(wordAdapter);
    }
}
