package lesson3;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //первое задание - сменить все 0 на 1 и обратно
        System.out.println("Первое задание:");
        int[] arr1 = {0, 1, 0, 1, 1, 1, 0, 0, 1, 0, 0};
        System.out.println("Исходный массив:");
        System.out.println(Arrays.toString(arr1));
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 0) {
                arr1[i] = 1;
            } else arr1[i] = 0;
        }
        System.out.println("Массив после конвертации:");
        System.out.println(Arrays.toString(arr1));

        //Второе задание - вывесть массив из 100 элементов от 1 до 100
        System.out.println("Второе задание:");
        int[] arr2 = new int[100];
        for (int i = 0; i < 100; i++) {
            arr2[i] = i + 1;
        }
        System.out.println("Массив в 100 элементов:");
        System.out.println(Arrays.toString(arr2));

        //Третье задание - все числа меньше 6 увеличить вдвое:
        System.out.println("Третье задание:");
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Исходный массив:");
        System.out.println(Arrays.toString(arr3));
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) {
                arr3[i] *= 2;
            }
        }
        System.out.println("Все элементы меньше 6 увеличены  вдвое:");
        System.out.println(Arrays.toString(arr3));

        //Четвертое задание - в двухмерной нулевой матрице диагонали - единицы
        System.out.println("Четвертое задание:");
        int[][] arr4 = new int[7][7];
        System.out.println("Единицы по диагонялям:");
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (i == j || (i + j == 6)) {
                    arr4[i][j] = 1;
                }
                System.out.print(arr4[i][j] + " ");
            }
            System.out.println();
        }

        //Пятое задание - передать методу len и initialValue, и вернуть массив длиной len с элементами=initialValue
        System.out.println("Пятое задание:");
        int len = 5;
        int initialValue = 7;

        int[] arr5 = task5(len, initialValue);      //вызов метода task5
        System.out.println(Arrays.toString(arr5));


        //Задание 6 - найти максимальный и минимальный элемент массива
        System.out.println("Шестое задание:");
        int[] arr6 = {155, 6, 10, 2, 0, 0, -78, -23, -4, 80, 52, 45, 143};
        int length = arr6.length;
        int max = arr6[0];
        int min = arr6[0];
        for (int i = 0; i < arr6.length - 1; i++) {
            if (arr6[i] > max)
                max = arr6[i];
            if (arr6[i] < min)
                min = arr6[i];
        }
        System.out.println(Arrays.toString(arr6));
        System.out.println("Максимальный элемент: " + max);
        System.out.println("Минимальный элемент: " + min);

        //Задание 7 - вернуть true, если в массиве есть место, где сумма правой и  левой части равны
        System.out.println("Седьмое задание:");
        int[] arr7 = {-2, -20, 2, 2, 1, 2, 2, 10, 1, -2};
        System.out.println(Arrays.toString(arr7));
        System.out.println(checkBalance(arr7));   //вызов метода для проверки*/

        //Задание 8 - метод должен смещать каждый элемент массива на n
        System.out.println("Восьмое задание:");
        int[] arr8 = {5, 0, 11, 55, 8, 1, 2, 7, 6, 15};
        int shift = 2;
        shiftMassive(arr8, shift);
    }


        //Метод ждя задания 8
        public static void shiftMassive(int arr8[], int shift) {
            System.out.println(Arrays.toString(arr8));
            int len = arr8.length;
            int[] shiftArr8 = arr8.clone();

            for (int i = 0; i < len - shift; i++) {
                shiftArr8[i] = arr8[i + shift];
            }

            for (int i = 0; i < shift; i++) {
                shiftArr8[len - shift + i] = arr8[i];
            }
            System.out.println("Сдвиг на "+shift+":");
            System.out.println(Arrays.toString(shiftArr8));
        }


        //метод для задания 7
        public static boolean checkBalance(int[] arr7) {
            boolean answer = false;
            int sum = 0;
            for (int j =0; j<arr7.length; j++){
                sum+=arr7[j];
            }
            int right = sum;
            int left = 0;
            for (int i = 0; i < arr7.length; i++) {
                left = left + arr7[i];
                right = right - arr7[i];
                if (left == right) {
                    answer = true;
                }
            }
                return answer;
            }

        //Метод для задания 5
       public static int[] task5(int len, int initialValue) {
        int[] arr5 = new int[len];
        for (int i = 0; i < len; i++) {
            arr5[i] = initialValue;
        }
        return arr5;
    }
    }

