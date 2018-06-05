package com.carl.daggerdemo.module.testdagger;

import com.carl.daggerdemo.module.home.view.MainActivity;

import dagger.Component;

/**
 * @author Carl
 * version 1.0
 * @since 2018/6/5
 */
@Component(modules = ShangjiaAModule.class)
public interface Platform {
    void inject(MainActivity activity);
}
