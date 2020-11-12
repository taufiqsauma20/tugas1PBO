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
public class Perkalian extends OperasiBilangan{
    protected double a;
    protected double b;
    public Perkalian(){     
    }
    public double Perkalian(double a, double b){
        this.a=a;
        this.b=b;
        return 0;
    }
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
        System.out.println("Perkalian : "+this.a+" x "+this.b+" = "+(this.a*this.b));
    }
}