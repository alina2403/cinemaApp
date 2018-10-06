package com.example.alina.cinemaapplication.Movie;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.alina.cinemaapplication.Movie.Movie;
import com.example.alina.cinemaapplication.Movie.MovieAdapter;
import com.example.alina.cinemaapplication.R;

import java.util.List;

public class MovieAdapter  {
    private Context context;
    private List<Movie> movieList;

    public MovieAdapter(Context context, List<Movie> movieList){
        this.context = context;
        this.movieList = movieList;
    }

    public MovieAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.movie_rec_layout, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MovieAdapter.ViewHolder holder, int position) {
        Movie movie = movieList.get(position);
       // holder.textId.setText(cinema.getId());
       // holder.textName.setText(cinema.getName());
    }

    @Override
    public int getItemCount() {
        return movieList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView textId, textName;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            //textId = itemView.findViewById(R.id.cinema_id);
            //textName = itemView.findViewById(R.id.cinema_name);
        }
    }
}
