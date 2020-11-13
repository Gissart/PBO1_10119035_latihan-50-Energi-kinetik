package com.tugasPBO;
/*Nama      : Argya Aulia Fauzandika
  NIM       : 10119035
  Kelas     : PBO1 / IF1
  Deskripsi : Program ini menampilkan hasil perhitungan energi kinetik berbasis objek
* */

public class Main {
    public static void main(String[] args) {
        Kinetik kinetik = new Kinetik(145, 25);
        System.out.println("Massa : " + kinetik.getMassa() + " g");
        System.out.println("Kecepatan : " + kinetik.getVolume() + " m/s");
        System.out.printf("Energi Kinetik : %.2f joule%n", kinetik.hitung());
        System.out.printf("Karena energi kinetik awalnya 0 maka usaha nya  %.2f joule%n", kinetik.hitung());
    }
}
