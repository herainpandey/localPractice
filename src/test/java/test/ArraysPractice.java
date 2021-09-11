package test;

import org.testng.annotations.Test;

public class ArraysPractice {

    //Array  Take input and find max number in an array
    /***
     * int [] a = {1,2,3,4,5,6}
     */

    @Test
     public static void test(){
        int arr[]={2,3,4,432,543,675,123,43,123,54,75};
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        System.out.println("Largest number in array is " + max);

     }

}

