
package Array;
import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for array size
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Creating the array
        int[] arr = new int[size];

        // Taking input for array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Taking input for the element to search
        System.out.print("Enter the element to search: ");
        int target = scanner.nextInt();

        // Calling linearSearch function to search for the target element
        int index = linearSearch(arr, target);

        // Displaying the result
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }

        scanner.close();
    }

    // Function to perform linear search
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Return the index if the element is found
            }
        }
        return -1; // Return -1 if the element is not found
    }
}
