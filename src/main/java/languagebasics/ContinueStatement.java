package languagebasics;

public class ContinueStatement {
    private static final String sentence = "Search for a substring from me";

    public int searchInSentenceWithLabeledContinue(String sub) {
        int max = sentence.length() - sub.length();
        search:
        for (int i = 0; i < max; i++) {
            int j = i;
            int k = 0;
            int n = sub.length();
            while (n-- > 0) {
                if (sentence.charAt(j++)!= sub.charAt(k++)) {
                    continue search;
                }
            }
            return i;
        }
        return -1;
    }
}
