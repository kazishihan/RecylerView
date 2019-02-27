package remon.com.my_recyler;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {

    private List<User> userList;

    public CustomAdapter(List<User> userList) {
        this.userList=userList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View itemview = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.user_item_layout,viewGroup,false);

        return new ViewHolder(itemview);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        User currentUser = userList.get(i);
        viewHolder.nameTv.setText(currentUser.getName());
        viewHolder.genderTv.setText(currentUser.getGender());
        viewHolder.phoneTv.setText(currentUser.getPhoneNumber());
        viewHolder.userImage.setImageResource(currentUser.getUserPhoto());

    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView userImage;
        private TextView nameTv,genderTv,phoneTv;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            userImage =itemView.findViewById(R.id.imageviewId);
            nameTv = itemView.findViewById(R.id.nameTv);
            genderTv = itemView.findViewById(R.id.genderTv);
            phoneTv = itemView.findViewById(R.id.phonenumberTv);

        }
    }
}
