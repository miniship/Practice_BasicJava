package languagebasics;

import org.junit.Assert;
import org.junit.Test;

public class ContinueStatementTest {

    private final ContinueStatement continueStatement = new ContinueStatement();

    @Test
    public void searchInSentenceWithLabeledContinueNotFound() {
        int index = continueStatement.searchInSentenceWithLabeledContinue("sub");

        Assert.assertEquals(13, index);
    }

    @Test
    public void searchInSentenceWithLabeledContinueFound() {
        int index = continueStatement.searchInSentenceWithLabeledContinue("abc");

        Assert.assertEquals(-1, index);
    }
}