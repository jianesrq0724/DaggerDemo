package com.ruiqin.testdagger;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by ruiqin.shen
 * 类说明：
 */
@Singleton
@Component(modules = ActivityModule.class)
public interface ActivityComponent {
    void inject(MainActivity activity);
}
