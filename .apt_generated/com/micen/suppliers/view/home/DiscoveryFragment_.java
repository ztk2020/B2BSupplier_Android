//
// DO NOT EDIT THIS FILE.Generated using AndroidAnnotations 3.3.1.
//  You can create a larger work that contains this file and distribute that work under terms of your choice.
//


package com.micen.suppliers.view.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.focustech.common.widget.pulltorefresh.PullToRefreshWebView;
import com.micen.suppliers.R.layout;
import org.androidannotations.api.builder.FragmentBuilder;
import org.androidannotations.api.view.HasViews;
import org.androidannotations.api.view.OnViewChangedListener;
import org.androidannotations.api.view.OnViewChangedNotifier;

public final class DiscoveryFragment_
    extends com.micen.suppliers.view.home.DiscoveryFragment
    implements HasViews, OnViewChangedListener
{

    private final OnViewChangedNotifier onViewChangedNotifier_ = new OnViewChangedNotifier();
    private View contentView_;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        OnViewChangedNotifier previousNotifier = OnViewChangedNotifier.replaceNotifier(onViewChangedNotifier_);
        init_(savedInstanceState);
        super.onCreate(savedInstanceState);
        OnViewChangedNotifier.replaceNotifier(previousNotifier);
    }

    @Override
    public View findViewById(int id) {
        if (contentView_ == null) {
            return null;
        }
        return contentView_.findViewById(id);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        contentView_ = super.onCreateView(inflater, container, savedInstanceState);
        if (contentView_ == null) {
            contentView_ = inflater.inflate(layout.discovery_fragment_layout, container, false);
        }
        return contentView_;
    }

    @Override
    public void onDestroyView() {
        contentView_ = null;
        super.onDestroyView();
    }

    private void init_(Bundle savedInstanceState) {
        OnViewChangedNotifier.registerOnViewChangedListener(this);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        onViewChangedNotifier_.notifyViewChanged(this);
    }

    public static DiscoveryFragment_.FragmentBuilder_ builder() {
        return new DiscoveryFragment_.FragmentBuilder_();
    }

    @Override
    public void onViewChanged(HasViews hasViews) {
        tvTitle = ((TextView) hasViews.findViewById(com.micen.suppliers.R.id.discovery_title_name));
        progressBar = ((ProgressBar) hasViews.findViewById(com.micen.suppliers.R.id.webview_progressbar));
        pullToRefreshWebView = ((PullToRefreshWebView) hasViews.findViewById(com.micen.suppliers.R.id.discovery_webview));
        initView();
    }

    public static class FragmentBuilder_
        extends FragmentBuilder<DiscoveryFragment_.FragmentBuilder_, com.micen.suppliers.view.home.DiscoveryFragment>
    {


        @Override
        public com.micen.suppliers.view.home.DiscoveryFragment build() {
            DiscoveryFragment_ fragment_ = new DiscoveryFragment_();
            fragment_.setArguments(args);
            return fragment_;
        }

    }

}