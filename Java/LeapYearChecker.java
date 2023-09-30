import java.util.Scanner;
public class Main {

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    // you can check any year is leap or not
    int year = sc.nextInt();
    //condition  to check leap year
    //if the condition satisfy then print Leap year otherwise Not a leap year 
    if((year%400==0)||((year%4==0)&&(year%100!=0)))
    {
      System.out.println("Leap year");
    }
    else
    {
      System.out.println("Not,A Leap year");
    }
  }
}
