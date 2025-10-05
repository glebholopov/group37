/*Задача *:
Задана строка, которая может иметь внутри себя скобки.
Скобкой считается любой из следующих символов - «(«, «)», «[«, «]», «{«, «}».
Проверить сбалансированность расстановки скобок в этой строке. Набор скобок считается сбалансированной парой,
если открывающая скобка "(", "[" и "{" стоит слева от соответствующей закрывающей скобки ")", "]" и "}", соответственно.
Строка, содержащая пары скобок, не сбалансирована, если набор заключенных в нее скобок не совпадает.
Например, если ввод «{[(])}», пара квадратных скобок «[]» заключает в себя одну несбалансированную открывающую круглую скобку «(».
Аналогично, пара круглых скобок «() ", заключает в себя одну несбалансированную
закрывающую квадратную скобку "]". Таким образом, входная строка "{[(])}" несбалансированная.

Пример
() - сбалансирована
[()] - сбалансирована
{[()]} - сбалансирована
([{{[(0)]}}]) - сбалансирована

{{[]()}}}} - не сбалансирована
{[(])} - не сбалансирована*/

package Lesson16.Task3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(isBalanced("([{{[(0)]}}])")); // true
        System.out.println(isBalanced("{[()]}")); // true
        System.out.println(isBalanced("{{[]()}}}}")); // false
        System.out.println(isBalanced("{[(])}")); // false
        System.out.println(isBalanced("((")); // false
        System.out.println(isBalanced("()[]}{")); // false

        System.out.println(isBalanced("()[]{}")); // true
        System.out.println(isBalanced("(([]){})")); // true
    }

    public static boolean isBalanced(String str) {
        List<Character> list = new ArrayList<>();
        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == ')' || ch == '[' || ch == ']' || ch == '{' || ch == '}') {
                list.add(ch);
            }
        }

        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i + 1) == list.get(i) + 1 || list.get(i + 1) == list.get(i) + 2) {
                list.remove(i + 1);
                list.remove(i);
                i = -1;
            }
        }

        return list.isEmpty();
    }
}
