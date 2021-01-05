class Pattern8 
{
       public static void main(String[] args) 
         { 
                int star = 5,space = 1;
                for (int i= 5; i>= 1; i--) {
                    
                    for (int j=1; j<=space;j++) {  
                        System.out.print("  ");  
                    }  
                    for (int k=1;k<=star;k++) {  
                        System.out.print("* ");  
                   }   
                    space++;
                    star--; 
                    System.out.println("");  
                }  
          }
}
       
            