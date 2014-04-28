/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosordenamiento;

/**
 *
 * @author Wladimir
 */
public class SelectionSort {
    public int[] selectionSort(int[] arr, int size){
        int i,j,min,temp;
        for(j=0; j < size-1; j++){
            min=j;
            for(i=j+1; i < size; i++)
                if(arr[i] < arr[min]) min=i;
                    if(j!=min){
                        temp=arr[j];
                        arr[j]=arr[min];
                        arr[min]=temp;
                    }
        }
        return arr;
    } 
}
