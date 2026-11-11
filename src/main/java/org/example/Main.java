package org.example;

public class Main {

    public static boolean isPalindrome(int number) {

        String sayi = String.valueOf(Math.abs(number));

        String ters = new StringBuilder(sayi).reverse().toString();

        return sayi.equals(ters);
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }

        int toplam = 0;

        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                toplam += i;
            }
        }

        return toplam == number;
    }

    public static String numberToWords(int number) {
        if (number < 0) {
            return "Invalid Value";
        }

        String[] birler = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};

        StringBuilder kelimeler = new StringBuilder();

        int basamakSayisi = getDigitCount(number);
        int tersSayi = reverse(number);

        for (int i = 0; i < basamakSayisi; i++) {
            int rakam = tersSayi % 10;
            kelimeler.append(birler[rakam]).append(" ");
            tersSayi /= 10;
        }

        return kelimeler.toString().trim();
    }

    public static int reverse(int number) {
        int ters = 0;

        while (number != 0) {
            ters = ters * 10 + number % 10;
            number /= 10;
        }

        return ters;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }

        if (number == 0) {
            return 1;
        }

        int basamakSayisi = 0;

        while (number > 0) {
            basamakSayisi++;
            number /= 10;
        }

        return basamakSayisi;
    }
}