import java.util.Scanner;

public class Continue {
    public static void main(String[] args) {
        int n, table;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        n = sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            if(i==5)
            {
                continue;
            }
            table = i*n;
            System.out.println(table);
            
        }
        sc.close();
    }
}
