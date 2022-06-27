package commons;

import org.junit.Assert;

import org.junit.runner.notification.Failure;

import org.junit.internal.runners.model.EachTestNotifier;
import org.openqa.selenium.WebDriver;

import static commons.Logger.log;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class VerifyHelper {

    //private Object thow;
    EachTestNotifier stepNotifier;
    EachTestNotifier executionUnitNotifier;
    private boolean failedStep;
    private boolean ignoredStep;
    Failure failure;

    public static VerifyHelper getData() {
        return new VerifyHelper();

    }

    public boolean checkTrue(boolean condition) {
        boolean pass = true;

        try {
            if (condition == true) {
                log.info(" -------------------------- PASSED -------------------------- ");
            } else {
                log.info(" -------------------------- FAILED -------------------------- ");
            }
            assertTrue(condition);
        } catch (Throwable e) {
            e.printStackTrace();
            failedStep = false;
            stepNotifier.addFailure(e);
            executionUnitNotifier.addFailure(e);
            pass = false;
        }
        return pass;
    }

    public boolean verifyTrue(boolean condition) {
        return checkTrue(condition);
    }

    private boolean checkFailed(boolean condition) {
        boolean pass = true;
        try {
            Assert.assertFalse(condition);
        } catch (Throwable e) {
            pass = false;
        }
        return pass;
    }

    public boolean verifyFalse(boolean condition) {
        return checkFailed(condition);
    }

    private boolean checkEquals(Object expected, Object actual) {
        boolean pass = true;

        try {
            assertEquals(expected, actual);

        } catch (Throwable e) {
            pass = false;
        }
        return pass;
    }

    public boolean verifyEquals(Object expected, Object actual) {
        return checkEquals(expected, actual);
    }

    public boolean titlePage(WebDriver locator, String data) {
        String txt = locator.getTitle();
        if (txt.equals(data)) {
            return true;
        }
        return false;
    }

}