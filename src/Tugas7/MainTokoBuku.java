/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tugas7;

/**
 *
 * @author Hendy PC
 * Nama : M.Taufiq Sauma Hendy
 * NIM  : 18104410131
 * Kalau copy Izin Dulu
 */
public class MainTokoBuku extends TokoBuku{
    
    @Override
    public void InputBuku() {
        super.InputBuku(); 
    }

    @Override
    public void ShowBuku() {
        super.ShowBuku(); 
    }
    
    public static void main(String[] args) {
        MainTokoBuku main = new MainTokoBuku();
        main.InputBuku();
        main.ShowBuku();
}
}
