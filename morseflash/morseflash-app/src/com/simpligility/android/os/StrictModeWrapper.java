package com.simpligility.android.os;

import android.os.StrictMode;

/**
 * StrictModeWrapper is a wrapper class for the android class android.os.StrictMode provided with Android 2.3 onwards.
 *
 * @author Manfred Moser <manfred@simpligility.com>
 */
public class StrictModeWrapper {
   private static StrictMode strictModeInstance;

    /* class initialization fails when this throws an exception */
   static {
       try {
           Class.forName("android.os.StrictMode", true, Thread.currentThread().getContextClassLoader());
       } catch (Exception ex) {
           throw new RuntimeException(ex);
       }
   }

    /**
     * Check if the class android.os.StrictMode is available at runtime.
     */
   public static void checkAvailable() {}


    /**
     * Call StrictMode.enableDefaults().
     */
    public static void enableDefaults() {
       StrictMode.enableDefaults();
   }
}
