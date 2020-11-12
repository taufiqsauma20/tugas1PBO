/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tugas5;

/**
 *
 * @author Hendy PC
 * Nama : M.Taufiq Sauma Hendy
 * NIM  : 18104410131
 * Kalau copy Izin Dulu
 */
public class Penilaian {
    public static void main(String[] args) {
        String [] nama = {"Saya","Aku","Kamu"};
        int [][] nil = {{90,88,76,},{96,75,87},{69,70,72}};
        int nilai;
        
        
        System.out.println("------------------------------------------------------------------------------------------------");  
        System.out.println("|Nama\t|Rata-Rata Tugas\t|UTS\t\t|UAS\t\t|Rata-Rata\t|Huruf\t\t|");
        System.out.println("------------------------------------------------------------------------------------------------"); 
    for (int row = 0; row < 3; row++)
    {
        System.out.print("| "+nama[row]+"\t|");
        for (int coloum = 0; coloum<3; coloum++)
        {
       System.out.print("\t"+nil[row][coloum]+"\t");
        }
        nilai=(nil[row][0]+nil[row][1]+nil[row][2])/3;
        System.out.print("\t"+nilai+"\t\t|");
        
        
    if (nilai > 80)
        {
            System.out.println("\tA\t|");
        }
        else if(nilai >70)
        {
            System.out.println("\tB\t|");
        }   
        else if(nilai >60)
        {
            System.out.println("\tC\t|");
        }
        else if(nilai >50)
        {
            System.out.println("\tD\t|");
        }
        else
        {
            System.out.println("\tE\t|");
        }
    }  
 System.out.println("------------------------------------------------------------------------------------------------"); 
    
    
    }
}