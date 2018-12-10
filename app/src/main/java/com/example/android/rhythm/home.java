package com.example.android.rhythm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grid_list);

        ArrayList<song_info> songs = new ArrayList<song_info>();
        songs.add(new song_info("Song 1","Artist 1","Album 1",4.00));
        songs.add(new song_info("Song 2","Artist 2","Album 2",4.50));
        songs.add(new song_info("Song 3","Artist 3","Album 3",4.10));
        songs.add(new song_info("Song 4","Artist 4","Album 4",4.00));
        songs.add(new song_info("Song 5","Artist 5","Album 5",5.00));
        songs.add(new song_info("Song 6","Artist 6","Album 6",4.07));
        songs.add(new song_info("Song 7","Artist 7","Album 7",4.50));
        songs.add(new song_info("Song 8","Artist 8","Album 8",5.10));
        songs.add(new song_info("Song 9","Artist 9","Album 9",4.40));
        songs.add(new song_info("Song 10","Artist 10","Album 10",5.50));
        songs.add(new song_info("Song 11","Artist 11","Album 11",4.30));
        songs.add(new song_info("Song 12","Artist 12","Album 12",4.00));


        SongAdapter adapter = new SongAdapter(this,songs);

        GridView gridView = (GridView)findViewById(R.id.grid);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent;
                intent = new Intent(home.this,my_music.class);
                startActivity(intent);
            }
        });
        gridView.setAdapter(adapter);


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu options_main from the res/menu/menu_catalog.xml file.
        // This adds menu items to the app bar.
        getMenuInflater().inflate(R.menu.options_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent;
        switch (item.getItemId()) {
            // Respond to a click on the "Delete all entries" menu option
            case R.id.action_now_playing:
                intent = new Intent(home.this,my_music.class);
                startActivity(intent);
                return true;
            case R.id.action_favorites:
                intent = new Intent(home.this,favorites.class);
                startActivity(intent);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
