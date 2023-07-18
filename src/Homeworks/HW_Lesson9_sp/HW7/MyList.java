package Homeworks.HW_Lesson9_sp.HW7;

public class MyList<T> {
    private Object[] elements;
    private int size;

    public MyList() {
        elements = new Object[10];
        size = 0;
    }

    public void add(T element) {
        if (size == elements.length) {
            Object[] newElements = new Object[elements.length * 2];
            System.arraycopy(elements, 0, newElements, 0, elements.length);
            elements = newElements;
        }
        elements[size] = element;
        size++;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return (T) elements[index];
    }

    public int getSize() {
        return size;
    }
}