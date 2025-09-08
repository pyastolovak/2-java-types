package com.example.task14;

public class Task14 {


    public static int reverse(int value) {

        String str = Integer.toString(value);
        String str2 = new StringBuilder(str).reverse().toString();
        int num =  Integer.parseInt(str2);
        return num;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int result = reverse(345);
        System.out.println(result);
         */
    }


}
