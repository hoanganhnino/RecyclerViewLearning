package com.example.hoanganh.recyclerviewlearning;

import java.util.ArrayList;

/**
 * Created by hoanganh on 2/27/2019.
 */

public class Contact
{
    private String mName;
    private boolean mIsOnline;
    private static int lastContactId = 0;

    public Contact(String mName, boolean online)
    {
        this.mName = mName;
        this.mIsOnline = online;
    }

    public String getName()
    {
        return mName;
    }

    public boolean isOnline()
    {
        return mIsOnline;
    }



    public static ArrayList<Contact> createContactList(int numContact)
    {
        ArrayList<Contact> contacts = new ArrayList<Contact>();
        for(int i = 1; i <= numContact; i++)
        {
            contacts.add(new Contact("Person"+ ++lastContactId, i<= numContact/2));
        }
        return contacts;
    }
}
