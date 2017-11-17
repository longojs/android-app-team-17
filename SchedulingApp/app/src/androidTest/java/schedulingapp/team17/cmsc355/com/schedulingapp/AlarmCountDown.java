package schedulingapp.team17.cmsc355.com.schedulingapp;


import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.Espresso.pressBack;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.pressImeActionButton;
import static android.support.test.espresso.action.ViewActions.replaceText;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withClassName;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withParent;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.is;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class AlarmCountDown {

    @Rule
    public ActivityTestRule<HomeScreen> mActivityTestRule = new ActivityTestRule<>(HomeScreen.class);

    @Test
    public void alarmCountDown() {
        ViewInteraction appCompatButton = onView(
                allOf(withId(R.id.btnAlarms), withText("Alarms"), isDisplayed()));
        appCompatButton.perform(click());

        ViewInteraction appCompatEditText = onView(
                allOf(withId(R.id.alarmInputCD), isDisplayed()));
        appCompatEditText.perform(click());

        ViewInteraction appCompatEditText2 = onView(
                allOf(withId(R.id.alarmInputCD), isDisplayed()));
        appCompatEditText2.perform(replaceText("1"), closeSoftKeyboard());

        ViewInteraction appCompatButton2 = onView(
                allOf(withId(R.id.alarmCD), withText("Alarm CountDown"), isDisplayed()));
        appCompatButton2.perform(click());

        ViewInteraction appCompatEditText3 = onView(
                allOf(withId(R.id.alarmInputCD), withText("1"), isDisplayed()));
        appCompatEditText3.perform(pressImeActionButton());

    }

    @Test
    public void alarmSet() {
        ViewInteraction appCompatButton = onView(
                allOf(withId(R.id.btnAlarms), withText("Alarms"), isDisplayed()));
        appCompatButton.perform(click());

        ViewInteraction appCompatButton2 = onView(
                allOf(withId(R.id.btnAlarmTP), withText("Alarm TimePicker"), isDisplayed()));
        appCompatButton2.perform(click());

        pressBack();

    }

    @Test
    public void alarmTrigered() {
        ViewInteraction appCompatButton = onView(
                allOf(withId(R.id.btnAlarms), withText("Alarms"), isDisplayed()));
        appCompatButton.perform(click());

        ViewInteraction appCompatEditText = onView(
                allOf(withId(R.id.alarmInputCD), isDisplayed()));
        appCompatEditText.perform(click());

        ViewInteraction appCompatEditText2 = onView(
                allOf(withId(R.id.alarmInputCD), isDisplayed()));
        appCompatEditText2.perform(click());

        ViewInteraction appCompatEditText3 = onView(
                allOf(withId(R.id.alarmInputCD), isDisplayed()));
        appCompatEditText3.perform(replaceText("1"), closeSoftKeyboard());

        ViewInteraction appCompatButton2 = onView(
                allOf(withId(R.id.alarmCD), withText("Alarm CountDown"), isDisplayed()));
        appCompatButton2.perform(click());

        pressBack();
        appCompatButton.perform(click());
        pressBack();
        appCompatButton.perform(click());
        pressBack();

    }



}
