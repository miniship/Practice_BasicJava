package languagebasics;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class InnerClass {
    private int size;
    private int[] arrayOfInt;

    private void initArrayOfInt() {
        arrayOfInt = new int[size];
        for (int i = 0; i < size; i++) {
            arrayOfInt[i] = i;
        }
    }

    public InnerClass() {
        size = 15;
        initArrayOfInt();
    }

    public InnerClass(int size) {
        this.size = size;
        initArrayOfInt();
    }

    interface InnerClassIterator extends Iterator<Integer> {}

    private class EvenIterator implements InnerClassIterator {
        private int index;

        @Override
        public boolean hasNext() {
            return index < size;
        }

        @Override
        public Integer next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }

            Integer returnValue = arrayOfInt[index];
            index += 2;
            return returnValue;
        }
    }

    public int sumEvenItems() {
        int sum = 0;
        EvenIterator evenIterator = new EvenIterator();
        while (evenIterator.hasNext()) {
            sum += evenIterator.next();
        }
        return sum;
    }
}
