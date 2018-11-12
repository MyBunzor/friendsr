package com.example.wvand.friendsr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private class GridItemClickListener implements AdapterView.OnItemClickListener {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            System.out.println("Sup duder");
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Friend> friends = new ArrayList<>();
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
        Friend arya = new Friend("arya", "This is arya.", drawableIdarya);
        Friend cersei = new Friend("cersei", "This is cersei", drawableIdcersei);
        Friend daenerys = new Friend("daenerys", "This is daenerys", drawableIddaenerys);
        Friend jaime = new Friend("jaime", "This is jaime", drawableIdjaime);
        Friend jon = new Friend("jon", "This is jon", drawableIdjon);
        Friend jorah = new Friend("jorah", "This is jorah", drawableIdjorah);
        Friend margaery = new Friend("margaery", "This is margaery", drawableIdmargaery);
        Friend melisandre = new Friend("melisandre", "this is melisandre", drawableIdmelisandre);
        Friend sansa = new Friend("sansa", "This is sansa", drawableIdsansa);
        Friend tyrion = new Friend("tyrion", "This is tyrion", drawableIdtyrion);

        // Adding friend instantions to friends
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

        FriendsAdapter adapter = new FriendsAdapter(this,R.layout.grid_item, friends);

        GridView homescreen = findViewById(R.id.homescreen);
        homescreen.setAdapter(adapter);
        homescreen.setOnItemClickListener(new GridItemClickListener());
    }


}
