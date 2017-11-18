package schedulingapp.team17.cmsc355.com.schedulingapp;

import android.support.test.rule.ActivityTestRule;
import android.view.View;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by josephlongo on 11/17/17.
 */
public class ScheduleCreatorTest {
    @Rule
    public ActivityTestRule<ScheduleCreator> colorsActivityTestRule = new ActivityTestRule<ScheduleCreator>(ScheduleCreator.class);

    private ScheduleCreator mActivity = null;


    @Before
    public void setUp() throws Exception {
        mActivity = colorsActivityTestRule.getActivity();
    }

    @Test
    public void testLaunch() {
        View viewPink = mActivity.findViewById(R.id.button63);
        assertNotNull(viewPink);

        View viewDeepOrange = mActivity.findViewById(R.id.button30);
        assertNotNull(viewDeepOrange);

        View viewGreen = mActivity.findViewById(R.id.button32);
        assertNotNull(viewGreen);

        View viewOrange = mActivity.findViewById(R.id.button31);
        assertNotNull(viewOrange);

    }

    @After
    public void tearDown() throws Exception {
        mActivity = null;
    }

}