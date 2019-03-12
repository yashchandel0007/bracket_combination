/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package combination;
import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class Combination {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int numberOfA, numberOfB,total_combinations;
        Utility utilityObject = new Utility();
        System.out.print("Enter the number of a:");
        numberOfA = scan.nextInt();
        System.out.print("Enter the number of b:");
        numberOfB = scan.nextInt();
        total_combinations = utilityObject.combination(numberOfA+numberOfB,numberOfA);
        System.out.println("Total no of possible combinations are " + total_combinations);
        char[][] array = new char[total_combinations][numberOfA];
            
    }
  
}