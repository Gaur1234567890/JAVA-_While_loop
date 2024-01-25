import java. util.*;
public class Count {
    public static void main(String[] args) {
        int n , count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        n = sc.nextInt();
        while(n>0)
        {
            count ++;
            n= n/10;
        }
        System.out.println(count);
        sc.close();
    }
}
