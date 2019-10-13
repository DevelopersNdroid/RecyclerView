package com.bhavyathacker.recyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements RecyclerViewAdapter.ListItemClickListener {

    private static final String TAG = "MainActivity";
    private ArrayList<String> mImageNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();

    private Toast mToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: ");
        initImageBitmaps();
    }

    private void initImageBitmaps() {
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");
        mImageUrls.add("https://c1.staticflickr.com/5/4636/25316407448_de5fbf183d_o.jpg");
        mImageNames.add("Havasu Falls");
        mImageUrls.add("https://i.redd.it/tpsnoz5bzo501.jpg");
        mImageNames.add("Trondheim");
        mImageUrls.add("https://i.redd.it/qn7f9oqu7o501.jpg");
        mImageNames.add("Portugal");
        mImageUrls.add("https://i.redd.it/j6myfqglup501.jpg");
        mImageNames.add("Rocky Mountain National Park");
        mImageUrls.add("https://i.redd.it/0h2gm1ix6p501.jpg");
        mImageNames.add("Mahahual");
        mImageUrls.add("https://i.redd.it/k98uzl68eh501.jpg");
        mImageNames.add("Frozen Lake");
        mImageUrls.add("https://i.redd.it/glin0nwndo501.jpg");
        mImageNames.add("White Sands Desert");
        mImageUrls.add("https://i.redd.it/obx4zydshg601.jpg");
        mImageNames.add("Austrailia");
        mImageUrls.add("https://i.imgur.com/ZcLLrkY.jpg");
        mImageNames.add("Washington");
        mImageUrls.add("https://c1.staticflickr.com/5/4636/25316407448_de5fbf183d_o.jpg");
        mImageNames.add("Havasu Falls");
        mImageUrls.add("https://i.redd.it/tpsnoz5bzo501.jpg");
        mImageNames.add("Trondheim");
        mImageUrls.add("https://i.redd.it/qn7f9oqu7o501.jpg");
        mImageNames.add("Portugal");
        mImageUrls.add("https://i.redd.it/j6myfqglup501.jpg");
        mImageNames.add("Rocky Mountain National Park");
        mImageUrls.add("https://i.redd.it/0h2gm1ix6p501.jpg");
        mImageNames.add("Mahahual");
        mImageUrls.add("https://i.redd.it/k98uzl68eh501.jpg");
        mImageNames.add("Frozen Lake");
        mImageUrls.add("https://i.redd.it/glin0nwndo501.jpg");
        mImageNames.add("White Sands Desert");
        mImageUrls.add("https://i.redd.it/obx4zydshg601.jpg");
        mImageNames.add("Austrailia");
        mImageUrls.add("https://i.imgur.com/ZcLLrkY.jpg");
        mImageNames.add("Washington");
        initRecyclerView();

    }

    private void initRecyclerView() {
        Log.d(TAG, "initRecyclerView: ");
        RecyclerView recyclerView = findViewById(R.id.rv_main);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, mImageNames, mImageUrls, this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public void onListItemClick(int clickedItemIndex) {
        if (mToast != null) {
            mToast.cancel();
        }
        mToast = Toast.makeText(this, mImageNames.get(clickedItemIndex) + " at " + clickedItemIndex, Toast.LENGTH_SHORT);
        mToast.show();
    }
}
