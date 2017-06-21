package com.ruiqin.testdagger;

import android.os.Bundle;
import android.widget.TextView;

import com.ruiqin.testdagger.base.BaseActivity;
import com.ruiqin.testdagger.entity.UserModel;

import javax.inject.Inject;

import butterknife.BindView;

public class MainActivity extends BaseActivity {

    private ActivityComponent mActivityComponent;

    @BindView(R.id.text)
    TextView mText;
    @Inject
    UserModel mUserModel;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView(Bundle savedInstanceState) {
        mActivityComponent = DaggerActivityComponent.builder().activityModule(new ActivityModule()).build();
        mActivityComponent.inject(this);
        mText.setText(mUserModel.getName());
    }
}
