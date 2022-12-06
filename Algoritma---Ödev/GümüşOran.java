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
public class GümüşOran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Doğru Parçasının Uzunluğunu Giriniz: ");
        int dp = input.nextInt();
        double b = (double)dp/(2 + Math.pow(2,5));
        double a = dp - b;
        System.out.println(a);
        System.out.println(b);
                
    }
    
}
