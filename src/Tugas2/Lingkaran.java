/*
 * Nama : M.Taufiq Sauma H.
 * NIM  : 18104410131
 * Kelas: TI C
 */
package Tugas2;

import java.util.Scanner;

public class Lingkaran {
    public static void main(String[] args) {
            float r, d, luas, keliling, phi = (float) 3.14;
            Scanner scan = new Scanner(System.in);
            System.out.print("Masukkan panjang Diagonal lingkaran : ");
            d = scan.nextFloat();
            System.out.print("Masukkan panjang jari-jari lingkaran : ");
            r = scan.nextFloat();
            luas =  (phi * r * r);
            keliling =  (phi * d); 
            System.out.println("Luas Lingkaran adalah "+luas +" cm2");
            System.out.println("Keliling Lingkaran adalah "+keliling +" cm");

    }
    
}
