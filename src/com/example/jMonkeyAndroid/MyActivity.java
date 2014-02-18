package com.example.jMonkeyAndroid;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import com.jme3.app.AndroidHarness;
import com.jme3.system.android.AndroidConfigChooser;

public class MyActivity extends AndroidHarness {
    public MyActivity() {
        appClass = "org.axhm3a.jmonkey.DesktopExample";
        eglConfigType = AndroidConfigChooser.ConfigType.BEST.BEST;
        exitDialogTitle = "Exit?";
        exitDialogMessage = "Press Yes";
        eglConfigVerboseLogging= true;
        screenOrientation = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE;
        mouseEventsInvertX = true;
        mouseEventsInvertY = true;
    }

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}
