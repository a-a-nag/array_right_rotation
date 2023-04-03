/*
* A right rotation is an operation that shifts each element of an array to the right.
* For example, if an array is {1,2,3,4,5} and we right rotate it by 1, the new array will be {5,1,2,3,4}.
* If we rotate it by 2, the new array will be {4,5,1,2,3}. It goes like this: {1,2,3,4,5} -> {5,1,2,3,4} -> {4,5,1,2,3}.
*
* Implement rotate method that performs a right rotation on an array by a given number.
*/

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter an array size");
        int arrayLength = scanner.nextInt();
        System.out.printf("Array size is %d %n", arrayLength);
        int[] array = new int[arrayLength];
        
        System.out.println("Enter steps");
        int rotation = scanner.nextInt();
        System.out.printf("Rotate the array to the right by %d steps %n", rotation);
        
        System.out.println("Fill up the array");
        for (int i = 0; i < arrayLength; i++) {
            array[i] = scanner.nextInt();
        }
        
        System.out.println("Your array");
        for (int element : array) {
            System.out.print(element + " ");
        }
        
        System.out.println();
        
        for (int i = 1; i <= rotation; i++) {
            int arrayLastElement = array[arrayLength - 1];
            
            System.out.printf("Rotation - %d %n", i);
            
            for (int j = arrayLength - 1; j > 0; j--) {
                array[j] = array[j - 1];
            }
            array[0] = arrayLastElement;
            System.out.println(Arrays.toString(array));
            
        }
    }
}
