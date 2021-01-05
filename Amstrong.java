class Amstrong
{
       public static void main(String[] args) 
         { 
              strong();  
      }
       public static int strong() {
              int num = 165,rem,sum=0;
              int temp = num;
              while(num > 0) {
                   rem = num % 10;
                   num = num / 10; 
                   sum = sum + (rem*rem*rem);
            }
             if (temp == sum){
                 System.out.println("The number " + sum + " is an Amstrong number"); 
            }
             else{
                 System.out.println("The number " + sum + " is not an Amstrong number"); 
           }   
             return sum;
       }

}