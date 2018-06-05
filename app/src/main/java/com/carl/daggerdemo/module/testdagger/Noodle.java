package com.carl.daggerdemo.module.testdagger;

import javax.inject.Inject;

/**
 * @author Carl
 * version 1.0
 * @since 2018/6/5
 */
public class Noodle {

    @Inject
    public Noodle() {
    }

    @Override
    public String toString() {
        return "面条";
    }
}
