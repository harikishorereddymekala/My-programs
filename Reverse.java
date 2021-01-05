class Reverse
{
       public static void main(String[] args) 
         {
          
         reverse();
         
          }
       public static int reverse(){
              int num = 128,rem,rev = 0;
              while(num>0) {
                    rem = num % 10;
                    rev = rev * 10 + rem;
                    num = num/10;
             }
              
              System.out.println(rev);
              return num;
       }  

}
       
            