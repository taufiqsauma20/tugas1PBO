/*
 * Nama : M.Taufiq Sauma H.
 * NIM  : 18104410131
 * Kelas: TI C
 */
package Tugas1;

import java.util.Scanner;


public class KRS {
    public static void main(String[] args) {
            Scanner enter = new Scanner(System.in);
            System.out.println("Masukkan Nama :");
            String NAMA = enter.nextLine();
            System.out.println("Masukkan NIM :");
            String NIM = enter.nextLine();
            System.out.println("Masukkan IP Semester Sebelumnya :");
            String IP = enter.nextLine();
            System.out.println("Masukkan IPK :");
            String IPK = enter.nextLine();
        
            System.out.println(" UNIVERSITAS ISLAM BLITAR");
            System.out.println(" KARTU RENCANA STUDI (KRS)");
            System.out.println("");
            System.out.println("");
            System.out.println("NAMA MAHASISWA    : "+NAMA);
            System.out.println("NIM               : "+NIM);
            System.out.println("");
            System.out.println("-------------------------------------------------------------");
            System.out.println("|  NO  |     Kode    |        Mata Kuliah         |   SKS   |");
            System.out.println("-------------------------------------------------------------");
            System.out.println("|  1   |   TI0001    | Statistika & Probalitik    |   3     |");
            System.out.println("|  2   |   TI0002    | Kewirausahaan              |   2     |");
            System.out.println("|  3   |   TI0003    | Sistem Database            |   2     |");
            System.out.println("|  4   |   TI0004    | Desain Web                 |   3     |");
            System.out.println("|  5   |   TI0005    | Prak.Basis Data            |   2     |");
            System.out.println("|  6   |   TI0006    | Pem. Berorientasi Objek    |   2     |");
            System.out.println("|  7   |   TI0007    | Prak.PBO                   |   2     |");
            System.out.println("|  8   |   TI0008    | Bahasa Inggris             |   2     |");
            System.out.println("|  9   |   TI0009    | Interaksi Manusia & Kom.   |   2     |");
            System.out.println("-------------------------------------------------------------");
            System.out.println("|                                      TOTAL SKS  |   20    |");
            System.out.println("-------------------------------------------------------------");
            System.out.println("IP Semester lalu   : "+IP);
            System.out.println("IPK                : "+IPK);
        

     }
    
    
}