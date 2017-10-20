package schedulingapp.team17.cmsc355.com.schedulingapp;

//Tests for the Chat box - USer Storie 8
//first is for a user with an account already registered in the firebase
//Second one is for a user with out an account registered in the firebase
//Third one is for when you don't get it in an email

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
import static android.support.test.espresso.action.ViewActions.replaceText;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class ChatTest1 {

    @Rule
    public ActivityTestRule<HomeScreen> mActivityTestRule = new ActivityTestRule<>(HomeScreen.class);

    @Test
    public void chatTest1() {
        ViewInteraction appCompatButton = onView(
                allOf(withId(R.id.button26), withText("Button"), isDisplayed()));
        appCompatButton.perform(click());

        ViewInteraction appCompatEditText = onView(
                allOf(withId(R.id.email), isDisplayed()));
        appCompatEditText.perform(replaceText("rodolfo.d.tinoco@gmail.com"), closeSoftKeyboard());

        ViewInteraction appCompatButton2 = onView(
                allOf(withId(R.id.button_ok), withText("Next"), isDisplayed()));
        appCompatButton2.perform(click());

    }

    @Test
    public void chatTest2() {
        ViewInteraction appCompatButton = onView(
                allOf(withId(R.id.button26), withText("Button"), isDisplayed()));
        appCompatButton.perform(click());

        ViewInteraction appCompatEditText = onView(
                allOf(withId(R.id.email), isDisplayed()));
        appCompatEditText.perform(replaceText("tinocobeniter@mymail.vcu.edu"), closeSoftKeyboard());

        ViewInteraction appCompatButton2 = onView(
                allOf(withId(R.id.button_ok), withText("Next"), isDisplayed()));
        appCompatButton2.perform(click());

    }

    @Test
    public void chatTest3() {
        ViewInteraction appCompatButton = onView(
                allOf(withId(R.id.button26), withText("Button"), isDisplayed()));
        appCompatButton.perform(click());

        ViewInteraction appCompatEditText = onView(
                allOf(withId(R.id.email), isDisplayed()));
        appCompatEditText.perform(replaceText("not a mail"), closeSoftKeyboard());

        ViewInteraction appCompatButton2 = onView(
                allOf(withId(R.id.button_ok), withText("Next"), isDisplayed()));
        appCompatButton2.perform(click());

    }

}
