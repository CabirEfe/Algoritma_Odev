/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
import java.util.Scanner;
public class ÜçgenselSayı {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Terim Sayısını Giriniz: ");
        int ts = input.nextInt();
        int sonuc;
        for (int i = 1; i < ts; i++) 
        {
         System.out.println((i * (i + 1))/2);
        }
    }
    
}
