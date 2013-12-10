package com.gdgminsk.mylib;

import android.util.Log;

public class HelloLibraryProject {

    private static final String TAG = HelloLibraryProject.class.getSimpleName();

    public void sayHello() {
        Log.i(TAG, "Hello from gradle library project!");
    }

}