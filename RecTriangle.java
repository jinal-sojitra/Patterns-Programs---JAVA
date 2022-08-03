/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apnikakshajava.Patterns;

/**
 *
 * @author LENOVO
 */
public class RecTriangle {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		patternRev(2,2);

	}
	
	static void patternRev(int r, int c){
		if(r==0)
                    return;
		if(c>0){
                    patternRev(r,c-1);
                    System.out.print("* ");
                    
		}
                else{	
                    patternRev(r-1,r-1);
                    System.out.println();
                    
                }
		
	}

}
