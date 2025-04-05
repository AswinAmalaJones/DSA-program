// Implementation insertion Sort 09
public class Main{
    //Function to perform insertion sort on an array
    public static void insertionSort(int[]array){
       int n = array.length;
       for(int i=1; i<n; i++){
        int key = array[i]; // Current element to be compared
        int j = i-1;

        // Shift element of array[0...i-1], that are greater than key, to ine position ahead of their current position
        while(j>=0 && array[j]>key){
            array[j+1]= array[j];
            j = j-1;
        }
        //Insert the key element at the corrct position
        array[j + 1] = key;
       } 
    }

    public static void main(String[]args){
        int[] arr = {12,11,13,5,6}; // sample array

        //print the original array
        System.out.print("Original array:");
        for(int num : arr)
        {
            System.out.print(num + "");
        }
        System.out.println();

        // call the insertionsort function to sort the array 
        insertionSort(arr);

        //print the sorted array
        System.out.println("Sorted array using Insertion Sort:");
        for(int num : arr){
            System.out.print(num + "");
        }
    }
}