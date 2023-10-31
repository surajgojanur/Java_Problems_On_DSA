class parten77{
    public static void main(String args[])
    {
        int t=1;
        for(int i=1;i<=5;i++)
        {
            t=1;
            for(int j=5;j>=i;j--)
            {
                System.out.print(t);
                t=t+1;
            }
            System.out.println();
        }
    }
}