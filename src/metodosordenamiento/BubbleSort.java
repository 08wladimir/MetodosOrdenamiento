/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package metodosordenamiento;

/**
 *
 * @author Administrador
 */
public class BubbleSort {
    
    public int[] bubbleSort(int[] arr, int size){
        int temp;
        for(int j=size-1; j > 0; j--){
            for(int i=0; i < size-1; i++){
                if(arr[i] > arr[i+1]){
                    temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
        return arr;
    }
}
