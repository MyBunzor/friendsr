package com.example.wvand.friendsr;

import android.content.Intent;
import android.content.SharedPreferences;
import android.media.Rating;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.RatingBar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private class GridItemClickListener implements AdapterView.OnItemClickListener {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id){

            // Create intent, pass along clickedfriend
            Friend clickedFriend = (Friend) parent.getItemAtPosition(position);
            Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
            intent.putExtra("clicked_friend", clickedFriend);
            startActivity(intent);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Friend> friends;
        friends = new ArrayList<>();

        // Adding the drawable id
        int drawableIdarya = this.getResources().getIdentifier("arya", "drawable", this.getPackageName());
        int drawableIdcersei = this.getResources().getIdentifier("cersei", "drawable", this.getPackageName());
        int drawableIddaenerys = this.getResources().getIdentifier("daenerys", "drawable", this.getPackageName());
        int drawableIdjaime = this.getResources().getIdentifier("jaime", "drawable", this.getPackageName());
        int drawableIdjon = this.getResources().getIdentifier("jon", "drawable", this.getPackageName());
        int drawableIdjorah = this.getResources().getIdentifier("jorah", "drawable", this.getPackageName());
        int drawableIdmargaery = this.getResources().getIdentifier("margaery", "drawable", this.getPackageName());
        int drawableIdmelisandre = this.getResources().getIdentifier("melisandre", "drawable", this.getPackageName());
        int drawableIdsansa = this.getResources().getIdentifier("sansa", "drawable", this.getPackageName());
        int drawableIdtyrion = this.getResources().getIdentifier("tyrion", "drawable", this.getPackageName());

        // Instantiate Friend objects
        Friend arya = new Friend("Arya", "This is Arya.", drawableIdarya);
        Friend cersei = new Friend("Cersei", "This is Cersei", drawableIdcersei);
        Friend daenerys = new Friend("Daenerys", "This is Daenerys", drawableIddaenerys);
        Friend jaime = new Friend("Jaime", "This is Jaime", drawableIdjaime);
        Friend jon = new Friend("Jon", "This is Jon", drawableIdjon);
        Friend jorah = new Friend("Jorah", "This is Jorah", drawableIdjorah);
        Friend margaery = new Friend("Margaery", "This is Margaery", drawableIdmargaery);
        Friend melisandre = new Friend("Melisandre", "This is Melisandre", drawableIdmelisandre);
        Friend sansa = new Friend("Sansa", "This is Sansa", drawableIdsansa);
        Friend tyrion = new Friend("Tyrion", "This is Tyrion", drawableIdtyrion);

        // Adding friend instances to friends
        friends.add(arya);
        friends.add(cersei);
        friends.add(daenerys);
        friends.add(jaime);
        friends.add(jon);
        friends.add(jorah);
        friends.add(margaery);
        friends.add(melisandre);
        friends.add(sansa);
        friends.add(tyrion);

        // Creating friendsadapter
        FriendsAdapter adapter = new FriendsAdapter(this,R.layout.grid_item, friends);

        // Set adapter on homescreen
        GridView homescreen = findViewById(R.id.homescreen);
        homescreen.setAdapter(adapter);
        homescreen.setOnItemClickListener(new GridItemClickListener());
    }
}
