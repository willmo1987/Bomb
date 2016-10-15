package com.will4it.bombframe;

import android.content.Context;

/**
 * author will
 * date 10/10/2016.
 */

public class RunningContext {

    public static Context sAppContext;

    public static void init(Context context) {
        sAppContext = context;
    }

}
