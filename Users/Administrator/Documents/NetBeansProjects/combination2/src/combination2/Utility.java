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
    int combi;
    public static int factorial(int fact){
        if(fact == 0)
            return 1;
        else
            return fact*factorial(fact-1);
    }
    int combination(int n,int r){
        combi = Utility.factorial(n)/(Utility.factorial(r)*Utility.factorial(n-r));
        return combi;
    }
    
}
