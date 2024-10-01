package org.example;

import exceptions.InvalidDimensionException;
import exceptions.InvalidHeightException;
import exceptions.InvalidRadiusException;
import geometry2d.Circle;
import geometry2d.Rectangle;
import geometry3d.Cylinder;

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

                System.out.println("Сколько раз вы хотите нажать на кнопку?");
                int clickAmount;

                if (scanner.hasNextInt()) {
                    clickAmount = scanner.nextInt();
                } else {
                    System.out.println("Некорректный ввод.");
                    break;
                }
                for (int i = 0; i < clickAmount; i++) {
                    button.click();
                }
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

            case 4: {
                OddEvenSeparator separatedNumbersList = new OddEvenSeparator();

                System.out.println("Вводите целые числа для разделения на чётные/нечётные.");
                System.out.println("Когда закончите, введите что-то отличное от целого числа.");

                while (scanner.hasNextInt()) {
                    separatedNumbersList.addNumber(scanner.nextInt());
                }

                separatedNumbersList.even();
                separatedNumbersList.odd();

                break;
            }

            case 5: {

                Table table = new Table(3, 3);
                System.out.println("Таблица для примера уже заполнена.");

                table.setValue(0, 0, 20);
                table.setValue(0, 1, 5);
                table.setValue(1, 1, 4);
                table.setValue(2, 0, 42);
                table.setValue(2, 2, 34);

                System.out.println("Значение в 3-3: " + table.getValue(2, 2));
                System.out.println("Кол-во строк: " + table.rows());
                System.out.println("Кол-во столбцов: " + table.cols());

                String stringedTable = table.toString();
                System.out.println("Переведём таблицу в строку: " + stringedTable);

                System.out.print("Среднее значение таблицы: " + table.average());

                break;
            }

            case 6: {
                double radiusInputted, widthInputted, lengthInputted, heightInputted;
                String output;

                System.out.print("Введите радиус круга: ");
                if (scanner.hasNextDouble()) {
                    radiusInputted = scanner.nextDouble();
                } else {
                    System.out.println("Некорректный ввод.");
                    break;
                }

                System.out.print("Введите ширину прямоугольника: ");
                if (scanner.hasNextDouble()) {
                    widthInputted = scanner.nextDouble();
                } else {
                    System.out.println("Некорректный ввод.");
                    break;
                }

                System.out.print("Введите длину прямоугольника: ");
                if (scanner.hasNextDouble()) {
                    lengthInputted = scanner.nextDouble();
                } else {
                    System.out.println("Некорректный ввод.");
                    break;
                }

                System.out.print("Введите высоту цилиндра: ");
                if (scanner.hasNextDouble()) {
                    heightInputted = scanner.nextDouble();
                } else {
                    System.out.println("Некорректный ввод.");
                    break;
                }

                try {
                    Circle circle = new Circle(radiusInputted);
                    output = circle.toString();
                    System.out.println(output);

                    Rectangle rectangle = new Rectangle(widthInputted, lengthInputted);
                    output = rectangle.toString();
                    System.out.println(output);

                    Cylinder cylinder = new Cylinder(circle, heightInputted);
                    output = cylinder.toString();
                    System.out.println(output);

                } catch (InvalidRadiusException | InvalidDimensionException | InvalidHeightException exception) {
                    System.err.println(exception.getMessage());
                }
            }

            default: {
                System.out.println("Нет задания с таким номером.");
                break;
            }
        }
    } // end of main() func;

} // end of Main Class;