package com.example.android.rhythm;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<song_info> {
    public SongAdapter(Activity context, ArrayList<song_info> songs) {
        super(context, 0, songs);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View gridItemView = convertView;
        if (gridItemView == null) {
            gridItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.activity_home, parent, false);
        }
        song_info currentSong = getItem(position);

        TextView songNameTextView = (TextView) gridItemView.findViewById(R.id.song_name);
        assert currentSong != null;
        songNameTextView.setText(currentSong.getmSongName());

        TextView artistNameTextView = (TextView) gridItemView.findViewById(R.id.artist_name);
        artistNameTextView.setText(currentSong.getmArtistName());

        TextView albumNameTextView = (TextView) gridItemView.findViewById(R.id.album_name);
        albumNameTextView.setText(currentSong.getmAlbumName());
        return gridItemView;
    }
}
