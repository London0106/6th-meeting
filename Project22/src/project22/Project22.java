/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project22;


/**
 *
 * @author London
 */
public class Project22 {
//question = amir menabung sebesar 5jt setiap tahun, dengan bunga sebesar 7% selama 8 tahun.
// buatlah algoritma untuk mengetahui total uang amir beserta bunganya.
// PR : swift case, 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    long uangAmir = 5000000;
    int lamaMenabung = 8;
    long totalBunga = 0;
    
    for(int i=0; i<8; i++){
        totalBunga = uangAmir * 7/100;
        uangAmir = uangAmir + totalBunga;
    }
        System.out.println("Uang Amir Setelah Ditabung Selama 8 Tahun = "+uangAmir);      



    }
    
}
