class Evensum
{
       public static void main(String[] args) 
         {
          
          digits();
         
          }
       public static int digits(){
              int num = 423,rem,sum = 0;
              while(num>0) {
                    rem = num % 10;
                    if(rem%2==0){
                    sum = sum + rem;
                    }
                    num = num/10;
             }
              System.out.println(sum);
              return num;
       }  

}
       
            