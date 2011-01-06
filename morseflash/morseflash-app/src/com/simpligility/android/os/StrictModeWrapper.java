package com.simpligility.android.os;

import android.os.StrictMode;

/**
 * StrictModeWrapper is a wrapper class for the android class android.os.StrictMode provided with Android 2.3 onwards.
 * It allows usage of StrictMode class on devices/emulators with Android 2.3 or higher, while providing an availability
 * check so that the code can stay in situ for lower platform versions. See the application class for usage.
 *
 * @author Manfred Moser <manfred@simpligility.com>
 *
 * @see "http://android-developers.blogspot.com/2009/04/backward-compatibility-for-android.html"
 * @see "http://android-developers.blogspot.com/2010/12/new-gingerbread-api-strictmode.html"
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

   // More wrappings could be done here but this is all we want for now..
}
