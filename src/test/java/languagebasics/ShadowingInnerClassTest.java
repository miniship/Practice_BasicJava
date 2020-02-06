package languagebasics;

import org.junit.Assert;
import org.junit.Test;

public class ShadowingInnerClassTest {

    @Test
    public void test() {
        ShadowingInnerClass shadowingInnerClass = new ShadowingInnerClass();
        ShadowingInnerClass.FirstLevel firstLevel = shadowingInnerClass.new FirstLevel();

        Assert.assertEquals(0, shadowingInnerClass.getX());
        Assert.assertEquals(1, firstLevel.getX());
        Assert.assertEquals(2, firstLevel.methodInFirstLevel(2));
    }
}