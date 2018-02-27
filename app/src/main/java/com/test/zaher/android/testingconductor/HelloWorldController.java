package com.test.zaher.android.testingconductor;

import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bluelinelabs.conductor.Controller;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by zaher on 7/23/2017.
 */

public class HelloWorldController extends Controller {

    Unbinder unbinder;
    @BindView(R.id.tvMessage)
    TextView tvMessage;

    @NonNull
    @Override
    protected View onCreateView(@NonNull LayoutInflater inflater, @NonNull ViewGroup container) {
        View view = inflater.inflate(R.layout.hello_world_layout, container, false);
        unbinder = ButterKnife.bind(this, view);
        onViewBound(view);
        return view;
    }


    private void onViewBound(@NonNull View view) {
        tvMessage.setText("Hello World");
    }

    @Override
    protected void onDestroyView(@NonNull View view) {
        super.onDestroyView(view);
        unbinder.unbind();
        unbinder = null;
    }
}
