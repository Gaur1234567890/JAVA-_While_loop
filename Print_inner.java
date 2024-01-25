public class Print_inner {
    public static void main(String[] args) {
        for(int i=1;i<=4;i++)
        {
            for(int j=1 ; j<=4;j++)
            {
                if(i==4 && j==3) // AND operator means both of conditions are true
                {
                    break;
                }
                System.out.println(i+ " " +j);
            }
        }
    }
}

/*output 
 * 1 1
1 2
1 3
1 4
2 1
2 2
2 3
2 4
3 1
3 2
3 3
3 4
4 1
4 2
 */