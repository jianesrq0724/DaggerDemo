package com.carl.daggerdemo.module.testdagger;

import com.carl.daggerdemo.pub.utils.ToastUtils;

import javax.inject.Inject;

/**
 * @author Carl
 * version 1.0
 * @since 2018/6/5
 */
public class People {
    @Inject
    Baozi mBaozi;

    @Inject
    Noodle mNoodle;

    @Inject
    String resturant;

    @Inject
    public People() {

    }

    public void eat() {
        StringBuilder sb = new StringBuilder();
        sb.append("我从 ");
        sb.append(resturant.toString());
        sb.append("订的外卖，");
        sb.append("我吃的是 ");
        if (mBaozi != null) {
            sb.append(mBaozi.toString());
        }

        if (mNoodle != null) {
            sb.append("  ");
            sb.append(mNoodle.toString());
        }

        ToastUtils.showShort(sb);
    }


}
