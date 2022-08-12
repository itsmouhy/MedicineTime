package com.mouhy.medicinetime;

import android.app.Application;
import android.content.Context;

/**
 * Created by mouhy on 12/07/17.
 */

public class MedicineApp extends Application {

    private static Context mInstance;


    @Override
    public void onCreate() {
        super.onCreate();
        if (mInstance == null) {
            mInstance = getApplicationContext();
        }
    }

    public static Context getInstance() {
        return mInstance;
    }
}
