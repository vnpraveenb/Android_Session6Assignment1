package com.praveen.session6assignment1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    String username = "praveen";
    String password = "praveen";

    @Test
    public void testUsernameEmpty() throws Exception {
        Validation obj = new Validation("","");
        boolean isEmptyUsername = obj.isUsernameEmpty();
        assertTrue("Username is Empty", isEmptyUsername);
    }

    @Test
    public void testPasswordEmpty() throws Exception {
        Validation obj = new Validation("","");
        boolean isEmptyPassword = obj.isPasswordEmpty();
        assertTrue("Password is Empty", isEmptyPassword);
    }

    @Test
    public void testCorrectCredentialsWrong() throws Exception {
        Validation obj = new Validation("praveen","abcdefg");
        boolean checkCredentials = obj.checkCredentials(username, password);
        assertTrue("Credentials are incorrect. Please check your username and password and try again",  checkCredentials);
    }

    @Test
    public void testCorrectCredentialsCorrect() throws Exception {
        Validation obj = new Validation("praveen","praveen");
        boolean checkCredentials = obj.checkCredentials(username, password);
        assertTrue("Credentials are correct. You may login",  checkCredentials);
    }

}