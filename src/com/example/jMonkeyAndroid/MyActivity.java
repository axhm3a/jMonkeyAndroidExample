package com.example.jMonkeyAndroid;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import com.jme3.app.AndroidHarness;
import com.jme3.system.android.AndroidConfigChooser;

public class MyActivity extends AndroidHarness {
    public MyActivity() {

        appClass = "org.axhm3a.jmonkey.DesktopExample";

        eglConfigType = AndroidConfigChooser.ConfigType.BEST.BEST;
// Exit Dialog title & message
        exitDialogTitle = "Exit?";
        exitDialogMessage = "Press Yes";
// Edit: 25.06.2011: Enable verbose logging
        eglConfigVerboseLogging= true;
// Edit: 30.06.2011: Choose screen orientation
        screenOrientation = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE;
// Edit 12.07.2011: Invert the MouseEvents X (default = true)
        mouseEventsInvertX = true;
// Edit 05.07.2011: Invert the MouseEvents Y (default = true)
        mouseEventsInvertY = true;
    }

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.main);
        //this.app.start();
    }
}
