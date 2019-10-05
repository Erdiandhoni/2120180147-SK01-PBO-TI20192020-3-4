/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erdiandempat;

/**
 *
 * @author sandi
 */
public class ErdianDempat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n=10;
        for (int a = 1; a <= n; a++) {
            for (int b = 1; b <= n-a; b++) { 
                System.out.print(" "); 
                } 
            for (int k = 1; k <= a; k++) {   
                System.out.print("4 "); 
                }   
        System.out.println(); //menampilkan hasil
        } 
    } 

    
    
}
