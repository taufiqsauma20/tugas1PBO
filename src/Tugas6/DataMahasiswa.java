/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tugas6;

import java.util.Scanner;

/**
 *
 * @author Hendy PC
 * Nama : M.Taufiq Sauma Hendy
 * NIM  : 18104410131
 * Kalau copy Izin Dulu
 */
public class DataMahasiswa {
    String nama,nim,prodi,fakultas,email;
    Scanner masukan = new Scanner(System.in);
    
void FillData() {
    System.out.println("------- Masukan Data Mahasiswa -------");
    System.out.print("Masukan Nama: ");
    nama = masukan.nextLine();
    System.out.print("Masukan NIM: ");
    nim = masukan.nextLine();
    System.out.print("Masukan Fakultas: ");
    fakultas = masukan.nextLine();
    System.out.print("Masukan Program Studi: ");
    prodi = masukan.nextLine();
    System.out.print("Masukan Email: ");
    email = masukan.nextLine();
    System.out.println("--------------------------------------");
    }

void ShowData() {
    System.out.println("------- Data Mahasiswa -------");
    System.out.println("Nama\t\t: "+nama);
    System.out.println("NIM\t\t: "+nim);
    System.out.println("Alamat\t\t: "+fakultas);
    System.out.println("Prodi\t\t: "+prodi);
    System.out.println("Email\t\t: "+email);
    System.out.println("------------------------------");
    }

public static void main(String[] args) {
    DataMahasiswa dataMahasiswa = new DataMahasiswa();
    dataMahasiswa.FillData();
    dataMahasiswa.ShowData() ;
    }
}