class Palindrome
{
       public static void main(String[] args) 
         {
          
         reverse();
         
          }
       public static int reverse(){
              int num = 121,rem,rev = 0,temp;
              temp = num;
              while(num>0) {
                    rem = num % 10;
                    rev = rev * 10 + rem;
                    num = num/10;
             }
              if ( temp == rev) {
              System.out.println("it is a palindrome");
             }
              else {
              System.out.println("it is not a palindrome");
             }
              return num;
       }  

}
          