package Lesson9.TaskTwo;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Dog.eat(); //  через static метод, так как он относиться к классу, а не объекту

        Dog.dog().voice(); // создание обхекта не напрямую, а через статик метод с проверкой(получился singleton)

        Class<?> dogClass = Dog.class; // всеми любимая рефлексия, через открытие приватного конструктора и создания объекта, а затем вызом метода у этого объекта
        Constructor<?> constructor = dogClass.getDeclaredConstructor();
        constructor.setAccessible(true);
        Object dogInstance = constructor.newInstance();
        constructor.setAccessible(false);
        Method voiceMethod = dogClass.getMethod("voice");
        voiceMethod.invoke(dogInstance);
    }
}
