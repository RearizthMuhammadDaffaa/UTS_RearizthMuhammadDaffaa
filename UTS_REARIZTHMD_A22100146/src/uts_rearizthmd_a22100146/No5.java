/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uts_rearizthmd_a22100146;

/**
 *
 * @author hp
 */
public class No5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bank bank1 = new Bank(1000000);
        bank1.simpanUang(500000);
        bank1.getSaldo();
        
        bank1.ambilUang(2000000);
        bank1.ambilUang(300000);
        
        bank1.getSaldo();
       
    }
    
}
