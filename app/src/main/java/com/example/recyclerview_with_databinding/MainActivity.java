package com.example.recyclerview_with_databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.recyclerview_with_databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    String[] names= {"James", "Rosy", "Maryland","Joseph", "Fred", "Mila", "Ellen"};
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this, R.layout.activity_main);

        setAdapter();
    }


    public  void setAdapter(){
        Adapter adapter= new Adapter(names);
        LinearLayoutManager linearLayoutManager= new LinearLayoutManager(this, RecyclerView.VERTICAL,false);
        binding.rvView.setLayoutManager(linearLayoutManager);
        binding.rvView.setAdapter(adapter);
    }
}