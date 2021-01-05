class Pattern9 
{
       public static void main(String[] args) 
         { 
                for (int i= 0; i<= 7; i++) {  
                    for (int j=0; j<=7-i; j++) {  
                        System.out.print(" ");  
                    }  
                    for (int k=0; k<=i; k++) {  
                        System.out.print("* ");  
                    }
                    i++;  
                    System.out.println();  
  
                }   
          }
}
       
            