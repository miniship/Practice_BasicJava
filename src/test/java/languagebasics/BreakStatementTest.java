package languagebasics;

import org.junit.Assert;
import org.junit.Test;

public class BreakStatementTest {

    private final BreakStatement breakStatement = new BreakStatement();

    @Test
    public void searchInMatrixWithLabeledBreakNotFound() {
        int count = breakStatement.searchInMatrixWithLabeledBreak(123);

        Assert.assertEquals(12, count);
    }

    @Test
    public void searchInMatrixWithLabeledBreakFound() {
        int count = breakStatement.searchInMatrixWithLabeledBreak(78);

        Assert.assertEquals(6, count);
    }

    @Test
    public void searchInMatrixWithUnlabeledBreakNotFound() {
        int count = breakStatement.searchInMatrixWithUnlabeledBreak(123);

        Assert.assertEquals(12, count);
    }

    @Test
    public void searchInMatrixWithUnlabeledBreakFound() {
        int count = breakStatement.searchInMatrixWithUnlabeledBreak(78);

        Assert.assertEquals(10, count);
    }
}