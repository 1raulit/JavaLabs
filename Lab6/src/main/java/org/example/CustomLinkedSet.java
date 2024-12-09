package org.example;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/**
 * Клас, що реалізує типізовану колекцію (Set) на основі однозв'язного списку.
 * @param <T> Тип елементів, що зберігається у колекції.
 */
public class CustomLinkedSet<T> implements Set<T> {

    /**
     * Внутрішній клас, що описує вузол однозв'язного списку.
     */
    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node<T> head; // Голова списку
    private int size;     // Кількість елементів у списку

    /**
     * Порожній конструктор – створює пусту колекцію.
     */
    public CustomLinkedSet() {
        head = null;
        size = 0;
    }

    /**
     * Конструктор, що приймає один об'єкт для додавання до списку.
     * @param element Елемент для додавання.
     */
    public CustomLinkedSet(T element) {
        this();
        add(element);
    }

    /**
     * Конструктор, що приймає колекцію об'єктів для ініціалізації списку.
     * @param collection Колекція об'єктів.
     */
    public CustomLinkedSet(Collection<? extends T> collection) {
        this();
        for (T item : collection) {
            add(item);
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        Node<T> current = head;
        while (current != null) {
            if (current.data.equals(o)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private Node<T> current = head;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public T next() {
                if (!hasNext()) throw new NoSuchElementException();
                T data = current.data;
                current = current.next;
                return data;
            }
        };
    }

    @Override
    public Object[] toArray() {
        Object[] array = new Object[size];
        Node<T> current = head;
        int index = 0;
        while (current != null) {
            array[index++] = current.data;
            current = current.next;
        }
        return array;
    }

    @Override
    public <E> E[] toArray(E[] a) {
        if (a.length < size) {
            a = (E[]) java.lang.reflect.Array.newInstance(a.getClass().getComponentType(), size);
        }
        Node<T> current = head;
        int index = 0;
        while (current != null) {
            a[index++] = (E) current.data;
            current = current.next;
        }
        return a;
    }

    @Override
    public boolean add(T t) {
        if (contains(t)) {
            return false; // Уникнення дублікатів
        }
        Node<T> newNode = new Node<>(t);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        if (head == null) return false;

        if (head.data.equals(o)) {
            head = head.next;
            size--;
            return true;
        }

        Node<T> current = head;
        while (current.next != null) {
            if (current.next.data.equals(o)) {
                current.next = current.next.next;
                size--;
                return true;
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        for (Object item : c) {
            if (!contains(item)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        boolean modified = false;
        for (T item : c) {
            if (add(item)) {
                modified = true;
            }
        }
        return modified;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        boolean modified = false;
        Node<T> current = head;
        Node<T> previous = null;

        while (current != null) {
            if (!c.contains(current.data)) {
                if (previous == null) {
                    head = current.next;
                } else {
                    previous.next = current.next;
                }
                size--;
                modified = true;
            } else {
                previous = current;
            }
            current = current.next;
        }
        return modified;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        boolean modified = false;
        for (Object item : c) {
            while (remove(item)) {
                modified = true;
            }
        }
        return modified;
    }

    @Override
    public void clear() {
        head = null;
        size = 0;
    }

    /**
     * Повертає рядкове представлення списку.
     * @return Рядок, що містить усі елементи списку.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Node<T> current = head;
        while (current != null) {
            sb.append(current.data.getClass().getSimpleName());
            if (current.next != null) {
                sb.append(", ");
            }
            current = current.next;
        }
        sb.append("]");
        return sb.toString();
    }
}