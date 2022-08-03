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
public class AdvPattern4 {
    public static void main(String[] args){
        byte n=1;
        for(byte i=1;i<=n;i++){
            for(byte j=1;j<=i;j++){
                if (j==1 || j==i||i==n){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
