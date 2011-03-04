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

    /**
     * Tests that correct texts appear.
     */
    public void testCorrectTextsAppear() {
        assertTrue(robotium.searchText("Hello World, MainActivity"));
        assertTrue(robotium.searchText("This is from a resource in libraryprojects-lib1."));
        assertTrue(robotium.searchText("This is from a resource in libraryprojects-lib2."));
        assertTrue(robotium.searchText("This is from an asset in libraryprojects-lib1."));
        assertTrue(robotium.searchText("This is from an asset in libraryprojects-lib2."));
        assertTrue(robotium.searchText("This is from a class in libraryprojects-lib1."));
        assertTrue(robotium.searchText("This is from a class in libraryprojects-lib2."));
        assertTrue(robotium.searchText("This is from a java resource in libraryprojects-lib1."));
        assertTrue(robotium.searchText("This is from a java resource in libraryprojects-lib2."));
    }

}
