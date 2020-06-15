package com.reactlibrary;

import android.widget.Toast;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import java.util.Map;
public class AddNativeCodeModule extends ReactContextBaseJavaModule {
    
    Context mContext;
    public AppSharedPreferenceManager preferenceManager;

    public AddNativeCodeModule(ReactApplicationContext reactContext) {
        super(reactContext);
        mContext = reactContext;
        preferenceManager = new AppSharedPreferenceManager(new PreferencesHelper(reactContext));
    }

    @Override
    public String getName() {
        return "SharefPreference";
    }
}
