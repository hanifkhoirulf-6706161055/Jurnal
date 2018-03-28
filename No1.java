/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no1;
import java.util.Scanner;
/**
 *
 * @author Praktikan
 */
public class No1 {

    /**
     * @param args the command line arguments
     */
     Scanner in=new Scanner(System.in);
        System.out.println("Input :");
        int count=in.nextInt()+1;
        int n1=0,n2=1,n3=0,i;    
        System.out.println("Output :");
        //System.out.print(n2);  
        int jumlah=n2;
        for(i=2;i<count;++i){    
             n3=n1+n2;    
             jumlah=jumlah+n3;    
             n1=n2;    
             n2=n3;    
        }    
        System.out.println(jumlah);
        System.out.println();
    
}
