import java.util.Scanner;

public class Sum_of_first_And_last {
    public static void main(String[] args) {
        int n,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        n = sc.nextInt();
        int r = n%10;
        if(n<9)
        {
            sum=-1;
        }
        while(n>0)
        {
          
          sum = sum+r;
          n=n/10;
        }
        System.out.println(sum);
        sc.close();
    }
}
