package com.example.musicplayer_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;


import java.util.ArrayList;

public class SongList_Activity extends AppCompatActivity {

    int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_list_);

        Resources res = getResources();
        final String[] SongName = res.getStringArray(R.array.Song_Name);
        final String[] SongArtist = res.getStringArray(R.array.Song_Artist);
        final String[] PosterURL = res.getStringArray(R.array.PosterURL);

        ListView songViewList = findViewById(R.id.song_listView);

        //Creating Array List
        ArrayList<MusicList> musicLists = new ArrayList<>();

        //Adding data to ArrayList
         for (i = 0; i <=9; i++){
             musicLists.add(new MusicList(SongName[i], SongArtist[i], PosterURL[i]));
         }

        //Creating Custom Array Adapter
        MusicListAdapter listAdapter = new MusicListAdapter(SongList_Activity.this,musicLists);
        songViewList.setAdapter(listAdapter);

        songViewList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(SongList_Activity.this,PlaySong_Activity.class);
                    intent.putExtra("MUSIC_NAME", SongName[position]);
                    intent.putExtra("MUSIC_ARTIST", SongArtist[position]);
                    intent.putExtra("POSTER_URL", PosterURL[position]);
                startActivity(intent);
            }
        });
    }
}
