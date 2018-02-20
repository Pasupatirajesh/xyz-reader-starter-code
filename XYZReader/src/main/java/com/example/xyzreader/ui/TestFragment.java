package com.example.xyzreader.ui;

import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.xyzreader.R;

/**
 * Created by SSubra27 on 2/20/18.
 */

public class TestFragment extends Fragment {

    public TestFragment(){}

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);

        inflater = LayoutInflater.from(getContext());
        View v = inflater.inflate(R.layout.test_fragment, container, false);
        TextView tv = (TextView) v.findViewById(R.id.testfragtv);
        tv.setText("HI");
        return v;



    }
}
