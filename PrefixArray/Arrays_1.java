// SortZeroesAndOnes
import java.util.*;
public class Arrays_1 {
    
    public static int[] SortZeroesAndOnes(int[] arr){
       int c = 0;
       for(int i = 0; i<arr.length; i++)
        if(arr[i] == 0) c++;

       for(int i = 0; i<arr.length; i++ ){
        if(i<c)
        arr[i] = 0;
        else 
        arr[i] = 1;
       }
       return arr;
    }
    public static void main(String[] args) {
        int[] arr = {0,1,1,0,1,0,1};
        System.out.println(Arrays.toString(SortZeroesAndOnes(arr)));
    }
}
