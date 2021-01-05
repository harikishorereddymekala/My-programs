class Fibonacci
{
       public static void main(String[] args) 
         {
        fib(); 
       }
       public static int fib(){
          int t1=0,t2=1,fib=0;
          System.out.println(t1);
          System.out.println(t2);
          while(fib<=100) {
         fib=t1+t2;
         if(fib<=100){
          System.out.println(fib);}
          else{
              break;
          }
          t1=t2;
          t2=fib;
         }
         return fib;
    }

}