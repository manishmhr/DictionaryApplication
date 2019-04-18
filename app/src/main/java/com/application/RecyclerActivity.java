package com.application;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import adapter.ContactsAdapter;
import model.Contacts;

public class RecyclerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);


        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        //Create a list of Contact
        List<Contacts> contactsList = new ArrayList<>();
        contactsList.add(new Contacts("Mr fox","9855555555",R.drawable.fox));
        contactsList.add(new Contacts("Manish","9866666666",R.drawable.man));
        contactsList.add(new Contacts("Mr Bear","9888888888",R.drawable.mrbear));
        contactsList.add(new Contacts("Skull","no phone",R.drawable.mrskull));
        contactsList.add(new Contacts("Penguin","no phone",R.drawable.penguin));
        contactsList.add(new Contacts("Pikachu","no phone",R.drawable.pikachu));
        contactsList.add(new Contacts("Rabbit","no phone",R.drawable.rabbit));
        contactsList.add(new Contacts("Storm Trooper","no phone",R.drawable.trooper));
        contactsList.add(new Contacts("Unicorn","no phone",R.drawable.unicorn));
        contactsList.add(new Contacts("saugat Malla","9855555555",R.drawable.saugat));
        contactsList.add(new Contacts("Bhuwan KC","9866666666",R.drawable.bhuwan));
        contactsList.add(new Contacts("Rajesh Dai","9888888888",R.drawable.rajesh));
        contactsList.add(new Contacts("Dayahang Rai","no phone",R.drawable.dahayang));

        //pass this list to adapter

        ContactsAdapter contactsAdapter = new ContactsAdapter(this,contactsList);
        recyclerView.setAdapter(contactsAdapter);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
    }
}
