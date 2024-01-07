/* Question  20 90 30 40 10  array ko bubble sort krna 
bubble sort mtlb pehla iteration m sbse bda sbse last mein jayega

 
 */
import java.util.*;
public class bubblesort {
    public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);

      int n =scan.nextInt();
      int[] arr=new int[n];

      for(int i=0;i<n;i++)
      {
        arr[i]=scan.nextInt();

      }
//above takes input in the array

      bubbleSorting(arr);//bubble sort  check kro ki agla wala small to nhi agar hai to swap  , 1st journey m sbsse bada last m aata
      printarr(arr);//print the result
    }


    public static void bubbleSorting(int[] arr)
    {

        for(int i=1;i<=arr.length-1;i++)   // 20 90 30 40 10  to i90 p hai aur 10 mtlb last tk gya
       { 
        for(int j=0;j<=arr.length-1-i;j++)  //aur j 20 p hai abhi starting m aur kyuki 
        {
            if(isSmaller(arr,j+1,j)==true)//agar agla no pehle wale se bda to swap
            {
              swap(arr,j,j+1) ;
            }
            
        }
        

       }
    
    }
    public static boolean isSmaller(int[]arr,int i, int j)
    {  if(arr[i]<arr[j])
        return true;
        else 
        return false;

    }

    public static void swap(int[]arr,int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void printarr(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
