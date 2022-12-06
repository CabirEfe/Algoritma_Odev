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
public class FermatSayılar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Bir Terim Sayısı Giriniz: ");
        int a = input.nextInt();
        
        for (int i = 0; i < a; i++) 
        {
            System.out.println(Math.pow(2,Math.pow(2,i)) + 1);    
        }
    }
    
}
