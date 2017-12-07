package schedulingapp.team17.cmsc355.com.schedulingapp;

import android.support.test.rule.ActivityTestRule;
import android.view.View;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by mekonneny on 11/17/17.
 */
public class HomeScreenTest {
    @Rule
    public ActivityTestRule<HomeScreen> colorsActivityTestRule = new ActivityTestRule<HomeScreen>(HomeScreen.class);

    private HomeScreen mActivity = null;

    @Before
    public void setUp() throws Exception {

       mActivity = colorsActivityTestRule.getActivity();

    }

    @Test
    public void testLaunch()
    {
        View view = mActivity.findViewById(R.id.button28);

        assertNotNull(view);
    }

    @After
    public void tearDown() throws Exception {
        mActivity = null;
    }


}