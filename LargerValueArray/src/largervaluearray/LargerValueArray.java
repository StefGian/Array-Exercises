package largervaluearray;

import java.util.Scanner;

/**
 *
 * @author stefa
 */
public class LargerValueArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int [] array = new int[3];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert numbers in array:");
        for(int i =0; i<array.length; i++){
            array[i] = scanner.nextInt();
        }
        
        System.out.println("The array is:");
        for(int i : array){
            System.out.print(i + " ");
        }
        
        System.out.println("\nThe greater number between array's first element and last element is:");
        if(array[0] > array[2]){
            System.out.println(array[0]);
        }else if (array[0] < array[2]){
            System.out.println(array[2]);
        }
    }
    
}
