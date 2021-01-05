class Method1
{
       public static void main(String[] args) 
         {
          
          int a = add();
          System.out.println(a);
 
         
          }
       public static int add(){ 
             int sum = 0;
             for(int i = 1; i<= 10; i++) {
                 sum = sum + i;
             }
             return sum;   
       }  

}
       
            