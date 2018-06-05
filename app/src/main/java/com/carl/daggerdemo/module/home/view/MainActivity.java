package com.carl.daggerdemo.module.home.view;

import android.content.Intent;
import android.view.View;

import com.carl.daggerdemo.R;
import com.carl.daggerdemo.module.home.interfaces.MainI;
import com.carl.daggerdemo.module.home.presenter.MainPresenter;
import com.carl.daggerdemo.module.testdagger.DaggerPlatform;
import com.carl.daggerdemo.module.testdagger.People;
import com.carl.daggerdemo.module.testdagger.ShangjiaAModule;
import com.carl.daggerdemo.module.testsingle.SecondActivity;
import com.carl.daggerdemo.pub.base.BaseListActivity;
import com.carl.daggerdemo.pub.base.CommonBaseAdapter;
import com.carl.daggerdemo.pub.base.CommonSimpleAdapter;
import com.carl.daggerdemo.pub.utils.ToastUtils;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

/**
 * @author Carl
 * @version 1.0
 * @since 2018/5/10
 */
public class MainActivity extends BaseListActivity<MainI, MainPresenter> implements MainI {

    @Inject
    People mPeople;

    private List<String> mTitles = new ArrayList<>();

    @Override
    public void setOnInteractListener() {

    }

    @Override
    protected void initData() {
        mTitles.add("Test Dagger");
        mTitles.add("测试单例");
    }


    @Override
    protected void initView() {
        mToolbarManager.hideBackIcon();
        mToolbarManager.setToolbarTitle("Dagger2 Demo");

        mBaseAdapter = new CommonSimpleAdapter(mTitles);
        initListView();

        mBaseAdapter.setOnItemClickListener(new CommonBaseAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                switch (position) {
                    case 0:
                        DaggerPlatform.builder()
                                .shangjiaAModule(new ShangjiaAModule("restaurant"))
                                .build()
                                .inject((MainActivity) mContext);
                        mPeople.eat();
                        break;
                    case 1:
                        startActivity(new Intent(mContext, SecondActivity.class));
                        break;
                    case 2:
                        break;

                    case 3:
                        break;
                    default:
                        break;
                }
            }
        });

    }

    @Override
    public MainPresenter createPresenter() {
        return new MainPresenter();
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void getFirstData() {

    }

    @Override
    protected void onLoad() {

    }

    @Override
    public void loginSuccess(String msg) {
        ToastUtils.showShort(msg);
    }

    private long lastClickTime;

    @Override
    public void onBackPressed() {
        long currentClickTime = System.currentTimeMillis();
        if (currentClickTime - lastClickTime > 2000) {
            ToastUtils.showShort("再按一次退出");
            lastClickTime = currentClickTime;
        } else {
            super.onBackPressed();
        }
    }

}



