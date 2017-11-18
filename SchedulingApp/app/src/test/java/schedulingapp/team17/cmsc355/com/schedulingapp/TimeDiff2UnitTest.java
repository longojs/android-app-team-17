package schedulingapp.team17.cmsc355.com.schedulingapp;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import android.view.View;

import static org.junit.Assert.*;

/**
 * Created by yerikim on 11/17/17.
 */
public class TimeDiff2UnitTest {

    @Rule
    public ActivityTestRule<TimeDiff2> mActivityTestRule = new ActivityTestRule<TimeDiff2>(TimeDiff2.class);
    private TimeDiff2 mActivity = null;



    @Before
    public void setUp() throws Exception {
        mActivity = mActivityTestRule.getActivity();

    }

    @Test
    public void testLaunch()
    {
        View view = mActivity.findViewById(R.id.btnLINT);

        assertNotNull(view);
    }

    @After
    public void tearDown() throws Exception {

        mActivity = null;

    }

}