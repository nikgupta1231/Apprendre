package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;

public class Main5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("Hello.","Bonjour."));
        words.add(new Word("My Name Is...","Je m'appelle..."));
        words.add(new Word("What is your name?","Comment vous appelezvous?"));
        words.add(new Word("Plaese speak slowly.","Parlez lentement."));
        words.add(new Word("I dont understand.","Je ne comprends  pas."));
        words.add(new Word("Thank you.","Merci."));
        words.add(new Word("You're welcome.","De rien."));
        words.add(new Word("Excuse Me.","Excusez-moi."));
        words.add(new Word("I love you.","Je t'aime."));
        words.add(new Word("I want to be with you.","Je veux etre avec toi."));
        words.add(new Word("How are you?","Comment allez-vous?"));
        words.add(new Word("I am from...","Je Suis de..."));
        words.add(new Word("L would like...","Je voudrais..."));
        words.add(new Word("Bye!","Salut!"));
        words.add(new Word("Please","S'll vous plait"));
        WordAdapter wordAdapter = new WordAdapter(this,words);

        LinearLayout linearLayout = (LinearLayout)findViewById(R.id.activity_main5);
        ListView listView = new ListView(this);
        assert linearLayout != null;
        linearLayout.addView(listView);
        listView.setAdapter(wordAdapter);
    }
}
