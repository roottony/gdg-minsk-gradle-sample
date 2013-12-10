package com.gdgminsk.gradlesample;

import android.os.Bundle;
import android.util.Log;
import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.google.gson.Gson;

public class MainActivity extends SherlockFragmentActivity {
    public static final String TAG = "GDG Minsk";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_main);

        // Use our jar-as-local-file dependency
        Gson gson = new Gson();
        Log.d(TAG, "Json: " + gson.toJson("Hello Gdg minsk"));
    }

}
