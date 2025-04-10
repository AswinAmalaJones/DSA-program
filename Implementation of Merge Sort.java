//Implementation of Merge Sort. 11
public class Main{
    //Merges two subarrays of arr[]
    public void merge(int arr[], int l, int m, int r)
    {
        int n1 = m - l + 1;
        int n2 = r - m;

        int L[] = new int[n1];
        int R[] = new int[n2];

        //Copy data to temporary arrays
        for(int i = 0; i< n1; ++i)
        {
            L[i] = arr[l + i];
        }
        for(int j=0; j<n2; ++j)
        {
            R[j] = arr[m + 1 + j];
        }
        int i = 0, j = 0;
        int k = l;

        // Merge the temporary arrays
        while(i<n1 && j<n2)
        {
            if(L[i] <= R[j]){
                arr[k] = L[i];
                i++;
            }
            else{
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        //Copy remaining elements of L[] if any
        while(i<n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }
        // Copy remaining elements of R[] if any
        while(j < n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    //Function to perform merge sort
    public void sort(int arr[], int l, int r)
    {
        if(l < r)
        {
            int m = (l + r) / 2;

            sort(arr, l, m); // Sort first half
            sort(arr, m + 1, r); //sort second half

            merge(arr, l, m , r); // Merger the sorted halves
        }
    }
    public static void main(String args[])
    {
        int arr[] = {12,11,13,5,6,7}; // Example array

        Main ob = new Main();
        ob.sort(arr, 0 , arr.length-1 );

        System.out.println("Sorted array using Merge Sort:");
        for(int i=0; i< arr.length; ++i)
        {
            System.out.print(arr[i] + "");
        }
    }
}