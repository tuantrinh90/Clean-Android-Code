package com.plaps.androidcleancode;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.plaps.androidcleancode.component.CityComponent;
import com.plaps.androidcleancode.component.DaggerCityComponent;
import com.plaps.androidcleancode.networking.NetworkModule;

import java.io.File;

/**
 * Created by ennur on 6/28/16.
 */
public class BaseApp extends AppCompatActivity {
    CityComponent mComponent;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        File cacheFile = new File(getCacheDir(), "responses");
        mComponent = DaggerCityComponent.builder().networkModule(new NetworkModule(cacheFile)).build();

    }

    public CityComponent getComponent() {
        return mComponent;
    }
}
