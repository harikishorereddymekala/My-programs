class Method2
{
       public static void main(String[] args) 
         {
          
          int a = add();
          System.out.println(a);
 
         
          }
       public static int add(){ 
             int product = 1;
             for(int i = 1; i<= 10; i++) {
                 product = product * i;
             }
             return product;   
       }  

}
       
            