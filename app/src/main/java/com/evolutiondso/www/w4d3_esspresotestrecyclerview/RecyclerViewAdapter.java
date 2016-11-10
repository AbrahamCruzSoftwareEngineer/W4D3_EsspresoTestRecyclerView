package com.evolutiondso.www.w4d3_esspresotestrecyclerview;
/**
 * Created by Albrtx on 10/11/2016.
 */

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private ArrayList<String> mArrayList;


    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View termView = inflater.inflate(R.layout.recycler_item, parent, false);

        return new ViewHolder(termView);
    }

    @Override
    public void onBindViewHolder(RecyclerViewAdapter.ViewHolder holder, int position) {
        String string = mArrayList.get(position);

        ImageView imageViewName = holder.imageViewName;
        holder.string = string;

    }


    public RecyclerViewAdapter(ArrayList<String> arrayList) {

        this.mArrayList = arrayList;
    }

    @Override
    public int getItemCount() {
        return mArrayList.size();
    }

    //All the inner clases to set them to STATIC to avoid memory Leaks
    public static class ViewHolder extends RecyclerView.ViewHolder {

        private static final String TAG = "MYTAG";
        public final ImageView imageView;
        public final Button button;
        public final ProgressBar progresBar;
        public String string;
        public ImageView imageViewName;

        public ViewHolder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.img_view);
            progresBar = (ProgressBar) itemView.findViewById(R.id.r_item_progres);
            button = (Button) itemView.findViewById(R.id.r_item_button);
            button.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    Log.d(TAG, "OnClick" + string);
                }
            });
        }

    }
}
