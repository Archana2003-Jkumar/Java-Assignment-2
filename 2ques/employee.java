import java.util.Scanner;

public class employee {
    String nm;
    int year;
    int sal;
    String address;
    public static void main(String[] args)
    {
        int n = 3;
        Scanner sc = new Scanner(System.in);
        employee det[] = new employee[n];
        for (int i = 0; i < n; i++) {
            det[i] = new employee();
            det[i].nm = sc.next();
            det[i].year = sc.nextInt();
            det[i].sal = sc.nextInt();
            det[i].address = sc.next();
        }
        System.out.println("Name"+"\t\t"+"Age"+"\t\t"+"Salary"+"\t\t"+"Address");
        for (int i = 0; i < n; i++) {
            System.out.println(det[i].nm + "\t\t" + det[i].year + "\t\t" + det[i].sal + "\t\t" + det[i].address);
        }

    }
}
