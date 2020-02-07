package languagebasics;

import org.junit.Assert;
import org.junit.Test;

public class InnerClassTest {

    @Test
    public void innerClassTest() {
        InnerClass innerClass1 = new InnerClass(10);
        InnerClass innerClass2 = new InnerClass();

        Assert.assertEquals(30, innerClass1.sumEvenItems());
        Assert.assertEquals(56, innerClass2.sumEvenItems());
    }
}