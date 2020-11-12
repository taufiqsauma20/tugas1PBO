/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tugas8;

/**
 *
 * @author Hendy PC
 * Nama : M.Taufiq Sauma Hendy
 * NIM  : 18104410131
 * Kalau copy Izin Dulu
 */
public class MainOperasi {
    public static void main(String[] args) {
        MainOperasi main = new MainOperasi();
        main.tampilkanSemua();
    }
    private void tampilkanSemua(){
        OperasiBilangan ob;
        ob=new Penjumlahan();
        ((Penjumlahan)ob).Penjumlahan(10.5, 0.5);
        ((Penjumlahan)ob).tampilkan();
        
        Perkalian perkalian=new Perkalian();
        OperasiBilangan ob2=(OperasiBilangan)perkalian;
        ob2.setA(10.5);
        ob2.setB(0.5);
        ob2.tampilkan();
        
        Pembagian pembagian=new Pembagian();
        OperasiBilangan ob3=pembagian;
        ob3.setA(10.5);
        ob3.setB(0.5);
        ob3.tampilkan();
    }
}