/*Задача *:
Представим, что в Java нет коллекции типа ArrayList. Создать свой класс, симулирующий работу класса динамической коллекции т.е. создать свою кастомную коллекцию. В
-
основе коллекции будет массив. Кастомная коллекция должна хранить элементы разных классов(т.е. это generic).
Предусмотреть операции(методы):
1. добавления элемента
2. удаления элемента
3. получение элемента по индексу
4. проверка есть ли элемент в коллекции
5. очистка всей коллекции
-
Предусмотреть конструктор без параметров создает массив размером
по умолчанию. Предусмотреть конструктор с задаваемым размером внутреннего массива.
Предусмотреть возможность автоматического расширения коллекции при добавлении элемента в том случае, когда коллекция уже заполнена.*/

package Lesson15.Task4;

public class Main {
    public static void main(String[] args) {
        DynamicArray<Integer> dynamicArray = new DynamicArray<>();

//        dynamicArray.add(1);
//        dynamicArray.add(2);
//        System.out.println(dynamicArray.find(2));
//        System.out.println(dynamicArray);
//        dynamicArray.add(3);
//        dynamicArray.add(4);
//        System.out.println(dynamicArray);
//        dynamicArray.remove();
//        System.out.println(dynamicArray);
//        System.out.println(dynamicArray.contains(4));

        dynamicArray.add(1);
        dynamicArray.add(2);
        dynamicArray.add(1);
        dynamicArray.add(2);
        dynamicArray.add(1);
        dynamicArray.add(2);
        dynamicArray.add(1);
        dynamicArray.add(2);
        System.out.println(dynamicArray.contains(1));
        System.out.println(dynamicArray);
        dynamicArray.remove(7);
        System.out.println(dynamicArray);

    }
}
