package com.company;

import java.util.Scanner;

class Task3 {
    /**
     * Функция определяет, является ли целое число, введённое пользователем, чётным или нечётным.
     * Если пользователь введёт не целое число, то выводится сообщение об ошибке.
     */
    static void evenOddNumber() {
        int x;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Input an integer value: > ");
            if (scanner.hasNextInt()) {
                x = scanner.nextInt();
                break;
            } else {
                System.out.println("Value is not integer!!! Try again!!!");
                scanner.next();
            }
        }

        if (x % 2 != 0) {
            System.out.println("Number is odd");
        } else {
            System.out.println("Number is even");
        }

    }

}
