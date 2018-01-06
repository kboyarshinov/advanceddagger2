package com.kboyarshinov.advanceddagger2;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.kboyarshinov.advanceddagger2.store.StoreActivity;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class StoreActivityTest {

    @Rule
    public ActivityTestRule<StoreActivity> activityActivityTestRule = new ActivityTestRule<>(StoreActivity.class);

    @Test
    public void activityDisplays1Product() throws Exception {
        onView(withId(R.id.products_number))
                .check(matches(withText("Products: 1")));
    }
}