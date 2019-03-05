package com.example.hoanganh.recyclerviewlearning;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.hoanganh.recyclerviewlearning.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{
    private ArrayList<Contact> contacts;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView contactRecyclerView = (RecyclerView)findViewById(R.id.recycler_contact);
        contacts = Contact.createContactList(3);
        ContactAdapter contactAdapter = new ContactAdapter(contacts);
        contactRecyclerView.setAdapter(contactAdapter);
        contactRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
