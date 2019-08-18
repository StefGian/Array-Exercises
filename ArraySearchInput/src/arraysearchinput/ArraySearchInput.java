package arraysearchinput;

import java.util.Scanner;

/**
 *
 * @author stefa
 */
public class ArraySearchInput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int [] array = new int[2];
        
        System.out.println("Please enter numbers in array:");
        for(int i=0; i<array.length; i++){
            array[i] = scanner.nextInt();
        }
        
        System.out.println("The array is:");
        for(int i : array){
            System.out.print(i + " ");
        }
        
         System.out.println("\n");
        //check array's elements
        for(int i=0; i<array.length; i++){
            if(array[i] == 4 || array[i] == 7){
                System.out.println("true");
            }else {
                System.out.println("false");
            }
        }
        
    }
    
}
