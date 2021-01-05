class Oddproduct
{
       public static void main(String[] args) 
         {
          
          digits();
         
          }
       public static int digits(){
              int num = 523,rem,product = 1;
              while(num>0) {
                    rem = num % 10;
                    if(rem%2!=0){
                    product = product * rem;
                    }
                    num = num/10;
             }
              System.out.println(product);
              return num;
       }  

}
       
            