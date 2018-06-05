package com.carl.daggerdemo.module.testsingle;

import javax.inject.Singleton;

import dagger.Component;

/**
 * @author Carl
 * version 1.0
 * @since 2018/6/5
 */
@Singleton
@Component
public interface ActivityComponent {
    void inject(SecondActivity activity);
}
