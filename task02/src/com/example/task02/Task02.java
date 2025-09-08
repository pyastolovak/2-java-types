package com.example.task02;

public class Task02 {

    public static String solution(String input) {

        long a = Long.parseLong(input);

        if (a >= -128 && a <= 128){
            return"byte";
        } else if(a >= -32_768 && a <= 32_768){
            return"short";
        } else if(a >= -2_147_483_648 && a <= 2_147_483_647){
            return "int";
        } else {
            return "long";
        }
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        String result = solution("12345");
        System.out.println(result);
         */
    }

}
