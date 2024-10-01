package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите номер задания: ");
        int taskNumber;

        if (scanner.hasNextInt()) {
            taskNumber = scanner.nextInt();
        } else {
            System.out.println("Некорректный ввод.");
            return;
        }

        switch (taskNumber) {
            case 1: {
                Button button = new Button();
                System.out.println("Нажмём на кнопку 1 раз: ");
                button.click();
                System.out.println("Нажмём ещё 4 раза: ");
                button.click();
                button.click();
                button.click();
                button.click();
                break;
            }

            case 2: {
                Balance balance = new Balance();
                System.out.println("Положите вес на правую чашу: ");

                if (scanner.hasNextInt()) {
                    balance.addRight(scanner.nextInt());
                } else {
                    System.out.println("Некорректный ввод.");
                    break;
                }


                System.out.println("Положите вес на левую чашу: ");

                if (scanner.hasNextInt()) {
                    balance.addLeft(scanner.nextInt());
                } else {
                    System.out.println("Некорректный ввод.");
                    break;
                }
                System.out.println("Результат: " + balance.result());

                break;
            }

            case 3: {

                Bell bell = new Bell();
                System.out.println("Сколько раз вы хотите позвонить в колокольчик?");
                int ringAmount;

                if (scanner.hasNextInt()) {
                    ringAmount = scanner.nextInt();
                } else {
                    System.out.println("Некорректный ввод.");
                    break;
                }
                for (int i = 0; i < ringAmount; i++) {
                    bell.sound();
                }

                break;
            }

            default: {
                System.out.println("Нет задания с таким номером.");
                break;
            }
        }
    } // end of main() func;

} // end of Main Class;