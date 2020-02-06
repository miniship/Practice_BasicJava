package languagebasics;

public class BreakStatement {
    private int[][] matrix = {
        {38, 12, 45, 96},
        {-14, 78, -56, 189},
        {798, 26, -4, 0}
    };

    public int searchInMatrixWithLabeledBreak(int num) {
        int count = 0;

        search:
        for (int[] row : matrix) {
            for (int i : row) {
                count++;
                if (i == num) {
                    break search;
                }
            }
        }
        return count;
    }

    public int searchInMatrixWithUnlabeledBreak(int num) {
        int count = 0;

        for (int[] row : matrix) {
            for (int i : row) {
                count++;
                if (i == num) {
                    break;
                }
            }
        }
        return count;
    }
}
