package demo;

import org.junit.Test;
import static org.junit.Assert.*;

public class Apptest {
    Test public void testAppHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }
}