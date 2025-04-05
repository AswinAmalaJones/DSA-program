// Implementation of binary search using JAVA 08
public class Main{
    //Method to perform binary search
    public static int binarySearch(int[]arr,int key){
        int left = 0;
        int right = arr.length - 1;

        while (left <= right){
            int mid = left + (right-left)/2; //Find the middle element

            // Check if the key is present at mid
            if(arr[mid]==key){
                return mid;
            }
            // If key is greater, ignore the left half
            if (arr[mid]<key){
                left = mid +1;
            }
            else{
                right = mid -1;
            }
        }
        // Return -1 if the element is not found
        return -1;
    }

    public static void main(String[]args){
        //Hardcoded Sorted input array
        int[] arr = {10,20,30,40,50,60,70,80};
        //Hardcoded key to search
        int key = 40;

        //Perform binary search
        int result = binarySearch(arr,key);

        //Output the result
        if(result == -1){

            System.out.println("Element not found in the array.");

        }
        else{
            System.out.println("Element found at index:"+result);
        }
    }
}