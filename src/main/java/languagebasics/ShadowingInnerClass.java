package languagebasics;

public class ShadowingInnerClass {
    private int x = 0;

    class FirstLevel {
        private int x = 1;

        public int methodInFirstLevel(int x) {
            return x;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
