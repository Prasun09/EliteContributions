import java.util.Scanner;
public class Main {

  public static void main(String[] args) {
  Sanner sc=new Scanner(System.in);
    // year to be checked
    int year = sc.nextInt();
    if((year%4==0)||((year%400==0)&(year%100!=0)))
    {
      System.out.println(year + " is a leap year.");
    }else{
      System.out.println(year + " is not a leap year.");
  }
  }  
}
