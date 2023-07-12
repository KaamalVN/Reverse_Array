import java.util.Arrays;
import java.util.Scanner;

public class Reverse_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size= scanner.nextInt();
        int[] array = new int[size];
        for(int iterator=0;iterator<size;iterator++){
            array[iterator]=scanner.nextInt();
        }
        System.out.println(Arrays.toString(array_reverse(array, size)));
    }

    static int[] array_reverse(int[] array, int size) {
        int[] reversed_array = new int[size];

        for(int iterator=0;iterator<size/2;iterator++){
            reversed_array[iterator]=array[size-1-iterator];
            reversed_array[size-1-iterator]=array[iterator];
        }
        if(size%2!=0){
            reversed_array[size/2]=array[size/2];
        }

        return reversed_array;
    }
}
