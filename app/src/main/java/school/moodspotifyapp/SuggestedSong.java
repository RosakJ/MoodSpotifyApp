package school.moodspotifyapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class SuggestedSong extends AppCompatActivity {
    Button homeSong;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suggestedsong);
        addListenerOnButton();
    }
    public void addListenerOnButton() {
        final SuggestedSong context = this;
        homeSong = (Button) findViewById(R.id.homeSong);
        homeSong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, MainActivity.class);
                    startActivity(intent);
            }
        });
    }
}