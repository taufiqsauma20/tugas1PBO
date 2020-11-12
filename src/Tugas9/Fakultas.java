/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tugas9;

/**
 *
 * @author Hendy PC
 * Nama : M.Taufiq Sauma Hendy
 * NIM  : 18104410131
 * Kalau copy Izin Dulu
 */
public class Fakultas implements Informatika, Siskom{
    @Override
    public void dekan1() {
        System.out.println("Dekan Informatika : Ano");
    }
    @Override
    public void dosen1() {
        System.out.println("Dosen Informatika : Ani");
    }
    @Override
    public void mhs1() {
        System.out.println("Mahasiswa Informatika : Anu");
    }
    @Override
    public void dekan2() {
        System.out.println("Dekan Siskom : Beni");
    }
    @Override
    public void dosen2() {
        System.out.println("Dosen Siskom : Beno");
    }
    @Override
    public void mhs2() {
        System.out.println("Mahasiswa Siskom : Bene");
    }
}
