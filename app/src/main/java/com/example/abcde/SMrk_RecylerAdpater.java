package com.example.abcde;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SMrk_RecylerAdpater extends RecyclerView.Adapter<SMrk_RecylerAdpater.MyViewHolder > {
    private RecyclerViewInterface recyclerViewInterface = null;


    Context context;
    ArrayList<smodel>Smodels;
    public SMrk_RecylerAdpater(Context context, ArrayList<smodel>Smodels,
          RecyclerViewInterface recyclerViewInterface){
  this.context=context;
  this.Smodels=Smodels;
  this.recyclerViewInterface = recyclerViewInterface;


    }

    @NonNull
    @Override
    public SMrk_RecylerAdpater.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.recyler_view_row,parent,false);
        

        return new  SMrk_RecylerAdpater.MyViewHolder(view, recyclerViewInterface);
    }

    @Override
    public void onBindViewHolder(@NonNull SMrk_RecylerAdpater.MyViewHolder holder, int position) {


        holder.tvNmae.setText(Smodels.get(position).getSmartphoneModel());
        holder.tv3Letter.setText(Smodels.get(position).getProsesorName());
        holder.tv1Letter.setText(Smodels.get(position).getPenyimpananNama());
        holder.imageView.setImageResource(Smodels.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        return Smodels.size();
    }
    public static class MyViewHolder extends  RecyclerView.ViewHolder{


        ImageView imageView;
        TextView tvNmae,tv3Letter,tv1Letter;
        public MyViewHolder(@NonNull View itemView, RecyclerViewInterface recyclerViewInterface) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView4);
            tvNmae= itemView.findViewById(R.id.textView3);
                    tv3Letter =itemView.findViewById(R.id.textView4);
                    tv1Letter=itemView.findViewById(R.id.textView5);

                    itemView.setOnClickListener(new View.OnClickListener(){
                     @Override
                     public void onClick(View view){
                         if (recyclerViewInterface !=null){
                           int pos =getAdapterPosition();

                           if(pos != RecyclerView.NO_POSITION){
                               recyclerViewInterface.onItemClick(pos);
                           }


                         }
                     }
                    });
        }
    }
}
