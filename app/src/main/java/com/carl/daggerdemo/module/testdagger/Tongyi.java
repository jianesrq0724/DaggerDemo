package com.carl.daggerdemo.module.testdagger;

import javax.inject.Inject;

/**
 * @author Carl
 * version 1.0
 * @since 2018/6/5
 */
public class Tongyi extends Noodle {
    @Inject
    public Tongyi() {
    }

    @Override
    public String toString() {
        return "统一方便面";
    }
}
