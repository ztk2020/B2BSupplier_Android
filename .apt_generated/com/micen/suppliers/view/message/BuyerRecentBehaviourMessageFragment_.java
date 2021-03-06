//
// DO NOT EDIT THIS FILE.Generated using AndroidAnnotations 3.3.1.
//  You can create a larger work that contains this file and distribute that work under terms of your choice.
//


package com.micen.suppliers.view.message;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.micen.suppliers.R.layout;
import org.androidannotations.api.builder.FragmentBuilder;
import org.androidannotations.api.view.HasViews;
import org.androidannotations.api.view.OnViewChangedListener;
import org.androidannotations.api.view.OnViewChangedNotifier;

public final class BuyerRecentBehaviourMessageFragment_
    extends com.micen.suppliers.view.message.BuyerRecentBehaviourMessageFragment
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
            contentView_ = inflater.inflate(layout.fragment_message_buyer_recent_behaviour, container, false);
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

    public static BuyerRecentBehaviourMessageFragment_.FragmentBuilder_ builder() {
        return new BuyerRecentBehaviourMessageFragment_.FragmentBuilder_();
    }

    @Override
    public void onViewChanged(HasViews hasViews) {
        keyLlSearchLine = hasViews.findViewById(com.micen.suppliers.R.id.mbr_behaviour_key_ll_search_line);
        behaviourTvSeasonMessage = ((TextView) hasViews.findViewById(com.micen.suppliers.R.id.mbr_behaviour_tv_season_message));
        KeyLvSourcingList = ((ListView) hasViews.findViewById(com.micen.suppliers.R.id.mbr_behaviour_key_lv_sourcing_list));
        behaviourTvWeekMessage = ((TextView) hasViews.findViewById(com.micen.suppliers.R.id.mbr_behaviour_tv_week_message));
        behaviourTvYearMessage = ((TextView) hasViews.findViewById(com.micen.suppliers.R.id.mbr_behaviour_tv_year_message));
        keyLlCatalogue = ((LinearLayout) hasViews.findViewById(com.micen.suppliers.R.id.mbr_behaviour_key_ll_catalogue));
        seasonMessageLl = ((LinearLayout) hasViews.findViewById(com.micen.suppliers.R.id.mbr_behaviour_season_message_ll));
        keyLlSearchKeyword = ((LinearLayout) hasViews.findViewById(com.micen.suppliers.R.id.mbr_behaviour_key_ll_search_keyword));
        KeyTvSearchKeyword = ((TextView) hasViews.findViewById(com.micen.suppliers.R.id.mbr_behaviour_key_tv_search_keyword));
        keyLl = ((LinearLayout) hasViews.findViewById(com.micen.suppliers.R.id.mbr_behaviour_key_ll));
        keyTvCatalogue = ((TextView) hasViews.findViewById(com.micen.suppliers.R.id.mbr_behaviour_key_tv_catalogue));
        keyLlSourcing = ((LinearLayout) hasViews.findViewById(com.micen.suppliers.R.id.mbr_behaviour_key_ll_sourcing));
        keyLlCatalogueLine = hasViews.findViewById(com.micen.suppliers.R.id.mbr_behaviour_key_ll_catalogue_line);
    }

    public static class FragmentBuilder_
        extends FragmentBuilder<BuyerRecentBehaviourMessageFragment_.FragmentBuilder_, com.micen.suppliers.view.message.BuyerRecentBehaviourMessageFragment>
    {


        @Override
        public com.micen.suppliers.view.message.BuyerRecentBehaviourMessageFragment build() {
            BuyerRecentBehaviourMessageFragment_ fragment_ = new BuyerRecentBehaviourMessageFragment_();
            fragment_.setArguments(args);
            return fragment_;
        }

    }

}
