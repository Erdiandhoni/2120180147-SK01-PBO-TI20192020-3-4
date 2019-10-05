/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erdiandenam;

/**
 *
 * @author sandi
 */
public class ErdianDenam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    int i,j,k,p,q,r;
    int n = 10;
    int er = n-1;
    for(i=0;i<n;i++) {//looping ke bawah memakai increment
        for(j=0;j<er;j++) {//looping ke samping memakai increment
        System.out.print(" ");//menampilkan hasil berupa spasi
        }
            for(k=0;k<=i;k++) {//looping ke bawah memakai increment
            System.out.print("6 ");//menampilkan hasil berupa angka 6 dengan spasi
            }
            er--;
            System.out.println();//menampilkan hasil
            }
            er = 0;
            for(p=(n);p>0;p--) {//looping ke bawah memakai decrement
            for(q=0;q<er;q++) {//looping ke samping memakai increment
            System.out.print(" ");//menampilkan hasil berupa spasi
            }
            for(r=0;r<p;r++) {//looping ke samping memakai increment
            System.out.print("6 ");//menampilkan hasil berupa angka 6 dengan spasi
            }
            System.out.println();//menampilkan hasil  
            er++;
        }
    }

}
