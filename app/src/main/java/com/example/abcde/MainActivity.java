package com.example.abcde;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements RecyclerViewInterface {

    ArrayList<smodel>Smodels = new ArrayList<>();
    int []smodelimage = {R.drawable.baseline_tablet_android_24,
            R.drawable.baseline_tablet_android_25,R.drawable.baseline_tablet_android_26,
            R.drawable.baseline_tablet_android_27,R.drawable.baseline_tablet_android_28,
            R.drawable.baseline_tablet_android_29,R.drawable.baseline_tablet_android_30,
            R.drawable.baseline_tablet_android_31
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.mRecyclerView);
        setUpsmodels();
        SMrk_RecylerAdpater adapter = new SMrk_RecylerAdpater(this,
                Smodels,this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
    private void setUpsmodels(){
        String[]SmartphnoeName = getResources().getStringArray(R.array.merek_smartphone_txt);
        String[]chipsetName = getResources().getStringArray(R.array.chipset_smartphone_txt);
        String[]pymname = getResources().getStringArray(R.array.Ram_Memory_txt);

        for (int i = 0; i<SmartphnoeName.length;i++){
            Smodels.add(new smodel(SmartphnoeName[i],
                    chipsetName[i],
                    pymname[i],
                    smodelimage[i]) );
        }
    }

    @Override
    public void onItemClick(int position) {
       Intent intent =new Intent(MainActivity.this,MainActivity2.class);
       intent.putExtra("Name",Smodels.get(position).getSmartphoneModel());
       intent.putExtra("CHIPSET",Smodels.get(position).getProsesorName());
       intent.putExtra("STORAGE",Smodels.get(position).getPenyimpananNama());
       intent.putExtra("IMAGE",Smodels.get(position).getImage());
               startActivity(intent);
    }
}