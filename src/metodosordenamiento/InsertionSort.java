/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosordenamiento;

/**
 *
 * @author Wladimir
 */
public class InsertionSort {
    public int[] insertionSort(int[] a, int n){
        int i,k,temp;
        for(k=1; k < n; k++){
            temp=a[k];
            i=k;
            while(i > 0 && temp < a[i-1]){
                a[i]=a[i-1];
                i--;
            }
            a[i]=temp;
        }
        return a;
    } 
    
}
