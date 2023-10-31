class parten9{
    public static void main(String args[])
    {
        int sum=0;
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                sum = i + j;
                if(sum%2==0)
                
                {
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}