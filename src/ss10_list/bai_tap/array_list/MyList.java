package ss10_list.bai_tap.array_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    public void add(int index, E element) {
        if (size == elements.length) {
            int newSize = elements.length * 2;
            elements = Arrays.copyOf(elements, newSize);
        }
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + " Size: " + size);
        }
        for (int i = size; i > index; i--) {
            elements[i] = elements[i - 1];
        }
        elements[index] = element;
        size++;
    }

    public E remove(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Index: " + index + " ,Size " + index);
        E temp = (E) elements[index];
        for (int i = index; i < size; i++) {
            elements[i] = elements[i + 1];
        }
        size--;
        return temp;
    }

    public E get(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Index: " + index + " ,Size " + index);

        return (E) elements[index];
    }

    public int size() {
        return size;
    }

    public MyList<E> clone() {
        MyList<E> list = new MyList<>();
        list.ensureCapacity(elements.length);
        list.elements = elements;
        list.size = size;
        return list;
    }

    public boolean contains(E o) {
        for (Object e : elements) {
            if (e == o)
                return true;
        }
        return false;
    }

    public int indexOf(E o) {
        for (int i = 0; i < size; i++) {
            if (elements[i] == o)
                return i;
        }
        return -1;
    }

    public boolean add(E o) {
        if (size == elements.length) {
            int newSize = size * 2;
            elements = Arrays.copyOf(elements, newSize);
        }
        elements[size] = o;
        size++;
        return true;
    }

    public void ensureCapacity(int minCapacity) {
        int newSize = size + minCapacity;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }
}
