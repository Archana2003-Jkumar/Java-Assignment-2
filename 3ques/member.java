import java.util.Scanner;
public class member{

    public void printsal(int sal,int mansal)
    {

        System.out.println("Employee details:");
        Scanner sc=new Scanner(System.in);
        String empname = sc.nextLine();
        int empage = sc.nextInt();
        String empphone = sc.next();
        String empadd= sc.next();
        System.out.println("Employee name:"+empname+"\nEmployee Age:"+empage+"\nEmployee phone:"+empphone+"\nEmployee Address:"+empadd);


        System.out.println("Manager details");
        Scanner sc1=new Scanner(System.in);
        String manname = sc1.nextLine();
        int manage = sc1.nextInt();
        String manphone = sc1.next();
        String manadd= sc1.next();
        System.out.println("Manager name:"+manname+"\nManager Age:"+manage+"\nManager phone:"+manphone+"\nManager Address:"+manadd);

        System.out.println(sal);
        System.out.println(mansal);

}
        }