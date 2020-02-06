package languagebasics;

import org.junit.Assert;
import org.junit.Test;

public class ArbitraryNumberOfArgumentsTest {

    private ArbitraryNumberOfArguments arbitraryNumberOfArguments = new ArbitraryNumberOfArguments();

    @Test
    public void countArgumentsTest_noArguments() {
        int count = arbitraryNumberOfArguments.countArguments();

        Assert.assertEquals(0, count);
    }

    @Test
    public void countArgumentsTest_sequenceOfArguments() {
        int count = arbitraryNumberOfArguments.countArguments("one", "two");

        Assert.assertEquals(2, count);
    }

    @Test
    public void countArgumentsTest_argumentArray() {
        String[] args = new String[]{"one", "two", "three"};

        int count = arbitraryNumberOfArguments.countArguments(args);

        Assert.assertEquals(3, count);
    }
}