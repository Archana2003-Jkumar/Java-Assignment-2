import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

      int base,exp,i=1;
      Scanner sc = new Scanner(System.in);
      base  = sc.nextInt();
      exp = sc.nextInt();
      while(exp!=0)
      {
          i*=base;
          exp--;
      }
        System.out.println("Result :"+i );



    }
}