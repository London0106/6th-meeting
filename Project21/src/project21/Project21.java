/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project21;
import java.util.Scanner;

/**
 *
 * @author London
 */
public class Project21 {
    //question = Ask a teacher I want to know average 4 of the students 
    //1st student = erros(90) | 2nd student = London(92) | 3rd student = Oliver (95) | 4th student = Lucky (100)
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner scan = new Scanner (System.in);
        String namaStudent;
    int temp = 0;
    int nilai = 0;
    int totalStudents = 0;
            for(int i = 1; i<=4; i++){
        System.out.println("Insert Student Name");
        namaStudent = scan.next();
                System.out.println("Insert Value Student");
                nilai = scan.nextInt();
                
           
            if(nilai<=70){
                temp = temp+0;
            
            
            }
            else if(nilai>70){
                totalStudents = totalStudents + 1;
                temp = temp+nilai;
            }
            }
            temp = temp/totalStudents ;
            System.out.println("Average of the 4 Students = "+temp);
            
            
           
            
            
        
    }
     
    }
    

