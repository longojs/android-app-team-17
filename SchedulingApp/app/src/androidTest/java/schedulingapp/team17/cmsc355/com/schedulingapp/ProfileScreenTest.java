package schedulingapp.team17.cmsc355.com.schedulingapp;


import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.pressImeActionButton;
import static android.support.test.espresso.action.ViewActions.replaceText;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

//**********************************
//This test belongs to User Story 5*
//**********************************
@LargeTest
@RunWith(AndroidJUnit4.class)
public class ProfileScreenTest {

    @Rule
    public ActivityTestRule<HomeScreen> mActivityTestRule = new ActivityTestRule<>(HomeScreen.class);

    @Test
    public void profileScreenTest() {
        ViewInteraction appCompatButton = onView(
                allOf(withId(R.id.button27), withText("Profile"), isDisplayed()));
        appCompatButton.perform(click());

        ViewInteraction appCompatButton2 = onView(
                allOf(withId(R.id.button19), withText("Create Profile"), isDisplayed()));
        appCompatButton2.perform(click());

        ViewInteraction appCompatEditText = onView(
                allOf(withId(R.id.nameInput), isDisplayed()));
        appCompatEditText.perform(replaceText("John"), closeSoftKeyboard());

        ViewInteraction appCompatEditText2 = onView(
                allOf(withId(R.id.emailInput), isDisplayed()));
        appCompatEditText2.perform(replaceText("john@gmail.com"), closeSoftKeyboard());

        ViewInteraction appCompatButton3 = onView(
                allOf(withId(R.id.submitButton), withText("Create "), isDisplayed()));
        appCompatButton3.perform(click());

        ViewInteraction appCompatButton4 = onView(
                allOf(withId(R.id.button18), withText("Design Schedule"), isDisplayed()));
        appCompatButton4.perform(click());

        ViewInteraction appCompatEditText3 = onView(
                allOf(withId(R.id.dayInput), isDisplayed()));
        appCompatEditText3.perform(replaceText("Monday"), closeSoftKeyboard());

        ViewInteraction appCompatButton5 = onView(
                allOf(withId(R.id.daySubmit), withText("Save Day"), isDisplayed()));
        appCompatButton5.perform(click());

        ViewInteraction appCompatEditText4 = onView(
                allOf(withId(R.id.startTimeInput), isDisplayed()));
        appCompatEditText4.perform(replaceText("09:34"), closeSoftKeyboard());

        ViewInteraction appCompatEditText5 = onView(
                allOf(withId(R.id.endTimeInput), isDisplayed()));
        appCompatEditText5.perform(replaceText("13:22"), closeSoftKeyboard());

        ViewInteraction appCompatButton6 = onView(
                allOf(withId(R.id.startTimeSubmit), withText("Save Start Time"), isDisplayed()));
        appCompatButton6.perform(click());

        ViewInteraction appCompatButton7 = onView(
                allOf(withId(R.id.endTimeSubmit), withText("Save End Time"), isDisplayed()));
        appCompatButton7.perform(click());

        ViewInteraction appCompatEditText6 = onView(
                allOf(withId(R.id.endTimeInput), withText("13:22"), isDisplayed()));
        appCompatEditText6.perform(pressImeActionButton());

        ViewInteraction appCompatButton8 = onView(
                allOf(withId(R.id.button21), withText("Save and Create Another Event"), isDisplayed()));
        appCompatButton8.perform(click());

        ViewInteraction appCompatEditText7 = onView(
                allOf(withId(R.id.dayInput), isDisplayed()));
        appCompatEditText7.perform(replaceText("Tuesday"), closeSoftKeyboard());

        ViewInteraction appCompatButton9 = onView(
                allOf(withId(R.id.daySubmit), withText("Save Day"), isDisplayed()));
        appCompatButton9.perform(click());

        ViewInteraction appCompatEditText8 = onView(
                allOf(withId(R.id.startTimeInput), isDisplayed()));
        appCompatEditText8.perform(replaceText("10:44"), closeSoftKeyboard());

        ViewInteraction appCompatEditText9 = onView(
                allOf(withId(R.id.endTimeInput), isDisplayed()));
        appCompatEditText9.perform(replaceText("14:52"), closeSoftKeyboard());

        ViewInteraction appCompatButton10 = onView(
                allOf(withId(R.id.startTimeSubmit), withText("Save Start Time"), isDisplayed()));
        appCompatButton10.perform(click());

        ViewInteraction appCompatButton11 = onView(
                allOf(withId(R.id.endTimeSubmit), withText("Save End Time"), isDisplayed()));
        appCompatButton11.perform(click());

        ViewInteraction appCompatEditText10 = onView(
                allOf(withId(R.id.endTimeInput), withText("14:52"), isDisplayed()));
        appCompatEditText10.perform(pressImeActionButton());

        ViewInteraction appCompatButton12 = onView(
                allOf(withId(R.id.button22), withText("Save and Return to Previous Screen"), isDisplayed()));
        appCompatButton12.perform(click());

        ViewInteraction appCompatButton13 = onView(
                allOf(withId(R.id.button25), withText("Return to Home Screen"), isDisplayed()));
        appCompatButton13.perform(click());

    }

}
