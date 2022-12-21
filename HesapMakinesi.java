package Metotlar;

import java.util.Scanner;

public class HesapMakinesi {

    static int sum(int a, int b) {
        int result = a + b;
        System.out.println("Toplama İşleminin Sonucu : " + result);
        return result;
    }

    static int minus(int a, int b) {
        int result = a - b;
        System.out.println("Çıkarma İşleminin Sonucu : " + result);
        return result;
    }

    static int times(int a, int b) {
        int result = a * b;
        System.out.println("Çarpma İşleminin Sonucu : " + result);
        return result;
    }

    static int divided(int a, int b) {
        if (b == 0) {
            System.out.println("Bölen Sıfırdan Farklı Olmalı");
            return 0;
        }
        int result = a / b;
        System.out.println("Bölme İşleminin Sonucu : " + result);
        return result;
    }

    static int power(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        System.out.println("Çarpma İşleminin Sonucu : " + result);
        return result;
    }

    static int mod(int a, int b) {
        int result = a % b;
        System.out.println("Mod İşleminin Sonucu : " + result);
        return result;
    }

    static int rectangle(int a, int b) {
        int result = a * b;
        System.out.println("Dikdörtgenin Alanı : " + result);
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select;

        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarmpa İşlemi\n"
                + "4- Bölme İşlemi\n"
                + "5- Üslü Sayı Hesabı\n"
                + "6- Mod Alma\n"
                + "7- Dikdörtgen Alan Hesabı\n"
                + "0- Çıkış";

        while (true) {
            System.out.println("********************");
            System.out.println(menu);
            System.out.print("Yapmak İstediğiniz İşlemi Seçiniz : ");
            select = input.nextInt();
            if (select == 0) {
                System.out.print("Çıkış Yapılıyor...");
                break;
            }
            System.out.print("İlk Sayıyı Girin : ");
            int a = input.nextInt();
            System.out.print("İkinci Sayııy Girin : ");
            int b = input.nextInt();
            switch (select) {
                case 1:
                    sum(a, b);
                    break;
                case 2:
                    minus(a, b);
                    break;
                case 3:
                    times(a, b);
                    break;
                case 4:
                    divided(a, b);
                    break;
                case 5:
                    power(a, b);
                    break;
                case 6:
                    mod(a, b);
                    break;
                case 7:
                    rectangle(a, b);
                    break;
                default:
                    System.out.println("Geçersiz Bir işlem Girdiniz");
            }
        }
    }
}
