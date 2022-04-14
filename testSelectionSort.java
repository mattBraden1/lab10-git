
/*
 * testSelectionSort.java
 *
* To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;
public class testSelectionSort {
@Test
public void test() {
testPositive();
testNegative();
testMixed();
testDuplicates();
}
    public testSelectionSort() {
    }
    
    public void testPositive(){
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 2;
        
        int[] sortedArr = new int[5];
        sortedArr[0] = 2;
        sortedArr[1] = 7;
        sortedArr[2] = 8;
        sortedArr[3] = 9;
        sortedArr[4] = 10;
        
        SelectionSort test = new SelectionSort();
    	int[] selectionArr = test.basicSelectionSort(arr);
    	assertArrayEquals("The array was not correctly sorted", selectionArr, sortedArr);
    }
    
    public void testNegative(){
    	int[] arr = new int[5];
        arr[0] = -8;
        arr[1] = -9;
        arr[2] = -7;
        arr[3] = -10;
        arr[4] = -2;
        
        int[] sortedArr = new int[5];
        sortedArr[0] = -10;
        sortedArr[1] = -9;
        sortedArr[2] = -8;
        sortedArr[3] = -7;
        sortedArr[4] = -2;
        
        SelectionSort test = new SelectionSort();
    	int[] selectionArr = test.basicSelectionSort(arr);
    	assertArrayEquals("The array was not correctly sorted", selectionArr, sortedArr);
    }
    
    public void testMixed(){
    	int[] arr = new int[5];
        arr[0] = 6;
        arr[1] = -4;
        arr[2] = 0;
        arr[3] = -13;
        arr[4] = 1;
        
        int[] sortedArr = new int[5];
        sortedArr[0] = -13;
        sortedArr[1] = -4;
        sortedArr[2] = 0;
        sortedArr[3] = 1;
        sortedArr[4] = 6;
        
        SelectionSort test = new SelectionSort();
    	int[] selectionArr = test.basicSelectionSort(arr);
    	assertArrayEquals("The array was not correctly sorted", selectionArr, sortedArr);
    }
    
    public void testDuplicates(){
        int[] arr = new int[5];
        arr[0] = 7;
        arr[1] = 7;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = -2;
        
        int[] sortedArr = new int[5];
        sortedArr[0] = -2;
        sortedArr[1] = 7;
        sortedArr[2] = 7;
        sortedArr[3] = 7;
        sortedArr[4] = 10;
        
        SelectionSort test = new SelectionSort();
    	int[] selectionArr = test.basicSelectionSort(arr);
    	assertArrayEquals("The array was not correctly sorted", selectionArr, sortedArr);
    }
}