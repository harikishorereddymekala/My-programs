class Str
{
       public static void main(String[] args) 
         { 
          int num = 145,rem,sum=0;
          int n = num;
          while(n!=0){
          int fact = 1;
          rem = n % 10;
          for(int i=rem;i>=1;i--) {
                  fact = fact * i;}
                  sum = sum + fact;
                  n = n / 10; 
          }
           if (sum == num){
              System.out.println("sum1"); 
           }
           else{
              System.out.println("sum2"); 
           }
        
        }
}