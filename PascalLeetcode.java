/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apnikakshajava.Patterns;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jinal Sojitra
 */
public class PascalLeetcode {
    public static void main(String[] args){
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        List<Integer> row;
        for(int i=0;i<5;i++){
            row=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i)
                    row.add(1);
                else
                    row.add(res.get(i-1).get(j-1)+res.get(i-1).get(j));
            }
            
            res.add(row);     
            
        }
        
    }
//    public List<List<Integer>> generate(int numRows) {
//        return res;
//    }

}
