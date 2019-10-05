/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erdiandlima;

/**
 *
 * @author sandi
 */
public class ErdianDlima {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int p,q,r;
    int n = 10;
    int erdian = n;
        for(p=(n);p>0;p--)
        {
            for(q=0;q<erdian;q++)//looping ke samping memakai increment
            {
            System.out.print(" ");//menampilkan hasil berupa spasi
            }
            for(r=0;r<p;r++)//looping ke bawah memakai increment
            {
            System.out.print("5 ");//menampilkan hasil berupa angka 5 dengan spasi
            }
            System.out.println();//menampilkan hasil
            erdian++;
        }
        
    }
}

    

