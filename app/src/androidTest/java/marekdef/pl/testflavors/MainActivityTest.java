package marekdef.pl.testflavors;

import android.test.ActivityInstrumentationTestCase2;
import android.view.KeyEvent;
import android.view.View;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

    private MainActivity mActivity;

    public MainActivityTest() {

        super(MainActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();

        mActivity = getActivity();
    }

    public void testTexts() throws Exception{
        View viewById = mActivity.findViewById(R.id.app);
        assertNotNull(viewById);

        getInstrumentation().sendKeySync(new KeyEvent(KeyEvent.ACTION_UP, KeyEvent.KEYCODE_MENU));
        getInstrumentation().waitForIdleSync();
    }
}