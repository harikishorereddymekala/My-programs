class Arrow 
{
       public static void main(String[] args) 
         {
                int star=0,space=4;
                for(int i=1; i<=7; i++)
{
            if(i<=4)
{
                  star++;
                 space--;
}
             else
{
                 space++;
                  star--;
}

                   for(int j=1; j<=space; j++)
/*  if(i<=4)
{
                  star++;
                  for(int j=1; j<=star; j++)
{
                      System.out.print("*");
}                      
}
             else
{
                  space--;
                   for (int l=7 ;l>=space;l--)
{
                      System.out.print("*");
} 
}*/
{
                      System.out.print(" ");
}      
                   for (int l=1 ;l<=star;l++)
{
                      System.out.print("*");
}       
                 if (i<=2||i>=6)
{
                    for (int j=1;j<=3;j++)
{
                      System.out.print(" ");
}
}
                 else
{
                    for (int j=1;j<=3;j++)
{
                       System.out.print("*");
}
}
if(i<=4)
{
star++;
         for(int j=1;j<=star;j++)
{
                    System.out.print("*");
}
}
else
{ 
space--;
for(int j=1;j<=space;j++)
{
System.out.print("*");
}
}
System.out.println();
                   }
         }
}
            