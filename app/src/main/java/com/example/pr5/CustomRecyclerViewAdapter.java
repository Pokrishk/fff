package com.example.pr5;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public class CustomRecyclerViewAdapter extends RecyclerView.Adapter<CustomRecyclerViewAdapter.MyViewHolder> {
    private final ArrayList<CardData> dataList;

    public CustomRecyclerViewAdapter(ArrayList<CardData> dataList) {
        this.dataList = dataList;

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        CardData data = dataList.get(position);
        holder.name.setText(data.getName());
        holder.surname.setText(data.getSurname());
        holder.middlename.setText(data.getMiddlename());
        holder.pos.setText(String.valueOf(data.getPos()));
    }


    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView name;
        TextView surname;
        TextView middlename;
        TextView pos;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            surname = itemView.findViewById(R.id.surname);
            middlename = itemView.findViewById(R.id.middlename);
            pos = itemView.findViewById(R.id.pos);
        }
    }
}
