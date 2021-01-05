class Uniq
{
       public static void main(String[] args) 
         {
          
          digits();
         
          }
       public static int digits(){
              int num = 423,rem;
              while(num>0) {
                    rem = num % 10;
                    System.out.println(rem);
                    num = num/10;
             }
              return num;
       }  

}
       
            