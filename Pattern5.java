class Pattern5 
{
       public static void main(String[] args) 
         {
                int star = 0;
                for(int i = 1; i <= 7; i++){
                    star++;
                    for(int j = 4; j <= star; j--){ 
                        System.out.print("* ");
                     }
                    for(int k = 1; k <=star; k++){
                        System.out.print("* ");
                    }
                     System.out.println(" ");
                }

          }
}
       
            