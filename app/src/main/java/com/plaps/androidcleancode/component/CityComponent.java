package com.plaps.androidcleancode.component;


import com.plaps.androidcleancode.home.HomeActivity;
import com.plaps.androidcleancode.networking.NetworkModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by ennur on 6/28/16.
 */
@Singleton
@Component(modules = {NetworkModule.class,})
public interface CityComponent {
    void inject(HomeActivity homeActivity);
}
