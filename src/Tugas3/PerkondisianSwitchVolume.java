/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tugas3;

import javax.swing.JOptionPane;

/**
 *
 * @author Hendy PC
 * Nama : M.Taufiq Sauma Hendy
 * NIM  : 18104410131
 * Kalau copy Izin Dulu
 */
public class PerkondisianSwitchVolume {

    public static void main(String[] args) {
        int s,p,l,tb;
        double r, d, tt;
        double vol ;
        double phi = 3.14;
        System.out.println("Pemilihan Bangun");
        System.out.println("1.Balok");
        System.out.println("2.Kubus");
        System.out.println("3.Tabung");
        String input=JOptionPane.showInputDialog("Masukan Kode : ");
        int pilihan = Integer.parseInt(input);
        switch (pilihan){
            case 1 :                            
            String P1=JOptionPane.showInputDialog("Masukan Panjang : ");
            p = Integer.parseInt(P1);
            P1=JOptionPane.showInputDialog("Masukan Lebar : ");
            l = Integer.parseInt(P1);
            P1=JOptionPane.showInputDialog("Masukan Tinggi : ");
            tb = Integer.parseInt(P1);
            System.out.println ();
            vol=p*l*tb;
            System.out.println ("Volume Balok = "+vol);
            break;
            
            case 2 :
            String P2=JOptionPane.showInputDialog("Masukan Sisi : ");
            s = Integer.parseInt(P2);
            vol=s*s*s;
            System.out.println ("Volume Kubus = "+vol); 
                break;   
            
            case 3 :                                 
            String P3;
                 P3 = JOptionPane.showInputDialog("Masukkan nilai Diameter tabung : ");
                 d =  Double.parseDouble(P3);
                 P3 = JOptionPane.showInputDialog("Masukkan nilai Tinggi tabung  : ");
                 tt = Double.parseDouble(P3);
                 r = d / 2;
                 vol = (phi *r*r* tt);
                 System.out.println("Volume Tabungnya = "+vol);
                break;  
            default:
                System.out.println("Pilihan anda salah"); 
    }
  }
}