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
public class OperasiBilangan {
    double a;
    double b;
    public double getA(){
        return a;
    }
    public void setA(double a){
        this.a=a;
    } 
    public double getB(){
        return b;
    }
    public void setB(double b){
        this.b=b;
    }
    protected void tampilkan(){
        Perkalian p=new Perkalian();
        p.Perkalian(this.a, this.b);
        p.tampilkan();
    }
}
