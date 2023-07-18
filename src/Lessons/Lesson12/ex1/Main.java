package Lessons.Lesson12.ex1;

class MyClass {
    public <Type> Type convertFromFarenheitToCelsij(Type value) {
        if (value.getClass().equals(Integer.class)) {
            return (Type) (Object) ((Integer) value * (Integer) 3);
        }

        if (value.getClass().equals(Double.class)) {
            return (Type) (Object) ((Double) value * (Double) 3.0);
        }
        return (Type) (Object) 0;
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass cl = new MyClass();
        System.out.println(cl.convertFromFarenheitToCelsij(35));
        System.out.println(cl.convertFromFarenheitToCelsij(10.3));
    }
}