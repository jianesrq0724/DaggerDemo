package com.carl.daggerdemo.module.testdagger;

import dagger.Module;
import dagger.Provides;

/**
 * @author Carl
 * version 1.0
 * @since 2018/6/5
 */
@Module
public class ShangjiaAModule {

    String restaurant;

    public ShangjiaAModule(String restaurant) {
        this.restaurant = restaurant;
    }

    @Provides
    public Baozi provideBaozi() {
        return new Baozi("豆沙包3");
    }

    @Provides
    public Noodle provideNoodle(Tongyi noodle) {
        return noodle;
    }

    @Provides
    public String provideResturant() {
        return restaurant;
    }
}
