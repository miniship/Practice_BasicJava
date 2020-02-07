package languagebasics;

import org.junit.Assert;
import org.junit.Test;

public class LocalClassTest {

    @Test
    public void localClassTest() {
        LocalClass localClass = new LocalClass();

        Assert.assertTrue(localClass.validatePhoneNumber("123-456-7890"));
        Assert.assertFalse(localClass.validatePhoneNumber("456-789"));
    }
}