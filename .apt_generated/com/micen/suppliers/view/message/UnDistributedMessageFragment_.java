//
// DO NOT EDIT THIS FILE.Generated using AndroidAnnotations 3.3.1.
//  You can create a larger work that contains this file and distribute that work under terms of your choice.
//


package com.micen.suppliers.view.message;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.focustech.common.widget.pulltorefresh.PullToRefreshListView;
import com.micen.suppliers.R.layout;
import com.micen.suppliers.view.PageStatusView;
import org.androidannotations.api.builder.FragmentBuilder;
import org.androidannotations.api.view.HasViews;
import org.androidannotations.api.view.OnViewChangedListener;
import org.androidannotations.api.view.OnViewChangedNotifier;

public final class UnDistributedMessageFragment_
    extends com.micen.suppliers.view.message.UnDistributedMessageFragment
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
            contentView_ = inflater.inflate(layout.fragment_message_list, container, false);
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

    public static UnDistributedMessageFragment_.FragmentBuilder_ builder() {
        return new UnDistributedMessageFragment_.FragmentBuilder_();
    }

    @Override
    public void onViewChanged(HasViews hasViews) {
        pullToListView = ((PullToRefreshListView) hasViews.findViewById(com.micen.suppliers.R.id.lv_mail_list));
        progressBar = ((RelativeLayout) hasViews.findViewById(com.micen.suppliers.R.id.progress_bar));
        statusView = ((PageStatusView) hasViews.findViewById(com.micen.suppliers.R.id.broadcast_page_status));
        initView();
    }

    public static class FragmentBuilder_
        extends FragmentBuilder<UnDistributedMessageFragment_.FragmentBuilder_, com.micen.suppliers.view.message.UnDistributedMessageFragment>
    {


        @Override
        public com.micen.suppliers.view.message.UnDistributedMessageFragment build() {
            UnDistributedMessageFragment_ fragment_ = new UnDistributedMessageFragment_();
            fragment_.setArguments(args);
            return fragment_;
        }

    }

}
