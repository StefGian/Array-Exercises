package array2;

import java.util.Scanner;

/**
 *
 * @author stefa
 */
public class Array2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please insert the length of the first array:");
        int lengthArray1 = scanner.nextInt();
        
        int [] array1 = new int[lengthArray1];
        System.out.println("Please enter numbers in first array:");
        for (int i = 0; i<lengthArray1; i++){
            array1[i] = scanner.nextInt();
        }
        
        System.out.println("Please insert the length of second array:");
        int lengthArray2 = scanner.nextInt();
        
        int [] array2 = new int[lengthArray2];
        System.out.println("Please enter numbers in second array:");
        for(int i=0; i<lengthArray2; i++){
            array2[i] = scanner.nextInt();
        }
        
        System.out.println("First array:");
        for(int i : array1){
            System.out.print(i + " ");
        }
        
        System.out.println("\nSecond array:");
        for(int i : array2){
            System.out.print(i + " ");
        }
        
        int [] array3 = {array1[0], array2[array2.length-1]};
        System.out.println("Third array:");
        for(int i : array3){
            System.out.print(i + " ");
        }
    }
    
}
