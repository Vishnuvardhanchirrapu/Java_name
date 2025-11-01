// code for returning largest sequence of charecter substring inthe given string
import java.util.*;
public class Main
{
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String str = new String(sc.nextLine());
      int index = 0;
      int h = 1;
          int c = 1;
      for(int i = 0; i<str.length() - 1; i++){
          
          if((int)str.charAt(i)+1 == (int)str.charAt(i+1)){
              c++;
              if( i == str.length() - 2){
                  if(c>h){ h = c; index = i - h +2; }
              }
          }
          else{
              if(c>h) {h = c;   index = i - h + 1; }
              c = 1;
          }
      }
      String ans = "";
      for(int i = index; i < (h+index); i++){
          ans += str.charAt(i);
      }
      System.out.println("length of Largest sequence of charecters : "+h);
      System.out.println("The largest substring :"+ans);
	}
}
