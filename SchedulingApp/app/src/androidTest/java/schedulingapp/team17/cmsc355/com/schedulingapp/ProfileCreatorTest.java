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
public class ProfileCreatorTest {
    @Rule
    public ActivityTestRule<ProfileCreator> colorsActivityTestRule = new ActivityTestRule<ProfileCreator>(ProfileCreator.class);

    private ProfileCreator mActivity = null;

    @Before
    public void setUp() throws Exception {
        mActivity = colorsActivityTestRule.getActivity();
    }

    @Test
    public void testLaunch() {
        View viewNight = mActivity.findViewById(R.id.NightMode);
        assertNotNull(viewNight);
    }

    @After
    public void tearDown() throws Exception {
        mActivity = null;
    }

}