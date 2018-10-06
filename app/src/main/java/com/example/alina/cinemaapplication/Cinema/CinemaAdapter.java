package com.example.alina.cinemaapplication.Cinema;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.alina.cinemaapplication.R;

import java.util.List;

import static com.example.alina.cinemaapplication.R.layout.cinema_rec_layout;

public class CinemaAdapter  extends RecyclerView.Adapter<CinemaAdapter.ViewHolder>{

    private Context context;
    private List<Cinema> cinemaList;

    public CinemaAdapter(Context context, List<Cinema> cinemaList){
        this.context = context;
        this.cinemaList = cinemaList;
    }

    public CinemaAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.cinema_rec_layout, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Cinema cinema = cinemaList.get(position);
        holder.textId.setText(cinema.getId());
        holder.textName.setText(cinema.getName());
    }

    @Override
    public int getItemCount() {
        return cinemaList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView textId, textName;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textId = itemView.findViewById(R.id.cinema_id);
            textName = itemView.findViewById(R.id.cinema_name);
        }
    }
}
