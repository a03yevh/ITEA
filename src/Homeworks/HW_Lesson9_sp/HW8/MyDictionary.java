package Homeworks.HW_Lesson9_sp.HW8;

public class MyDictionary {
    private Pair[] pairs;
    private int count;

    public MyDictionary() {
        pairs = new Pair[10];
        count = 0;
    }

    public void add(int key, String value) {
        if (count >= pairs.length) {
            int newSize = pairs.length * 2;
            Pair[] newPairs = new Pair[newSize];
            System.arraycopy(pairs, 0, newPairs, 0, pairs.length);
            pairs = newPairs;
        }

        pairs[count] = new Pair(key, value);
        count++;
    }

    public String getValue(int index) {
        if (index >= 0 && index < count) {
            return pairs[index].getValue();
        } else {
            throw new IndexOutOfBoundsException("Invalid index -> " + index);
        }
    }

    public int getCount() {
        return count;
    }

    private static class Pair {
        private final int key;
        private final String value;

        public Pair(int key, String value) {
            this.key = key;
            this.value = value;
        }

        public int getKey() {
            return key;
        }

        public String getValue() {
            return value;
        }
    }
}