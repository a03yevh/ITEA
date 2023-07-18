package Lessons.Lesson8_Book_LastEx_by_Methods;
import java.lang.Math;

public class Begin {
    static double a = 5;
    public static double Begin1_cube(double a) {
        double p = 4 * a;
        return p;
    }

    public static double Begin2_Square(double a) {
        double S = a * a;
        return S;
    }

    public static double Begin3_rectangle_S(double a, double b) {
        double S = a * b;
        return S;
    }

    public static double Begin3_rectangle_P(double a, double b) {
        double P = 2 * (a + b);
        return P;
    }

    public static double Begin4_circle_L(double d) {
        double L = 3.14 * d;
        return L;
    }

    public static double Begin5_cube_edge_length_p1(double a) {
        double V = Math.pow(a, 3);
        return V;
    }

    public static double Begin5_cube_edge_length_p2(double a) {
        double S = 6 * Math.pow(a, 2);
        return S;
    }

    public static double Begin6_V(double a, double b, double c) {
        double V = a * b * c;
        return V;
    }

    public static double Begin6_S(double a, double b, double c) {
        double S = 2 * (a * b + b * c + a * c);
        return S;
    }

    public static double Begin7_L(double R) {
        double L = 2 * 3.14 * R;
        return L;
    }

    public static double Begin7_S(double R) {
        double S = 3.14 * Math.pow(R, 2);
        return S;
    }

    public static void main(String[] args) {
        System.out.println(Begin1_cube(a));
        System.out.println(Begin2_Square(a));

        System.out.println(Begin3_rectangle_P(a,3));
        System.out.println(Begin4_circle_L(a));

        System.out.println(Begin5_cube_edge_length_p1(a));
        System.out.println(Begin5_cube_edge_length_p2(a));

        System.out.println(Begin6_V(a,3,6));
        System.out.println(Begin6_S(a,3,6));

        System.out.println(Begin7_L(4));
        System.out.println(Begin7_S(4));
    }
}
