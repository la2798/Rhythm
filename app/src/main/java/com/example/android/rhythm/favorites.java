package com.example.android.rhythm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.GridView;

import java.util.ArrayList;

public class favorites extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grid_list);

        ArrayList<song_info> songs = new ArrayList<song_info>();
        songs.add(new song_info("Song 1", "Artist 1", "Album 1", 4.00));
        songs.add(new song_info("Song 2", "Artist 2", "Album 2", 4.50));
        songs.add(new song_info("Song 3", "Artist 3", "Album 3", 4.10));
        songs.add(new song_info("Song 4", "Artist 4", "Album 4", 4.00));
        songs.add(new song_info("Song 5", "Artist 5", "Album 5", 5.00));
        songs.add(new song_info("Song 6", "Artist 6", "Album 6", 4.07));
        SongAdapter adapter = new SongAdapter(this, songs);
        GridView gridView = (GridView) findViewById(R.id.grid);
        gridView.setAdapter(adapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.option_fav, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent;
        switch (item.getItemId()) {
            case R.id.action_now_playing:
                intent = new Intent(favorites.this, my_music.class);
                startActivity(intent);
                return true;
            case R.id.action_home:
                intent = new Intent(favorites.this, home.class);
                startActivity(intent);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
