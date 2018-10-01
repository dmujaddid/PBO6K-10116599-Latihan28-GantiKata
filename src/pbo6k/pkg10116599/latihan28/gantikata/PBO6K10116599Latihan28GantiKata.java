/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6k.pkg10116599.latihan28.gantikata;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Robby Eka Purnama
 * KELAS    : PBO6K
 * NIM      : 10116599
 * Deskripsi Program : Program mengganti kata dalam sebuah kalimat dimana user
                        menginputkan sendiri kalimatnya.
 * 
 */
public class PBO6K10116599Latihan28GantiKata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("====Program Mengganti Kata====");
        
        
        
         
        //Kalimat sebelum diganti
        System.out.print("Masukkan kalimat : ");
        Scanner scan = new Scanner(System.in);
        String kalimat = scan.nextLine();
        
        // Kata
        System.out.print("Ganti Kata : ");
        String kata = scan.next();
        
        System.out.print("Menjadi Kata : ");
        String kataBaru = scan.next();
        
        
  
        String kalimatBaru = kalimat.replace(kata, kataBaru);
        
        System.out.println();
        System.out.println("===Hasil Formatting===");
        //System.out.print("Kalimat Awal : " +kalimat);
        //System.out.print("Kalimat Baru : " +kalimatBaru);
        
        
        

        
        
        
        
        
        
        
        
        
    }
    
}
