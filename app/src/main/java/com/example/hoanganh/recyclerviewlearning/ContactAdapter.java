package com.example.hoanganh.recyclerviewlearning;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.hoanganh.recyclerviewlearning.R;

import java.util.List;

/**
 * Created by hoanganh on 2/27/2019.
 */

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ViewHolder>
{
    private String statusOn = "Online";
    private String statusOff = "Offline";
    private List<Contact> mContact;
    public class ViewHolder extends RecyclerView.ViewHolder
    {
        public TextView nameTextView;
        public Button messageButton;

        public ViewHolder(View itemView)
        {
            super(itemView);

            nameTextView = itemView.findViewById(R.id.text_contact_name);
            messageButton = itemView.findViewById(R.id.button_message);
        }
    }

    public ContactAdapter(List<Contact> contacts)
    {
        mContact = contacts;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View contactView = inflater.inflate(R.layout.item_contact, parent, false);
        ViewHolder viewHolder = new ViewHolder(contactView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ContactAdapter.ViewHolder holder, int position)
    {
        Contact contact = mContact.get(position);
        TextView textView = holder.nameTextView;
        textView.setText(contact.getName());
        Button button = holder.messageButton;
        button.setText(contact.isOnline() ? statusOn : statusOff);
        button.setEnabled(contact.isOnline());
    }

    @Override
    public int getItemCount()
    {
        return mContact.size();
    }
}
