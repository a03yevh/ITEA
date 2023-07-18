package Lessons.Lesson8_Book_LastEx_by_Methods;

public class If {

    public static int If1(int a) {
        if (a > 0) {
            a = a + 1;
        }
        return a;
    }

    public static int If2(int a) {
        if (a > 0) {
            a = a + 1;
        } else {
            a = a - 2;
        }
        return a;
    }

    public static int If3(int a) {
        if (a > 0) {
            a = a + 1;
        } else if (a < 0) {
            a = a - 2;
        } else {
            a = 0;
        }
        return a;
    }

    public static int If4(int a, int b, int c) {
        int count = 0;

        if (a > 0) {
            count++;
        }

        if (b > 0) {
            count++;
        }

        if (c > 0) {
            count++;
        }

        return count;
    }

    public static String If5(int a, int b, int c) {
        int pCount = 0;
        int nCount = 0;

        if (a > 0) {
            pCount++;
        } else {
            nCount++;
        }

        if (b > 0) {
            pCount++;
        } else {
            nCount++;
        }

        if (c > 0) {
            pCount++;
        } else {
            nCount++;
        }

        return "> Positive count: " + pCount + ", negative count: " + nCount;
    }

    public static int If6(int a, int b) {
        int temp = 0;

        if (a > b) {
            temp = a;
        } else {
            temp = b;
        }
        return temp;
    }

    public static int If7(int a, int b) {
        int temp = 0;

        if (a > b) {
            temp = 1;
        } else {
            temp = 2;
        }
        return temp;
    }

    public static String If8(int a, int b) {
        int temp = 0;
        int temp1 = 0;

        if (a > b) {
            temp = a;
            temp1 = b;
        } else {
            temp = b;
            temp1 = a;
        }

        return "> Larger: " + temp + ", Smaller: " + temp1;
    }

    public static String If9(int a, int b) {
        int temp = 0;

        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }

        return "> a: " + a + ", b: " + b;
    }

    public static String If10(int a, int b) {
        if (a != b) {
            a = a + b;
            b = a;
        } else {
            a = 0;
            b = 0;
        }

        return "> a: " + a + ", b: " + b;
    }

    public static void main(String[] args) {
        System.out.println(If1(5));
        System.out.println(If2(3));
        System.out.println(If2(-1));
        System.out.println(If3(0));
        System.out.println(If4(1,2,3));
        System.out.println(If5(1,-2,-3));
        System.out.println(If6(45,15));
        System.out.println(If7(25,24));
        System.out.println(If8(5,8));
        System.out.println(If9(2,5));
        System.out.println(If10(3,3));
    }
}
