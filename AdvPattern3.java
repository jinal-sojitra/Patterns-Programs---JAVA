/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apnikakshajava.Patterns;

/**
 *
 * @author Jinal Sojitra
 */
public class AdvPattern3 {
    public static void main(String[] args){
        int n=4;
        int rows=2*n-1;
        for(int i=1;i<=rows;i++){
            if(i<=n){
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
            }
            else{
                for(int j=1;j<=rows-i+1;j++){
                    System.out.print("*");
                }
            }
           System.out.println();
        }
    }
}
