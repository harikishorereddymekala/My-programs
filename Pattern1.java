class Pattern1 
{
       public static void main(String[] args) 
         {
          for(int i=1;i<=5;i++)
    {
        for(int j=1;j<=5;j++)
        {
            if(i==(5+1)/2||j==(5-i+1)||i==j||j==(5+1)/2)
            {
              System.out.print("*");
            }
        
        else
        {
           System.out.println(" ");
        }
        }
       
    }
    
          }
}
       
            