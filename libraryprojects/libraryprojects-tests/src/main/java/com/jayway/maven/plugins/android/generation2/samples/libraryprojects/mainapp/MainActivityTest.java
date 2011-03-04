package com.jayway.maven.plugins.android.generation2.samples.libraryprojects.mainapp;

import android.test.ActivityInstrumentationTestCase2;
import com.jayway.android.robotium.solo.Solo;

/**
 * Tests that {@link MainActivity} displays correct data from its libraries.
 *
 * @author hugo.josefson@jayway.com
 */
public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

    private Solo robotium;

    public MainActivityTest() {
        super("com.jayway.maven.plugins.android.generation2.samples.libraryprojects.mainapp", MainActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        robotium = new Solo(getInstrumentation(), getActivity());
    }

    /**
     * Tests that the framework launches at all.
     */
    public void testFrameworkLaunches() {
    }

}
