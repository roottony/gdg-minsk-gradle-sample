package com.gdgminsk.mylib;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

public class HelloLibraryProject {

    private static final String TAG = HelloLibraryProject.class.getSimpleName();

    public void sayHello(Context context) {
        Log.i(TAG, "Hello from gradle library project!");
        Toast.makeText(context, R.string.library_resource_string, Toast.LENGTH_LONG).show();
    }

}