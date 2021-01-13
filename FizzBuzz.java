import java.util.*;
class FizzBuzz{
  public static void main(String[] args){
  Scanner kbd = new Scanner(System.in);
  int x = kbd.nextInt();
  int y = kbd.nextInt();
  int n = kbd.nextInt();
  if(x >= 1 && x <= 100 && y >=1 && y <= 100 & n >=1 && n <= 100){
    for(int i = 1;i <= n;i++){
    if(i%x == 0 && i%y == 0){
      System.out.println("FizzBuzz");
    }
    else if(i%x == 0){
      System.out.println("Fizz");
    }
    else if(i%y == 0){
      System.out.println("Buzz");
    }
    else
      System.out.println(i);
    }
  } 
 }
}