package com.example.wvand.friendsr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Friend> friends = new ArrayList<>();
        friends = new ArrayList<>();

        // Adding the drawable id
        int drawableIdarya = this.getResources().getIdentifier("arya", "id", this.getPackageName());
        int drawableIdcersei = this.getResources().getIdentifier("cersei", "id", this.getPackageName());
        int drawableIddaenerys = this.getResources().getIdentifier("daenerys", "id", this.getPackageName());
        int drawableIdjaime = this.getResources().getIdentifier("jaime", "id", this.getPackageName());
        int drawableIdjon = this.getResources().getIdentifier("jon", "id", this.getPackageName());
        int drawableIdjorah = this.getResources().getIdentifier("jorah", "id", this.getPackageName());
        int drawableIdmargaery = this.getResources().getIdentifier("margaery", "id", this.getPackageName());
        int drawableIdmelisandre = this.getResources().getIdentifier("melisandre", "id", this.getPackageName());
        int drawableIdsansa = this.getResources().getIdentifier("sansa", "id", this.getPackageName());
        int drawableIdtyrion = this.getResources().getIdentifier("tyrion", "id", this.getPackageName());

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
    }

}
