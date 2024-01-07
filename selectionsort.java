/*Ques    20 30 90 40 10   array selection sort

selection sort mein sbse chota sbse pehle  aata 1st journey k khatam p
mtlb 10 30 90 40 20       aur iss hisab se  pehli journey mein pehla sort to element -1  journey "outer loop"
aur pehli journey mein 4 comparis ion 5 element 4
agli journey mein  3 comparision kyuki pehla sort    to mtlb inner loop mein  last element tak comparision arrleng-1 tk
 */   

import java.util.*;
public class selectionsort {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        //isse upar tak input liya
        selectandsort(arr);//sort krne ka method bnaaya
        printarr(arr);     //print ka method

    }


    public static void selectandsort(int[] arr) { //journeys= elements -1 
        //comparision starts from 2nd element till last ie arrary.length-1

        for (int i = 0; i <= arr.length - 2; i++) {
            int minidx = i;//smallest p fix krdiya
            for (int j = minidx + 1; j <= arr.length - 1; j++) 
            {
                if (isSmaller(arr,minidx,j) == false)//agar humara pehle koi bada element hai  mtlb arr[minidx]<arr[j]
                 {
                    minidx = j;                   //to minidx mein j daal do jo bade element ka index tha

                 }
            }
            swap(arr, minidx,i);   //bade element ko swap krdo
     
        }
    }
    public static boolean isSmaller(int[] arr, int i, int j) {//check krega pehla element baad wala se chota ki nhi
        if (arr[i] < arr[j]) {
            return true;
        } else {
            return false;
        }
    }
    public static void swap(int[] arr, int i, int j) {//swapping ka function
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    public static void printarr(int[] arr) {//print ka function
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
    }
}