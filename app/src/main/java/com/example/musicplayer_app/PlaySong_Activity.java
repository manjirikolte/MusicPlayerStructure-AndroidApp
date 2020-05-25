package com.example.musicplayer_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class PlaySong_Activity extends AppCompatActivity {

    TextView name_textView, artist_textView;
    ImageView poster_img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_song_);

        name_textView = findViewById(R.id.name_textView);
        artist_textView = findViewById(R.id.artist_textView);
        poster_img = findViewById(R.id.poster_img);

        Intent intent = getIntent();
        String SongName = intent.getStringExtra("MUSIC_NAME");
        String SongArtist = intent.getStringExtra("MUSIC_ARTIST");
        String PosterURL = intent.getStringExtra("POSTER_URL");

        name_textView.setText(SongName);
        artist_textView.setText(SongArtist);
        Picasso.get().load(PosterURL).into(poster_img);
    }
}
