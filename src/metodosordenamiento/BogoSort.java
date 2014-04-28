/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package metodosordenamiento;

import java.util.Random;

public class BogoSort {
    
    public int[] BogoSort(int[] N){
        Random rnd = new Random();
        while(true){
            boolean sorted = true;
            for(int i = 0; i < N.length-1; i++)
                if(N[i] > N[i+1]){
                    sorted = false;
                    break;
                }
            if (sorted)
                return N;
            for(int i = N.length - 1; i > 0; i--){
                int rand = rnd.nextInt(i);
                int temp = N[i];
                N[i] = N[rand];
                N[rand] = temp;
            }
    }
}
}
