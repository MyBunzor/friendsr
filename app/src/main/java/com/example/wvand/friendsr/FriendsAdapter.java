package com.example.wvand.friendsr;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class FriendsAdapter extends ArrayAdapter<Friend> {

    // Declaring friends as an arraylist, so we can fill it with objects in constructor below
    ArrayList<Friend> friends;

    public FriendsAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Friend> objects) {
        super(context, resource, objects);
        this.friends = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.grid_item, parent, false);
        }

        // Get access to layout's views
        ImageView friendimage = convertView.findViewById(R.id.friendimage);
        TextView friendname = convertView.findViewById(R.id.friendname);
        //TextView friendbio = convertView.findViewById(R.id.friendbio);

        // Getting data from friends list
        int drawable = friends.get(position).getDrawableId();
        String name = friends.get(position).getName();
        //String bio = friends.get(position).getBio();

        // Use data to fill the layout's views
        friendname.setText(name);
        //friendbio.setText(bio);
        friendimage.setImageResource(drawable);

        return convertView;
    }
}
