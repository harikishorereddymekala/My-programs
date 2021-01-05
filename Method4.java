class Factorial
{
       public static void main(String[] args) 
         { 
               System.out.println(fact(5));  
      }
       public static int fact(int fact) { 
          for(int i=fact-1;i>=1;i--) {
          fact=fact*i;
           }
              return fact;
          
       }
         
      

}