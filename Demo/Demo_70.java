import java.util.Arrays;
public class Demo_70 {
    public static void main(String...args){
        System.out.println("Welcome to java");
        int[] arr = {3,5,2,6,3,9,7};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        
        System.out.println("Enter the target :");
        java.util.Scanner sc =  new java.util.Scanner(System.in);
        int target = sc.nextInt();
         int i = 0,j = arr.length -1;
         while(i<j){
            int sum = arr[i]+arr[j];
            if(sum == target){
                System.err.println("Target found!!!"+i+" "+j); return;
            }
            else if(sum>target)
                j--;
            else 
                i++;
         }
         System.err.println("Target missed!!!");
    }
}


