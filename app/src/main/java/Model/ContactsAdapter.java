package Model;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.application.R;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;


public class ContactsAdapter extends RecyclerView.Adapter<ContactsAdapter.ContactsViewHolder> {
    Context mContext;
    List<Contacts> contactsList;
    //constructor
    public ContactsAdapter(Context mContext, List<Contacts> contactsList) {
        this.mContext = mContext;
        this.contactsList = contactsList;
    }

    @NonNull
    @Override
    public ContactsViewHolder onCreateViewHolder(@NonNull
    ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(ViewGroup.getContext())
                .inflate(R.layout.contact,viewGroup,false);
        return new ContactsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactsViewHolder contactsViewHolder, int i){
        Contacts contacts = contactsList.get(i);
        contactsViewHolder.imgProfile.setImageResource(contacts.getImageId());
        contactsViewHolder.tvName.setText(contacts.getName());
        contactsViewHolder.tvPhone.setText(contacts.getPhoneNo());
    }

    @Override
    public int getItemCount(){
        return contactsList.size();
    }


    public class ContactsViewHolder extends RecyclerView.ViewHolder{
        CircleImageView imgProfile;
        TextView tvName, tvPhone;
        public ContactsViewHolder(@NonNull View itemView){
            super(itemView);
            imgProfile = itemView.findViewById(R.id.imgProfile);
            tvName = itemView.findViewById(R.id.tvName);
            tvPhone = itemView.findViewById(R.id.tvPhone);
        }

    }
}
