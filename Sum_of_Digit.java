import java.util.*;
public class Sum_of_Digit {
    public static void main(String[] args) {
        int n , r, sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        n = sc.nextInt();
while(n>0)
{
    r = n %10;
    sum = sum +r;
    n = n/10;
}
System.out.println(sum);
    }
}
