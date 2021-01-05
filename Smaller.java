class Smallest
{
       public static void main(String[] args) 
         {
          int a = 100;
          int b = 20;
          int c = 80;
          String smaller = (a<b) ? ((a<c) ? a + " is smaller" : c + " is smaller") : ((b<c) ? b + " is smaller" : c + " is smaller");
          System.out.println(smaller);
          }
}
       
            