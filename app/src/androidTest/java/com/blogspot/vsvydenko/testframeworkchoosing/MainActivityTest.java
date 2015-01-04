package com.blogspot.vsvydenko.testframeworkchoosing;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

/**
 * Created by vsvydenko on 04.01.15.
 */
public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

    private MainActivity activity;

    public MainActivityTest() {
        super(MainActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        setActivityInitialTouchMode(false);
        activity = getActivity();
    }

    public void testWelcomeText() {

        TextView tView;
        tView = (TextView) activity.findViewById(R.id.txtMain);
        assertNotNull(tView);

        String introText;
        introText = tView.getText().toString();
        assertNotNull(introText);

        assertTrue("Check intro text", introText.equals("Hello world!"));
    }

}
