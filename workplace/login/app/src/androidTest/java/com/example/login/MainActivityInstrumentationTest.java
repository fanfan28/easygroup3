package com.example.login;

import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;


@RunWith(AndroidJUnit4.class)
@LargeTest
public class MainActivityInstrumentationTest {

    private static final String STRING_TO_BE_TYPED = "fanfan";
    private static final String STRING_TO_BE_PASS1="beautiful";
    private static final String STRING_TO_BE_PASS2="abc";

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(
            MainActivity.class);

    @Test
    public void testlogin()
    {   onView(withId(R.id.username)).perform(typeText(STRING_TO_BE_TYPED), closeSoftKeyboard()); //正确用户名
        onView(withId(R.id.password)).perform(typeText(STRING_TO_BE_PASS1), closeSoftKeyboard()); //正确密码
        onView(withId(R.id.btn_one)).perform(click()); //成功登录
        onView(withId(R.id.password)).perform(typeText(STRING_TO_BE_PASS2), closeSoftKeyboard()); //错误密码
        onView(withId(R.id.btn_one)).perform(click()); //登录失败
        onView(withText("退出")).perform(click()); //退出登录*/
    }
}