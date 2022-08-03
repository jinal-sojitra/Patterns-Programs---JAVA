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
public class MiddleTriangle {
    public static void main(String[] args){
        int n=5;
        int space=n/2;
        for(int i=1;i<=n;i++){
            for(int s=0;s<space;s++){
                System.out.print(" ");
            }
            space--;
            for(int j=0;j<i;j++){
                System.out.print("*");
                
            }
            System.out.println();
        }
        
    }
}
