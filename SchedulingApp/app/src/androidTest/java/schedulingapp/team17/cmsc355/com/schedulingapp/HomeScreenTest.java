package schedulingapp.team17.cmsc355.com.schedulingapp;

import android.support.test.rule.ActivityTestRule;
import android.view.View;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

/**
<<<<<<< HEAD
 * Created by mekonneny on 11/17/17.
=======
 * Created by josephlongo on 11/17/17.
>>>>>>> e41dc4eb6229401f6e07c6d8ea9c8a3bf36e3f79
 */
public class HomeScreenTest {
    @Rule
    public ActivityTestRule<HomeScreen> colorsActivityTestRule = new ActivityTestRule<HomeScreen>(HomeScreen.class);

    private HomeScreen mActivity = null;

<<<<<<< HEAD
    @Before
    public void setUp() throws Exception {

       mActivity = colorsActivityTestRule.getActivity();

    }

    @Test
    public void testLaunch()
    {
        View view = mActivity.findViewById(R.id.button28);

        assertNotNull(view);
=======

    @Before
    public void setUp() throws Exception {
     mActivity = colorsActivityTestRule.getActivity();
    }

    @Test
    public void testLaunch() {
        View viewRed = mActivity.findViewById(R.id.button28);
        assertNotNull(viewRed);

        View viewBlue = mActivity.findViewById(R.id.button14);
        assertNotNull(viewBlue);

        View viewTeal = mActivity.findViewById(R.id.button26);
        assertNotNull(viewTeal);

        View viewPurple = mActivity.findViewById(R.id.button27);
        assertNotNull(viewPurple);
>>>>>>> e41dc4eb6229401f6e07c6d8ea9c8a3bf36e3f79
    }

    @After
    public void tearDown() throws Exception {
        mActivity = null;
    }

<<<<<<< HEAD

=======
>>>>>>> e41dc4eb6229401f6e07c6d8ea9c8a3bf36e3f79
}