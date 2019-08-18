package largestintarray;

import java.util.Scanner;

/**
 *
 * @author stefa
 */
public class LargestIntArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type array's length:");
        int lengthArray = scanner.nextInt();
        int [] array = new int[lengthArray];
        
        System.out.println("Please insert numbers in array:");
        for(int i = 0; i < lengthArray; i++){
            array[i] = scanner.nextInt();
        }
        
        System.out.println("The array is:");
        for(int i : array){
            System.out.print(i + " ");
        }
        
        int max = array[0];
        for (int i =0; i < array.length; i++){
            if (array[i] > max){
                max = array[i];
            }
        }
        System.out.println("\nThe max value is: " + max);
    }
    
}
