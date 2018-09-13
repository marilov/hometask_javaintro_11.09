package com.sokyrko;

public class Main {

    public static void main(String[] args) {

        // Дано:
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};

        // Задача 1

        for (int i = 0; i < numbers.length; i++)
            if (numbers[i] == 15) {
                System.out.println("Индекс элемента со значением 15 = " + i);
            }

         // Задача 2
        int i = 0;
        while (i<numbers.length && numbers[i] != 18) {
            i++;
        }
        if(i>=numbers.length)
        System.out.println("Такого элемента нет в массиве");

        // Задача 3
        for (i = 0; i < numbers.length; i++) {
            if(numbers[i]%2 == 0){
                System.out.print(numbers[i] + ", ");
            }
        }

        // Задача 4
        int max = numbers[0];

        for (i = 0; i < numbers.length; i++){
            if (numbers[i] > max){
                max = numbers[i];
            }
        }
        System.out.println("\n" + "Наибольшее число в массиве: " + max);
    }
}
