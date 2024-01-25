public class Label_Break {
    public static void main(String[] args) {
       a1:  
       for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=4;j++)
            {
                if(i==2)
                {
                    break a1;
                }
                System.out.println(i+ " "+j);
            }
        }
    }
}
/* output
1 1
1 2
1 3
1 4
 */
