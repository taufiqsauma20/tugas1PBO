/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tugas4;

import javax.swing.JOptionPane;

/**
 *
 * @author Hendy PC
 * Nama : M.Taufiq Sauma Hendy
 * NIM  : 18104410131
 * Kalau copy Izin Dulu
 */
public class SegitigaBintang1 {
    public static void main(String[] args) {
        int i, j , tinggi;
        String P1=JOptionPane.showInputDialog("Tinggi Segitiga : ");
        System.out.print("");
        tinggi = Integer.parseInt(P1);
        for (i = 1 ; i <= tinggi; i++) {
            for ( j = 1; j <= i; j++)
                System.out.print("*");
                System.out.println(" ");
        }
    }
}
