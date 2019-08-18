package array1;

import java.lang.reflect.Array;
import java.util.Scanner;

/**
 *
 * @author stefa
 */
public class Array1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please enter array's length:");
        int lengthArray = scanner.nextInt();
        int [] array = new int[lengthArray];
        
        System.out.println("Please insert number:");     
        for(int i=0; i<lengthArray; i++){
            array[i] = scanner.nextInt();
        }
        
        //print array
        for(int i : array){
            System.out.print(i + ", ");
        }
        
        if(array[0] == 10){
            System.out.println("true");
        }else if(array[array.length-1] == 10){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
    
}
