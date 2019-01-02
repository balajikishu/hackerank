/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interviewkit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author balajis
 */
public class Sol1 {
    static int sockMerchant(int n,int[] ar)
    {
        int result = 0;
        List<Integer> listInt = new ArrayList<>();
        if(ar.length > 1 )
        {
            for(int a:ar)
            {
                listInt.add(a);
            }
        }
        Collections.sort(listInt);
        System.out.println(listInt);
        for(int ix = 0; ix < n-1 ;){
            if(Objects.equals(listInt.get(ix), listInt.get(ix+1)))
            {
                result++;
                ix+=2;
            }else
            {
                ix++;
            }

        }
        return result;
    }
    
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String ags[]) {
      
     int [] ar =  new int[] {10, 20, 20, 10, 10, 30,50, 10, 20};  
        System.out.println(sockMerchant(ar.length,ar));
    }
}
