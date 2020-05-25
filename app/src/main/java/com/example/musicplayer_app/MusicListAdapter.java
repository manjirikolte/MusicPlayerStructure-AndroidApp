package com.example.musicplayer_app;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class MusicListAdapter extends ArrayAdapter<MusicList> {
    public MusicListAdapter(Activity context, ArrayList<MusicList> musicLists) {
        super(context, 0, musicLists);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.design_listview, parent, false);
        }

        MusicList currentMusicList = getItem(position);

        TextView nameTextView =  listItemView.findViewById(R.id.song_name);
        nameTextView.setText(currentMusicList.getSongName());

        TextView numberTextView =  listItemView.findViewById(R.id.song_artist);
        numberTextView.setText(currentMusicList.getSongArtist());


        ImageView imageView =  listItemView.findViewById(R.id.song_img);
        Picasso.get().load(currentMusicList.getImageResourceId()).into(imageView);


        return listItemView;
    }
}
