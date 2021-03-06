//
// DO NOT EDIT THIS FILE.Generated using AndroidAnnotations 3.3.1.
//  You can create a larger work that contains this file and distribute that work under terms of your choice.
//


package com.micen.suppliers.activity.setting;

import android.app.Activity;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Build.VERSION_CODES;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.micen.suppliers.R.id;
import org.androidannotations.api.builder.ActivityIntentBuilder;
import org.androidannotations.api.view.HasViews;
import org.androidannotations.api.view.OnViewChangedListener;
import org.androidannotations.api.view.OnViewChangedNotifier;

public final class PersonalActivity_
    extends PersonalActivity
    implements HasViews, OnViewChangedListener
{

    private final OnViewChangedNotifier onViewChangedNotifier_ = new OnViewChangedNotifier();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        OnViewChangedNotifier previousNotifier = OnViewChangedNotifier.replaceNotifier(onViewChangedNotifier_);
        init_(savedInstanceState);
        super.onCreate(savedInstanceState);
        OnViewChangedNotifier.replaceNotifier(previousNotifier);
    }

    private void init_(Bundle savedInstanceState) {
        OnViewChangedNotifier.registerOnViewChangedListener(this);
    }

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
        onViewChangedNotifier_.notifyViewChanged(this);
    }

    @Override
    public void setContentView(View view, LayoutParams params) {
        super.setContentView(view, params);
        onViewChangedNotifier_.notifyViewChanged(this);
    }

    @Override
    public void setContentView(View view) {
        super.setContentView(view);
        onViewChangedNotifier_.notifyViewChanged(this);
    }

    public static PersonalActivity_.IntentBuilder_ intent(Context context) {
        return new PersonalActivity_.IntentBuilder_(context);
    }

    public static PersonalActivity_.IntentBuilder_ intent(android.app.Fragment fragment) {
        return new PersonalActivity_.IntentBuilder_(fragment);
    }

    public static PersonalActivity_.IntentBuilder_ intent(android.support.v4.app.Fragment supportFragment) {
        return new PersonalActivity_.IntentBuilder_(supportFragment);
    }

    @Override
    public void onViewChanged(HasViews hasViews) {
        btnFunction2 = ((ImageView) hasViews.findViewById(id.common_title_function2));
        tvTitle = ((TextView) hasViews.findViewById(id.common_title_name));
        btnFunction3 = ((ImageView) hasViews.findViewById(id.common_title_function3));
        llBack = ((LinearLayout) hasViews.findViewById(id.common_ll_title_back));
        btnFunction4 = ((ImageView) hasViews.findViewById(id.common_title_function4));
        btnTextFunction = ((TextView) hasViews.findViewById(id.common_title_text_function));
        btnBack = ((ImageView) hasViews.findViewById(id.common_title_back));
        btnFunction5 = ((ImageView) hasViews.findViewById(id.common_title_function5));
        btnFunction1 = ((ImageView) hasViews.findViewById(id.common_title_function1));
        personalListView = ((ListView) hasViews.findViewById(id.lv_personal_list));
        initView();
    }

    public static class IntentBuilder_
        extends ActivityIntentBuilder<PersonalActivity_.IntentBuilder_>
    {

        private android.app.Fragment fragment_;
        private android.support.v4.app.Fragment fragmentSupport_;

        public IntentBuilder_(Context context) {
            super(context, PersonalActivity_.class);
        }

        public IntentBuilder_(android.app.Fragment fragment) {
            super(fragment.getActivity(), PersonalActivity_.class);
            fragment_ = fragment;
        }

        public IntentBuilder_(android.support.v4.app.Fragment fragment) {
            super(fragment.getActivity(), PersonalActivity_.class);
            fragmentSupport_ = fragment;
        }

        @Override
        public void startForResult(int requestCode) {
            if (fragmentSupport_!= null) {
                fragmentSupport_.startActivityForResult(intent, requestCode);
            } else {
                if (fragment_!= null) {
                    if (VERSION.SDK_INT >= VERSION_CODES.JELLY_BEAN) {
                        fragment_.startActivityForResult(intent, requestCode, lastOptions);
                    } else {
                        fragment_.startActivityForResult(intent, requestCode);
                    }
                } else {
                    if (context instanceof Activity) {
                        Activity activity = ((Activity) context);
                        ActivityCompat.startActivityForResult(activity, intent, requestCode, lastOptions);
                    } else {
                        if (VERSION.SDK_INT >= VERSION_CODES.JELLY_BEAN) {
                            context.startActivity(intent, lastOptions);
                        } else {
                            context.startActivity(intent);
                        }
                    }
                }
            }
        }

    }

}
