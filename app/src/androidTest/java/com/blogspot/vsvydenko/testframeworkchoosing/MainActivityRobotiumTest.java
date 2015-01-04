package com.blogspot.vsvydenko.testframeworkchoosing;

import com.robotium.solo.Solo;

import android.test.ActivityInstrumentationTestCase2;

/**
 * Created by vsvydenko on 04.01.15.
 */
public class MainActivityRobotiumTest extends ActivityInstrumentationTestCase2<MainActivity> {

    private Solo solo;

    public MainActivityRobotiumTest() {
        super(MainActivity.class);
    }

    public void setUp() throws Exception {
        solo = new Solo(getInstrumentation(), getActivity());
    }

    @Override
    public void tearDown() throws Exception {
        solo.finishOpenedActivities();
    }

    public void testTextItem() throws Exception {

        solo.assertCurrentActivity("wrong activity", MainActivity.class);

        solo.searchText("Hello world!");
    }

}
