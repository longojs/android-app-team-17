package schedulingapp.team17.cmsc355.com.schedulingapp;

import android.support.test.rule.ActivityTestRule;
import android.view.View;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Rodolfo on 11/17/17.
 */
public class AlarmsUnitTest {

    @Rule
    //this is what launches the activity
    public ActivityTestRule<Alarms> alarmsActivityTestRule = new ActivityTestRule<Alarms>(Alarms.class);

    private Alarms alarmsActivity = null;

    //This executes before you execute the test case
    //here are the set up for the test launch
    @Before
    public void setUp() throws Exception {
        alarmsActivity = alarmsActivityTestRule.getActivity();
    }

    @Test
    public void testLaunch() {

        View view = alarmsActivity.findViewById(R.id.timePicker);

        assertNotNull(view);
    }
    //This executes after you execute a test cases
    //HEre is the clean up of the test launch
    @After
    public void tearDown() throws Exception {
        alarmsActivity = null;

    }

}