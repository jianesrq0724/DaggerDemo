package com.carl.daggerdemo.module.testsingle;

import android.view.View;

import com.carl.daggerdemo.pub.base.BaseListActivity;
import com.carl.daggerdemo.pub.base.BasePresenter;
import com.carl.daggerdemo.pub.base.CommonBaseAdapter;
import com.carl.daggerdemo.pub.base.CommonSimpleAdapter;
import com.carl.daggerdemo.pub.utils.ToastUtils;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

public class SecondActivity extends BaseListActivity {

    private List<String> mTitles = new ArrayList<>();

    @Inject
    TestSingleton mTestSingleton1;

    @Inject
    TestSingleton mTestSingleton2;


    @Override
    protected void initData() {
        super.initData();
        mTitles.add("onClick");
    }

    @Override
    protected void initView() {
        super.initView();
        mBaseAdapter = new CommonSimpleAdapter(mTitles);
        initListView();

        DaggerActivityComponent.builder().build().inject(this);

        mBaseAdapter.setOnItemClickListener(new CommonBaseAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                switch (position) {
                    case 0:
                        ToastUtils.showLong(mTestSingleton1.toString() + ", " + mTestSingleton2.toString());
                        break;
                    case 1:
                        break;
                    default:
                        break;
                }
            }
        });
    }

    @Override
    public void setOnInteractListener() {

    }

    @Override
    public BasePresenter createPresenter() {
        return null;
    }


    @Override
    protected void getFirstData() {

    }

    @Override
    protected void onLoad() {

    }
}
