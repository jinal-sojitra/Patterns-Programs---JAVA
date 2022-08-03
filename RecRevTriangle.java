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
public class RecRevTriangle {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		patternRev(4,4);

	}
	
	static void patternRev(int r, int c){
		if(r==0)
                    return;
		if(c>0){
                    System.out.print("* ");
                    patternRev(r,c-1);
		}
                else{	
                    System.out.println();
                    patternRev(r-1,r-1);
                }
		
	}

}
