package Lesson15.Task4;

import java.util.Arrays;

public class DynamicArray<T> {
    private int countOfElements = 0;
    private T[] array;

    public DynamicArray() {
        int DEFAULT_SIZE = 15;
        this.array = (T[]) new Object[DEFAULT_SIZE];
    }

    public DynamicArray(int startSize) {
        this.array = (T[]) new Object[startSize];
    }

    // Размер массива(кол-во элементов)
    public int size() {
        return countOfElements;
    }

    // Добавление элемента в конец
    public void add(T element) {
        if (countOfElements == array.length) {
            array = updateArray();
        }
        array[countOfElements] = element;
        countOfElements++;
    }

    // Удаление последнего элемента
    public void remove() {
        if (countOfElements > 0) {
            array[countOfElements - 1] = null;
            countOfElements--;
        }
    }

    // Удаление элемента по индексу
    public void remove(int index) {
        if (index >= 0 && index < countOfElements) {
            for (int i = index; i < countOfElements; i++) {
                array[i] = array[i + 1];
            }
            array[countOfElements] = null;
            countOfElements--;
        } else throw new IndexOutOfBoundsException("Вы просите элемент: " + index + ", а крайний элемент находится под индексом: " + (countOfElements - 1));
    }

    // Удаление элемента по содержанию
    public void remove(T element) {
        this.remove(find(element));
    }

    // Получение элемента по индексу
    public T find(int index) {
        try {
            return array[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new ArrayIndexOutOfBoundsException("Вы просите элемент: " + index + ", а крайний элемент находится под индексом: " + (countOfElements - 1));
        }
    }

    // Получение индекса по содержание(-1 если нет совпадения)
    public int find(T element) {
        for (int i = 0; i < countOfElements; i++) {
            if(array[i] == element) {
                return i;
            }
        }
        return -1;
    }

    // Содержит ли массив, данный элемент
    public boolean contains(T element) {
        for(int i = 0; i < countOfElements; i++) {
            if(array[i] == element) {
                return true;
            }
        }
        return false;
    }

    // Очистка всего массива
    public void clear() {
        for (int i = 0; i < countOfElements; i++) {
            array[i] = null;
        }
    }

    // Увеличение размера массива(+5)
    private T[] updateArray() {
        T[] newArray = (T[]) new Object[array.length + 5];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }

    @Override
    public String toString() {
        return  Arrays.toString(array);
    }
}
