/*
 * Nama : M.Taufiq Sauma H.
 * NIM  : 18104410131
 * Kelas: TI C
 */
package Tugas2;

import java.util.Scanner;

public class GerbangLogika {
    public static void main(String[] args) {
        
        boolean a = true;
        boolean b = false;
        
        boolean OR = a || b;
        boolean XOR = a ^ b;
        boolean AND = a && b;
        
        System.out.println(a + " OR " + b + " = " + OR);
        System.out.println(a + " XOR " + b + " = " + XOR);
        System.out.println(a + " AND " + b + " = " + AND);
    }
    
}