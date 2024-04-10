package com.telran.hw_2;

//1) В методе main инициализировать 3 переменные примитивного типа и вывести на консоль результат выполнения операций + - *  / %.
//2) Дано трехзначное число. Вывести на экран все цифры этого числа
//Пример: 345
//Вывод в консоль: Число 345 -> 3, 4, 5

public class Main_hw_2 {
    public static void main(String[]args){
        int a = 5;
        int b = 10;
        int c = 15;

        System.out.println(a + b + c);
        System.out.println(a - b - c);
        System.out.println(a * b * c);
        System.out.println(a / b / c);
        System.out.println(a % b % c);

        int number = 345;

        int d = number / 100;
        int e = (number / 10) % 10;
        int f = number % 10;

        System.out.println("Число" + number + "->" + d + "," + e + "," + f +);

    }

}
