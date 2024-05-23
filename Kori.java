import java.util.Scanner;
public class Kori {
    public static void main(String[] args){
      Scanner Obj = new Scanner(System.in);
      String name;
      int roll;
      System.out.println("Enter your name and roll:");
      name = Obj.nextLine();
      roll = Obj.nextInt();
      System.out.println("Your name is "+name+" and roll is "+roll);
    }
}