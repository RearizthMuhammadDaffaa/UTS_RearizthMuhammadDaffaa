/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uts_rearizthmd_a22100146;

/**
 *
 * @author hp
 */
public class Bank {
int Mysaldo;
    int total;
     public Bank(int saldo){
         Mysaldo = saldo;
    }
     void getSaldo(){
      
       System.out.println("Selamat Datang di Bank ABC");
       System.out.println("Saldo saat ini: "+Mysaldo);
         System.out.println("--------------------------");
     }
     void simpanUang(int Simpan){
           Mysaldo += Simpan;
       
         System.out.println("Simpan Uang: "+Simpan);
         System.out.println("Saldo saat ini: "+"Rp." + Mysaldo);
         System.out.println("--------------------------");
     }
     void ambilUang(int ambil){
         if(ambil < Mysaldo){
             Mysaldo -= ambil;
              System.out.println("Ambil uang: "+ambil);
           System.out.println("Saldo saat ini: "+"Rp."+Mysaldo);
            System.out.println("--------------------------");
         }else{  
            System.out.println("Maaf saldo anda kurang");
         }
     }
   
}
