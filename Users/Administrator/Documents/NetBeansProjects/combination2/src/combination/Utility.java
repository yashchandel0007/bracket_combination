/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package combination;

/**
 *
 * @author Administrator
 */
public class Utility {
//    int combi;
    
    long factorial(int fact){
        if(fact == 0)
            return 1;
        else
            return fact*factorial(fact-1);
    }
    int combination(int n,int r){
        long combi;
        System.out.println("n="+n+"r="+r);
        combi = factorial(n)/(factorial(r)*factorial(n-r));
        int temp =(int) combi;
        return temp;
    }   
    
 
}
