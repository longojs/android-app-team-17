package schedulingapp.team17.cmsc355.com.schedulingapp;

//Test for User Story 3
import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class SchedulingAppTest {

    @Rule
    public ActivityTestRule<HomeScreen> mActivityTestRule = new ActivityTestRule<>(HomeScreen.class);

    @Test
    public void schedulingAppTest() {
        ViewInteraction appCompatButton = onView(
                allOf(withId(R.id.btnFindTime), withText("Button"), isDisplayed()));
        appCompatButton.perform(click());

        ViewInteraction appCompatButton2 = onView(
                allOf(withId(R.id.button2), withText("Click"), isDisplayed()));
        appCompatButton2.perform(click());
    }
    @Test
    public void MeetingTimeTest() {
        ViewInteraction appCompatButton = onView(
                allOf(withId(R.id.btnFindTime), withText("Button"), isDisplayed()));
        appCompatButton.perform(click());

        ViewInteraction appCompatButton2 = onView(
                allOf(withId(R.id.button2), withText("Click"), isDisplayed()));
        appCompatButton2.perform(click());


        ViewInteraction appCompatButton3 = onView(
                allOf(withId(R.id.button15), withText("Choose"), isDisplayed()));
        appCompatButton3.perform(click());
    }
     @Test
    public void MeetingDayTest() {
        ViewInteraction appCompatButton = onView(
                allOf(withId(R.id.btnFindTime), withText("Button"), isDisplayed()));
        appCompatButton.perform(click());

        ViewInteraction appCompatButton2 = onView(
                allOf(withId(R.id.button2), withText("Click"), isDisplayed()));
        appCompatButton2.perform(click());


        ViewInteraction appCompatButton3 = onView(
                allOf(withId(R.id.button15), withText("Choose"), isDisplayed()));
        appCompatButton3.perform(click());

        ViewInteraction appCompatButton4 = onView(
                allOf(withId(R.id.button19), withText("select"), isDisplayed()));
        appCompatButton4.perform(click());

// Scenario: User Story
}
}

