/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tugas7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Hendy PC
 * Nama : M.Taufiq Sauma Hendy
 * NIM  : 18104410131
 * Kalau copy Izin Dulu
 */
public class TokoBuku {
    String[] judul = new String[40];
    String[] nama = new String[40];
    String[] penerbit = new String[40];
    String[] tahun = new String[40];
    String[] umur = new String[40];

    public void InputBuku(){
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        try{
            for(int i=1; i<4; i++){
                System.out.println();
                System.out.println(" Data Buku "+i);
                System.out.print(" Masukkan Judul Buku\t\t\t: ");
                judul[i] = input.readLine();
                System.out.print(" Masukkan Nama Pengarang Buku\t\t: ");
                nama[i] = input.readLine();
                System.out.print(" Masukkan Penerbit Buku\t\t\t: ");
                penerbit[i] = input.readLine();
                System.out.print(" Masukkan Tahun Cetak Buku\t\t: ");
                tahun[i] = input.readLine();
                System.out.print(" Masukkan Kategori Umur (SU/R/D/A)\t: ");
                umur[i] = input.readLine();
            }
        }catch(IOException e){
            System.out.println(" Error");
        }
    }
    
    public void ShowBuku(){
        System.out.println("");
        System.out.println("\t DATA OUTPUT");
        for(int i=1; i<4; i++){
            System.out.println("");
            System.out.println(" Data Buku ke-"+i);
            System.out.println(" Judul Buku \t\t: "+judul[i]);
            System.out.println(" Nama Pengarang Buku \t: "+nama[i]);
            System.out.println(" Penerbit Buku \t\t: "+penerbit[i]);
            System.out.println(" Tahun Cetak Buku \t: "+tahun[i]);
            System.out.print(" Kategori Umur \t\t: ");
                switch(this.umur[i]){
                    case "SU":
                        System.out.println(" Semua Umur");
                        break;
                    case "R":
                        System.out.println(" Remaja");
                        break;
                    case "D":
                        System.out.println(" Dewasa");
                        break;
                    case "AD":
                        System.out.println(" Anak-anak");
                        break;
                    default:
                        System.out.println(" Tidak Terkategorikan");          
            }
        }
    }
}