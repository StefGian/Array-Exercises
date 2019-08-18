package arrayaverage;

import java.util.Scanner;

/**
 *
 * @author stefa
 */
public class ArrayAverage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[6];

        System.out.println("Please insert 6 numbers in array:");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("The array is:");
        for (int i : array) {
            System.out.print(i + " ");
        }
        
        int sum =0;
        for(int i =0; i <= array.length; i++){
            sum = sum + i;
        }
        
        double average = sum / array.length;
        System.out.println("\nThe average value is: " + average);
    }
    
}
