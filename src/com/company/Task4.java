package com.company;

import java.util.Scanner;

class Task4 {
    /**
     * Функция вычисляет и выводит на экран сумму двух целых чисел, введённых пользователем.
     * Если пользователь некорректно ввёл хотя бы одно из чисел, то выводится сообщение об ошибке.
     */
    static void sumOfInteger() {
        int x1, x2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first integer value: > ");
        x1 = getIntValue(scanner);
        System.out.print("Input second integer value: > ");
        x2 = getIntValue(scanner);

        System.out.printf("\n%d + %d = %d", x1, x2, x1+x2);
    }

    /**
     * Функция считывает из консоли введенные пользователем значения
     * @param sc - переменная типа Scanner для получения значения из консоли
     * @return - возвращается значение типа int веденное пользователем
     */
    private static int getIntValue(Scanner sc) {
        int x;
        while (true) {
            if (sc.hasNextInt()) {
                x = sc.nextInt();
                break;
            } else {
                System.out.println("Value is not integer!!! Try again!!!");
                sc.next();
            }
        }
        return x;
    }
}
