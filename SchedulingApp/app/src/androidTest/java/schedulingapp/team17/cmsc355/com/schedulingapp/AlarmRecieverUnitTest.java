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
public class AlarmRecieverUnitTest {
    @Rule
    //Remeinder, this is what launches the file or the
    //activiry where we are testing

    public ActivityTestRule<Alarms> alarmsActivityTestRule= new ActivityTestRule<Alarms>(Alarms.class);
    private Alarms alarmsActivity = null;
    private AlarmReciever alarmReciever = null;
    @Before
    public void setUp() throws Exception {
        alarmsActivity = alarmsActivityTestRule.getActivity();
        //alarmReciever = alarmsActivityTestRule.getClass(AlarmReciever.class);
    }
    @Test
    public void testLaunch() {
        View v = alarmsActivity.findViewById(R.id.alarmInputCD);
        assertNotNull(v);
    }
    @After
    public void tearDown() throws Exception {
        alarmsActivity = null;
        alarmReciever = null;
    }

}