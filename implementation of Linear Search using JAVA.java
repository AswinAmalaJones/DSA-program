// implementation of Linear Search using JAVA 07

public class Main{
    //Method to perform linear search

    public static int linearSearch(int[]arr,int key){
        for(int i=0; i<=arr.length;i++){
            if(arr[i]==key){
                return i; //Return the index of the element if found
            }
        }
        return -1; //Return -1 if the element is not found
    }
    public static void main(String[]args){
        //Hardcoded input array
        int[]arr = {10,20,30,40,50};

        //Hardcoded key to search
        int key = 30;

        //perform linear search
        int result = linearSearch(arr, key);

        //output the result
        if(result == -1){
            System.out.println("Element not found in the array. ");
        }
        else{
            System.out.println("Element found at index:"+result);
        }
    }
}