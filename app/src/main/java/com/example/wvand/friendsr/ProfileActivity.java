package com.example.wvand.friendsr;

import android.content.Intent;
import android.content.SharedPreferences;
import android.media.Rating;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    private class saveRating implements RatingBar.OnRatingBarChangeListener {

        // Get friend that user clicked on, to use friends name which we used as key
        SharedPreferences.Editor editor = getSharedPreferences("settings", MODE_PRIVATE).edit();
        Intent intent = getIntent();
        Friend retrievedFriend = (Friend) intent.getSerializableExtra("clicked_friend");
        String friendName = retrievedFriend.getName();

        @Override

        // When user clicks a friend, a float is put in clickedrating
        public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
            editor.putFloat(friendName, rating);
            editor.apply();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        // Get intent, so the user is directed to right activity, get clicked friend
        Intent intent = getIntent();
        Friend retrievedFriend = (Friend) intent.getSerializableExtra("clicked_friend");

        // Get access to views in layout that we want to fill
        ImageView photo = findViewById(R.id.photo);
        TextView name = findViewById(R.id.name);
        TextView bio = findViewById(R.id.bio);

        // Get clicked friend's info
        int photoId = retrievedFriend.getDrawableId();
        String friendName = retrievedFriend.getName();
        String friendBio = retrievedFriend.getBio();

        // Set the views in the layout with info above
        photo.setImageResource(photoId);
        name.setText(friendName);
        bio.setText(friendBio);

        // Set ratingbar on
        RatingBar ratingBar2  = findViewById(R.id.ratingBar);
        ratingBar2.setOnRatingBarChangeListener(new saveRating());

        // Put rating (float) in StoredFloat with friends' name as key
        SharedPreferences prefs = getSharedPreferences("settings", MODE_PRIVATE);
        Float StoredFloat = prefs.getFloat(friendName, 0.0f);

        if (StoredFloat != 0.0f) {

            // User rated a friend, therefor set ratingbar
            ratingBar2.setRating(StoredFloat);
        }
    }

}
