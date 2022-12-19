package arrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Задача 1.
        // Вывести первые 3 элемента массива (Вывести первые 3 элемента массива используя цикл for).

        int[] nums = {7, -3, 9, -11, 18, 99, 2, 11};
        System.out.println("Исходный массив: " + Arrays.toString(nums));
        System.out.print("Первые 3 элемента:");

        int count = 3;
        for (int i = 0; i < count; i++) {
            System.out.print(" " + nums[i]);
        }
        System.out.println();
        System.out.println();


        // Задача 2.
        // Вывести первую половину массива (Вывести первую половину элементов массива
        //при помощи цикла for).

        int[] nums2 = {7, -3, 9, -11, 18, 99, 2, 11};
        System.out.println("Исходный массив: " + Arrays.toString(nums2));
        System.out.print("Первая половина элементов:");

        for (int i = 0; i < nums2.length / 2; i++) {
            System.out.print(" " + nums2[i]);
        }

        System.out.println();
        System.out.println();


        // Задача 3.
        // Вывести вторую половину массива (Вывести вторую половину элементов массива
        //при помощи цикла for). Реализация задачи должна работать при любом чётном
        //количестве элементов.

        int[] nums3 = {7, -3, 9, -11, 18, 99, 2, 11};
        System.out.println("Исходный массив: " + Arrays.toString(nums3));
        System.out.print("Вторая половина элементов:");

        for (int i = nums3.length / 2; i < nums3.length; i++) {
            System.out.print(" " + nums3[i]);
        }

        System.out.println();
        System.out.println();


        // Задача 4.
        // Вывести все элементы кроме первого и последнего.

        int[] nums4 = {7, -3, 9, -11, 18, 99, 2, 11};
        System.out.print("Элемента массива кроме первого и последнего:");

        for (int i = 1; i < nums4.length - 1; i++) {
            System.out.print(" " + nums4[i]);
        }

        System.out.println();
        System.out.println();


        // Задача 5.
        // Вывести последние 3 элемента массива (Для массива [7, -3, 9, -11, 18, 99, 2, 11]
        //вывод должен быть таким: 99, 2, 11)

        int[] nums5 = {7, -3, 9, -11, 18, 99, 2, 11};
        System.out.println("Исходный массив: " + Arrays.toString(nums5));
        System.out.print("Последние 3 элемента:");

        for (int i = nums5.length - 3; i < nums5.length; i++) {
            System.out.print(" " + nums5[i]);
        }

        System.out.println();
        System.out.println();


        // Задача 6.
        // Вывести чётные элементы массива по порядку (Вывести только чётные элементы
        //массива по порядку (каждый второй элемент). Необходимо будет вывести второй,
        //четвёртый, шестой и т.д. элементы. Позиции (индексы) для необходимых элементов:
        //1, 3, 5...n (постоянное увеличение на 2).

        int[] nums6 = {7, -3, 9, -11, 18, 99, 2, 11};
        System.out.println("Исходный массив: " + Arrays.toString(nums6));
        System.out.print("Чётные элементы по порядку (каждый второй):");

        for (int i = 1; i < nums6.length; i += 2) {
            System.out.print(" " + nums6[i]);
        }
        System.out.println();
        System.out.println();


        // Задача 7.
        // Вывести количество положительных и отрицательных элементов (Необходимо
        //определить количество положительных и отрицательных элементов в массиве и
        //вывести его). В реализации задачи понадобится определить 2 переменные для
        //хранения количества элементов: Одна переменная для хранения количества
        //положительных элементов, допустим positiveCount. Вторая для хранения
        //количества отрицательных элементов, допустим negativeCount. Названия
        //переменных можно выбирать на своё усмотрение.

        int[] nums7 = {7, -3, 9, -11, 18, 99, 2, 11};
        System.out.println("Исходный массив: " + Arrays.toString(nums7));
        int positiveCount = 0;
        int negativeCount = 0;

        for (int num7 : nums7) {
            if (num7 > 0) {
                positiveCount++;
            } else if (num7 < 0) {
                negativeCount++;
            }
        }
        System.out.println("Количество положительных: " + positiveCount);
        System.out.println("Количество отрицательных: " + negativeCount);
        System.out.println();
        System.out.println();


        // Задача 8.
        // Найти максимальный и минимальный элементы массива (Необходимо
        //определить максимальный и минимальный элементы в массиве и вывести их).

        int[] nums8 = {7, -3, 9, -11, 18, 99, 2, 11};
        System.out.println("Исходный массив: " + Arrays.toString(nums8));
        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 1; i < nums8.length; i++) {
            if (nums8[i] > nums8[maxIndex]) {
                maxIndex = i;
            } else if (nums8[i] < nums8[minIndex]) {
                minIndex = i;
            }
        }
        System.out.println("Максимальный элемент: " + nums[maxIndex]);
        System.out.println("Минимальный элемент: " + nums[minIndex]);
    }
}
