class Inner_java
{
    public static void main(String[] args) {
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=4;j++)
            {
                if(i==1 || j==3)
                {
                    break;
                }
                System.out.println(i+ " "+j);
            }
        }
    }
}
/* output
 * 2 1
2 2
3 1
3 2
4 1
4 2
 */