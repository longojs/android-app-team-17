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
public class AlarmsUnitTestButtons {
    @Rule
    public ActivityTestRule<Alarms> alarmsActivityTestRule= new ActivityTestRule<Alarms>(Alarms.class);
    private Alarms alarmsActivity = null;
    private AlarmReciever alarmReciever = null;

    @Before
    public void setUp() throws Exception {
        alarmsActivity = alarmsActivityTestRule.getActivity();
    }
    @Test
    public void testLaunch() {
        View btnTP = alarmsActivity.findViewById(R.id.btnAlarmTP);
        View btnCD = alarmsActivity.findViewById(R.id.alarmCD);
        assertNotNull(btnTP);
        assertNotNull(btnCD);
    }

    @After
    public void tearDown() throws Exception {
        alarmsActivity = null;
        alarmReciever = null;

    }
}