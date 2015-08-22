/**
 * Graphical Sorter - SelectionSort
 * @author Tim Backus
 * @version rev001
 * <p>
 * This class serves as an example of how to make sorting algorithms for this program.
 * </p>
 */

package com.rath.sorts;

import com.rath.elem.ArrayMemberList;

public class SelectionSort {
  
  private final ArrayMemberList array;
  // private final int sortDelay;          // Delay in ms
  
  
  /**
   * Default constructor
   * @param argArray a reference to the ArrayMemberList to be sorted
   * All sorts must have a constructor Constructor(ArrayMemberList) to be considered valid.
   */
	public SelectionSort(ArrayMemberList argArray) {
		array = argArray;
    // sortDelay = argDelay;
    System.out.println("Constructed sort");
	}
	
  /**
   * Perform the sort.
   */
  public void sort() {
	
    System.out.println("Called sort()");
    // i = index to select for
		for(int i = 0; i < array.getSize() - 1; i++) {
      // System.out.println("Selection Sort: iteration " + i);
      int minPos = i;
      // Find the lowest value in the array for the rest of it up from index i
			for(int j = i+1; j < array.getSize(); j++) {
        if(array.getValue(j) < array.getValue(minPos))
          minPos = j;
          
          
			}
      array.swap(i, minPos);
      try {
        
        // For delay testing purposes only (will remove once I figure this out...)
        Thread.sleep(10);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
		}
	}
}