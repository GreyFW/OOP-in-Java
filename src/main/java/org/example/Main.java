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

                break;
            }

            case 3: {

                break;
            }
        }
    } // end of main() func;

} // end of Main Class;