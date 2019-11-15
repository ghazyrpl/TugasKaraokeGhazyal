/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paketkaroke;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author LABKOM01-RPL03
 */
public class ghazy_main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //deklarasi variabel
        String nama;
        int small = 55000, medium = 70000, large = 120000, family = 150000;
        double diskon,setelah_diskon,bayar,kembali; 
        int usia,gaji,pilih,jam,total;
        
        //membuat scanner baru
        Scanner keyboard = new Scanner(System.in);
        
        //Tampilkan output ke user
        System.out.print("Karoke Syariah \n");
        System.out.print("1.ROOM SMALL / RP 55.000 \n");
        System.out.print("2.ROOM MEDIUM / RP 70.000 \n");
        System.out.print("3.ROOM LARGE / RP 120.000 \n");
        System.out.print("4.FAMILY ROOM / RP 150.000 \n");
        
        System.out.print("Pilih No :");
        //menggunakan scannerdan menyimpan apa yang diketik di variabel nama
        pilih = keyboard.nextInt();
        if(pilih == 1){
            System.out.println("Anda memilih ROOM SMALL");
            System.out.print("JAM: ");
             jam = keyboard.nextInt();
             if( jam >3){
                 total = jam * small ;
                 diskon = total * 11.11/100;
                 setelah_diskon = total - diskon;
                 
                 System.out.println("Anda harus membayar sebesar: "+setelah_diskon);
                 
                 System.out.println("Bayar: ");
                 bayar = keyboard.nextDouble();
                 
                 kembali = bayar - setelah_diskon;
                         
                  System.out.println("Kembali: "+kembali+"\n");
                
                 System.out.print("===============================================================\n");
                 System.out.print("RINCIAN TRANSAKSI \n");
                 System.out.print("===============================================================\n");
                 System.out.print("ROOM : FAMILY ROOM \n");
                 System.out.print("JAM : "+jam+" jam"+"\n");
                 System.out.print("TOTAL HARGA : "+setelah_diskon+"\n");
                 System.out.print("BAYAR : "+bayar+"\n");
                 System.out.print("KEMBALI : "+kembali+"\n");
                 
             }else{
                 total = jam * small ;
                 System.out.println("Anda harus membayar sebesar: "+total);
                 
                  System.out.println("Bayar: ");
                  bayar = keyboard.nextDouble();
                 
                 kembali = bayar - total;
                         
                  System.out.println("Kembali: "+kembali+"\n");
                
                 System.out.print("===============================================================\n");
                 System.out.print("RINCIAN TRANSAKSI \n");
                 System.out.print("===============================================================\n");
                 System.out.print("ROOM : FAMILY ROOM \n");
                 System.out.print("JAM : "+jam+" jam"+"\n");
                 System.out.print("TOTAL HARGA : "+total+"\n");
                 System.out.print("BAYAR : "+bayar+"\n");
                 System.out.print("KEMBALI : "+kembali+"\n");
             }
             
             
             }else if(pilih == 2){
            System.out.println("Anda memilih ROOM MEDIUM");
            System.out.print("JAM: ");
             jam = keyboard.nextInt();
             if( jam >3){
                 total = jam * medium ;
                 diskon = total * 11.11/100;
                 setelah_diskon = total - diskon;
                 
                 System.out.println("Anda harus membayar sebesar: "+setelah_diskon);
                 
                   
                 System.out.println("Bayar: ");
                 bayar = keyboard.nextDouble();
                 
                 kembali = bayar - setelah_diskon;
                         
                 System.out.println("Kembali: "+kembali+"\n");
                
                 System.out.print("===============================================================\n");
                 System.out.print("RINCIAN TRANSAKSI \n");
                 System.out.print("===============================================================\n");
                 System.out.print("ROOM : FAMILY ROOM \n");
                 System.out.print("JAM : "+jam+" jam"+"\n");
                 System.out.print("TOTAL HARGA : "+setelah_diskon+"\n");
                 System.out.print("BAYAR : "+bayar+"\n");
                 System.out.print("KEMBALI : "+kembali+"\n");
             }else{
                 total = jam * medium ;
                 System.out.println("Anda harus membayar sebesar: "+total);
                
                   
                 System.out.println("Bayar: ");
                 bayar = keyboard.nextDouble();
                 
                 kembali = bayar - total;
                         
                  System.out.println("Kembali: "+kembali+"\n");
                
                 System.out.print("===============================================================\n");
                 System.out.print("RINCIAN TRANSAKSI \n");
                 System.out.print("===============================================================\n");
                 System.out.print("ROOM : FAMILY ROOM \n");
                 System.out.print("JAM : "+jam+" jam"+"\n");
                 System.out.print("TOTAL HARGA : "+total+"\n");
                 System.out.print("BAYAR : "+bayar+"\n");
                 System.out.print("KEMBALI : "+kembali+"\n");
             }
             }else if(pilih == 3){
            System.out.println("Anda memilih ROOM LARGE");
            System.out.print("JAM: ");
             jam = keyboard.nextInt();
             if( jam >3){
                 total = jam * large ;
                 diskon = total * 11.11/100;
                 setelah_diskon = total - diskon;
                 
                 System.out.println("Anda harus membayar sebesar: "+setelah_diskon);
                   
                 System.out.println("Bayar: ");
                 bayar = keyboard.nextDouble();
                 
                 kembali = bayar - setelah_diskon;
                         
                 System.out.println("Kembali: "+kembali+"\n");
               
                 System.out.print("RINCIAN TRANSAKSI \n");
                 System.out.print("ROOM : FAMILY ROOM \n");
                 System.out.print("JAM : "+jam+" jam"+"\n");
                 System.out.print("TOTAL HARGA : "+setelah_diskon+"\n");
                 System.out.print("BAYAR : "+bayar+"\n");
                 System.out.print("KEMBALI : "+kembali+"\n");
             }else{
                 total = jam * large ;
                 System.out.println("Anda harus membayar sebesar: "+total);
                
                   
                 System.out.println("Bayar: ");
                 bayar = keyboard.nextDouble();
                 
                 kembali = bayar - total;
                         
                  System.out.println("Kembali: "+kembali+"\n");
                
                 System.out.print("===============================================================\n");
                 System.out.print("RINCIAN TRANSAKSI \n");
                 System.out.print("===============================================================\n");
                 System.out.print("ROOM : FAMILY ROOM \n");
                 System.out.print("JAM : "+jam+" jam"+"\n");
                 System.out.print("TOTAL HARGA : "+total+"\n");
                 System.out.print("BAYAR : "+bayar+"\n");
                 System.out.print("KEMBALI : "+kembali+"\n");
             }
        }else if(pilih == 4){
            System.out.println("Anda memilih FAMILY ROOM");
            System.out.print("JAM: ");
             jam = keyboard.nextInt();
             if( jam >3){
                 total = jam * family ;
                 diskon = total * 11.11/100;
                 setelah_diskon = total - diskon;
                 
                 System.out.println("Anda harus membayar sebesar: "+setelah_diskon);
                 
                   
                 System.out.println("Bayar: ");
                 bayar = keyboard.nextDouble();
                 
                 kembali = bayar - setelah_diskon;
                         
                 System.out.println("Kembali: "+kembali+"\n");
                
                 System.out.print("===============================================================\n");
                 System.out.print("RINCIAN TRANSAKSI \n");
                 System.out.print("===============================================================\n");
                 System.out.print("ROOM : FAMILY ROOM \n");
                 System.out.print("JAM : "+jam+" jam"+"\n");
                 System.out.print("TOTAL HARGA : "+setelah_diskon+"\n");
                 System.out.print("BAYAR : "+bayar+"\n");
                 System.out.print("KEMBALI : "+kembali+"\n");
             }else{
                 total = jam * family ;
                 System.out.println("Anda harus membayar sebesar: "+total);
                
                   
                 System.out.println("Bayar: ");
                 bayar = keyboard.nextDouble();
                 
                 kembali = bayar - total;
                         
                  System.out.println("Kembali: "+kembali+"\n");
                
                 System.out.print("===============================================================\n");
                 System.out.print("RINCIAN TRANSAKSI \n");
                 System.out.print("===============================================================\n");
                 System.out.print("ROOM : FAMILY ROOM \n");
                 System.out.print("JAM : "+jam+" jam"+"\n");
                 System.out.print("TOTAL HARGA : "+total+"\n");
                 System.out.print("BAYAR : "+bayar+"\n");
                 System.out.print("KEMBALI : "+kembali+"\n");
            
             }
        }else{
            System.out.println("Anda tidak memilih sesuai pilihan");
        }
      
    }
    
}
