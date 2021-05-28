/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project19;
import java.util.Scanner;

/**
 *
 * @author London
 */
public class Project19 {
    //do while example :
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner (System.in);
        int i = 0;
        
        
        do{
            System.out.println("1.HBO");
            System.out.println("2.Disney");
            System.out.println("3.Kompass");
            System.out.println("0.LogOut");
            System.out.println("Masukan Pilihan Channel");
            i = scan.nextInt();
            
            switch(i){
                case 1 : System.out.println("Your Channel is HBO");
                         break;
                case 2 : System.out.println("Your Channel is Disney");
                         break;
                case 3 : System.out.println("Your Channel is Kompass");
                         break;
                case 0 : System.out.println("You Are LogOut");
                         
            }
        }while(i!=0);
    
}
}
