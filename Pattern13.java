class Pattern13 
{
       public static void main(String[] args) 
         { 
                int i,j,row = 4,space = row -1;
                for (j = 1; j<= row; j++) {  
                    for (i = 1; i<= space; i++) {  
                        System.out.print(" ");  
                    }  
                    space--;  
                    for (i = 1; i <= 2 * j - 1; i++) {  
                        System.out.print("*");  
                    }  
                     System.out.println("");  
                }  
                space = 1;  
                for (j = 1; j<= row - 1; j++) {  
                    for (i = 1; i<= space; i++) {  
                        System.out.print(" ");  
                    }  
                    space++;  
                    for (i = 1; i<= 2 * (row - j) - 1; i++) {  
                        System.out.print("*");  
                    }  
                    System.out.println("");  
                 }  
          }
}
       
            