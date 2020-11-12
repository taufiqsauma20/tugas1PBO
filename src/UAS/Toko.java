/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package UAS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 *
 * @author Hendy PC
 * Nama : M.Taufiq Sauma Hendy
 * NIM  : 18104410131
 * Kalau copy Izin Dulu
 */
public class Toko implements Pajak{
 public List<Vendor> listData = new ArrayList<>();
   Vendor vendor;
    
public void show (){
//       
//    for (int i=0;i<2;i++){
//    Vendor vendor = new Vendor();
//    Scanner scan1 = new Scanner (System.in);
//    vendor.setNamaVendor = (namaVendor);
//   Vendor vendor = new Vendor();
//    Scanner scan1 = new Scanner (System.in);
//    vendor.setNamaVendor = (namaVendor);
//    Vendor vendor = new Vendor();
//    Scanner scan1 = new Scanner (System.in);
//    vendor.setNamaVendor = (namaVendor);
//    }
//}
//            
//            .setNamaVendor("ASUS ROG");
//    
//    
//    vendor.setProdukVendor("ROG");
//    vendor.setHargaVendor(18000000);
//   
//    String NamaVendor_1 = vendor.getNamaVendor();
//    String ProdukVendor_1 = vendor.getProdukVendor();
//    double HargaVendor_1 = vendor.getHargaVendor();
//    
//    
  }    



public static void main(String[] args) {
    DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
    DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

    formatRp.setCurrencySymbol("Rp. ");
    formatRp.setMonetaryDecimalSeparator(',');
    formatRp.setGroupingSeparator('.');


    Vendor objekKelas_1 = new Vendor();
    objekKelas_1.setNamaVendor("ASUS");
    objekKelas_1.setProdukVendor("ROG");
    objekKelas_1.setHargaVendor(18000000);
    
    String NamaVendor_1 = objekKelas_1.getNamaVendor();
    String ProdukVendor_1 = objekKelas_1.getProdukVendor();
    double HargaVendor_1 = objekKelas_1.getHargaVendor();
    
    kursIndonesia.setDecimalFormatSymbols(formatRp);
    System.out.println("Nama Brand   : " + NamaVendor_1);
    System.out.println("Jenis Produk : " + ProdukVendor_1);
    System.out.println("Harga Produk : " + (HargaVendor_1));
    System.out.println("================================");
    
      
    
    Vendor objekKelas_2 = new Vendor();
    objekKelas_2.setNamaVendor("ACER");
    objekKelas_2.setProdukVendor("Predator");
    objekKelas_2.setHargaVendor(15000000);
    
    String NamaVendor_2 = objekKelas_2.getNamaVendor();
    String ProdukVendor_2 = objekKelas_2.getProdukVendor();
    double HargaVendor_2 = objekKelas_2.getHargaVendor();
    
    System.out.println("Nama Brand   : " + NamaVendor_2);
    System.out.println("Jenis Produk : " + ProdukVendor_2);
    System.out.println("Harga Produk : " + (HargaVendor_2));
    System.out.println("================================");
    
    

    Vendor objekKelas_3 = new Vendor();
    objekKelas_3.setNamaVendor("ASUS");
    objekKelas_3.setProdukVendor("ROG");
    objekKelas_3.setHargaVendor(18450000);
    
    String NamaVendor_3 = objekKelas_3.getNamaVendor();
    String ProdukVendor_3 = objekKelas_3.getProdukVendor();
    double HargaVendor_3 = objekKelas_3.getHargaVendor();
    
    System.out.println("Nama Brand   : " + NamaVendor_3);
    System.out.println("Jenis Produk : " + ProdukVendor_3);
    System.out.println("Harga Produk : " + kursIndonesia.format(HargaVendor_3));
    System.out.println("================================");

    Vendor objekKelas_4 = new Vendor();
    objekKelas_4.setNamaVendor("ACER");
    objekKelas_4.setProdukVendor("Predator");
    objekKelas_4.setHargaVendor(15350000);
    
    String NamaVendor_4 = objekKelas_4.getNamaVendor();
    String ProdukVendor_4 = objekKelas_4.getProdukVendor();
    double HargaVendor_4 = objekKelas_4.getHargaVendor();
    
    System.out.println("Nama Brand   : " + NamaVendor_4);
    System.out.println("Jenis Produk : " + ProdukVendor_4);
    System.out.println("Harga Produk : " + kursIndonesia.format(HargaVendor_4));
    System.out.println("================================");
    }

public void hitung(){
    double hargabruto;
//    hargabruto= ( * PERSEN) + harga netto;
}
}
