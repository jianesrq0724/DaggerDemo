package com.ruiqin.testdagger;

import com.ruiqin.testdagger.entity.UserModel;

import dagger.Module;
import dagger.Provides;

/**
 * Created by ruiqin.shen
 * 类说明：
 */
@Module
public class ActivityModule {
    @Provides
    UserModel provideUserModel() {
        return new UserModel();
    }
}
