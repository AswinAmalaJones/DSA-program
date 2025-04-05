//implementation of Quick Sort 10
public class Main
{
    // Function to partition the array and return the pivot index
    public static int partition(int[] array, int low, int high)
    {
        int pivot = array[high]; // Choose the rightmost element as pivot
        int i = low - 1; // pointer for the smaller element
        // Traverse through all elements and compare then with the pivot
        for (int j = low; j<high; j++)
        {
            if (array[j]<= pivot)
            {
                i++;
            
            //Swap element at i with element at j
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
    //Swap the pivot element with the greater element specified by i
    int temp = array[i + 1];
    array[i + 1] = array[high];
    array[high] = temp;

    //Return the position from where partition is done
    return i + 1;
}
//Function to perform quicksort
public static void quickSort(int[] array, int low, int high)
{
    if (low < high)
    {
        int pivotIndex = partition(array, low,high);// Find pivot element

        // Recursively call on the left and right sides of the pivot

        quickSort(array,low , pivotIndex-1);
        quickSort(array,pivotIndex + 1, high);
    }
} 
public static void main(String[]args)
{
    int[]arr = {7,2,1,6,8,5,3,4}; //Sample array

    // print the original array
    System.out.print("Original array:");
    for(int num : arr)
    {
        System.out.print(num + "");
    }
    System.out.println();

    //Call the quickSort function to sort the array
    quickSort(arr,0,arr.length-1);

    // print the sorted array
    System.out.print("Sorted array using Quick Sort:");
    for(int num : arr)
    {
        System.out.print(num + "");
    }
}
}