package com.example.photogallery;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.photogallery.model.Photo;

import java.util.ArrayList;

public class PhotoGallery extends AppCompatActivity {
    ArrayList<Photo> photo ;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gallery_activity);
        photo = new ArrayList<>();
        setPhoto();
        PhotoAdapter adapter = new PhotoAdapter(photo,this);
        recyclerView = findViewById(R.id.list);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 3));
    }
    void setPhoto(){
        for (int i = 0; i <20 ; i++) {
            photo.add(new Photo());
        }
    }
}