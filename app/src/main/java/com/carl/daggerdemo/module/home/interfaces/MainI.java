package com.carl.daggerdemo.module.home.interfaces;

import com.carl.daggerdemo.pub.loading.interfaces.ILoading;

/**
 * @author Carl
 * @version 1.0
 * @since 2018/5/10
 */
public interface MainI extends ILoading {
    void loginSuccess(String msg);
}
