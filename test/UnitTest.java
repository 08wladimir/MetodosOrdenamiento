/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import metodosordenamiento.*;
import static org.junit.Assert.assertEquals;


/**
 *
 * @author Administrador
 */
public class UnitTest {
    BogoSort bogo;
    BubbleSort bubble;
    InsertionSort insertion;
    SelectionSort selection;
    int[] vector = {5,7,8,3,1,4,10,9,6,2};
    int[] vector2 = {1,2,3,4,5,6,7,8,9,10};
    
    
    @Before
    public void setUp() {
        bogo = new BogoSort();
        bubble = new BubbleSort();
        insertion = new InsertionSort();
        selection = new SelectionSort();
    }
    
    @After
    public void tearDown() {
        bogo = null;
        bubble = null;
        insertion = null;
        selection = null;
    }

    @Test
    public void bogoSort() {
        int[] vectorOrdenado = bogo.BogoSort(vector);
        for(int i= 0; i<vector.length; i++){
            assertEquals(vector2[i], vectorOrdenado[i]);
        }
    }
    
    @Test
    public void bubbleSort() {
        int[] vectorOrdenado = bubble.bubbleSort(vector, vector.length);
        for(int i= 0; i<vector.length; i++){
            assertEquals(vector2[i], vectorOrdenado[i]);
        }
    }
    
    @Test
    public void insertionSort() {
        int[] vectorOrdenado = insertion.insertionSort(vector, vector.length);
        for(int i= 0; i<vector.length; i++){
            assertEquals(vector2[i], vectorOrdenado[i]);
        }
    }
    
    @Test
    public void selectionSort() {
        int[] vectorOrdenado = selection.selectionSort(vector, vector.length);
        for(int i= 0; i<vector.length; i++){
            assertEquals(vector2[i], vectorOrdenado[i]);
        }
    }
}
