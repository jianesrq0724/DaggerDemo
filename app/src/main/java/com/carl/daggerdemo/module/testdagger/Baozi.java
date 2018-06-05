package com.carl.daggerdemo.module.testdagger;

import javax.inject.Inject;

/**
 * @author Carl
 * version 1.0
 * @since 2018/6/5
 */
public class Baozi {
    private String name;

    @Inject
    public Baozi() {
        name = "小笼包";
    }


    public Baozi(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
