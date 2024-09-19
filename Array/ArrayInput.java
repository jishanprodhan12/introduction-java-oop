
package Array;
import java.util.Scanner;

public class ArrayInput {
    
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the size of Array : ");
        int size =in.nextInt();
        int arr[] =new int [size];
        System.out.println("enter the elements of array : ");
        for (int i = 0; i < size; i++) {
            System.out.print("enter "+(i+1)+" element ");
            arr[i]=in.nextInt();
        }
        System.out.println("Elements of the array is : ");
        for (int i = 0; i < size ; i++) {
            
            System.out.print(arr[i]+" ");
        }

    }
    
}
